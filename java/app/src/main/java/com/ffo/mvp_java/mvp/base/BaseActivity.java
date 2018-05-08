package com.ffo.mvp_java.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ffo.mvp_java.mvp.IView;

/**
 * @author: huchunhua
 * @create_time: 2018/5/2
 * @change_time:
 * @package: com.ffo.mvp_java.mvp.base
 * @project: java
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public abstract class BaseActivity<P extends BasePresenter> extends Activity implements IView{
    protected P iPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        UnbindView();
    }

    @Override
    public void bindView() {
        iPresenter = createPresenter();
        iPresenter.register(this);
    }

    @Override
    public void UnbindView() {
        iPresenter.unRegister();
    }

    protected abstract P createPresenter();
}
