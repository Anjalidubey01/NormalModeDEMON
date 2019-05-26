package com.example.android.demon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private EditText k;
    private TextView l;
    private Button bt;
    private TextView j;
    private TextView q;
    int b = 10;
    int counter = 0;
    boolean r = false;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        k = (EditText)findViewById(R.id.editText);
        l = (TextView)findViewById(R.id.textView3);
        bt = (Button)findViewById(R.id.button2);
        q = (TextView) findViewById(R.id.textView4);


        st = getIntent().getExtras().getString("value");

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {counter++;
                if(counter>b){bt.setEnabled(false);}
                else{
                    int n = Integer.parseInt(k.getText().toString());
                    int m = Integer.parseInt(st);
                    if(m == n){r = true;
                    l.setText("same Age value");
                    q.setText("CONGRATS you won");}
                    else if (n > m) {
                        l.setText("higher age Value");
                        q.setText("incorrect");
                    } else  {
                        l.setText("lower age value");
                        q.setText("incorrect");
                    }



                } }});

        }}




