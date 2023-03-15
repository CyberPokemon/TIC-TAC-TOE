package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button easy;
    private Button medium;
    private Button hard;
    private Button x;
    private Button y;
    private Button start;
    private Button d1;
    private Button d2;
    private Button d3;
    private Button d4;
    private Button d5;
    private Button d6;
    private Button d7;
    private Button d8;
    private Button d9;
     TextView text5;

    private int mode1=0, mode2=0,mode3=0,turn1=0,turn2=0,permission1=0,reset=0,i=0;
    boolean top5bdisable=false, ticmat=false;
    private String arr[];
    int userchoice=0;
    int disp=0;
    //int chance2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setupUIviews();
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(top5bdisable==true)
                {
                    Toast.makeText(getApplicationContext(), "SETTING CANNOT BE CHANGED DURING GAMEPLAY", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (mode1 == 0 && mode2 == 0 && mode3 == 0)
                    {
                        mode1 = 1;

                    }
                    else if (mode1 == 1 && mode2 == 0 && mode3 == 0)
                    {
                        mode1 = 0;
                    }
                    else if (mode1 == 0 && (mode2 == 1 || mode3 == 1)) {
                        mode1 = 1;
                        mode2 = 0;
                        mode3 = 0;
                    }
                }

            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(top5bdisable==true)
                {
                    Toast.makeText(getApplicationContext(), "SETTING CANNOT BE CHANGED DURING GAMEPLAY", Toast.LENGTH_SHORT).show();
                }
                else {

                    if (mode1 == 0 && mode2 == 0 && mode3 == 0) {
                        mode2 = 1;
                    } else if (mode1 == 0 && mode2 == 1 && mode3 == 0) {
                        mode2 = 0;
                    } else if (mode2 == 0 && (mode1 == 1 || mode3 == 1)) {
                        mode1 = 0;
                        mode2 = 1;
                        mode3 = 0;
                    }
                }
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(top5bdisable==true)
                {
                    Toast.makeText(getApplicationContext(), "SETTING CANNOT BE CHANGED DURING GAMEPLAY", Toast.LENGTH_SHORT).show();
                }
                else {

                    if (mode1 == 0 && mode2 == 0 && mode3 == 0) {
                        mode3 = 1;
                    } else if (mode1 == 0 && mode2 == 0 && mode3 == 1) {
                        mode3 = 0;
                    } else if (mode3 == 0 && (mode2 == 1 || mode1 == 1)) {
                        mode1 = 0;
                        mode2 = 0;
                        mode3 = 1;
                    }
                }
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(top5bdisable==true)
                {
                    Toast.makeText(getApplicationContext(), "SETTING CANNOT BE CHANGED DURING GAMEPLAY", Toast.LENGTH_SHORT).show();
                }
                else {

                    if (turn1 == 0 && turn2 == 0) {
                        turn1 = 1;
                    } else if (turn1 == 1 && turn2 == 0) {
                        turn1 = 0;
                    } else if (turn1 == 0 && turn2 == 1) {
                        turn2 = 0;
                        turn1 = 1;
                    }
                }
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(top5bdisable==true)
                {
                    Toast.makeText(getApplicationContext(), "SETTING CANNOT BE CHANGED DURING GAMEPLAY", Toast.LENGTH_SHORT).show();
                }
                else {

                    if (turn1 == 0 && turn2 == 0) {
                        turn2 = 1;
                    } else if (turn2 == 1 && turn1 == 0) {
                        turn2 = 0;
                    } else if (turn2 == 0 && turn1 == 1) {
                        turn1 = 0;
                        turn2 = 1;
                    }
                }
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(reset==1)
                {
                    reset();
                }
                else if(top5bdisable==false)
                {
                    if((mode1==1 && mode2==0 & mode3==0)&& (turn1==1 && turn2==0))
                    {
                        permission1=1;
                        top5bdisable=true;
                        userchoice=1;
                        ticmat=true;
                        text5.setText("GOOD LUCK");
                        createboard();
                        dispboard();

                    }
                    else if((mode1==1 && mode2==0 & mode3==0)&& (turn1==0 && turn2==1))
                    {
                        permission1=2;
                        top5bdisable=true;
                        userchoice=2;
                        ticmat=true;
                        text5.setText("GOOD LUCK");
                        createboard();
                        dispboard();
                        computer1(1);
                        dispboard();
                        i++;

                    }
                    else if((mode1==0 && mode2==1 & mode3==0)&& (turn1==1 && turn2==0))
                    {
                        permission1=3;
                        top5bdisable=true;
                        userchoice=1;
                        ticmat=true;
                        text5.setText("GOOD LUCK");
                        createboard();
                        dispboard();

                    }
                    else if((mode1==0 && mode2==1 & mode3==0)&& (turn1==0 && turn2==1))
                    {
                        permission1=4;
                        top5bdisable=true;
                        userchoice=2;
                        ticmat=true;
                        text5.setText("GOOD LUCK");
                        createboard();
                        dispboard();
                        int ran=(int)(0+Math.random()*8);
                        if(ran<4)
                            computer1(1);
                        else
                            computer2(1,i);
                        dispboard();
                        i++;


                    }
                    else if((mode1==0 && mode2==0 & mode3==1)&& (turn1==1 && turn2==0))
                    {
                        permission1=5;
                        top5bdisable=true;
                        userchoice=1;
                        ticmat=true;
                        text5.setText("GOOD LUCK");
                        createboard();
                        dispboard();

                    }
                    else if((mode1==0 && mode2==0 & mode3==1)&& (turn1==0 && turn2==1))
                    {
                        permission1=6;
                        top5bdisable=true;
                        userchoice=2;
                        ticmat=true;
                        text5.setText("GOOD LUCK");
                        createboard();
                        dispboard();
                        computer2(1,i);
                        dispboard();
                        i++;

                    }
                    else
                    {
                        if((mode1==0 &&mode2==0 && mode3==0) && (turn1==0 && turn2==0))
                        {
                            permission1=0;
                            text5.setText("ERROR : MODE AND TURN NOT SELECTED");
                        }
                        else if((mode1==0 &&mode2==0 && mode3==0) && (turn1==1 || turn2==1))
                        {
                            permission1=0;
                            text5.setText("ERROR : MODE NOT SELECTED");
                        }
                        else if((mode1==1 ||mode2==1 || mode3==1) && (turn1==0 && turn2==0))
                        {
                            permission1=0;
                            text5.setText("ERROR : TURN NOT SELECTED");
                        }
                    }

                }
            }
        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[0].equals(" ") == true)
                        {
                            arr[0] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(permission1==2)
                    {
                        if(arr[0].equals(" ")==true)
                        {
                            arr[0]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[0].equals(" ") == true)
                        {
                            arr[0] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[0].equals(" ")==true)
                        {
                            arr[0]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[0].equals(" ") == true)
                        {
                            arr[0] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[0].equals(" ")==true)
                        {
                            arr[0]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }

                }

            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[1].equals(" ") == true)
                        {
                            arr[1] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==2)
                    {
                        if(arr[1].equals(" ")==true)
                        {
                            arr[1]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[1].equals(" ") == true)
                        {
                            arr[1] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[1].equals(" ")==true)
                        {
                            arr[1]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[1].equals(" ") == true)
                        {
                            arr[1] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[1].equals(" ")==true)
                        {
                            arr[1]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[2].equals(" ") == true)
                        {
                            arr[2] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==2)
                    {
                        if(arr[2].equals(" ")==true)
                        {
                            arr[2]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[2].equals(" ") == true)
                        {
                            arr[2] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[2].equals(" ")==true)
                        {
                            arr[2]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[2].equals(" ") == true)
                        {
                            arr[2] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[2].equals(" ")==true)
                        {
                            arr[2]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[3].equals(" ") == true)
                        {
                            arr[3] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==2)
                    {
                        if(arr[3].equals(" ")==true)
                        {
                            arr[3]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[3].equals(" ") == true)
                        {
                            arr[3] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[3].equals(" ")==true)
                        {
                            arr[3]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[3].equals(" ") == true)
                        {
                            arr[3] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[3].equals(" ")==true)
                        {
                            arr[3]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[4].equals(" ") == true)
                        {
                            arr[4] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==2)
                    {
                        if(arr[4].equals(" ")==true)
                        {
                            arr[4]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[4].equals(" ") == true)
                        {
                            arr[4] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[4].equals(" ")==true)
                        {
                            arr[4]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[4].equals(" ") == true)
                        {
                            arr[4] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[4].equals(" ")==true)
                        {
                            arr[4]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[5].equals(" ") == true)
                        {
                            arr[5] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==2)
                    {
                        if(arr[5].equals(" ")==true)
                        {
                            arr[5]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[5].equals(" ") == true)
                        {
                            arr[5] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[5].equals(" ")==true)
                        {
                            arr[5]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    dispboard();
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    dispboard();
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[5].equals(" ") == true)
                        {
                            arr[5] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[5].equals(" ")==true)
                        {
                            arr[5]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[6].equals(" ") == true)
                        {
                            arr[6] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==2)
                    {
                        if(arr[6].equals(" ")==true)
                        {
                            arr[6]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[6].equals(" ") == true)
                        {
                            arr[6] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[6].equals(" ")==true)
                        {
                            arr[6]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[6].equals(" ") == true)
                        {
                            arr[6] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[6].equals(" ")==true)
                        {
                            arr[6]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[7].equals(" ") == true)
                        {
                            arr[7] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==2)
                    {
                        if(arr[7].equals(" ")==true)
                        {
                            arr[7]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[7].equals(" ") == true)
                        {
                            arr[7] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[7].equals(" ")==true)
                        {
                            arr[7]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[7].equals(" ") == true)
                        {
                            arr[7] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[7].equals(" ")==true)
                        {
                            arr[7]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ran=0;
                if(ticmat==false)
                {
                    Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(permission1==1)
                    {
                        if (arr[8].equals(" ") == true)
                        {
                            arr[8] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==2)
                    {
                        if(arr[8].equals(" ")==true)
                        {
                            arr[8]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer1(1);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==3)
                    {
                        if (arr[8].equals(" ") == true)
                        {
                            arr[8] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(2);
                                else
                                    computer2(2,i);
                                //computer1(2);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==4)
                    {
                        if(arr[8].equals(" ")==true)
                        {
                            arr[8]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                ran=(int)(0+Math.random()*8);
                                if(ran<4)
                                    computer1(1);
                                else
                                    computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==5)
                    {
                        if (arr[8].equals(" ") == true)
                        {
                            arr[8] = "X";
                            i++;
                            dispboard();
                            if (i == 9 && check() == true)
                            {
                                text5.setText("MATCH DRAW");
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else if (check() == false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(2,i);
                                i++;
                                dispboard();
                                if (check() == false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }

                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else if(permission1==6)
                    {
                        if(arr[8].equals(" ")==true)
                        {
                            arr[8]="O";
                            i++;
                            dispboard();
                            if(check()==false)
                            {
                                ticmat = false;
                                start.setText("RESET");
                                reset = 1;
                            }
                            else
                            {
                                computer2(1,i);
                                i++;
                                dispboard();
                                if(i==9 && check()==true)
                                {
                                    text5.setText("MATCH DRAW");
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                                else if(check()==false)
                                {
                                    ticmat = false;
                                    start.setText("RESET");
                                    reset = 1;
                                }
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "BUTTON UNAVAILABLE", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });


    }
    private void reset()
    {
        mode1=0;
        mode2=0;
        mode3=0;
        turn1=0;
        turn2=0;
        permission1=0;
        userchoice=0;
        createboard();
        disp=0;

        start.setText("START");
        dispboard();
        text5.setText("");
        i=0;
        reset=0;
        top5bdisable=false;
    }
    void computer1(int n)
    {
        int ch;
        if(n==1)
        {
            boolean c=true;
            while(c)
            {
                ch=(int)(Math.random()*9);
                if(arr[ch].equals(" "))
                {
                    arr[ch]="X";
                    c=false;
                }
            }
        }
        else if(n==2)
        {
            boolean c=true;
            while(c)
            {
                ch=(int)(Math.random()*9);
                if(arr[ch].equals(" "))
                {
                    arr[ch]="O";
                    c=false;
                }
            }
        }
    }

    void computer2(int n,int xyz)
    {
        String arr2[]= new String[9];
        int i,j,result,decision=0;
        for(i=0;i<9;i++)
        {
            arr2[i]="";
            arr2[i]=arr[i];
        }
        if(xyz==0 ||xyz==1)
        {
            if(arr[4].equals(" "))
            {
                if(userchoice==1)
                {
                    arr[4]="O";
                    return;
                }
                else if(userchoice==2)
                {
                    arr[4]="X";
                    return;
                }
            }
            else
            {
                while(true)
                {
                    decision=(int)(0+(Math.random()*8));
                    if(decision<2 && arr[0].equals(" "))
                    {
                        arr[0]="O";
                        return;
                    }
                    else if(decision<4 && arr[2].equals(" "))
                    {
                        arr[2]="O";
                        return;
                    }
                    else if(decision<6 && arr[6].equals(" "))
                    {
                        arr[6]="O";
                        return;
                    }
                    else if(decision<8 && arr[8].equals(" "))
                    {
                        arr[8]="O";
                        return;
                    }

                }
            }
        }
        if(n==1)
        {//FISRT ATTEMPT WINNING
            for(i=0;i<9;i++)
            {
                if(arr2[i].equals(" "))
                {
                    arr2[i]="X";
                    result=check2(arr2);
                    if(result ==1)
                    {
                        arr[i]="X";
                        return;
                    }
                    arr2[i]=" ";
                }
            }
        }
        if(n==2)
        {//FISRT ATTEMPT WINNING
            for(i=0;i<9;i++)
            {
                if(arr2[i].equals(" "))
                {
                    arr2[i]="O";
                    result=check2(arr2);
                    if(result ==1)
                    {
                        arr[i]="O";
                        return;
                    }
                    arr2[i]=" ";
                }
            }
        }
        double posibilities[] = new double[9];
        double winning[]=new double[9];
        double losing[]=new double[9];
        for(i=0;i<9;i++)
        {
            posibilities[i]=0;
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                arr2[j]=arr[j];
            }
            winning[i]=posi(arr2,i,0,1,100);
            for(j=0;j<9;j++)//extra... need to be optimized
            {
                arr2[j]=arr[j];
            }
            //dispboard(arr2);
            losing[i]=posi2(arr2,i,0,1,100);
            //posibilities[i]=((double)posi(arr2,i,0,1,100))/((double)posi2(arr2,i,0,1,100));
            posibilities[i]=winning[i]/losing[i];
        }
        for(i=0;i<9;i++)
        {
            arr2[i]="";
            arr2[i]=arr[i];
        }
        isbuggy(arr2,posibilities);//test bug fix
        double max=0;
        int pos=0;
        //finding maximum possibility
        for(i=0;i<9;i++)
        {
            if(posibilities[i]>max)
            {
                max=posibilities[i];
                pos=i;
            }
        }
        if(max==0)
        {
            for(i=0;i<9;i++)
            {
                if(winning[i]==0 && losing[i]==0 && arr[i].equals(" "))
                {
                    pos=i;
                }
            }
        }
        if(arr[pos].equals(" ")==false)
        {
            for(i=0;i<9;i++)
            {
                if(arr[i].equals(" "))
                {
                    pos=i;
                    break;
                }
            }
        }
        if(userchoice==1)
        {
            arr[pos]="O";
        }
        else if(userchoice==2)
        {
            arr[pos]="X";
        }
    }

    //wining
    int posi(String checkarray[],int startcell,int turn,int start,int test)
    {
        int pos=0,i,chance=0;
        String newarray[]=new String[9];
        //System.out.println("STARTCELL = "+startcell);
        if(test ==100 && checkarray[startcell].equals(" ")==false )
        {
            return 0;
        }
        if(turn ==0)
        {
            if(start==1)
            {
                if(userchoice==2)
                {
                    checkarray[startcell]="X";
                    return 0+ posi(checkarray,0, (turn+1)%2,0,0);
                }
                else
                {
                    checkarray[startcell]="O";
                    for(i=0;i<9;i++)
                    {
                        if(checkarray[i].equals(" "))
                        {
                            pos=i;
                            break;
                        }
                    }
                    return 0+ posi(checkarray,pos, (turn+1)%2,0,0);
                }
            }
            else
            {
                for(i=0;i<9;i++)
                {
                    newarray[i]=checkarray[i];
                }
                if(userchoice==2)
                {
                    for(i=0;i<9;i++)
                    {
                        if(checkarray[i].equals(" "))
                        {
                            newarray[i]="X";
                            //if(chance2>=6)
                             //   dispboard(newarray);//test
                            if(check2(newarray)==1 || check2(newarray)==0)
                            {
                                chance++;
                            }
                            else
                            {
                                chance=chance+posi(newarray,0,(turn+1)%2,0,0);
                            }
                            newarray[i]=" ";
                        }
                    }
                }
                else if(userchoice==1)
                {
                    for(i=0;i<9;i++)
                    {
                        if(checkarray[i].equals(" "))
                        {
                            newarray[i]="O";
                            //if(chance2>=6)
                             //   dispboard(newarray);//test
                            if(check2(newarray)==1 || check2(newarray)==0)
                            {
                                chance++;
                            }
                            else
                            {
                                chance=chance+posi(newarray,0,(turn+1)%2,0,0);
                            }
                            newarray[i]=" ";
                        }
                    }
                }
            }
        }
        else if(turn ==1)
        {
            for(i=0;i<9;i++)
            {
                newarray[i]=checkarray[i];
            }
            for(i=0;i<9;i++)
            {
                if(checkarray[i].equals(" "))
                {
                    if(userchoice==2)
                        newarray[i]="O";
                    else
                        newarray[i]="X";
                    if(check2(newarray)==-1)
                    {
                    }
                    //test
                    else if(check2(newarray)==0)
                    {
                        chance++;//testing
                    }
                    else
                    {
                        chance=chance+posi(newarray,0,(turn+1)%2,0,0);
                    }
                    newarray[i]=" ";
                }
            }
        }
        return chance;
    }
    //lossing
    int posi2(String checkarray[],int startcell,int turn,int start,int test)
    {
        int pos=0,i,chance=0;
        String newarray[]=new String[9];
        if(test ==100 && checkarray[startcell].equals(" ")==false )
        {
            return 0;
        }
        if(turn ==0)
        {
            if(start==1)
            {
                if(userchoice==2)
                {
                    checkarray[startcell]="X";
                    return 0+ posi2(checkarray,0, (turn+1)%2,0,0);
                }
                else
                {
                    checkarray[startcell]="O";
                    return 0+ posi2(checkarray,pos, (turn+1)%2,0,0);
                }
            }
            else
            {
                for(i=0;i<9;i++)
                {
                    newarray[i]=checkarray[i];
                }
                if(userchoice==2)
                {
                    for(i=0;i<9;i++)
                    {
                        if(checkarray[i].equals(" "))
                        {
                            newarray[i]="X";
                            if(check2(newarray)==1 || check2(newarray)==0)
                            {
                            }
                            else
                            {
                                chance=chance+posi2(newarray,0,(turn+1)%2,0,0);
                            }
                            newarray[i]=" ";
                        }
                    }
                }
                else if(userchoice==1)
                {
                    for(i=0;i<9;i++)
                    {
                        if(checkarray[i].equals(" "))
                        {
                            newarray[i]="O";
                            if(check2(newarray)==1 || check2(newarray)==0)
                            {
                            }
                            else
                            {
                                chance=chance+posi2(newarray,0,(turn+1)%2,0,0);
                            }
                            newarray[i]=" ";
                        }
                    }
                }
            }
        }
        else if(turn ==1)
        {
            for(i=0;i<9;i++)
            {
                newarray[i]=checkarray[i];
            }
            for(i=0;i<9;i++)
            {
                if(checkarray[i].equals(" "))
                {
                    if(userchoice==2)
                        newarray[i]="O";
                    else
                        newarray[i]="X";
                    if(check2(newarray)==-1)
                    {
                        chance++;//lossing
                    }
                    else
                    {
                        chance=chance+posi2(newarray,0,(turn+1)%2,0,0);
                    }
                    newarray[i]=" ";
                }
            }
        }
        return chance;
    }

    void isbuggy(String arrch[],double p[])
    {
        //double com1[]={1.75,1.5294117647058822, 0/0, 1.5294117647058822, 0/0, 1.5294117647058822, 0/0, 1.5294117647058822, 1.75};
        //double com2[]={0/0, 1.5294117647058822, 1.75, 1.5294117647058822, 0/0, 1.5294117647058822, 1.75 ,1.5294117647058822, 0/0};
        String com1[]={" "," ","X"," ","O"," ","X"," "," "};
        String com2[]={"X"," "," "," ","O"," "," "," ","X"};
        int i=0,c1=0,c2=0;
        for(i=0;i<9;i++)
        {
            if(arrch[i].equals(com1[i]))
                c1++;
        }
        for(i=0;i<9;i++)
        {
            if(arrch[i].equals(com2[i]))
                c2++;
        }
        if(c1==9)
        {
            p[0]=0;
            p[8]=0;
        }
        else if(c2==9)
        {
            p[2]=0;
            p[6]=0;
        }
    }

    int check2(String arr3[])
    {
        //computer won =1
        //user won= -1
        //draw = 0
        //empty space =2
        //X WON
        if((arr3[0]+arr3[1]+arr3[2]).equals("XXX"))
        {
            if(userchoice==1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        if((arr3[3]+arr3[4]+arr3[5]).equals("XXX"))
        {
            if(userchoice==1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        if((arr3[6]+arr3[7]+arr3[8]).equals("XXX"))
        {
            if(userchoice==1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        if((arr3[0]+arr3[3]+arr3[6]).equals("XXX"))
        {
            if(userchoice==1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        if((arr3[1]+arr3[4]+arr3[7]).equals("XXX"))
        {
            if(userchoice==1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        if((arr3[2]+arr3[5]+arr3[8]).equals("XXX"))
        {
            if(userchoice==1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        if((arr3[0]+arr3[4]+arr3[8]).equals("XXX"))
        {
            if(userchoice==1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        if((arr3[2]+arr3[4]+arr3[6]).equals("XXX"))
        {
            if(userchoice==1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }

        //O WON
        if((arr3[0]+arr3[1]+arr3[2]).equals("OOO"))
        {
            if(userchoice==1)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if((arr3[3]+arr3[4]+arr3[5]).equals("OOO"))
        {
            if(userchoice==1)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if((arr3[6]+arr3[7]+arr3[8]).equals("OOO"))
        {
            if(userchoice==1)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if((arr3[0]+arr3[3]+arr3[6]).equals("OOO"))
        {
            if(userchoice==1)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if((arr3[1]+arr3[4]+arr3[7]).equals("OOO"))
        {
            if(userchoice==1)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if((arr3[2]+arr3[5]+arr3[8]).equals("OOO"))
        {
            if(userchoice==1)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if((arr3[0]+arr3[4]+arr3[8]).equals("OOO"))
        {
            if(userchoice==1)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if((arr3[2]+arr3[4]+arr3[6]).equals("OOO"))
        {
            if(userchoice==1)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        int i;
        for(i=0;i<9;i++)
        {
            if(arr3[i].equals(" "))
                return 2;
        }
        return 0;
    }
    boolean check()
    {
        //X WON
        if((arr[0]+arr[1]+arr[2]).equals("XXX"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[3]+arr[4]+arr[5]).equals("XXX"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[6]+arr[7]+arr[8]).equals("XXX"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[0]+arr[3]+arr[6]).equals("XXX"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[1]+arr[4]+arr[7]).equals("XXX"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[2]+arr[5]+arr[8]).equals("XXX"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[0]+arr[4]+arr[8]).equals("XXX"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[2]+arr[4]+arr[6]).equals("XXX"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
        }

        //O WON
        if((arr[0]+arr[1]+arr[2]).equals("OOO"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[3]+arr[4]+arr[5]).equals("OOO"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[6]+arr[7]+arr[8]).equals("OOO"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[0]+arr[3]+arr[6]).equals("OOO"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[1]+arr[4]+arr[7]).equals("OOO"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[2]+arr[5]+arr[8]).equals("OOO"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[0]+arr[4]+arr[8]).equals("OOO"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
        }
        if((arr[2]+arr[4]+arr[6]).equals("OOO"))
        {
            if(userchoice==1)
            {
                if(disp==0)
                {
                    text5.setText("COMPUTER WON");
                    disp=1;
                }
                return false;
            }
            else
            {
                if(disp==0)
                {
                    text5.setText("YOU WON");
                    disp=1;
                }
                return false;
            }
        }
        return true;
    }
    private void createboard()
    {
        arr=new String[9];
        for(int i =0;i<9;i++)
        {
            arr[i]=" ";
        }
        disp=0;
    }
    private void dispboard()
    {
        d1.setText(arr[0]);
        d2.setText(arr[1]);
        d3.setText(arr[2]);
        d4.setText(arr[3]);
        d5.setText(arr[4]);
        d6.setText(arr[5]);
        d7.setText(arr[6]);
        d8.setText(arr[7]);
        d9.setText(arr[8]);
    }
    private void setupUIviews()
    {
        easy =(Button)findViewById(R.id.b2);
        medium =(Button)findViewById(R.id.b3);
        hard =(Button)findViewById(R.id.b4);
        x =(Button)findViewById(R.id.b5);
        y =(Button)findViewById(R.id.b6);
        start =(Button)findViewById(R.id.b7);

        d1 =(Button)findViewById(R.id.b8);
        d2 =(Button)findViewById(R.id.b9);
        d3 =(Button)findViewById(R.id.b10);
        d4 =(Button)findViewById(R.id.b11);
        d5 =(Button)findViewById(R.id.b12);
        d6 =(Button)findViewById(R.id.b13);
        d7 =(Button)findViewById(R.id.b14);
        d8 =(Button)findViewById(R.id.b15);
        d9 =(Button)findViewById(R.id.b16);

        text5=(TextView)findViewById(R.id.t5);


    }
}