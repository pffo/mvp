package com.ffo.ipet.mvp.ui

import android.os.Bundle
import android.widget.Toast
import com.ffo.ipet.mvp.BaseActivity
import com.ffo.ipet.mvp.contract.DemoContract
import com.ffo.ipet.mvp.presenter.DemoPresenter

/**
 * @author: huchunhua
 * @create_time: 2018/4/26
 * @change_time:
 * @package: com.ffo.ipet.mvp.ui
 * @project: pet
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
class DemoActivity: BaseActivity<DemoPresenter>(),DemoContract.DemoView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iPersenter.loadUI()
    }

    override fun createPresenter(): DemoPresenter {
        return DemoPresenter()
    }

    override fun operationUI(data: Any) {
        Toast.makeText(context , data.toString() , Toast.LENGTH_LONG).show()
    }

}