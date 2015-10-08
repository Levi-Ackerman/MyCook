package lee.scut.edu.mycook;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsonlee on 10/1/15.
 */
public class PlayerService extends Service {
    public List<String> musicList;// 存放找到的所有mp3的绝对路径。
    public MediaPlayer player; // 定义多媒体对象
    public int songNum; // 当前播放的歌曲在List中的下标
    public String songName; // 当前播放的歌曲名

    public PlayerService() {
        musicList = new ArrayList<String>();
        player = new MediaPlayer();
//        File[] mp3s = App.MUSIC_PATH.listFiles(new FilenameFilter() {
//
//            @Override
//            public boolean accept(File dir, String filename) {
//                return filename.endsWith(".mp3");
//            }
//        });
//
//        if (mp3s.length > 0) {
//            for (File file : mp3s) {
//                musicList.add(file.getAbsolutePath());
//            }
//        }
        musicList.add("http://www.lizhengxian.com/test_A.mp3");
    }

    public void start() {
        try {
            player.reset(); //重置多媒体
            String dataSource = musicList.get(songNum);//得到当前播放音乐的路径
            setPlayName(dataSource);//截取歌名
            player.setDataSource(dataSource);//为多媒体对象设置播放路径
            player.prepare();//准备播放
            player.start();//开始播放
            //setOnCompletionListener 当当前多媒体对象播放完成时发生的事件
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer arg0) {
                    next();//如果当前歌曲播放完毕,自动播放下一首.
                }
            });
        } catch (Exception e) {
            Log.v("MusicService", e.getMessage());
        }
    }

    public void next() {
        songNum = songNum == musicList.size() - 1 ? 0 : songNum + 1;
        start();
    }

    public void setPlayName(String dataSource) {
        String[] ss = dataSource.split("/");
//        File file = new File(dataSource);//假设为D:\\mm.mp3
//        String name = file.getName();//name=mm.mp3
        String name = ss[ss.length-1];
        int index = name.lastIndexOf(".");//找到最后一个.
        songName = name.substring(0, index);//截取为mm
    }

    public void stop() {
        if (player.isPlaying()) {
            player.stop();
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null) {
            if ("init".equals(intent.getStringExtra("action"))) {
                Intent in = new Intent("music.list");
                in.putStringArrayListExtra("music.list", (ArrayList<String>) musicList);
                sendBroadcast(in);
            } else if ("play".equals(intent.getStringExtra("action"))) {
                songNum = intent.getIntExtra("position", -1);
                if (songNum > -1) {
                    start();
                }
            } else if ("stop".equals(intent.getStringExtra("action"))) {
                stop();
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    enum State {Playing, Stopped, Reading, Stopping}

    ;
}
