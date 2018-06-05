package alphabet.adviserconn.base;

/**
 * Created by Administrator on 2016/9/30.
 * 网络请求时的回调，获取Bean
 */
public interface BeanCallback<Bean> {
    public void onSuccess(Bean bean, int count);
    public void onError();
}
