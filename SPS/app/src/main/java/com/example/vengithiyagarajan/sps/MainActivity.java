package com.example.vengithiyagarajan.sps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;
import java.util.RandomAccess;

public class MainActivity extends AppCompatActivity {

    Button rock,paper,scissor;
    ImageView iv_cpu,iv_me;
    String cpuchoise,mychoise,result;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rock = (Button)findViewById(R.id.b_rock);
        paper = (Button)findViewById(R.id.b_papper);
        scissor = (Button)findViewById(R.id.b_scissor);
        iv_cpu = (ImageView)findViewById(R.id.iv_cpu1);
        iv_me = (ImageView)findViewById(R.id.iv_me);
        r = new Random();

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mychoise = "rock";
                iv_me.setImageResource(R.drawable.stone);
                calculate();
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mychoise = "paper";
                iv_me.setImageResource(R.drawable.papper);
                calculate();
            }
        });

        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mychoise = "scissor";
                iv_me.setImageResource(R.drawable.scissor);
                calculate();
            }
        });

    }
    public void calculate()
    {
        int cpu = r.nextInt(3);
        if(cpu == 0)
        {
            cpuchoise = "rock";
            iv_cpu.setImageResource(R.drawable.stone);


        }else if(cpu == 1)
        {
            cpuchoise = "paper";
            iv_cpu.setImageResource(R.drawable.papper);
        }
        else if(cpu == 2)
        {
            cpuchoise = "scissor";
            iv_cpu.setImageResource(R.drawable.scissor);
        }
        if(mychoise.equals("rock") && cpuchoise.equals("paper"))
        {
            result  = "You loose";
        }
        else if(mychoise.equals("rock") && cpuchoise.equals("scissor"))
        {
            result  = "You win";
        }
        else  if(mychoise.equals("paper") && cpuchoise.equals("rock"))
        {
            result  = "You win";
        }
        else if(mychoise.equals("paper") && cpuchoise.equals("scissor"))
        {
            result  = "You Loose";
        }
        else if(mychoise.equals("scissor") && cpuchoise.equals("paper"))
        {
            result  = "You win";
        }
        else if(mychoise.equals("scissor") && cpuchoise.equals("rock"))
        {
            result  = "You loose";
        }
        else if(mychoise.equals("scissor") && cpuchoise.equals("scissor"))
        {
            result  = "Draw";
        }
        else if(mychoise.equals("paper") && cpuchoise.equals("paper"))
        {
            result  = "Draw";
        }
        else if(mychoise.equals("rock") && cpuchoise.equals("rock"))
        {
            result  = "Draw";
        }
        Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
    }
}

