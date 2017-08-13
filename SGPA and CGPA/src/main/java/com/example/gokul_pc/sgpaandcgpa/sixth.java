package com.example.gokul_pc.sgpaandcgpa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sixth extends AppCompatActivity {

    TextView f,d;
    Button a,b;
    final Context c=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth);
        b=(Button)findViewById(R.id.bck);
        a=(Button)findViewById(R.id.hm);
        f=(TextView)findViewById(R.id.ans);
        Bundle bundle=getIntent().getExtras();
        float f1=bundle.getFloat("CGPA");
        f.setText("The CGPA is="+f1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(c,second.class);
                startActivity(i);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(c,MainActivity.class);
                startActivity(i);
            }
        });
    }
}

