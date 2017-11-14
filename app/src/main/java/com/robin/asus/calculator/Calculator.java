package com.robin.asus.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.robin.asus.calculator.Model.User;

public class Calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,btnc;
    EditText et;
    double val1,val2;
    boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1=(Button) findViewById(R.id.Button1);
        b2=(Button) findViewById(R.id.Button2);
        b3=(Button) findViewById(R.id.Button3);
        b4=(Button) findViewById(R.id.Button4);
        b5=(Button) findViewById(R.id.Button5);
        b6=(Button) findViewById(R.id.Button6);
        b7=(Button) findViewById(R.id.Button7);
        b8=(Button) findViewById(R.id.Button8);
        b9=(Button) findViewById(R.id.Button9);
        b0=(Button) findViewById(R.id.Button0);
        bdot=(Button) findViewById(R.id.Button10);
        badd=(Button) findViewById(R.id.Button11);
        bsub=(Button) findViewById(R.id.Button12);
        bmul=(Button) findViewById(R.id.Button13);
        bdiv=(Button) findViewById(R.id.Button14);
        beq=(Button) findViewById(R.id.Button15);
        btnc=(Button) findViewById(R.id.ButtonC);
        et=(EditText) findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"1");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                et.setText(null);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(et.getText()+"");
                add=true;
                et.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(et.getText()+"");
                sub=true;
                et.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(et.getText()+"");
                div=true;
                et.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(et.getText()+"");
                mul=true;
                et.setText(null);
            }
        });

        beq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val2=Double.parseDouble(et.getText()+"");
                if (add==true) {
                    et.setText(val1+val2+"");
                    add=false;
                }
                if (sub==true) {
                    et.setText(val1-val2+"");
                    sub=false;
                }
                if (mul==true) {
                    et.setText(val1*val2+"");
                    mul=false;
                }
                if (div==true) {
                    et.setText(val1/val2+"");
                    div=false;
                }
            }
        });
    }
}
