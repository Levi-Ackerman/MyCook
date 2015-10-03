package lee.scut.edu.mycook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YuecaiActivity extends BaseCaiActivity implements View.OnTouchListener {

    List<String> foodList = new ArrayList<>();
    TextView tv_tilte;
    ListView listView;
    ListAdapter adapter ;
    VideoView videoView;
    ScrollView foodDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuecai);
        listView = (ListView)findViewById(R.id.lv_foods);
        listView.setOnItemClickListener(this);
        tv_tilte = (TextView)findViewById(R.id.tv_food_title);
        videoView = (VideoView)findViewById(R.id.vv_videoView);
        videoView.setOnTouchListener(this);
        foodDetail = (ScrollView)findViewById(R.id.food_detail);
        initFoodList();
        setListViewAdapter();
        int clickItem = loadInt(App.FOOD_LIST_POS,-1);
        if(clickItem > -1){
            listView.performItemClick(null,clickItem,0);
        }
    }

    private void initFoodList() {
        foodList.clear();
        foodList.add("白切鸡");
        foodList.add("隆江猪脚饭");
        foodList.add("猪肉卷");
    }

    private void setListViewAdapter() {
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        for (String path : foodList) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fileName", path);
            data.add(map);
        }
        adapter = new SimpleAdapter(this, data,
                android.R.layout.simple_list_item_1,
                new String[]{"fileName"}, new int[]{android.R.id.text1});
        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Map<String,String> map = (Map<String, String>) listView.getAdapter().getItem(position);
        tv_tilte.setText(map.get("fileName"));
        foodDetail.setVisibility(View.VISIBLE);
        saveInt(App.FOOD_LIST_POS,position);
    }

    private void playVedio(){
//        Uri uri = Uri.parse("http://pan.baidu.com/play/video#video/path=%2Ftest1.mp4&t=-1");
        Uri uri = Uri.fromFile(new File(App.MUSIC_PATH+"/ms720.wmv"));
//调用系统自带的播放器
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(uri, "video/mp4");
        startActivity(intent);
//        File file=new File("/sdcard/ms720.wmv");
//        if(file.exists()){
//            //VideoView与MediaController进行关联
//            videoView.setVideoPath(file.getAbsolutePath());
//            videoView.setMediaController(mediaco);
//            mediaco.setMediaPlayer(videoView);
//            //让VideiView获取焦点
//            videoView.requestFocus();
//            videoView.start();
//        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        playVedio();
        return false;
    }
}
