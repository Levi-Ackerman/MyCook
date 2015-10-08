package lee.scut.edu.mycook;

import android.os.Bundle;
import android.view.View;

/**
 * Created by jsonlee on 10/8/15.
 */
public class CaiXiActivity extends BaseActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixi);
        findViewById(R.id.ib_yuecai).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib_yuecai:
                jumpToActivity(YuecaiActivity.class);
                break;
        }
    }
}
