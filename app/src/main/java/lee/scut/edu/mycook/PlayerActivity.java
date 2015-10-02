package lee.scut.edu.mycook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jsonlee on 10/1/15.
 */
public class PlayerActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("music.list")) {
                List<String> musicList = intent.getStringArrayListExtra("music.list");
                setListViewAdapter(musicList);
            }
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        listView = (ListView) findViewById(R.id.lv_songs);
        listView.setOnItemClickListener(this);

        IntentFilter filter = new IntentFilter("music.list");
        registerReceiver(receiver, filter);
        startActionInService("init");
    }

    private void startActionInService(String action){
        Intent in = new Intent(this, PlayerService.class);
        in.putExtra("action", action);
        startService(in);
    }

    private void setListViewAdapter(List<String> musicList) {
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

        for (String path : musicList) {
            Map<String, Object> map = new HashMap<String, Object>();
            File file = new File(path);
            map.put("fileName", file.getName());
            data.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, data,
                android.R.layout.simple_list_item_1,
                new String[]{"fileName"}, new int[]{android.R.id.text1});
        listView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
