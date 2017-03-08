package com.a.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn1=(Button) findViewById(R.id.button1);
        Button bn2=(Button) findViewById(R.id.button2);
        Button bn3=(Button) findViewById(R.id.button3);
        bn1.setOnClickListener(new Test1());
        bn2.setOnClickListener(new Test2());
        bn3.setOnClickListener(new Test3());

    }
    class Test1 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            setContentView(R.layout.test1);
        }
    }
    class Test2 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            setContentView(R.layout.test2);
        }
    }
    class Test3 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            setContentView(R.layout.test3);
        }
    }
}
