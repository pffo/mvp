package com.ffo.ipet.mvp

/**
 * @author: huchunhua
 * @create_time: 2018/4/24
 * @change_time:
 * @package: com.ffo.ipet.mvp
 * @project: pet
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */

public interface IPresenter<in V> {

    /**
     * bind View
     */
    fun register(view: V)

    /**
     * unBind View
     */
    fun unRegister();
}