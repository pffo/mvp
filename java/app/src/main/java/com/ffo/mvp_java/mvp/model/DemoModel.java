package com.ffo.mvp_java.mvp.model;

import com.ffo.mvp_java.mvp.contract.DemoContract;

/**
 * @author: huchunhua
 * @create_time: 2018/5/2
 * @change_time:
 * @package: com.ffo.mvp_java.mvp.model
 * @project: java
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public class DemoModel implements DemoContract.Model{
    @Override
    public void demoModel(ModelListener modelListener) {
        modelListener.completed("mvp test");
    }
}
