package alphabet.adviserconn.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import java.util.Map;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/10/10.
 */
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = View.inflate(getContext(), getLayoutRes(), null);
        //绑定fragment
        ButterKnife.bind(this, layout);
        iniView();
        return layout;

    }

    protected abstract void iniView();

    public void showToast(final String msg) {
        //有可能是子线程
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public abstract int getLayoutRes();

}
