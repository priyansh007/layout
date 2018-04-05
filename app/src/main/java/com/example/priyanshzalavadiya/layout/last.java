package com.example.priyanshzalavadiya.layout;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class last extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
    }

    public void process1(View v){
        ImageView i1=(ImageView)findViewById(R.id.image1);
        ImageView i2=(ImageView)findViewById(R.id.image2);
        if(v.getId()==R.id.image1)
        {
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image2){
            i2.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }

    }
}
