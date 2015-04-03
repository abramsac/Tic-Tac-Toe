package com.example.alexabrams.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class Activity1 extends ActionBarActivity {

    int turn = 0;
    int winner = -1;
    int nextturn = 0;
    int endgame = 0;
    int turncount = 1;
    String xo = "X";
    int[] xos = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttons(View v) {
        if (endgame == 0 && winner == -1) {
            int buttonId = v.getId();
            if (turn == 0) {
                xo = "X";
                nextturn = 1;
            } else {
                xo = "O";
                nextturn = 0;
            }
            switch (buttonId) {
                case R.id.button1:
                    if (b1.getText() == "") {
                        xos[0] = turn;
                        b1.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
                case R.id.button2:
                    if (b2.getText() == "") {
                        xos[1] = turn;
                        b2.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
                case R.id.button3:
                    if (b3.getText() == "") {
                        xos[2] = turn;
                        b3.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
                case R.id.button4:
                    if (b4.getText() == "") {
                        xos[3] = turn;
                        b4.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
                case R.id.button5:
                    if (b5.getText() == "") {
                        xos[4] = turn;
                        b5.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
                case R.id.button6:
                    if (b6.getText() == "") {
                        xos[5] = turn;
                        b6.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
                case R.id.button7:
                    if (b7.getText() == "") {
                        xos[6] = turn;
                        b7.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
                case R.id.button8:
                    if (b8.getText() == "") {
                        xos[7] = turn;
                        b8.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
                case R.id.button9:
                    if (b9.getText() == "") {
                        xos[8] = turn;
                        b9.setText(xo);
                        turn = nextturn;
                        turncount++;
                        break;
                    }
                    break;
            }
            if (turncount == 10 || gameWon()) {
                endgame = 1;
                Toast.makeText(getApplicationContext(), "Player " + Integer.toString(winner+1) + " wins!",
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    public boolean gameWon() {
        if ((xos[0] == 1 && xos[1] == 1 && xos[2] == 1) || (xos[0] == 0 && xos[1] == 0 && xos[2] == 0)) {
            if (xos[0] == 0) {
                winner = 0;
            }
            else {
                winner = 1;
            }
            return true;
        }
        if ((xos[3] == 1 && xos[4] == 1 && xos[5] == 1) || (xos[3] == 0 && xos[4] == 0 && xos[5] == 0)) {
            if (xos[3] == 0) {
                winner = 0;
            }
            else {
                winner = 1;
            }
            return true;
        }
        if ((xos[6] == 1 && xos[7] == 1 && xos[8] == 1) || (xos[6] == 0 && xos[7] == 0 && xos[8] == 0)) {
            if (xos[6] == 0) {
                winner = 0;
            }
            else {
                winner = 1;
            }
            return true;
        }
        if ((xos[0] == 1 && xos[3] == 1 && xos[6] == 1) || (xos[0] == 0 && xos[3] == 0 && xos[6] == 0)) {
            if (xos[0] == 0) {
                winner = 0;
            }
            else {
                winner = 1;
            }
            return true;
        }
        if ((xos[1] == 1 && xos[4] == 1 && xos[7] == 1) || (xos[1] == 0 && xos[4] == 0 && xos[7] == 0)) {
            if (xos[1] == 0) {
                winner = 0;
            }
            else {
                winner = 1;
            }
            return true;
        }
        if ((xos[2] == 1 && xos[5] == 1 && xos[8] == 1) || (xos[2] == 0 && xos[5] == 0 && xos[8] == 0)) {
            if (xos[2] == 0) {
                winner = 0;
            }
            else {
                winner = 1;
            }
            return true;
        }
        if ((xos[0] == 1 && xos[4] == 1 && xos[8] == 1) || (xos[0] == 0 && xos[4] == 0 && xos[8] == 0)) {
            if (xos[0] == 0) {
                winner = 0;
            }
            else {
                winner = 1;
            }
            return true;
        }
        if ((xos[2] == 1 && xos[4] == 1 && xos[6] == 1) || (xos[2] == 0 && xos[4] == 0 && xos[6] == 0)) {
            if (xos[2] == 0) {
                winner = 0;
            }
            else {
                winner = 1;
            }
            return true;
        }
        return false;
    }

    public void newGame(View v) {
        for (int i = 0; i < 9; i++) {
            xos[i] = -1;
        }
        turn = 0;
        nextturn = 0;
        xo = "X";
        turncount = 1;
        endgame = 0;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        winner = -1;

    }
}
