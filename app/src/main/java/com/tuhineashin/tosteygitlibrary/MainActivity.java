package com.tuhineashin.tosteygitlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tuhineashin.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.SimpleToastGit(MainActivity.this, "Hello World");
    }
}