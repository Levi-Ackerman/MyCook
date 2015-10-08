package lee.scut.edu.mycook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YuecaiActivity extends BaseCaiActivity implements View.OnClickListener {

    List<String> foodList = new ArrayList<>();
    TextView tvTilte;
    ListView listView;
    ListAdapter adapter ;
    ImageButton videoView;
    ScrollView foodDetail;
    TextView tvContent;
    Food currentFood;

    @Override
    public void onClick(View v) {
        playVedio();
    }

    class Food{
        String content;

        String videoUrl;

        public Food(String content, String videoUrl) {
            this.content = content;
            this.videoUrl = videoUrl;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuecai);
        listView = (ListView)findViewById(R.id.lv_foods);
        listView.setOnItemClickListener(this);
        tvTilte = (TextView)findViewById(R.id.tv_food_title);
        tvContent = (TextView)findViewById(R.id.tv_content);
        videoView = (ImageButton)findViewById(R.id.vv_videoView);
        videoView.setOnClickListener(this);
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
        tvTilte.setText(map.get("fileName"));
        foodDetail.setVisibility(View.VISIBLE);
        saveInt(App.FOOD_LIST_POS, position);

        currentFood = new Food("白切鸡的具体做法如下:\n白切鸡的佐餐调料，各地风味除少数地区就地取材用特殊原料外，种类可以千变万化，主要是调料配制的不同而形成了独特的口味。调料组合得当，不仅具有特殊的香气，而且可获得意想不到的异味，使白切鸡更觉脍炙人口。\n" +
                "1、把蒜切成末，香葱、香菜洗净切成末。\n" +
                "2、用一个碗装起来，放到微波炉加热30秒钟，使它们的香味飘出来后，放一点点糖，调入适量鲜贝露调味汁/美极调味汁，滴一两滴香油调匀。\n" +
                "3、鸡的处理：在北京市区里是禁止活家禽买卖的，所以买回来的鸡是已经杀好并做了拔毛开膛等初步处理了的，只需将鸡洗干净，切去鸡爪甲即可。\n" +
                "4、在锅里面加入水、大料、八角、大葱段、姜片、蒜瓣、料酒。\n" +
                "5、水烧开就把鸡放进去，最好水没过一整只鸡。",App.MUSIC_PATH+"/ms720.wmv");
        tvContent.setText(currentFood.content);
    }

    private void playVedio(){
        Uri uri = Uri.parse("http://www.lizhengxian.com/testVideo.flv");
//        Uri uri = Uri.fromFile(new File(currentFood.videoUrl));
//调用系统自带的播放器
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(uri, "video/mp4");
        startActivity(intent);
    }
}
