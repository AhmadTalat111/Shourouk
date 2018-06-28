package com.example.android.shorouk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FutureMall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mall_activity);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FutureMallFragment())
                .commit();
    }
}
