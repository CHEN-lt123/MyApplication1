package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;//第一次使用要先增加import
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //設定原件為變數
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(new Temp());
        //鼠標點擊紅字>左邊出現驚嘆號小燈泡>creat inner class
    }


    private class Temp implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            textView.setText("Hellow World!");
        }
        ////鼠標點擊紅色波浪底線字串>左邊出現驚嘆號小燈泡>implements methods>ok
    }
}