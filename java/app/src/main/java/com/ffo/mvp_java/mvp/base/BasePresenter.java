package com.ffo.mvp_java.mvp.base;


import android.util.Log;

import com.ffo.mvp_java.mvp.*;

import java.lang.ref.WeakReference;

/**
 * @author: huchunhua
 * @create_time: 2018/5/2
 * @change_time:
 * @package: com.ffo.mvp_java.mvp.imp
 * @project: java
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public class BasePresenter<V> implements IPresenter<V> {
    public static final String TAG = "BasePresenter";

    protected WeakReference<V> iView;

    @Override
    public void register(V view) {
        Log.i(TAG, "BasePresenter register: ");
        iView = new WeakReference<V>(view);
    }

    @Override
    public void unRegister() {
        Log.i(TAG, "BasePresenter unRegister: ");
        iView.clear();
    }
}
