package com.qzh.bottomtabbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.qzh.bottomtabbar.fragment.ContractFragment;
import com.qzh.bottomtabbar.fragment.FindFragment;
import com.qzh.bottomtabbar.fragment.MineFragment;
import com.qzh.bottomtabbar.fragment.WeixinFragment;
import com.qzh.bottomtabhost.BottomTabBar;

public class MainActivity extends AppCompatActivity {

    private BottomTabBar tb_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private <T extends View> T f(int ViewId) {
        return (T) findViewById(ViewId);
    }

    private void initView() {
     tb_bar=f(R.id.bt_tab);
    }

    private void initData() {
        tb_bar.init(getSupportFragmentManager())
                .setImgSize(90, 90)
                .setFontSize(12)
                .setTabPadding(8, 6, 6)
              //  .setChangeColor(Color.GREEN, Color.RED)
                .addTabItem("微信", R.mipmap.ic_weixincheck, R.mipmap.ic_weixinnormal, WeixinFragment.class)
                .addTabItem("通信录", R.mipmap.ic_contratcheck, R.mipmap.ic_contratnormal, ContractFragment.class)
                .addTabItem("发现", R.mipmap.ic_findcheck,R.mipmap.ic_findnormal, FindFragment.class)
                .addTabItem("我", R.mipmap.ic_mecheck,R.mipmap.ic_menormal, MineFragment.class)
                .setTabBarBackgroundResource(R.drawable.bg_bar)
                .isShowDivider(false)
                .setCurrentTab(0)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name, View view) {
                      //  tb_bar.m

                    }
                });

    }


}
