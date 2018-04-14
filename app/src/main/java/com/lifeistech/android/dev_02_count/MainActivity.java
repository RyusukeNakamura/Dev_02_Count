package com.lifeistech.android.dev_02_count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2,textView3;
    int n1=0;
    int n2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
    }
    public void add(View v){
        n1++;
        textView.setText(n1+"回ボタンが押されました");
    }
    public void minus(View v){
        n1--;
        textView.setText(n1+"回ボタンが押されました");
    }
    public void add2(View v){
        n2++;
        textView2.setText(n2+"回ボタンが押されました");
    }
    public void total(View v){
        textView3.setText("合計の値は"+(n1+n2)+"です");
    }
}
