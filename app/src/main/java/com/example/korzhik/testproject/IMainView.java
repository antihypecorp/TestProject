package com.example.korzhik.testproject;

import com.arellomobile.mvp.MvpView;

public interface IMainView extends MvpView {
    void load();
    void ok();
    void error();
}
