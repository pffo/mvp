package com.ffo.ipet.mvp.imp

import com.ffo.ipet.mvp.IPresenter
import com.ffo.ipet.mvp.IView
import com.ffo.util.log.LogUtil
import java.lang.ref.WeakReference

/**
 * @author: huchunhua
 * @create_time: 2018/4/26
 * @change_time:
 * @package: com.ffo.ipet.mvp.imp
 * @project: pet
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */

open class BasePresenter<V : IView> : IPresenter<V> {
    companion object {
        val log: LogUtil = LogUtil(BasePresenter::class.simpleName.toString())
    }

    protected var iView: WeakReference<V>? = null;

    override fun register(view: V) {
        log.infoMark("------>BasePresenter bindView<------")
        iView = WeakReference<V>(view)
    }

    override fun unRegister() {
        log.infoMark("BasePresenter unBindView")
        iView?.clear()
    }
}