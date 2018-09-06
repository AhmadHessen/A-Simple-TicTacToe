package com.example.coyg.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// score
//refresh for new game
//design

public class TwoPlayerActivity extends AppCompatActivity
{
    private int player=1 , XScore=0 , DrawScore=0 , OScore=0;

    private Context context;

    TextView sq1;
    TextView sq2;
    TextView sq3;
    TextView sq4;
    TextView sq5;
    TextView sq6;
    TextView sq7;
    TextView sq8;
    TextView sq9;

    TextView xScore;
    TextView drawScore;
    TextView oScore;

//////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);

        sq1 = (TextView)findViewById(R.id.sq1);
        sq2 = (TextView)findViewById(R.id.sq2);
        sq3 = (TextView)findViewById(R.id.sq3);
        sq4 = (TextView)findViewById(R.id.sq4);
        sq5 = (TextView)findViewById(R.id.sq5);
        sq6 = (TextView)findViewById(R.id.sq6);
        sq7 = (TextView)findViewById(R.id.sq7);
        sq8 = (TextView)findViewById(R.id.sq8);
        sq9 = (TextView)findViewById(R.id.sq9);

        xScore = (TextView)findViewById(R.id.xScore);
        drawScore = (TextView)findViewById(R.id.drawScore);
        oScore = (TextView)findViewById(R.id.oScore);
    }

//////////////////////////////////////////////////////////////////////////////

    public void Back(View view)
    {
        Intent i = new Intent(this , MainActivity.class);
        startActivity(i);
    }

    public void Reset()
    {
        sq1.setText("1");
        sq2.setText("2");
        sq3.setText("3");
        sq4.setText("4");
        sq5.setText("5");
        sq6.setText("6");
        sq7.setText("7");
        sq8.setText("8");
        sq9.setText("9");

        player=1;
    }



//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////

    public void Sq1(View view)
    {
        if(sq1.getText().equals("1"))
        {
            if(player==1)
                sq1.setText("X");
            else
                sq1.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }

    public void Sq2(View view)
    {
        if(sq2.getText().equals("2"))
        {
            if(player==1)
                sq2.setText("X");
            else
                sq2.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }

    public void Sq3(View view)
    {
        if(sq3.getText().equals("3"))
        {
            if(player==1)
                sq3.setText("X");
            else
                sq3.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }

    public void Sq4(View view)
    {
        if(sq4.getText().equals("4"))
        {
            if(player==1)
                sq4.setText("X");
            else
                sq4.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }

    public void Sq5(View view)
    {
        if(sq5.getText().equals("5"))
        {
            if(player==1)
                sq5.setText("X");
            else
                sq5.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }

    public void Sq6(View view)
    {
        if(sq6.getText().equals("6"))
        {
            if(player==1)
                sq6.setText("X");
            else
                sq6.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }

    public void Sq7(View view)
    {
        if(sq7.getText().equals("7"))
        {
            if(player==1)
                sq7.setText("X");
            else
                sq7.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }

    public void Sq8(View view)
    {
        if(sq8.getText().equals("8"))
        {
            if(player==1)
                sq8.setText("X");
            else
                sq8.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }

    public void Sq9(View view)
    {
        if(sq9.getText().equals("9"))
        {
            if(player==1)
                sq9.setText("X");
            else
                sq9.setText("O");

            CheckWin();

        }else
        {
            System.out.println("Invalid Move");
        }
    }


//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////

    public void CheckWin()
    {
        if(player==1)
            player=2;
        else
            player=1;

        if(sq1.getText().equals(sq2.getText()) && sq1.getText().equals(sq3.getText()))
        {
            if(sq1.getText().equals("X"))
            {
                Toast.makeText(getApplicationContext() , "X WON!" , Toast.LENGTH_LONG).show();
                xScore.setText(++XScore+"");
                Reset();
            }
            else
            {
                Toast.makeText(getApplicationContext() , "O WON!" , Toast.LENGTH_LONG).show();
                oScore.setText(++OScore+"");
                Reset();
            }

        }
        else if(sq1.getText().equals(sq5.getText()) && sq1.getText().equals(sq9.getText()))
        {
            if(sq1.getText().equals("X"))
            {
                Toast.makeText(getApplicationContext() , "X WON!" , Toast.LENGTH_LONG).show();
                xScore.setText(++XScore+"");
                Reset();
            }
            else
            {
                Toast.makeText(getApplicationContext() , "O WON!" , Toast.LENGTH_LONG).show();
                oScore.setText(++OScore+"");
                Reset();
            }
        }
        else if(sq1.getText().equals(sq4.getText()) && sq1.getText().equals(sq7.getText()))
        {
            if(sq1.getText().equals("X"))
            {
                Toast.makeText(getApplicationContext() , "X WON!" , Toast.LENGTH_LONG).show();
                xScore.setText(++XScore+"");
                Reset();
            }
            else
            {
                Toast.makeText(getApplicationContext() , "O WON!" , Toast.LENGTH_LONG).show();
                oScore.setText(++OScore+"");
                Reset();
            }
        }
        else if(sq5.getText().equals(sq4.getText()) && sq5.getText().equals(sq6.getText()))
        {
            if(sq5.getText().equals("X"))
            {
                Toast.makeText(getApplicationContext() , "X WON!" , Toast.LENGTH_LONG).show();
                xScore.setText(++XScore+"");
                Reset();
            }
            else
            {
                Toast.makeText(getApplicationContext() , "O WON!" , Toast.LENGTH_LONG).show();
                oScore.setText(++OScore+"");
                Reset();
            }
        }

        else if(sq5.getText().equals(sq2.getText()) && sq5.getText().equals(sq8.getText()))
        {
            if(sq5.getText().equals("X"))
            {
                Toast.makeText(getApplicationContext() , "X WON!" , Toast.LENGTH_LONG).show();
                xScore.setText(++XScore+"");
                Reset();
            }
            else
            {
                Toast.makeText(getApplicationContext() , "O WON!" , Toast.LENGTH_LONG).show();
                oScore.setText(++OScore+"");
                Reset();
            }
        }
        else if(sq5.getText().equals(sq3.getText()) && sq5.getText().equals(sq7.getText()))
        {
            if(sq5.getText().equals("X"))
            {
                Toast.makeText(getApplicationContext() , "X WON!" , Toast.LENGTH_LONG).show();
                xScore.setText(++XScore+"");
                Reset();
            }
            else
            {
                Toast.makeText(getApplicationContext() , "O WON!" , Toast.LENGTH_LONG).show();
                oScore.setText(++OScore+"");
                Reset();
            }
        }
        else if(sq3.getText().equals(sq6.getText()) && sq3.getText().equals(sq9.getText()))
        {
            if(sq3.getText().equals("X"))
            {
                Toast.makeText(getApplicationContext() , "X WON!" , Toast.LENGTH_LONG).show();
                xScore.setText(++XScore+"");
                Reset();
            }
            else
            {
                Toast.makeText(getApplicationContext() , "O WON!" , Toast.LENGTH_LONG).show();
                oScore.setText(++OScore+"");
                Reset();
            }
        }

        else if(sq7.getText().equals(sq8.getText()) && sq7.getText().equals(sq9.getText()))
        {
            if(sq7.getText().equals("X"))
            {
                Toast.makeText(getApplicationContext() , "X WON!" , Toast.LENGTH_LONG).show();
                xScore.setText(++XScore+"");
                Reset();
            }
            else
            {
                Toast.makeText(getApplicationContext() , "O WON!" , Toast.LENGTH_LONG).show();
                oScore.setText(++OScore+"");
                Reset();
            }

        }else if(!"1".equals(sq1.getText())
                && !"2".equals(sq2.getText())
                && !"3".equals(sq3.getText())
                && !"4".equals(sq4.getText())
                && !"5".equals(sq5.getText())
                && !"6".equals(sq6.getText())
                && !"7".equals(sq7.getText())
                && !"8".equals(sq8.getText())
                && !"9".equals(sq9.getText()))
        {
            Toast.makeText(getApplicationContext() , "It's DRAW!" , Toast.LENGTH_LONG).show();
            drawScore.setText(++DrawScore+"");
            Reset();
        }
    }

//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
}
