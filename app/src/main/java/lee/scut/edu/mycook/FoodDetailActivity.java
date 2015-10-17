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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lee.scut.edu.mycook.entity.FoodDetails.FoodComent;

public class FoodDetailActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    List<FoodComent> foodComents = new ArrayList<>();
    TextView tvTilte;
    ListView lv_comments;
    ListView lv_materials;
    ListView lv_steps;
    ListAdapter commentListAdapter;
    ArrayAdapter<CharSequence> gradeArrayAdapter;
    ImageButton videoView;
    TextView tvContent;
    Spinner spinner;
    CheckBox cb_done;
    Button btn_coment;

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
        showToast(isChecked+"");
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        lv_comments = (ListView) findViewById(R.id.lv_foods);
        tvTilte = (TextView) findViewById(R.id.tv_food_title);
        tvContent = (TextView) findViewById(R.id.tv_content);
        videoView = (ImageButton) findViewById(R.id.vv_videoView);
        videoView.setOnClickListener(this);
        spinner = (Spinner)findViewById(R.id.sp_grade);
        cb_done = (CheckBox)findViewById(R.id.cb_done);
        btn_coment = (Button)findViewById(R.id.btn_coment);

        gradeArrayAdapter = ArrayAdapter.createFromResource(this,R.array.grade,android.R.layout.simple_spinner_item);
        gradeArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(gradeArrayAdapter);
        spinner.setOnItemSelectedListener(this);
        spinner.setSelection(gradeArrayAdapter.getCount() - 1);
        cb_done.setOnCheckedChangeListener(this);
        btn_coment.setOnClickListener(this);

        initCommentList();
        setListViewAdapter();
    }

    private void initCommentList() {
        foodComents.clear();
        FoodComent com = new FoodComent(3, true, "吃货是我", "生抽代替老抽，效果更好的", "2015.10.10 14:32");
        foodComents.add(com);
        com = new FoodComent(5, true, "一张馅饼", "食材好多啊，光准备就要很久了", "2015.10.10 14:32");
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
        commentListAdapter = new SimpleAdapter(this, data,
                R.layout.item_food_coment,
                new String[]{"grade", "done", "userName", "content", "time"}, new int[]{R.id.coment_grade, R.id.coment_done, R.id.coment_userName, R.id.coment_content, R.id.coment_datetime});
        lv_comments.setAdapter(commentListAdapter);
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
