package com.ffo.mvp_java.mvp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.ffo.mvp_java.R;
import com.ffo.mvp_java.mvp.base.BaseActivity;
import com.ffo.mvp_java.mvp.contract.DemoContract;
import com.ffo.mvp_java.mvp.presenter.DemoPresenter;

/**
 * @author: huchunhua
 * @create_time: 2018/5/2
 * @change_time:
 * @package: com.ffo.mvp_java.mvp.ui
 * @project: java
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public class DemoActivity extends BaseActivity<DemoPresenter> implements DemoContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPresenter.demoPresenter();

    }

    @Override
    protected DemoPresenter createPresenter() {
        return new DemoPresenter();
    }

    @Override
    public void demoView(String test) {
        Toast.makeText(this, test, Toast.LENGTH_LONG).show();
    }

}
