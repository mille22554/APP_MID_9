package com.example.app_mid_9;

import android.app.Application;

public class GV extends Application {
    private int x=0;
    private int y;
    private int t=0;
    private String btn="1";
    private String btn2="2";
    private String btn3="3";
    private String btn4="4";
    private String btn5="5";
    private String btn6="6";
    private String btn7="7";
    private String btn8="8";
    private String btn9="9";
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setT(int t){
        this.t=t;
    }
    public void setBtn(String btn){
        this.btn=btn;
    }
    public void setBtn2(String btn){
        this.btn2=btn;
    }
    public void setBtn3(String btn){
        this.btn3=btn;
    }
    public void setBtn4(String btn){this.btn4=btn;    }
    public void setBtn5(String btn){
        this.btn5=btn;
    }
    public void setBtn6(String btn){
        this.btn6=btn;
    }
    public void setBtn7(String btn){
        this.btn7=btn;
    }
    public void setBtn8(String btn){
        this.btn8=btn;
    }
    public void setBtn9(String btn){
        this.btn9=btn;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getT(){
        return t;
    }
    public String getBtn(){
        return btn;
    }
    public String getBtn2(){
        return btn2;
    }
    public String getBtn3(){
        return btn3;
    }
    public String getBtn4(){
        return btn4;
    }
    public String getBtn5(){
        return btn5;
    }
    public String getBtn6(){
        return btn6;
    }
    public String getBtn7(){
        return btn7;
    }
    public String getBtn8(){
        return btn8;
    }
    public String getBtn9(){
        return btn9;
    }
}
