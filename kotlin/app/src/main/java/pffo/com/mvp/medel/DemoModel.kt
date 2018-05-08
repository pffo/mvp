package com.ffo.ipet.mvp.medel

import com.ffo.ipet.mvp.IModel
import com.ffo.ipet.mvp.contract.DemoContract

/**
 * @author: huchunhua
 * @create_time: 2018/4/25
 * @change_time:
 * @package: com.ffo.ipet.mvp.imp
 * @project: pet
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
class DemoModel : IModel, DemoContract.IModel {

    override fun operationData(operationDataListener: DemoContract.IModel.OperationDataListener) {
        operationDataListener.completed("success")
    }

}