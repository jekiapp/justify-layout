package com.muzakki.ahmad.samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.muzakki.ahmad.layout.JustifyLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JustifyLayout parent = (JustifyLayout) findViewById(R.id.parent);
        for(int i=0;i<6;i++){
            View item = getLayoutInflater().inflate(R.layout.menu_item,null);
            parent.addView(item);
        }
    }
}
