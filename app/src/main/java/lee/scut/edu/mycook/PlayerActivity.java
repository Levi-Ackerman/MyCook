package lee.scut.edu.mycook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jsonlee on 10/1/15.
 */
public class PlayerActivity extends BaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    ListView listView;
    Button btnPlay;
    TextView tvName;
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
        btnPlay = (Button) findViewById(R.id.btn_play);
        btnPlay.setOnClickListener(this);
        tvName = (TextView) findViewById(R.id.tv_songname);

        IntentFilter filter = new IntentFilter("music.list");
        registerReceiver(receiver, filter);
        Intent in = getIntentToService("init");
        startService(in);
    }

    private Intent getIntentToService(String action){
        Intent in = new Intent(this, PlayerService.class);
        in.putExtra("action", action);
        return in;
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
                R.layout.item_food_name_text,
                new String[]{"fileName"}, new int[]{R.id.tv_item});
        listView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Map<String,String> map = (Map<String, String>) listView.getAdapter().getItem(position);
        tvName.setText(map.get("fileName"));
        Intent in = getIntentToService("play");
        in.putExtra("position",position);
        startService(in);
    }

    @Override
    public void onClick(View v) {
        startService(getIntentToService("stop"));
    }
}
