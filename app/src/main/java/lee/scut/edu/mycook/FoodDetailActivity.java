package lee.scut.edu.mycook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lee.scut.edu.mycook.entity.FoodDetails.Food;
import lee.scut.edu.mycook.entity.FoodDetails.FoodComent;
import lee.scut.edu.mycook.entity.FoodDetails.FoodMaterial;
import lee.scut.edu.mycook.entity.FoodDetails.FoodStep;
import lee.scut.edu.mycook.view.ResizeListView;

public class FoodDetailActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    String json = "{\"result\":true,\"food\":{\"id\":32,\"name\":\"麻婆豆腐\",\"introduction\":\"有名的川菜，让你流口水\",\"isFavorite\":true,\"isUp\":false,\"picUrl\":\"http://i3.meishichina.com/attachment/recipe/201102/201102172239235.jpg\",\"videoUrl\":\"http://www.lizhengxian.com/video.mp4\",\"foodMaterials\":[{\"materialName\":\"豆腐\",\"weight\":\"100g\"},{\"materialName\":\"辣酱\",\"weight\":\"1勺\"},{\"materialName\":\"酱油\",\"weight\":\"1小碟\"},{\"materialName\":\"大蒜\",\"weight\":\"半颗\"}],\"foodSteps\":[{\"number\":1,\"step\":\"豆腐切块，装盘，要嫩\"},{\"number\":2,\"step\":\"辣酱炒熟，淋在豆腐上\"},{\"number\":3,\"step\":\"等待十分钟，豆腐充分吸收\"}],\"foodComents\":[{\"grade\":5,\"done\":true,\"userName\":\"萌萌哒是我\",\"content\":\"这么简单就能做，十分钟就会了\",\"time\":\"2015.09.0814:32\"},{\"grade\":2,\"done\":false,\"userName\":\"叶良辰来也\",\"content\":\"辣酱要选对，我偏爱湖南的辣酱，正宗\",\"time\":\"2015.10.0809:12\"}]}}";
    TextView tvTilte;
    ListView lv_comments;
    ResizeListView lv_materials;
    ResizeListView lv_steps;
    ListAdapter materialListAdapter;
    ListAdapter stepListAdapter;
    ListAdapter commentListAdapter;
    ArrayAdapter<CharSequence> gradeArrayAdapter;
    ImageButton videoView;
    TextView tvContent;
    Spinner spinner;
    CheckBox cbDone;
    CheckBox cbFavorite;
    CheckBox cbUp;
    Button btn_comment;

    Food food;

    @Override
    public void onClick(View v) {
        playVedio();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        showToast(parent.getItemAtPosition(position).toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        showToast(isChecked + "");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        lv_comments = (ListView) findViewById(R.id.lv_foods);
        lv_materials = (ResizeListView) findViewById(R.id.lv_materal);
        lv_steps = (ResizeListView) findViewById(R.id.lv_steps);
        tvTilte = (TextView) findViewById(R.id.tv_food_title);
        tvContent = (TextView) findViewById(R.id.tv_content);
        videoView = (ImageButton) findViewById(R.id.vv_videoView);
        videoView.setOnClickListener(this);
        spinner = (Spinner) findViewById(R.id.sp_grade);
        cbDone = (CheckBox) findViewById(R.id.cb_done);
        cbFavorite = (CheckBox) findViewById(R.id.cb_favorite);
        cbUp = (CheckBox) findViewById(R.id.cb_up);
        btn_comment = (Button) findViewById(R.id.btn_coment);

        gradeArrayAdapter = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_item);
        gradeArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(gradeArrayAdapter);

        spinner.setOnItemSelectedListener(this);
        spinner.setSelection(gradeArrayAdapter.getCount() - 1);
        cbDone.setOnCheckedChangeListener(this);
        cbUp.setOnCheckedChangeListener(this);
        cbFavorite.setOnCheckedChangeListener(this);
        btn_comment.setOnClickListener(this);

        initCommentList();
        setListViewAdapter();
        setOtherViews();
    }

    private void setOtherViews() {
        tvTilte.setText(food.name);
        tvContent.setText(food.introduction);
        cbFavorite.setChecked(food.isFavorite);
        cbUp.setChecked(food.isUp);
        getBitmap().display(videoView, food.picUrl);
    }

    private void initCommentList() {
        List<FoodComent> foodComents = new ArrayList<>();
        FoodComent com = new FoodComent(3, true, "吃货是我", "生抽代替老抽，效果更好的", "2015.10.10 14:32");
        foodComents.add(com);
        com = new FoodComent(5, true, "一张馅饼", "食材好多啊，光准备就要很久了", "2015.10.10 14:32");
        foodComents.add(com);

        List<FoodMaterial> materials = new ArrayList<>();
        FoodMaterial material = new FoodMaterial("鸡肉", "1只");
        materials.add(material);
        material = new FoodMaterial("大蒜", "两瓣");
        materials.add(material);
        material = new FoodMaterial("辣椒", "2个");
        materials.add(material);
        material = new FoodMaterial("酱油", "一小碟");
        materials.add(material);

        List<FoodStep> steps = new ArrayList<>();
        FoodStep step = new FoodStep(1, "把鸡给片好，炖煮三十分钟");
        steps.add(step);
        step = new FoodStep(2, "切蒜泥，弄好在盘子里");
        steps.add(step);
        step = new FoodStep(3, "切生姜");
        steps.add(step);

//        food = new Food("白切鸡", "白切鸡是一道色香味俱全的汉族传统名肴，属于粤菜系鸡肴中最普通的一种，是正宗的客家特有菜肴，属浸鸡类，以其制作简易，刚熟不烂，不加配料且保持原味为特点。", true, false,
//                "http://i3.meishichina.com/attachment/recipe/201102/201102172239235.jpg", "http://www.lizhengxian.com/video.mp4",
//                materials, steps, foodComents);
        try {
            JSONObject obj = new JSONObject(json);
            food = gson.fromJson(obj.getString("food"),Food.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void setListViewAdapter() {
        List<Map<String, Object>> materials = new ArrayList<Map<String, Object>>();
        for (FoodMaterial material : food.foodMaterials) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", material.materialName);
            map.put("weight", material.weight);
            materials.add(map);
        }
        materialListAdapter = new SimpleAdapter(this, materials, R.layout.item_food_material,
                new String[]{"name", "weight"}, new int[]{R.id.material_name, R.id.material_weight});
        lv_materials.setAdapter(materialListAdapter);

        List<Map<String, Object>> steps = new ArrayList<Map<String, Object>>();
        for (FoodStep step : food.foodSteps) {
            Map<String, Object> map = new HashMap<>();
            map.put("content", step.number + "、" + step.step);
            steps.add(map);
        }
        stepListAdapter = new SimpleAdapter(this, steps, R.layout.item_food_step, new String[]{"content"}, new int[]{R.id.tv_item});
        lv_steps.setAdapter(stepListAdapter);

        List<Map<String, Object>> coments = new ArrayList<Map<String, Object>>();
        for (FoodComent coment : food.foodComents) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("grade", coment.grade + "分");
            map.put("done", coment.done ? "做过" : "  ");
            map.put("userName", coment.userName);
            map.put("content", coment.content);
            map.put("time", coment.time);
            coments.add(map);
        }
        commentListAdapter = new SimpleAdapter(this, coments,
                R.layout.item_food_coment,
                new String[]{"grade", "done", "userName", "content", "time"}, new int[]{R.id.coment_grade, R.id.coment_done, R.id.coment_userName, R.id.coment_content, R.id.coment_datetime});
        lv_comments.setAdapter(commentListAdapter);
    }


    private void playVedio() {
        Uri uri = Uri.parse(food.videoUrl);
//        Uri uri = Uri.fromFile(new File(currentFood.videoUrl));
//调用系统自带的播放器
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(uri, "video/mp4");
        startActivity(intent);
    }
}
