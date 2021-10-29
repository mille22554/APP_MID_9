package com.example.app_mid_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView tv=findViewById(R.id.textView5);
        GV gv=(GV) getApplicationContext();
        tv.setText("共猜了"+gv.getT()+"次");
    }
    public void but_click(View view){
        GV gv=(GV) getApplicationContext();
        gv.setX(0);
        gv.setT(0);
        Intent intent = new Intent();
        intent.setClass(MainActivity3.this, MainActivity.class);
        startActivity(intent);
    }
}