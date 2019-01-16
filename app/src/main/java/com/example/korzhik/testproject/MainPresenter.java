package com.example.korzhik.testproject;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;


@InjectViewState
public class MainPresenter extends MvpPresenter<IMainView> {
    public void  login(String login, String password){
        getViewState().load();
        APIHelper.login(new APIHelper.OnCallback() {
            @Override
            public void callback() {
                getViewState().ok();
            }

            @Override
            public void error() {
                getViewState().error();
            }
        });
    }
}
