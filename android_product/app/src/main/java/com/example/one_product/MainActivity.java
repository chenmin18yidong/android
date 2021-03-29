package com.example.one_product;

import androidx.appcompat.app.AppCompatActivity;

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

        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
    }

    private  class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {

        }
    }
}