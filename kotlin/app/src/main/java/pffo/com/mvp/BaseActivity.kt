package com.ffo.ipet.mvp

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.ffo.ipet.mvp.contract.DemoContract
import com.ffo.ipet.mvp.imp.BasePresenter
import com.ffo.ipet.ui.activity.BaseActivity
import com.ffo.util.log.LogUtil

/**
 * @author: huchunhua
 * @create_time: 2018/4/26
 * @change_time:
 * @package: com.ffo.ipet.mvp
 * @project: pet
 * @mail: huchunhua5wasu.com
 * @describe: 一句话描述
 */
public open abstract class BaseActivity<V: IView , P : BasePresenter<V , V>>() : Activity(), IView {

    companion object {
        val log: LogUtil = LogUtil(BaseActivity::class.simpleName.toString())
    }

    protected lateinit var iPersenter: P

    protected var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log.infoMark("BaseActivity onCreate")
        bindView()
        context = this;
    }

    override fun onDestroy() {
        log.infoMark("BaseActivity onDestroy")
        context = null;

        super.onDestroy()
    }

    override fun getViewContext(): Context {
        return context ?: let { throw ExceptionInInitializerError("context is null") }
    }

    override fun bindView() {
        log.info("BaseActivity bindView")
        iPersenter = createPresenter()
        iPersenter.register(this)
    }

    override fun unBindView() {
        log.info("BaseActivity unBindView")
        iPersenter.unRegister()
    }

    /**
     * must init presenter
     */
    abstract fun createPresenter(): P;

}