package alphabet.adviserconn.ImaginarySpace;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;

import alphabet.adviserconn.utils.UnCeHandler;


/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class AdviserConn extends Application {

    //单例，只生成一个app对象
    public static AdviserConn instance;

    public static AdviserConn getInstance() {
        return instance;
    }
    ArrayList<Activity> list = new ArrayList<Activity>();

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
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