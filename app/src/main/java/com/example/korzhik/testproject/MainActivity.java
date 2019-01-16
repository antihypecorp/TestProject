package com.example.korzhik.testproject;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NAME = "KEY_NAME";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener //объявление навигации
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override                                                                                   //листенер навигации
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.navigation_dashboard:
                    selectedFragment = new DashFragment();
                    break;
                case R.id.navigation_notifications:
                    selectedFragment = new NotifFragment();
                    break;
            }
            assert selectedFragment != null;
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
            .commit();
            return true;
        }
    };


    public static final String APP_PREFERENCES = "Quest_cash";
    public static final String APP_PREFERENCES_NAME = "Nickname";
    public static final String APP_PREFERENCES_DESCRIPTION = "Description";
    public static final String APP_PREFERENCES_TEXT = "Text";
    public static final String APP_PREFERENCES_AGELEVEL = "Level";
    SharedPreferences mSettings;


    @Override                                                                                       //первый звпуск
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new HomeFragment())
                .commit();

        navigation.setSelectedItemId(R.id.navigation_home);

        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        Editor editor = mSettings.edit();
        editor.putString(APP_PREFERENCES_NAME, "@string/id101_names");
        editor.putString(APP_PREFERENCES_DESCRIPTION, "@string/id101_short_description");
        editor.putString(APP_PREFERENCES_TEXT, "@string/id101_long_description");
        editor.apply();
        editor.commit();
    }

}