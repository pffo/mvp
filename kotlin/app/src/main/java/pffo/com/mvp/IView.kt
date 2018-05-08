package com.ffo.ipet.mvp

import android.content.Context

/**
 * @author: huchunhua
 * @create_time: 2018/4/25
 * @change_time:
 * @package: com.ffo.ipet.mvp
 * @project: pet
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public interface IView{
    /**
     * 获取Context对象，建议非特殊情况不要使用，使用时请考虑是否会造成内存泄漏问题
     */
    fun getViewContext(): Context;

    /**
     * 绑定View
     */
    fun bindView();

    /**
     * 解除View绑定
     */
    fun unBindView();

}