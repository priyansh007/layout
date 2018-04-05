package com.example.priyanshzalavadiya.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sub extends AppCompatActivity {

    public Button but1;

    public void init()
    {
        but1=(Button)findViewById(R.id.butt2);
        but1.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick(View v){
                Intent toy = new Intent("com.example.priyanshzalavadiya.layout.last");
                startActivity(toy);
            }
        });
    }



    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        tv=(TextView)findViewById(R.id.text1);
        Intent i=getIntent();
        String s=i.getStringExtra("value");
        tv.setText(s);
        init();
    }


    public void myorder(View view){
        String text1=((TextView)findViewById(R.id.text1)).getText().toString();
        String text3=((TextView)findViewById(R.id.text3)).getText().toString();
        TextView text2=(TextView)findViewById(R.id.text2);
        int one = Integer.parseInt(text1);
        int two = Integer.parseInt(text3);
        int total=one*two;
        Intent i=getIntent();
        String s=i.getStringExtra("value1");
        text2.setText("You ordered "+text3+" "+s+" of "+text1+" Rupees So total is "+total+" rupees");


    }

    public void inc(View view)
    {
        String text1=((TextView)findViewById(R.id.text3)).getText().toString();
        int one = Integer.parseInt(text1);
        int total=one+1;
        TextView text20=(TextView)findViewById(R.id.text3);
        text20.setText(""+total);

    }

    public void dec(View view)
    {
        String text1=((TextView)findViewById(R.id.text3)).getText().toString();
        int one = Integer.parseInt(text1);
        int total=one-1;
        if(total<0)
        {
            total=0;
        }
        TextView text20=(TextView)findViewById(R.id.text3);
        text20.setText(""+total);
    }

}
