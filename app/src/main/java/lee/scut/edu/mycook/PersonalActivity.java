package lee.scut.edu.mycook;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lee.scut.edu.mycook.view.HorizonalListView;

/**
 * Created by jsonlee on 10/19/15.
 */
public class PersonalActivity extends BaseActivity {
    HorizonalListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new HorizonalListView(this);
        setContentView(listView);
        List<Map<String,String>> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Map<String,String> map = new HashMap<>();
            map.put("name", "yes");
            list.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this,list,android.R.layout.simple_list_item_1,new String[]{"name"},new int[]{android.R.id.text1});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showToast(""+position);
            }
        });
    }
}
