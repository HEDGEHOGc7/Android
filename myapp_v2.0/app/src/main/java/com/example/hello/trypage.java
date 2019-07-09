package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import android.content.Intent;

public class trypage extends AppCompatActivity {
    private List<item> List = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trypage);
        Button btn = (Button) this.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub
                setTitle("Submission succeeded");
                Intent intent = new Intent(trypage.this,MainActivity.class);
                startActivity(intent);
                //      Log.i("widgetDemo", "button1 is clicked");
            }
        });
        Init();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyRecyclerView adapter = new MyRecyclerView( List );
        recyclerView.setAdapter(adapter);
    }
    private void Init() {
        item phone1 = new item("华为 P30pro", R.drawable.pic1, "1");
        List.add(phone1);
        item phone2 = new item("OPPO Reno", R.drawable.pic2, "2");
        List.add(phone2);
        item phone3 = new item("Vivo X27", R.drawable.pic3, "3");
        List.add(phone3);
        item phone4 = new item("小米MIX4", R.drawable.pic4, "4");
        List.add(phone4);
        item phone5 = new item("一加 7pro", R.drawable.pic5, "5");
        List.add(phone5);
        item phone6 = new item("三星 Galaxy10", R.drawable.pic6, "6");
        List.add(phone6);
        item phone7 = new item("华为 Nova5", R.drawable.pic7, "7");
        List.add(phone7);
        item phone8 = new item("Vivo IQOO",R.drawable.pic8,"8");
        List.add(phone8);
        item phone9 = new item("OPPO K3",R.drawable.pic9,"9");
        List.add(phone9);
        item phone10 = new item("小米 9",R.drawable.pic10,"10");
        List.add(phone10);
    }

}
