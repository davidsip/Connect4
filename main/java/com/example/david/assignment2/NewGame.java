package com.example.david.assignment2;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class NewGame extends AppCompatActivity implements InputFragment.UserInputListener {


    public Data data;
    public Array array;

    //This gets called by the Input Fragment when user clicks button for column 0
    @Override
    public void selectedColumn0(String chip) {
        BoardViewFragment board = (BoardViewFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        board.setColumn0(chip);
    }
    //This gets called by the Input Fragment when user clicks button for column 1
    @Override
    public void selectedColumn1(String chip) {
        BoardViewFragment board = (BoardViewFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        board.setColumn1(chip);
    }

    //This gets called by the Input Fragment when user clicks button for column 2
    @Override
    public void selectedColumn2(String chip) {
        BoardViewFragment board = (BoardViewFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        board.setColumn2(chip);
    }
    //This gets called by the Input Fragment when user clicks button for column 3
    @Override
    public void selectedColumn3(String chip) {
        BoardViewFragment board = (BoardViewFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        board.setColumn3(chip);
    }

    //This gets called by the Input Fragment when user clicks button for column 4
    @Override
    public void selectedColumn4(String chip) {
        BoardViewFragment board = (BoardViewFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        board.setColumn4(chip);
    }

    //This gets called by the Input Fragment when user clicks button for column 5
    @Override
    public void selectedColumn5(String chip) {
        BoardViewFragment board = (BoardViewFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        board.setColumn5(chip);
    }

    //This gets called by the Input Fragment when user clicks button for column 6
    @Override
    public void selectedColumn6(String chip) {
        BoardViewFragment board = (BoardViewFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        board.setColumn6(chip);
    }

    protected static ToggleButton toggleButton;
    protected static Button winnerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        toggleButton.setChecked(false); // set to false when Red player's turn

        final TextView[][] array = new TextView[6][7];


        array[0][0] = BoardViewFragment.token00; array[0][1] = BoardViewFragment.token01; array[0][2] = BoardViewFragment.token02; array[0][3] = BoardViewFragment.token03; array[0][4] = BoardViewFragment.token04; array[0][5] = BoardViewFragment.token05; array[0][6] = BoardViewFragment.token06;
        array[1][0] = BoardViewFragment.token10; array[1][1] = BoardViewFragment.token11; array[1][2] = BoardViewFragment.token12; array[1][3] = BoardViewFragment.token13; array[1][4] = BoardViewFragment.token14; array[1][5] = BoardViewFragment.token15; array[1][6] = BoardViewFragment.token16;
        array[2][0] = BoardViewFragment.token20; array[2][1] = BoardViewFragment.token21; array[2][2] = BoardViewFragment.token22; array[2][3] = BoardViewFragment.token23; array[2][4] = BoardViewFragment.token24; array[2][5] = BoardViewFragment.token25; array[2][6] = BoardViewFragment.token26;
        array[3][0] = BoardViewFragment.token30; array[3][1] = BoardViewFragment.token31; array[3][2] = BoardViewFragment.token32; array[3][3] = BoardViewFragment.token33; array[3][4] = BoardViewFragment.token34; array[3][5] = BoardViewFragment.token35; array[3][6] = BoardViewFragment.token36;
        array[4][0] = BoardViewFragment.token40; array[4][1] = BoardViewFragment.token41; array[4][2] = BoardViewFragment.token42; array[4][3] = BoardViewFragment.token43; array[4][4] = BoardViewFragment.token44; array[4][5] = BoardViewFragment.token45; array[4][6] = BoardViewFragment.token46;
        array[5][0] = BoardViewFragment.token50; array[5][1] = BoardViewFragment.token51; array[5][2] = BoardViewFragment.token52; array[5][3] = BoardViewFragment.token53; array[5][4] = BoardViewFragment.token54; array[5][5] = BoardViewFragment.token55; array[5][6] = BoardViewFragment.token56;

        winnerButton = (Button) findViewById(R.id.checkWinner);

        winnerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkWin(array);
            }
        });



//        data = Data.getInstance();
//        array = Array.getInstance();


    }

    public void checkWin(TextView[][] arr){

        //horizontal check
        for(int j=0; j<4; j++){
            for(int i=0; i<6; i++){
                if(arr[i][j].getText().toString().equals("1") && arr[i][j+1].getText().toString().equals("1")&&
                        arr[i][j+2].getText().toString().equals("1")&& arr[i][j+3].getText().toString().equals("1")){
                    Toast.makeText(this, "Player wins!", Toast.LENGTH_LONG).show();
                }
            }
        }

//                if(arr[5][0].getText().toString().equals("1")){
//                    Toast.makeText(this, "Player wins!", Toast.LENGTH_LONG).show();
//                }else Toast.makeText(this, "NOPE!", Toast.LENGTH_SHORT).show();





       // Toast.makeText(this, "Player 2 winner!", Toast.LENGTH_LONG).show();
//        for(int i=5; i>=0; i--){
//            if(arr[i][0].equals("2")){
//                Toast.makeText(this, "Player 2 winner!", Toast.LENGTH_LONG).show();
//            }else if (arr[i][0].equals("1")){
//                Toast.makeText(this, "Player 1 winner!", Toast.LENGTH_LONG).show();
//            }else break;
//        }

    }
}
