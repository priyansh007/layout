package com.example.priyanshzalavadiya.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }

    public void process(View v) {
        if (v.getId() == R.id.but1) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.last");
            startActivity(intent);
        }
        if (v.getId() == R.id.o1) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text1)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t1)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
        if (v.getId() == R.id.o2) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text2)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t2)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
        if (v.getId() == R.id.o3) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text3)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t3)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
        if (v.getId() == R.id.o4) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text4)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t4)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
        if (v.getId() == R.id.o5) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text5)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t5)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
        if (v.getId() == R.id.o6) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text6)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t6)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
        if (v.getId() == R.id.o7) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text7)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t7)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
        if (v.getId() == R.id.o8) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text8)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t8)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
        if (v.getId() == R.id.o9) {
            Intent intent = new Intent("com.example.priyanshzalavadiya.layout.sub");
            String text1=((TextView)findViewById(R.id.text9)).getText().toString();
            intent.putExtra("value",text1);
            String text2=((TextView)findViewById(R.id.t9)).getText().toString();
            intent.putExtra("value1",text2);
            startActivity(intent);
        }
    }
}
