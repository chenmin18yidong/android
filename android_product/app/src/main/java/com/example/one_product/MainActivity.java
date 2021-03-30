package com.example.one_product;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button mBtnTextView;
   private Button mBtnButton;
   private Button mBtnEditText;
   private Button mBtnRadioButton;
   //可以用逗号拼接

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnRadioButton = findViewById(R.id.btn_textView);
        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到TextView掩饰页面
                Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
    }

    private  class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {

        }
    }
}