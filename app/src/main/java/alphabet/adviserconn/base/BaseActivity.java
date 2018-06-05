package alphabet.adviserconn.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import butterknife.ButterKnife;


/**
 * Created by Administrator on 2016/11/9.
 */

public abstract class BaseActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
        setContentView(getLayoutResID());
        ButterKnife.bind(this);
        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    protected abstract void initView();

    public abstract int getLayoutResID();

    //子线程或主线程中都可以使用toast
    public void showToast(final String msg) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
