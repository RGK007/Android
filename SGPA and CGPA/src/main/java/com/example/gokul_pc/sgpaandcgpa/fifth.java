package com.example.gokul_pc.sgpaandcgpa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fifth extends AppCompatActivity {

    EditText a1,a2,a3,a4,a5,a6,a7,a8,o;
    Button b;
    float sum = 0,sum1=0;
    int count=0;
    String s ="";
    float a[] = new float[8];
    final Context c=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth);
        a1=(EditText)findViewById(R.id.num1);
        a2=(EditText)findViewById(R.id.num2);
        a3=(EditText)findViewById(R.id.num3);
        a4=(EditText)findViewById(R.id.num4);
        a5=(EditText)findViewById(R.id.num5);
        a6=(EditText)findViewById(R.id.num6);
        a7=(EditText)findViewById(R.id.num7);
        a8=(EditText)findViewById(R.id.num8);
        b=(Button)findViewById(R.id.nxt1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a[0]=Float.valueOf(a1.getText().toString());
                a[1]=Float.valueOf(a2.getText().toString());
                a[2]=Float.valueOf(a3.getText().toString());
                a[3]=Float.valueOf(a4.getText().toString());
                a[4]=Float.valueOf(a5.getText().toString());
                a[5]=Float.valueOf(a6.getText().toString());
                a[6]=Float.valueOf(a7.getText().toString());
                a[7]=Float.valueOf(a8.getText().toString());
                for(int i=0;i<8;i++)
                {
                    if(a[i]>0)
                    {
                        sum=sum+a[i];
                        count++;
                    }
                }
                sum1=sum/count;
                Intent i=new Intent(c,sixth.class);
                i.putExtra("CGPA",sum1);
                startActivity(i);
            }
        });
    }
}

