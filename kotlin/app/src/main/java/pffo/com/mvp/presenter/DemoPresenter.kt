package com.ffo.ipet.mvp.presenter

import com.ffo.ipet.mvp.BaseActivity
import com.ffo.ipet.mvp.IModel
import com.ffo.ipet.mvp.IView
import com.ffo.ipet.mvp.contract.DemoContract
import com.ffo.ipet.mvp.imp.BasePresenter
import com.ffo.ipet.mvp.medel.DemoModel
import com.ffo.ipet.mvp.ui.DemoActivity
import com.ffo.util.log.LogUtil
import org.jetbrains.annotations.Contract

/**
 * @author: huchunhua
 * @create_time: 2018/4/26
 * @change_time:
 * @package: com.ffo.ipet.mvp.presenter
 * @project: pet
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public class DemoPresenter: BasePresenter<DemoActivity>(), DemoContract.DemoPresenter {

    val iModel: DemoContract.IModel = DemoModel()

    companion object {
        val log: LogUtil = LogUtil(DemoPresenter::class.simpleName.toString())
    }

    override fun loadUI() {
        iModel.operationData(object : DemoContract.IModel.OperationDataListener{
            override fun completed(data: Any) {
//                iView
            }
        })
    }

}
