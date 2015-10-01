package lee.scut.edu.mycook;

import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

/**
 * Created by jsonlee on 10/1/15.
 */
public class BaseActivity extends ActionBarActivity {
    protected void showToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
