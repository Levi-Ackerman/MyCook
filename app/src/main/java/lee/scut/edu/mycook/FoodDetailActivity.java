package lee.scut.edu.mycook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodDetailActivity extends BaseCaiActivity implements View.OnClickListener {

    List<FoodComent> foodComents = new ArrayList<>();
    TextView tvTilte;
    ListView listView;
    ListAdapter adapter;
    ImageButton videoView;
    ScrollView foodDetail;
    TextView tvContent;
    Food currentFood;

    @Override
    public void onClick(View v) {
        playVedio();
    }

    class FoodComent {
        int grade; //打分
        boolean done; //做过
        String userName;
        String content;
        String time;

        public FoodComent(int grade, boolean done, String userName, String content, String time) {
            this.grade = grade;
            this.done = done;
            this.userName = userName;
            this.content = content;
            this.time = time;
        }
    }

    class Food {
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
        setContentView(R.layout.activity_food_detail);
        listView = (ListView) findViewById(R.id.lv_foods);
        listView.setOnItemClickListener(this);
        tvTilte = (TextView) findViewById(R.id.tv_food_title);
        tvContent = (TextView) findViewById(R.id.tv_content);
        videoView = (ImageButton) findViewById(R.id.vv_videoView);
        videoView.setOnClickListener(this);
        foodDetail = (ScrollView) findViewById(R.id.food_detail);
        initCommentList();
        setListViewAdapter();
        int clickItem = loadInt(App.FOOD_LIST_POS, -1);
        if (clickItem > -1) {
            listView.performItemClick(null, clickItem, 0);
        }
    }

    private void initCommentList() {
        foodComents.clear();
        FoodComent com = new FoodComent(3, true, "吃货是我", "生抽代替老抽，效果更好的", "2015.10.10 14:32");
        foodComents.add(com);
    }

    private void setListViewAdapter() {
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        for (FoodComent coment : foodComents) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("grade", coment.grade + "分");
            map.put("done", coment.done ? "做过" : "  ");
            map.put("userName", coment.userName);
            map.put("content", coment.content);
            map.put("time", coment.time);
            data.add(map);
        }
        adapter = new SimpleAdapter(this, data,
                R.layout.item_food_coment,
                new String[]{"grade", "done", "userName", "content", "time"}, new int[]{R.id.coment_grade, R.id.coment_done, R.id.coment_userName, R.id.coment_content, R.id.coment_datetime});
        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Map<String, String> map = (Map<String, String>) listView.getAdapter().getItem(position);
        tvTilte.setText(map.get("fileName"));
        foodDetail.setVisibility(View.VISIBLE);
        saveInt(App.FOOD_LIST_POS, position);

        currentFood = new Food("白切鸡的具体做法如下:\n" +
                "\t1、把蒜切成末，香葱、香菜洗净切成末。\n" +
                "\t2、用一个碗装起来，放到微波炉加热30秒钟，使它们的香味飘出来后，放一点点糖，调入适量鲜贝露调味汁/美极调味汁，滴一两滴香油调匀。\n" +
                "\t3、鸡的处理：在北京市区里是禁止活家禽买卖的，所以买回来的鸡是已经杀好并做了拔毛开膛等初步处理了的，只需将鸡洗干净，切去鸡爪甲即可。\n" +
                "\t4、在锅里面加入水、大料、八角、大葱段、姜片、蒜瓣、料酒。\n" +
                "\t5、水烧开就把鸡放进去，最好水没过一整只鸡。", App.MUSIC_PATH + "/testVideo.flv");
        tvContent.setText(currentFood.content);
    }

    private void playVedio() {
        Uri uri = Uri.parse("http://www.lizhengxian.com/testVideo.flv");
//        Uri uri = Uri.fromFile(new File(currentFood.videoUrl));
//调用系统自带的播放器
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(uri, "video/mp4");
        startActivity(intent);
    }
}
