package com.yuto.automatic_deployment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yuto.deployment_library.TestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtil.test();
    }
}
