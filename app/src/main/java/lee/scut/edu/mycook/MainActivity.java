package lee.scut.edu.mycook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    ImageButton ibPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.ib_player).setOnClickListener(this);
        findViewById(R.id.ib_caixi).setOnClickListener(this);
        findViewById(R.id.ib_mall).setOnClickListener(this);
//        getItem("home", "test.php","1", Item.class, new OnJsonReturnListener<Item>() {
//            @Override
//            public void onJsonReturn(Item result) {
//                System.out.println(result.name + "");
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_exit) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib_player:
                jumpToActivity(SongCategoryActivity.class);
                break;
            case R.id.ib_caixi:
                jumpToActivity(FoodListActivity.class);
                break;
            case R.id.ib_mall:
                Intent in = new Intent(Intent.ACTION_VIEW);
                in.setData(Uri.parse("http://www.taobao.com"));
                startActivity(in);
        }
    }
}
