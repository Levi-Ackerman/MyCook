package lee.scut.edu.mycook;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lee.scut.edu.mycook.entity.FoodDetails.Food;
import lee.scut.edu.mycook.entity.FoodLists.FoodListItem;
import lee.scut.edu.mycook.entity.FoodLists.FoodLists;
import lee.scut.edu.mycook.entity.FoodLists.FoodRecommend;

/**
 * Created by jsonlee on 10/8/15.
 */
public class FoodListActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    String json = "{\"result\":true,\"foodlists\":{\"allFoods\":[{\"name\":\"白切鸡\",\"id\":1},{\"name\":\"麻婆豆腐\",\"id\":2}],\"popFoods\":[{\"name\":\"辣白菜\",\"id\":21,\"picUrl\":\"https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3750799260,3055367655&fm=58\"},{\"name\":\"鸡杂\",\"id\":23,\"picUrl\":\"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1291496758,915365011&fm=58\"}],\"recommendFood\":[{\"name\":\"酸辣土豆丝\",\"id\":51,\"picUrl\":\"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=2379760315,1627755912&fm=58\"},{\"name\":\"红烧茄子\",\"id\":43,\"picUrl\":\"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1628219389,1317093217&fm=58\"}],\"historyFood\":[{\"name\":\"小炒肉\",\"id\":32,\"picUrl\":\"https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2548423499,2318854489&fm=58\"},{\"name\":\"鸡蛋饼\",\"id\":33,\"picUrl\":\"https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=1822663682,1133471582&fm=58\"}]}}";
    FoodLists foodLists = null;
    List<FoodRecommend>[] foodRecommendLists; //3个推荐列表
    ImageView[][] ibFoodPictures = new ImageView[3][5];
    TextView[][] tvFoodNames = new TextView[3][5];
    View[] vwFoodIncludes = new View[3];
    Button[] btnMores = new Button[3];
    TextView[] tvShowTitles = new TextView[3];
    String[] showTitles = {"粤菜", "湘菜", "川菜"};
    View[] vwShowIncludes = new View[3];
    private ListView listView;
    EditText etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        getJson();
        initViews();
        initDatas();
    }

    private void getJson() {
//            JSONObject ele = new JSONObject(json);
//            String list = ele.getString("foodlists");
//            foodLists = gson.fromJson(list, FoodLists.class);
        foodLists = offlineData.foodLists;
        foodRecommendLists = new List[]{foodLists.popFoods, foodLists.recommendFood, foodLists.historyFood};

    }

    private void initDatas() {
        for (int i = 0; i < 3; i++) {
            tvShowTitles[i].setText(showTitles[i]);
            for (int j = 0; j < foodRecommendLists[i].size(); j++) {
                getBitmap().display(ibFoodPictures[i][j], foodRecommendLists[i].get(j).picUrl);
                tvFoodNames[i][j].setText(foodRecommendLists[i].get(j).name);
            }
        }
        setListViewAdapter(null);
    }

    private void initViews() {
        etSearch = (EditText) findViewById(R.id.et_search_caipu);
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s==null||s.equals("")){
                    setListViewAdapter(null);
                }
                else{
                    setListViewAdapter(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        listView = (ListView) findViewById(R.id.lv_foods);
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
                ibFoodPictures[i][j].setTag(foodRecommendLists[i].get(j).id);
                ibFoodPictures[i][j].setOnClickListener(this);
                vwFoodIncludes[i].findViewById(R.id.vw_food0 + j).setVisibility(j >= foodRecommendLists[i].size() ? View.INVISIBLE : View.VISIBLE);
            }
        }
    }

    @Override
    public void onClick(View v) {
        final int id = (int) v.getTag();
        // food image clicked
        FoodDetailActivity.foodId = id;
        jumpToActivity(FoodDetailActivity.class);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        FoodDetailActivity.foodId = (int)data.get(position).get("id");
        jumpToActivity(FoodDetailActivity.class);
    }

    ListAdapter adapter;


    List<Map<String, Object>> data;

    private void setListViewAdapter(String searchContent) {
        data = new ArrayList<Map<String, Object>>();
        for (FoodListItem food : foodLists.allFoods) {
            if (searchContent == null || food.name.contains(searchContent)) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("fileName", food.name);
                map.put("id",food.id);
                data.add(map);
            }
        }
        adapter = new SimpleAdapter(this, data,
                android.R.layout.simple_list_item_1,
                new String[]{"fileName"}, new int[]{android.R.id.text1});
        listView.setAdapter(adapter);
    }
}
