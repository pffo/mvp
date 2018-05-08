package com.ffo.mvp_java.mvp.presenter;

import com.ffo.mvp_java.mvp.contract.DemoContract;
import com.ffo.mvp_java.mvp.base.BasePresenter;
import com.ffo.mvp_java.mvp.model.DemoModel;
import com.ffo.mvp_java.mvp.ui.DemoActivity;

/**
 * @author: huchunhua
 * @create_time: 2018/5/2
 * @change_time:
 * @package: com.ffo.mvp_java.mvp.presenter
 * @project: java
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public class DemoPresenter extends BasePresenter<DemoActivity> implements DemoContract.Presenter {

    DemoContract.Model model = new DemoModel();

    @Override
    public void demoPresenter() {
        model.demoModel(new DemoContract.Model.ModelListener() {
            @Override
            public void completed(String test) {
                iView.get().demoView(test);
            }
        });
    }
}
