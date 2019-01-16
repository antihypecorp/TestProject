package com.example.korzhik.testproject;

import android.os.AsyncTask;

public class APIHelper {
    interface OnCallback {
        void callback();
        void error();
    }

    public static void login(final OnCallback callback) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                callback.callback();
            }
        }.execute();
    }
}
