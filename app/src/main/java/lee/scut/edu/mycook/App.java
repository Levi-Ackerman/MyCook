package lee.scut.edu.mycook;

import android.app.Application;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;

/**
 * Created by jsonlee on 10/1/15.
 */
public class App extends Application {
    public static final String FOOD_LIST_POS = "pos";
    public static final File MUSIC_PATH = Environment
            .getExternalStorageDirectory();// 找到music存放的路径。
}
