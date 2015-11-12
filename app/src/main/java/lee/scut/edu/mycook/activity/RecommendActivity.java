package lee.scut.edu.mycook.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lee.scut.edu.mycook.R;
import lee.scut.edu.mycook.entity.FoodLists.FoodListItem;
import lee.scut.edu.mycook.entity.FoodLists.FoodRecommend;

/**
 * Created by jsonlee on 11/12/15.
 */
public class RecommendActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    Button btnYule,btnPersonal,btnShop;
    ListView lvRecommend,lvILike;
    private List<Map<String, Object>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        btnYule = (Button)findViewById(R.id.btnYuLe);
        btnPersonal = (Button)findViewById(R.id.btnPersonal);
        btnShop = (Button)findViewById(R.id.btnShop);
        lvRecommend = (ListView)findViewById(R.id.listRecommend);
        lvILike = (ListView)findViewById(R.id.list_i_like);

        btnYule.setOnClickListener(this);
        btnPersonal.setOnClickListener(this);
        btnShop.setOnClickListener(this);
        lvRecommend.setOnItemClickListener(this);
        lvILike.setOnItemClickListener(this);

        data = new ArrayList<Map<String, Object>>();
        for (FoodListItem food : offlineData.foodLists.allFoods) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("fileName", food.name);
                map.put("id",food.id);
                data.add(map);
        }
        adapterILike = new SimpleAdapter(this, data,
                R.layout.item_food_name_text,
                new String[]{"fileName"}, new int[]{R.id.tv_item});
        lvILike.setAdapter(adapterILike);

        lvRecommend.setAdapter(adapterRecommend);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
    private SimpleAdapter adapterILike;

    private BaseAdapter adapterRecommend = new BaseAdapter(){

        @Override
        public int getCount() {
            return offlineData.foodLists.recommendFood.size();
        }

        @Override
        public Object getItem(int position) {
            return offlineData.foodLists.recommendFood.get(position);
        }

        @Override
        public long getItemId(int position) {
            return offlineData.foodLists.recommendFood.get(position).id;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView == null)
            {
                holder = new ViewHolder();
                LayoutInflater inflater = getLayoutInflater();
                convertView = inflater.inflate(R.layout.item_food_recommend,null);
                holder.tvName = (TextView) convertView.findViewById(R.id.tvFoodName);
                holder.ivRecmd = (ImageView) convertView.findViewById(R.id.ivFood);
                convertView.setTag(holder);
            }
            else{
                holder = (ViewHolder)convertView.getTag();
            }
            FoodRecommend foodRecommend = (FoodRecommend) getItem(position);
            holder.ivRecmd.setImageBitmap(BitmapFactory.decodeFile(foodRecommend.picUrl));
            holder.tvName.setText(foodRecommend.name);
            return convertView;
        }
        class ViewHolder{
            ImageView ivRecmd;
            TextView tvName;
        }
    };
}
