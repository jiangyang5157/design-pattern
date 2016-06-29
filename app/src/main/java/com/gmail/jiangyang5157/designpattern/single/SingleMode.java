package com.gmail.jiangyang5157.designpattern.single;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.gmail.jiangyang5157.designpattern.R;

public class SingleMode extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        setupViews();
        initialization();
    }

    private void setupViews() {
    }

    private void initialization() {
        SingletonEnum singletonEnum = SingletonEnum.getInstance();
        Log.i("#### SingleMode ####", String.valueOf(Boolean.valueOf(singletonEnum != null)));
    }
}