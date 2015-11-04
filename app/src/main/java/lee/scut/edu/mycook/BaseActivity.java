package lee.scut.edu.mycook;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import net.tsz.afinal.FinalBitmap;
import net.tsz.afinal.FinalHttp;
import net.tsz.afinal.http.AjaxCallBack;
import net.tsz.afinal.http.AjaxParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsonlee on 10/1/15.
 */
public abstract class BaseActivity extends ActionBarActivity {
    Gson gson = new Gson();
    Handler handler = new Handler();
//    final String url = "http://125.216.243.195:8080/MyCook";
    final String url = "http://www.lizhengxian.com";
    protected void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    protected void jumpToActivity(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

    private static SharedPreferences preferences;

    private SharedPreferences getPreferences() {
        if (preferences == null)
            preferences = getSharedPreferences("app", MODE_PRIVATE);
        return preferences;
    }

    protected int loadInt(String key, int defaultValue) {
        return getPreferences().getInt(key, defaultValue);
    }

    protected void saveInt(String key, int value) {
        getPreferences().edit().putInt(key, value).commit();
    }

    private static FinalHttp http;

    protected static FinalHttp getHttp() {
        if (http == null)
            http = new FinalHttp();
        return http;
    }

    protected FinalBitmap getBitmap(){
        return FinalBitmap.create(this);
    }
    protected void getJsonResFromHttp(final String url, final Class type, final OnJsonReturnListener listener) {
        final ProgressDialog dlg = new ProgressDialog(this);
        dlg.setTitle("正在加载，请稍候");
        dlg.show();
        final Thread thread = new Thread() {
            @Override
            public void run() {
                String jsonString = getHttp().getSync(url).toString();
                Object result = gson.fromJson(jsonString, type);
                dlg.cancel();
                listener.onJsonReturn(result);
            }
        };
        thread.start();
    }

    protected void getItem(final String home,final String type,final String id, final Class clazz,final OnJsonReturnListener listener) {
        final ProgressDialog dlg = new ProgressDialog(this);
        dlg.setTitle("正在加载，请稍候");
        dlg.show();
        final Thread thread = new Thread() {
            @Override
            public void run() {
                AjaxParams params = new AjaxParams("id", id);
                String jsonString = getHttp().getSync(url + "/" + home+"/"+type, params).toString();
                Object item = gson.fromJson(jsonString, clazz);
                dlg.cancel();
                listener.onJsonReturn(item);
            }
        };
        thread.start();
    }
    protected Activity getActivity(){
        return this;
    }
    protected void popLoginWnd(){
        View loginWnd = getLayoutInflater().inflate(R.layout.window_login, null);
        EditText etUsername = (EditText) loginWnd.findViewById(R.id.et_username);
        EditText etPasswd = (EditText) loginWnd.findViewById(R.id.et_passwd);
        new AlertDialog.Builder(this).setView(loginWnd).setTitle("登录").setPositiveButton("登录", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showToast("登录成功");
            }
        }).setNegativeButton("注册", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                View registerWnd = getLayoutInflater().inflate(R.layout.window_register, null);

                Spinner spGender = (Spinner)registerWnd.findViewById(R.id.sp_gender);
                ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.gender, android.R.layout.simple_spinner_item);
                spGender.setAdapter(genderAdapter);

                Spinner spCity = (Spinner)registerWnd.findViewById(R.id.sp_city);
                ArrayAdapter<CharSequence> cityAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.city,android.R.layout.simple_spinner_item);
                spCity.setAdapter(cityAdapter);

                DatePicker dpBorn = (DatePicker)registerWnd.findViewById(R.id.dp_date);
                final TextView tvBorn = (TextView)registerWnd.findViewById(R.id.tv_date);
                tvBorn.setText("1990/01/01");
                dpBorn.init(1990, 0, 1, new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        tvBorn.setText(year+"/"+(1+monthOfYear)+"/"+dayOfMonth);
                    }
                });

                new AlertDialog.Builder(getActivity()).setView(registerWnd).setTitle("注册").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setPositiveButton("注册", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();
            }
        }).show();
    }
}
