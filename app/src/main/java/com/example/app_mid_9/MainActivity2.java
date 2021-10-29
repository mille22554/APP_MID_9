package com.example.app_mid_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv=findViewById(R.id.textView);
        GV gv=(GV) getApplicationContext();
        if(gv.getX()>gv.getY()){
            tv.setText("太小");
        }
        else {
            tv.setText("太大");
        }
    }
    public void but_click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}