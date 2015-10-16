package lee.scut.edu.mycook;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jsonlee on 10/8/15.
 */
public class FoodListActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    ImageView[][] ibFoodPictures = new ImageView[3][5];
    TextView[][] tvFoodNames = new TextView[3][5];
    String[] foodNames = {"白切鸡","鱼香茄子","酸辣鸡杂,", "家常土豆饼", "蘑菇三鲜汤", "麻婆豆腐", "湖南小炒肉", "家常早餐鸡蛋饼", "红烧茄子", "醋溜土豆丝", "红烧肉", "鲜带鱼", "豉香江虾炒韭菜", "茄酱鲜虾炒意粉", "鱼香虾仁"};
    String[] foodImgs = {"https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=3688751828,2925574408&fm=58",
            "https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1291496758,915365011&fm=58",
            "https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=836457649,163339023&fm=58",
            "https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3750799260,3055367655&fm=58",
            "https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=547433694,3945283571&fm=58",
            "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=1040129828,2066831421&fm=58",
            "https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=3308351578,4084502962&fm=58",
            "https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=1479773097,2693381756&fm=58",
            "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2874347645,273834514&fm=58",
            "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2102209604,1828486137&fm=58",
            "https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=2410981642,2390975369&fm=58",
            "https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=2379760315,1627755912&fm=58",
            "https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1628219389,1317093217&fm=58",
            "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2548423499,2318854489&fm=58",
            "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=1822663682,1133471582&fm=58"
    };
    View[] vwFoodIncludes = new View[3];

    Button[] btnMores = new Button[3];
    TextView[] tvShowTitles = new TextView[3];
    String[] showTitles = {"当季热门", "猜你喜欢", "历史记录"};
    View[] vwShowIncludes = new View[3];
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        initViews();
        initDatas();
    }

    private void initDatas() {
        for (int i = 0; i < 3; i++) {
            tvShowTitles[i].setText(showTitles[i]);
            for (int j = 0; j < 5; j++) {
                getBitmap().display(ibFoodPictures[i][j],foodImgs[i*5+j]);
                tvFoodNames[i][j].setText(foodNames[i*5+j]);
            }
        }
        initFoodList();
        setListViewAdapter();
    }

    private void initViews() {
        listView = (ListView)findViewById(R.id.lv_foods);
        listView.setOnItemClickListener(this);
        vwShowIncludes[0] = findViewById(R.id.container_pop);
        vwShowIncludes[1] = findViewById(R.id.container_recommand);
        vwShowIncludes[2] = findViewById(R.id.container_history);
        for (int i = 0; i < 3; i++) {
            btnMores[i] = (Button) vwShowIncludes[i].findViewById(R.id.btn_more);
            btnMores[i].setTag(i);
            btnMores[i].setOnClickListener(this);
            tvShowTitles[i] = (TextView) vwShowIncludes[i].findViewById(R.id.tv_kind);
            vwFoodIncludes[i] = vwShowIncludes[i].findViewById(R.id.lay_show);
            for (int j = 0; j < 5; j++) {
                ibFoodPictures[i][j] = (ImageView) vwFoodIncludes[i].findViewById(R.id.vw_food0 + j).findViewById(R.id.ib_foodImg);
                tvFoodNames[i][j] = (TextView) vwFoodIncludes[i].findViewById(R.id.vw_food0 + j).findViewById(R.id.tv_food_simple);
                ibFoodPictures[i][j].setTag(100+i*10+j);
                ibFoodPictures[i][j].setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View v) {
        final int tag = (int)v.getTag();
        if (tag>=100){
            // food image clicked
            jumpToActivity(FoodDetailActivity.class);
        }
        else{
            //button clicked
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        jumpToActivity(FoodDetailActivity.class);
    }

    List<String> foodList = new ArrayList<>();
    ListAdapter adapter ;
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
}
