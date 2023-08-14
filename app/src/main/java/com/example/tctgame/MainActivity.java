package com.example.tctgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
AppCompatButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
String a1 ="",a2="",a3 = "",a4 = "",a5 = "" ,a6= "",a7 = "",a8 = "",a9 ="";
int flag = 0, count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        bt3 = findViewById(R.id.b3);
        bt4 = findViewById(R.id.b4);
        bt5 = findViewById(R.id.b5);
        bt6 = findViewById(R.id.b6);
        bt7 = findViewById(R.id.b7);
        bt8 = findViewById(R.id.b8);
        bt9 = findViewById(R.id.b9);
    }

    public void press(View view){
        AppCompatButton crnt_btn = (AppCompatButton)view;
        if(crnt_btn.getText().toString().equals("")){
        count++;
        if(flag == 0)
        {
            crnt_btn.setText("X");
            flag = 1;
        }
        else{
            crnt_btn.setText("O");
            flag = 0;
        }
      if(count > 4){
          a1 = bt1.getText().toString();
          a2 = bt2.getText().toString();
          a3 = bt3.getText().toString();
          a4 = bt4.getText().toString();
          a5 = bt5.getText().toString();
          a6 = bt6.getText().toString();
          a7 = bt7.getText().toString();
          a8 = bt8.getText().toString();
          a9 = bt9.getText().toString();

          if(a1.equals(a4) && a1.equals(a7) && !a1.equals("")){
              Toast.makeText(this, "Winner is "+a1, Toast.LENGTH_SHORT).show();
              count = 0;
              blank();
          }
          else if(a1.equals(a5) && a1.equals(a9) && !a1.equals("")){
              Toast.makeText(this, "Winner is "+a1, Toast.LENGTH_SHORT).show();
              count = 0;
              blank();

          }
          else if(a1.equals(a2) && a1.equals(a3) && !a1.equals("")){
              Toast.makeText(this, "Winner is "+a1, Toast.LENGTH_SHORT).show();
              count = 0;
              blank();
          }
          else if(a4.equals(a5) && a4.equals(a6) && !a4.equals("")){
              Toast.makeText(this, "Winner is "+a4, Toast.LENGTH_SHORT).show();
              count = 0;
              blank();
          }
         else  if(a7.equals(a8) && a7.equals(a9) && !a7.equals("")){
              Toast.makeText(this, "Winner is "+a7, Toast.LENGTH_SHORT).show();
              count = 0;
              blank();
          }
         else  if(a2.equals(a5) && a2.equals(a8) && !a2.equals("")){
              Toast.makeText(this, "Winner is "+a2, Toast.LENGTH_SHORT).show();
              count = 0;
              blank();
          }
          else if(a3.equals(a6) && a3.equals(a9) && !a3.equals("")){
              Toast.makeText(this, "Winner is "+a3, Toast.LENGTH_SHORT).show();
              count = 0;
              blank();
          }
          else if(a3.equals(a5) && a3.equals(a7) && !a3.equals("")){
              Toast.makeText(this, "Winner is "+a7, Toast.LENGTH_SHORT).show();
              count = 0;
              blank();
          }
          else if(count == 9){
              Toast.makeText(this, "MATCH IS A DRAW", Toast.LENGTH_SHORT).show();
              count=0;
              blank();

          }


      }
    }

}
public void blank(){
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        flag=0;
    }
}