package com.example.app_mid_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        Button btn2=findViewById(R.id.button2);
        Button btn3=findViewById(R.id.button3);
        Button btn4=findViewById(R.id.button4);
        Button btn5=findViewById(R.id.button5);
        Button btn6=findViewById(R.id.button6);
        Button btn7=findViewById(R.id.button7);
        Button btn8=findViewById(R.id.button8);
        Button btn9=findViewById(R.id.button9);
        GV gv=(GV) getApplicationContext();
        if(gv.getX()==0){
            gv.setX((int) (Math.random()*9+1));
            btn.setText("1");
            btn2.setText("2");
            btn3.setText("3");
            btn4.setText("4");
            btn5.setText("5");
            btn6.setText("6");
            btn7.setText("7");
            btn8.setText("8");
            btn9.setText("9");
            gv.setBtn("1");
            gv.setBtn2("2");
            gv.setBtn3("3");
            gv.setBtn4("4");
            gv.setBtn5("5");
            gv.setBtn6("6");
            gv.setBtn7("7");
            gv.setBtn8("8");
            gv.setBtn9("9");
        }
        else {
            btn.setText(gv.getBtn());
            btn2.setText(gv.getBtn2());
            btn3.setText(gv.getBtn3());
            btn4.setText(gv.getBtn4());
            btn5.setText(gv.getBtn5());
            btn6.setText(gv.getBtn6());
            btn7.setText(gv.getBtn7());
            btn8.setText(gv.getBtn8());
            btn9.setText(gv.getBtn9());
        }
    }
    public void but_click(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==1){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button);
            btn.setText("X");
            gv.setBtn("X");
            gv.setY(1);
        }
        startActivity(intent);
    }
    public void but_click2(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==2){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button2);
            btn.setText("X");
            gv.setBtn2("X");
            gv.setY(2);
        }
        startActivity(intent);
    }
    public void but_click3(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==3){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button3);
            btn.setText("X");
            gv.setBtn3("X");
            gv.setY(3);
        }
        startActivity(intent);
    }
    public void but_click4(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==4){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button4);
            btn.setText("X");
            gv.setBtn4("X");
            gv.setY(4);
        }
        startActivity(intent);
    }
    public void but_click5(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==5){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button5);
            btn.setText("X");
            gv.setBtn5("X");
            gv.setY(5);
        }
        startActivity(intent);
    }
    public void but_click6(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==6){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button6);
            btn.setText("X");
            gv.setBtn6("X");
            gv.setY(6);
        }
        startActivity(intent);
    }
    public void but_click7(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==7){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button7);
            btn.setText("X");
            gv.setBtn7("X");
            gv.setY(7);
        }
        startActivity(intent);
    }
    public void but_click8(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==8){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button8);
            btn.setText("X");
            gv.setBtn8("X");
            gv.setY(8);
        }
        startActivity(intent);
    }
    public void but_click9(View view){
        GV gv=(GV) getApplicationContext();
        Intent intent = new Intent();
        gv.setT(gv.getT()+1);
        if(gv.getX()==9){
            intent.setClass(MainActivity.this, MainActivity3.class);
        }
        else {
            intent.setClass(MainActivity.this, MainActivity2.class);
            Button btn=findViewById(R.id.button9);
            btn.setText("X");
            gv.setBtn9("X");
            gv.setY(9);
        }
        startActivity(intent);
    }
    public void reset(View view){
        GV gv=(GV) getApplicationContext();
        gv.setX(0);
        gv.setT(0);
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }
}