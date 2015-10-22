package lee.scut.edu.mycook;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lee.scut.edu.mycook.view.HorizonalListView;

/**
 * Created by jsonlee on 10/19/15.
 */
public class PersonalActivity extends BaseActivity implements View.OnClickListener {
    HorizonalListView listView;
    ListView lvPersonalInfo;
    boolean isLoginIn = true;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        lvPersonalInfo = (ListView) findViewById(R.id.lv_personal_info);
        btnLogin = (Button) findViewById(R.id.btn_login_out);
        btnLogin.setOnClickListener(this);
        if (isLoginIn) {
            loginIn();
        }
    }

    private void loginIn() {
        List<Map<String, String>> info = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("line", "吃货一个");
        info.add(map);
        map = new HashMap<>();
        map.put("line", "男");
        info.add(map);
        map = new HashMap<>();
        map.put("line", "22岁");
        info.add(map);
        map = new HashMap<>();
        map.put("line", "广州");
        info.add(map);
        SimpleAdapter adapter = new SimpleAdapter(this, info, R.layout.item_food_name_text, new String[]{"line"}, new int[]{R.id.tv_item});
        lvPersonalInfo.setAdapter(adapter);
        btnLogin.setText("退出");
    }

    @Override
    public void onClick(View v) {
        popLoginWnd();
    }
}
