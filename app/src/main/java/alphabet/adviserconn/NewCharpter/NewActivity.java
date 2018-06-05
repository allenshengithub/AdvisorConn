package alphabet.adviserconn.NewCharpter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import alphabet.adviserconn.NewCharpter.fragment.ContactsFragment;
import alphabet.adviserconn.NewCharpter.fragment.MeFragment;
import alphabet.adviserconn.NewCharpter.fragment.ReceiveFragment;
import alphabet.adviserconn.NewCharpter.fragment.SendFragment;
import alphabet.adviserconn.R;
import alphabet.adviserconn.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewActivity extends BaseActivity {

    @BindView(R.id.avatar)
    ImageView avatar;
    @BindView(R.id.content)
    FrameLayout content;
    @BindView(R.id.receive)
    RadioButton receive;
    @BindView(R.id.send)
    RadioButton send;
    @BindView(R.id.contacts)
    RadioButton contacts;
    @BindView(R.id.me)
    RadioButton me;
    @BindView(R.id.rg_tab)
    RadioGroup rgTab;


    ContactsFragment fragment3;
    SendFragment fragment2;
    ReceiveFragment fragment1;
    MeFragment fragment4;
    private FragmentManager fragmentManager;

    @Override
    protected void initView() {
        fragmentManager = getSupportFragmentManager();
        receive.performClick();
    }

    @Override
    public int getLayoutResID() {
        return R.layout.activity_new;
    }


    @OnClick({R.id.set, R.id.edit, R.id.receive, R.id.send, R.id.contacts, R.id.me})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.set:

                break;
            case R.id.edit:

                break;
            case R.id.receive:
                setTabSelection(0);
                break;
            case R.id.send:
                setTabSelection(1);
                break;
            case R.id.contacts:
                setTabSelection(2);
                break;
            case R.id.me:
                setTabSelection(3);
                break;
        }
    }

    private void setTabSelection(int index) {
        // 开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
        hideFragments(transaction);
        switch (index) {
            case 0:
                if (fragment1 == null) {
                    fragment1 = new ReceiveFragment();
                    transaction.add(R.id.content, fragment1);
                } else
                    transaction.show(fragment1);
                break;
            case 1:
                if (fragment2 == null) {
                    fragment2 = new SendFragment();
                    transaction.add(R.id.content, fragment2);
                } else
                    transaction.show(fragment2);
                break;
            case 2:
                if (fragment3 == null) {
                    fragment3 = new ContactsFragment();
                    transaction.add(R.id.content, fragment3);
                } else
                    transaction.show(fragment3);
                break;
            case 3:
                if (fragment4 == null) {
                    fragment4 = new MeFragment();
                    transaction.add(R.id.content, fragment4);
                } else
                    transaction.show(fragment4);
                break;
        }
        transaction.commit();
    }

    private void hideFragments(FragmentTransaction transaction) {
        if (fragment1 != null)
            transaction.hide(fragment1);
        if (fragment2 != null)
            transaction.hide(fragment2);
        if (fragment3 != null)
            transaction.hide(fragment3);
        if (fragment4 != null)
            transaction.hide(fragment4);
    }


    //通过判断这个fragment对象，如果属于FragmentTab类并且该类还未被实例化过，
    // 则将Activity的成员变量mFragmentTabX指向该fragment对象，这样就可以在原来的fragment对象上操作add/show/hide，因此不会有UI重叠现象
    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment1 == null && fragment instanceof ReceiveFragment) {
            fragment1 = (ReceiveFragment) fragment;
        } else if (fragment2 == null && fragment instanceof SendFragment) {
            fragment2 = (SendFragment) fragment;
        } else if (fragment3 == null && fragment instanceof ContactsFragment) {
            fragment3 = (ContactsFragment) fragment;
        } else if (fragment4 == null && fragment instanceof MeFragment) {
            fragment4 = (MeFragment) fragment;
        }
    }
}
