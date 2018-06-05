package alphabet.adviserconn.NewCharpter.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import alphabet.adviserconn.NewCharpter.adapter.MailAdapter;
import alphabet.adviserconn.NewCharpter.bean.Mail;
import alphabet.adviserconn.R;
import alphabet.adviserconn.base.BaseFragment;
import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReceiveFragment extends BaseFragment {
    Context context;

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    MailAdapter mailAdapter;
    List<Mail> list;

    public ReceiveFragment() {

    }

    @Override
    protected void iniView() {
        context = getActivity();
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setAddDuration(1000);
        recyclerview.setItemAnimator(defaultItemAnimator);
        recyclerview.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        recyclerview.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));

        //读取第一行剧本
        InputStream inputStream = getResources().openRawResource(R.raw.chapter1);
        String charpter1_1 = getString(inputStream);

        //解析json
        Gson gson = new Gson();
        list = gson.fromJson(charpter1_1, new TypeToken<List<Mail>>() {
        }.getType());

        //加载第一行对话
        mailAdapter = new MailAdapter(context, list);
        recyclerview.setAdapter(mailAdapter);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_receive;
    }

    public static String getString(InputStream inputStream) {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "utf-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer sb = new StringBuffer("");
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
