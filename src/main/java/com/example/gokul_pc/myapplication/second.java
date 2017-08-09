package com.example.gokul_pc.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {

    EditText a1,a2,a3,a4,a5,a6,a7,a8,a9,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button b;
    int z = 0, sum = 0, sum1 = 0;
    String s[] = new String[9];
    int a[] = new int[9];
    float v1=0;
final  Context c=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        a1=(EditText)findViewById(R.id.num1);
        a2=(EditText)findViewById(R.id.num2);
        a3=(EditText)findViewById(R.id.num3);
        a4=(EditText)findViewById(R.id.num4);
        a5=(EditText)findViewById(R.id.num5);
        a6=(EditText)findViewById(R.id.num6);
        a7=(EditText)findViewById(R.id.num7);
        a8=(EditText)findViewById(R.id.num8);
        a9=(EditText)findViewById(R.id.num9);
        b1=(EditText)findViewById(R.id.nu1);
        b2=(EditText)findViewById(R.id.nu2);
        b3=(EditText)findViewById(R.id.nu3);
        b4=(EditText)findViewById(R.id.nu4);
        b5=(EditText)findViewById(R.id.nu5);
        b6=(EditText)findViewById(R.id.nu6);
        b7=(EditText)findViewById(R.id.nu7);
        b8=(EditText)findViewById(R.id.nu8);
        b9=(EditText)findViewById(R.id.nu9);
        b=(Button)findViewById(R.id.nxt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s[0] = a1.getText().toString();
                a[0] = Integer.valueOf(b1.getText().toString());
                s[1] = a2.getText().toString();
                a[1] = Integer.valueOf(b2.getText().toString());
                s[2] = a3.getText().toString();
                a[2] = Integer.valueOf(b3.getText().toString());
                s[3] = a4.getText().toString();
                a[3] = Integer.valueOf(b4.getText().toString());
                s[4] = a5.getText().toString();
                a[4] = Integer.valueOf(b5.getText().toString());
                s[5] = a6.getText().toString();
                a[5] = Integer.valueOf(b6.getText().toString());
                s[6] = a7.getText().toString();
                a[6] = Integer.valueOf(b7.getText().toString());
                s[7] = a8.getText().toString();
                a[7] = Integer.valueOf(b8.getText().toString());
                s[8] = a9.getText().toString();
                a[8] = Integer.valueOf(b9.getText().toString());
                for (int i = 0; i < 9; i++)
                {
                    if (s[i].equalsIgnoreCase("s")) {
                        z = 10;
                    } else if (s[i].equalsIgnoreCase("a")) {
                        z = 9;
                    } else if (s[i].equalsIgnoreCase("b")) {
                        z = 8;
                    } else if (s[i].equalsIgnoreCase("c")) {
                        z = 7;
                    } else if (s[i].equalsIgnoreCase("d")) {
                        z = 6;
                    }else if (s[i].equalsIgnoreCase("e")) {
                        z = 5;
                    }else {
                        z = 0;
                    }
                    sum = sum + z * a[i];
                    sum1 = sum1 + a[i];
                }

                v1=(float)sum/sum1;

                Intent i=new Intent(c,third.class);
                i.putExtra("SGPA",v1);
                startActivity(i);
            }
        });







    }
}
