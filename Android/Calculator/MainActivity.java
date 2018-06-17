package com.example.iquest.calculator;

import android.support.v7.app.AppCompatActivity;
import java.io.*;
import  java.lang.Character;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but0,butM,butD,butA,butS,butEQ,butC,butP,butDEL;
    TextView ans,ans2;
    double var1,var2;
    int add,sub,mul,div,p=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1=(Button) findViewById(R.id.but1);
        but2=(Button) findViewById(R.id.but2);
        but3=(Button) findViewById(R.id.but3);
        but4=(Button) findViewById(R.id.but4);
        but5=(Button) findViewById(R.id.but5);
        but6=(Button) findViewById(R.id.but6);
        but7=(Button) findViewById(R.id.but7);
        but8=(Button) findViewById(R.id.but8);
        but9=(Button) findViewById(R.id.but9);
        but0=(Button) findViewById(R.id.but0);
        butP=(Button) findViewById(R.id.butP);
        butM=(Button) findViewById(R.id.butM);
        butA=(Button) findViewById(R.id.butA);
        butD=(Button) findViewById(R.id.butD);
        butS=(Button) findViewById(R.id.butS);
        butC=(Button) findViewById(R.id.butC);
        butEQ=(Button) findViewById(R.id.butEQ);
      //  butDEL=(Button) findViewById(R.id.butDEL);


        ans=(TextView) findViewById(R.id.textView);
        ans2=(TextView) findViewById(R.id.textView2);







        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"1");
            }
        });


        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"2");
            }
        });

        but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"3");
            }
        });

        but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"4");
            }
        });

        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"5");
            }
        });

        but6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"6");
            }
        });

        but7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"7");
            }
        });

        but8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"8");
            }
        });

        but9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"9");
            }
        });

        but0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(ans.getText().toString()+"0");
            }
        });

        butP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(p==0){
                    ans.setText(ans.getText().toString()+".");
                    p=1;
                }
            }
        });


        butM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                char c;
                int l=ans.getText().length();
                if(l!=0) {
                    c = ans.getText().charAt(l - 1);
                    if(Character.isDigit(c)) {
                        if (add == 0 && sub == 0 && div == 0 && mul == 0) {
                            mul = 1;
                            var1 = Double.parseDouble(ans.getText() + "");
                            ans2.setText(ans.getText().toString() + "*");
                            ans.setText(null);
                        } else if ((sub == 1 || add == 1 || mul == 1 || div == 1) && Character.isDigit(c)) {
                            ans2.setText(ans2.getText().toString() + ans.getText().toString());
                            if (sub == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 - var2));
                                sub = 0;
                                p = 0;
                            } else if (add == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 + var2));
                                add = 0;
                                p = 0;
                            } else if (mul == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 * var2));
                                mul = 0;
                                p = 0;
                            } else if (div == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 / var2));
                                div = 0;
                                p = 0;
                            }

                            var1 = Double.parseDouble(ans.getText() + "");
                            ans2.setText(ans.getText().toString() + "*");
                            ans.setText(null);
                            mul = 1;
                        }
                    }
                }
            }
        });

        butD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                char c;
                int l=ans.getText().length();
                if(l!=0) {
                    c = ans.getText().charAt(l - 1);
                    if(Character.isDigit(c)) {
                        if (add == 0 && sub == 0 && div == 0 && mul == 0) {
                            div = 1;
                            var1 = Double.parseDouble(ans.getText() + "");
                            ans2.setText(ans.getText().toString() + "/");
                            ans.setText(null);
                        } else if ((sub == 1 || add == 1 || mul == 1 || div == 1) && Character.isDigit(c)) {
                            ans2.setText(ans2.getText().toString() + ans.getText().toString());
                            if (sub == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 - var2));
                                sub = 0;
                                p = 0;
                            } else if (add == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 + var2));
                                add = 0;
                                p = 0;
                            } else if (mul == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 * var2));
                                mul = 0;
                                p = 0;
                            } else if (div == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 / var2));
                                div = 0;
                                p = 0;
                            }

                            var1 = Double.parseDouble(ans.getText() + "");
                            ans2.setText(ans.getText().toString() + "/");
                            ans.setText(null);
                            div = 1;
                        }
                    }
            }
            }
        });

        butA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                char c;
                int l=ans.getText().length();

                if(l!=0) {
                    c = ans.getText().charAt(l - 1);
                    if(Character.isDigit(c)) {

                        if (add == 0 && sub == 0 && div == 0 && mul == 0) {
                            add = 1;
                            var1 = Double.parseDouble(ans.getText() + "");
                            ans2.setText(ans.getText().toString() + "+");
                            ans.setText(null);
                        } else if ((sub == 1 || add == 1 || mul == 1 || div == 1) && Character.isDigit(c)) {
                            ans2.setText(ans2.getText().toString() + ans.getText().toString());
                            if (sub == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 - var2));
                                sub = 0;
                                p = 0;
                            } else if (add == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 + var2));
                                add = 0;
                                p = 0;
                            } else if (mul == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 * var2));
                                mul = 0;
                                p = 0;
                            } else if (div == 1) {
                                var2 = Double.parseDouble(ans.getText() + "");
                                ans.setText(String.format("%.4f", var1 / var2));
                                div = 0;
                                p = 0;
                            }
                            var1 = Double.parseDouble(ans.getText() + "");
                            ans2.setText(ans.getText().toString() + "+");
                            ans.setText(null);
                            add = 1;
                        }
                    }
                }

            }

        });

        butS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                char c;
                int l=ans.getText().length();
                if(l!=0) {
                    c = ans.getText().charAt(l - 1);}
                else{c=0;}
                if(Character.isDigit(c) || l==0){
                    if (ans.getText() == "") {
                        ans.setText(String.valueOf("-"));
                    } else if (add == 0 && sub == 0 && div == 0 && mul == 0) {
                        sub = 1;
                        var1 = Double.parseDouble(ans.getText() + "");
                        ans2.setText(ans.getText().toString() + "-");
                        ans.setText(null);
                    } else if ((sub == 1 || add == 1 || mul == 1 || div == 1) && Character.isDigit(c)) {
                        ans2.setText(ans2.getText().toString() + ans.getText().toString());
                        if (sub == 1) {
                            var2 = Double.parseDouble(ans.getText() + "");
                            ans.setText(String.format("%.4f", var1 - var2));
                            sub = 0;
                            p = 0;
                        } else if (add == 1) {
                            var2 = Double.parseDouble(ans.getText() + "");
                            ans.setText(String.format("%.4f", var1 + var2));
                            add = 0;
                            p = 0;
                        } else if (mul == 1) {
                            var2 = Double.parseDouble(ans.getText() + "");
                            ans.setText(String.format("%.4f", var1 * var2));
                            mul = 0;
                            p = 0;
                        } else if (div == 1) {
                            var2 = Double.parseDouble(ans.getText() + "");
                            ans.setText(String.format("%.4f", var1 / var2));
                            div = 0;
                            p = 0;
                        }
                        var1 = Double.parseDouble(ans.getText() + "");
                        ans2.setText(ans.getText().toString() + "-");
                        ans.setText(null);
                        sub = 1;
                    }
                }
            }
        });



/*
        butEQ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(sub || add || mul || div){
                    ans2.setText(ans2.getText().toString()+ans.getText().toString());
                }
                if(sub){
                    var2=Double.parseDouble(ans.getText()+"");
                    ans.setText(String.format("%.4f",var1-var2));
                    sub=false;p=false;
                }
                else if(add){
                    var2=Double.parseDouble(ans.getText()+"");
                    ans.setText(String.format("%.4f",var1+var2));
                    add=false;p=false;
                }
                else if(mul){
                    var2=Double.parseDouble(ans.getText()+"");
                    ans.setText(String.format("%.4f",var1*var2));
                    mul=false;p=false;
                }
                else if(div){
                    var2=Double.parseDouble(ans.getText()+"");
                    ans.setText(String.format("%.4f",var1/var2));
                    div=false;p=false;
                }
            }
        });*/
/*
        butDEL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(ans.getText()!=""){
                    ans2.setText((ans.getText().toString()).substring(0,-1));
                }
            }
        });*/



        butC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ans.setText(null);
                add=sub=div=mul=p=0;
                ans2.setText("Clear".toString());
            }
        });
    }

    public void onDEL(View var1){
        ans=(TextView) findViewById(R.id.textView);
        ans2=(TextView) findViewById(R.id.textView2);
        if(ans.getText().toString().length()!=0)
        {
           // ans.setText("09".toString());
            int l=ans.getText().length();
            ans.setText((ans.getText().toString()).substring(0,l-1));
        }
    }

    public void onEQ(View v){

        char c;
        int l=ans.getText().length();
        if(l!=0){
            c=ans.getText().charAt(l-1);

        if(Character.isDigit(c)) {

            if (sub == 1 || add == 1 || mul == 1 || div == 1) {
                ans2.setText(ans2.getText().toString() + ans.getText().toString());
            }
            if (sub == 1) {
                var2 = Double.parseDouble(ans.getText() + "");
                ans.setText(String.format("%.4f", var1 - var2));
                sub = 0;
                p = 0;
            } else if (add == 1) {
                var2 = Double.parseDouble(ans.getText() + "");
                ans.setText(String.format("%.4f", var1 + var2));
                add = 0;
                p = 0;
            } else if (mul == 1) {
                var2 = Double.parseDouble(ans.getText() + "");
                ans.setText(String.format("%.4f", var1 * var2));
                mul = 0;
                p = 0;
            } else if (div == 1) {
                var2 = Double.parseDouble(ans.getText() + "");
                ans.setText(String.format("%.4f", var1 / var2));
                div = 0;
                p = 0;
            }

        }
    }
}}
