package com.ffo.ipet.mvp.contract

/**
 * @author: huchunhua
 * @create_time: 2018/4/26
 * @change_time:
 * @package: com.ffo.ipet.mvp.contract
 * @project: pet
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public interface DemoContract{

    /**
     * View
     */
    public interface DemoView{
        fun operationUI(data: Any)
    }

    /**
     * Presenter
     */
    interface DemoPresenter{
        fun loadUI()
    }

    /**
     * Model
     */
    interface IModel{
        fun operationData(operationDataListener : OperationDataListener);

        interface OperationDataListener{
            fun completed(data:Any);
        }
    }
}