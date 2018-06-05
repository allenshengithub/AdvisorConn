package alphabet.adviserconn.ImaginarySpace;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import alphabet.adviserconn.R;
import alphabet.adviserconn.base.BaseActivity;
import alphabet.adviserconn.utils.AnimeUtil;
import alphabet.adviserconn.utils.SPUtil;
import alphabet.adviserconn.widget.ConfigDialog;
import alphabet.adviserconn.widget.EndingsDialog;
import alphabet.adviserconn.widget.MyAlertDialog;
import alphabet.adviserconn.widget.StaffDialog;
import alphabet.adviserconn.widget.StartDialog;
import alphabet.adviserconn.widget.TipsDialog;
import butterknife.BindView;

public class ImaginarySpaceActivity2 extends BaseActivity implements View.OnTouchListener {

    ChatAdapter chatAdapter;
    int position = 0;
    Timer timer = new Timer();
    TimerTask timerTask;
    List<Text4> list;
    Context context;
    Gson gson;
    AssetManager assetManager = null;
    Handler handler = new Handler();
    Runnable runnable;
    int i = 0;//文本读取计数器

    String content;//当前需要加载的文本

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void initView() {
        context = getBaseContext();
        assetManager = getAssets();
        //加载item动画
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setAddDuration(1000);
        recyclerview.setItemAnimator(defaultItemAnimator);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerview.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        loadFirstLine();

        generateTimer();

        handler.postDelayed(runnable, 2000);
    }

    private void generateTimer() {
        runnable = new Runnable() {
            @Override
            public void run() {
                if (i >= list.size()) {
                    if (timerTask != null)
                        timerTask.cancel();
                    if (timer != null)
                        timer.cancel();
                } else {
                    switch (list.get(i).getType()) {
                        case ("left_text"):
                            content = list.get(i).getLeft_single();
                            addItem();
                            break;
                        case ("right_click"):
                            content = list.get(i).getRight_single();
                            break;
                        case ("left_pic"):
                            addItem();
                            break;
                        case ("left_voice"):
                            addItem();
                            break;
                        case ("right_option"):
                            list.get(i).setType("right_text");
                            list.get(i).setOptions();

                            break;

                        case ("left_answer"):

                            break;
                        //选项经过转换后的文本
                        case ("right_text"):
                            content = list.get(i).getContent();

                            break;

                    }
                }
            }
        };
    }

    private void loadFirstLine() {
        //读取第一行剧本
//        InputStream inputStream = getResources().openRawResource(R.raw.chapter1_0);
//        String chapter1_0 = getString(inputStream);

        //解析json
        gson = new Gson();
//        mainList = gson.fromJson(chapter1_0, new TypeToken<List<Text4>>() {
//        }.getType());
        content = list.get(0).getContent();

        //加载第一行对话
//        chatAdapter = new ChatAdapter(this, mainList);
        recyclerview.setAdapter(chatAdapter);


        //加载charpter1_1剧本
//        InputStream inputStream2 = getResources().openRawResource(R.raw.chapter1_1);
//        String chapter1_1 = getString(inputStream2);
//        mainList = gson.fromJson(chapter1_1, new TypeToken<List<Text4>>() {
//        }.getType());
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


    private void addItem() {
        position++;
//        chatAdapter.addData(position, mainList.get(mainTxtCount), content);
        if (!isUserTouching)
            recyclerview.scrollToPosition(position);
        i++;
        handler.postDelayed(runnable, 2000);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (timerTask != null)
            timerTask.cancel();
        if (timer != null)
            timer.cancel();
    }

    boolean isUserTouching = false;

    Handler userTouchHandler = new Handler();
    Runnable userTouchRunnable = new Runnable() {
        @Override
        public void run() {
            isUserTouching = false;
        }
    };

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                isUserTouching = true;
                break;
            case MotionEvent.ACTION_MOVE:
                isUserTouching = true;
                break;
            case MotionEvent.ACTION_UP:
                userTouchHandler.postDelayed(userTouchRunnable, 3000);
                break;
            default:
                break;
        }

        return false;
    }

    @Override
    public int getLayoutResID() {
        return R.layout.activity_imaginary_space;
    }
}
