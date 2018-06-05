package alphabet.adviserconn;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;

import alphabet.adviserconn.ImaginarySpace.ImaginarySpaceActivity;
import alphabet.adviserconn.NewCharpter.NewActivity;
import alphabet.adviserconn.base.BaseActivity;
import alphabet.adviserconn.widget.StartDialog;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @Override
    protected void initView() {

    }

    @Override
    public int getLayoutResID() {
        return R.layout.activity_main;
    }

    ProgressDialog progressDialog;
    @OnClick({R.id.imaginary_space, R.id.new_charpter})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imaginary_space:
                startActivity(new Intent(this, ImaginarySpaceActivity.class));
                break;
            case R.id.new_charpter:
                progressDialog = new ProgressDialog(this);
                progressDialog.show();
                new Thread() {
                    @Override
                    public void run() {
                        super.run();
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        startActivity(new Intent(MainActivity.this, NewActivity.class));
                        if (progressDialog != null && progressDialog.isShowing()) {
                            progressDialog.dismiss();
                        }
                    }
                }.start();
                break;
        }
    }
}
