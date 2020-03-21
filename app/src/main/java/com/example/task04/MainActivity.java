package com.example.task04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd=new Random();
    Button btn,btn2,btn3,btn4;
    TextView tv,tv2,tv3,tv4,tv5,tv6;
    ImageView iv1,iv2,iv3;
    EditText eT,eT2,eT3;
    int num1=rnd.nextInt(90)+10,num2=rnd.nextInt(90)+10;
    int uAnswer=1,uAnswer2=1,uAnswer3=1;
    int num3,num4;
    float counter1=0,counter2=0,counter3;

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
        if (eT.getText().toString().matches("")){
            Toast.makeText(this, "ilegal action, try again", Toast.LENGTH_SHORT).show();
        }
        else {
            counter1++;
            uAnswer=Integer.parseInt(eT.getText().toString());
            if (uAnswer==num1+num2){
                tv2.setText(uAnswer+" ");
                iv1.setImageResource(R.drawable.tick);
                counter2++;
            }
            else{
                uAnswer=num1+num2;
                tv2.setText(uAnswer+" ");
                iv1.setImageResource(R.drawable.close);
            }
            num3=rnd.nextInt(90)+10;
            tv5.setText(num3+" ");
            btn.setClickable(false);
        }
    }
    public void Check2(View view) {
        if (eT2.getText().toString().matches("")){
            Toast.makeText(this, "ilegal action, try again", Toast.LENGTH_SHORT).show();
        }
        else {
            counter1++;
            uAnswer2 = Integer.parseInt(eT2.getText().toString());
            if (uAnswer2 == uAnswer + num3) {
                tv3.setText(uAnswer2 + " ");
                iv2.setImageResource(R.drawable.tick);
                counter2++;
            } else {
                uAnswer2 = uAnswer + num3;
                tv3.setText(uAnswer2 + " ");
                iv2.setImageResource(R.drawable.close);
            }
            num4 = rnd.nextInt(90) + 10;
            tv6.setText(num4 + " ");
            btn2.setClickable(false);
        }
    }

    public void Check3(View view) {
        if (eT3.getText().toString().matches("")){
            Toast.makeText(this, "ilegal action, try again", Toast.LENGTH_SHORT).show();
        }
        else {
            counter1++;
            uAnswer3 = Integer.parseInt(eT3.getText().toString());
            if (uAnswer3 == uAnswer2 + num4) {
                iv3.setImageResource(R.drawable.tick);
                counter2++;
            }
            else {
                iv3.setImageResource(R.drawable.close);
            }
            counter3=(counter2/counter1)*100;
            Toast.makeText(this,(int)counter3+"%"+" "+","+(int)counter2+"/3",Toast.LENGTH_SHORT).show();
        }
    }

    public void Fresh(View view) {
        tv6.setText(" ");
        tv5.setText(" ");
        tv2.setText(" ");
        tv3.setText(" ");
        eT.getText().clear();
        eT2.getText().clear();
        eT3.getText().clear();
        num1=rnd.nextInt(90)+10;
        num2=rnd.nextInt(90)+10;
        tv.setText(num1+" ");
        tv4.setText(num2+" ");
        iv1.setImageDrawable(null);
        iv2.setImageDrawable(null);
        iv3.setImageDrawable(null);
        uAnswer=0;
        uAnswer2=0;
        uAnswer3=0;
        counter1=0;
        counter2=0;
        btn.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
    }
}
