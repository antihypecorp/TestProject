package com.example.korzhik.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends MvpAppCompatActivity implements IMainView{

    @InjectPresenter
    public MainPresenter presenter;

    @BindView(R.id.login_view)
    public EditText login;

    @BindView(R.id.progress)
    public ProgressBar pb;

    @BindView(R.id.password_view)
    public EditText pass;

    @BindView(R.id.login_button)
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login("1", "1");
            }
        });
    }

    private void setProgress(boolean flag) {
        if (flag) {
            login.setVisibility(View.GONE);
            pass.setVisibility(View.GONE);
            btn.setVisibility(View.GONE);
            pb.setVisibility(View.VISIBLE);
        } else {
            login.setVisibility(View.VISIBLE);
            pass.setVisibility(View.VISIBLE);
            btn.setVisibility(View.VISIBLE);
            pb.setVisibility(View.GONE);
        }
    }

    @Override
    public void load() {
        setProgress(true);
    }

    @Override
    public void ok() {
        setProgress(false);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void error() {
        setProgress(false);
        Toast.makeText(getApplicationContext(), "ERRRORRR", Toast.LENGTH_SHORT).show();
    }
}
