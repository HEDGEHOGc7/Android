package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) this.findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub
                setTitle("submit succeeded");
                Intent intent = new Intent(MainActivity.this,choose.class);
           //     startActivity(intent);
                Log.i("widgetDemo", "button1 is clicked");
            }
        });
        TextView lblTitle=(TextView)findViewById(R.id.text1);
      //  lblTitle.setAutoLinkMask(Linkify.ALL);
       // lblTitle.setText("<a href=\"http://www.baidu.com\">百度</>");
        TextView t = (TextView) this.findViewById(R.id.text1);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTitle("Tab the button below");
            }
        });

    }

}
