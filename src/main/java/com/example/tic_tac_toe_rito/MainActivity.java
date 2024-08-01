
package com.example.tic_tac_toe_rito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn11,btn12,btn13,btn21,btn22,btn23,btn31,btn32,btn33;
    int flag=0,count=0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ids();

    }
    private void ids(){
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn21=findViewById(R.id.btn21);
        btn22=findViewById(R.id.btn22);
        btn23=findViewById(R.id.btn23);
        btn31=findViewById(R.id.btn31);
        btn32=findViewById(R.id.btn32);
        btn33=findViewById(R.id.btn33);
    }
    public void Click(View view){
        Button btncurent= (Button) view;
        if (btncurent.getText().toString().equals("")){
            count++;
            if (flag == 0) {
                btncurent.setText("X");
                flag = 1;
            } else {
                btncurent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                b1 = btn11.getText().toString();
                b2 = btn12.getText().toString();
                b3 = btn13.getText().toString();
                b4 = btn21.getText().toString();
                b5 = btn22.getText().toString();
                b6 = btn23.getText().toString();
                b7 = btn31.getText().toString();
                b8 = btn32.getText().toString();
                b9 = btn33.getText().toString();

                //game_conditions
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    delayRestart();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is: " + b4, Toast.LENGTH_SHORT).show();
                    delayRestart();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is: " + b7, Toast.LENGTH_SHORT).show();
                    delayRestart();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    delayRestart();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_SHORT).show();
                    delayRestart();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    delayRestart();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is: " + b2, Toast.LENGTH_SHORT).show();
                    delayRestart();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_SHORT).show();
                    delayRestart();
                } else if (count==9) {
                    Toast.makeText(this, "Match Drawn", Toast.LENGTH_SHORT).show();
                    delayRestart();
                }


            }
        }

    }
    public void restart(){
        btn11.setText("");
        btn12.setText("");
        btn13.setText("");
        btn21.setText("");
        btn22.setText("");
        btn23.setText("");
        btn31.setText("");
        btn32.setText("");
        btn33.setText("");
        flag=0;
        count=0;

    }
    public void delayRestart() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                restart();
            }
        }, 3000); // 3 seconds delay
    }

}