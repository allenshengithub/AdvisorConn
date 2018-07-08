package alphabet.adviserconn;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

/**
 * Created by user on 2017/12/9.
 */
public class MyApp extends Application {

    public static MyApp app;
    public static Context context;

    ArrayList<Activity> list = new ArrayList<Activity>();
    @Override
    public void onCreate() {
        context = this.getApplicationContext();
        app = this;
        super.onCreate();
        MobileAds.initialize(this, "ca-app-pub-9885585575069784~3957016956");
    }

    public void init(){
        //设置该CrashHandler为程序的默认处理器
//        UnCeHandler catchExcep = new UnCeHandler(this);
//        Thread.setDefaultUncaughtExceptionHandler(catchExcep);
    }

    /**
     * Activity关闭时，删除Activity列表中的Activity对象*/
    public void removeActivity(Activity a){
        list.remove(a);
    }

    /**
     * 向Activity列表中添加Activity对象*/
    public void addActivity(Activity a){
        list.add(a);
    }

    /**
     * 关闭Activity列表中的所有Activity*/
    public void finishActivity(){
        for (Activity activity : list) {
            if (null != activity) {
                activity.finish();
            }
        }
        //杀死该应用进程
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
