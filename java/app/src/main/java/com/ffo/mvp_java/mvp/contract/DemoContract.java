package com.ffo.mvp_java.mvp.contract;

/**
 * @author: huchunhua
 * @create_time: 2018/5/2
 * @change_time:
 * @package: com.ffo.mvp_java.mvp.contract
 * @project: java
 * @mail: huchunhua5@wasu.com
 * @describe: 一句话描述
 */
public interface DemoContract {
    interface View{
        void demoView(String test);
    }

    interface Presenter{
        void demoPresenter();
    }

    interface Model{
        void demoModel(ModelListener modelListener);

        interface ModelListener{
            void completed(String test);
        }
    }
}
