package com.example.task04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd=new Random();
    Button btn,btn2,btn3,btn4;
    TextView tv,tv2,tv3,tv4,tv5,tv6;
    ImageView iv1,iv2,iv3;
    EditText eT,eT2,eT3;
    int num1=rnd.nextInt(90)+10,num2=rnd.nextInt(90)+10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        tv=(TextView)findViewById(R.id.tv);
        tv.setText(num1+" ");
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.tv4);
        tv4.setText(num2+" ");
        tv5=(TextView)findViewById(R.id.tv5);
        tv6=(TextView)findViewById(R.id.tv6);
        iv1=(ImageView)findViewById(R.id.iv1);
        iv2=(ImageView)findViewById(R.id.iv2);
        iv3=(ImageView)findViewById(R.id.iv3);
        eT=(EditText)findViewById(R.id.eT);
        eT2=(EditText)findViewById(R.id.eT2);
        eT3=(EditText)findViewById(R.id.eT3);
    }
    public void Check1(View view) {


    }

    public void Check2(View view) {

    }

    public void Check3(View view) {

    }
}
