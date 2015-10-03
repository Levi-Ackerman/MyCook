package lee.scut.edu.mycook;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

/**
 * Created by jsonlee on 10/1/15.
 */
public abstract class BaseActivity extends ActionBarActivity {
    protected void showToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
    protected void jumpToActivity(Class clazz) {
        Intent intent = new Intent(this,clazz);
        startActivity(intent);
    }
    private static SharedPreferences preferences;
    private SharedPreferences getPreferences(){
        if(preferences == null)
            preferences = getSharedPreferences("app",MODE_PRIVATE);
        return preferences;
    }
    protected int loadInt(String key,int defaultValue){
        return getPreferences().getInt(key,defaultValue);
    }
    protected void saveInt(String key,int value){
        getPreferences().edit().putInt(key,value).commit();
    }
}
