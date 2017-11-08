package com.example.david.assignment2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BoardViewFragment extends Fragment {


    public Data data;

    protected static TextView token00, token01,token02,token03,token04, token05, token06;
    protected static TextView token10, token11,token12,token13,token14, token15, token16;
    protected static TextView token20, token21,token22,token23,token24, token25, token26;
    protected static TextView token30, token31,token32,token33,token34, token35, token36;
    protected static TextView token40, token41,token42,token43,token44, token45, token46;
    protected static TextView token50, token51,token52,token53,token54, token55, token56;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.board_fragment, container, false);

      //  final TextView[][] array = new TextView[6][7];

        token00 = (TextView) view.findViewById(R.id.rowcol00);
        token10 = (TextView) view.findViewById(R.id.rowcol10);
        token20 = (TextView) view.findViewById(R.id.rowcol20);
        token30 = (TextView) view.findViewById(R.id.rowcol30);
        token40 = (TextView) view.findViewById(R.id.rowcol40);
        token50 = (TextView) view.findViewById(R.id.rowcol50);

        token01 = (TextView) view.findViewById(R.id.rowcol01);
        token11 = (TextView) view.findViewById(R.id.rowcol11);
        token21 = (TextView) view.findViewById(R.id.rowcol21);
        token31 = (TextView) view.findViewById(R.id.rowcol31);
        token41 = (TextView) view.findViewById(R.id.rowcol41);
        token51 = (TextView) view.findViewById(R.id.rowcol51);

        token02 = (TextView) view.findViewById(R.id.rowcol02);
        token12 = (TextView) view.findViewById(R.id.rowcol12);
        token22 = (TextView) view.findViewById(R.id.rowcol22);
        token32 = (TextView) view.findViewById(R.id.rowcol32);
        token42 = (TextView) view.findViewById(R.id.rowcol42);
        token52 = (TextView) view.findViewById(R.id.rowcol52);

        token03 = (TextView) view.findViewById(R.id.rowcol03);
        token13 = (TextView) view.findViewById(R.id.rowcol13);
        token23 = (TextView) view.findViewById(R.id.rowcol23);
        token33 = (TextView) view.findViewById(R.id.rowcol33);
        token43 = (TextView) view.findViewById(R.id.rowcol43);
        token53 = (TextView) view.findViewById(R.id.rowcol53);

        token04 = (TextView) view.findViewById(R.id.rowcol04);
        token14 = (TextView) view.findViewById(R.id.rowcol14);
        token24 = (TextView) view.findViewById(R.id.rowcol24);
        token34 = (TextView) view.findViewById(R.id.rowcol34);
        token44 = (TextView) view.findViewById(R.id.rowcol44);
        token54 = (TextView) view.findViewById(R.id.rowcol54);

        token05 = (TextView) view.findViewById(R.id.rowcol05);
        token15 = (TextView) view.findViewById(R.id.rowcol15);
        token25 = (TextView) view.findViewById(R.id.rowcol25);
        token35 = (TextView) view.findViewById(R.id.rowcol35);
        token45 = (TextView) view.findViewById(R.id.rowcol45);
        token55 = (TextView) view.findViewById(R.id.rowcol55);

        token06 = (TextView) view.findViewById(R.id.rowcol06);
        token16 = (TextView) view.findViewById(R.id.rowcol16);
        token26 = (TextView) view.findViewById(R.id.rowcol26);
        token36 = (TextView) view.findViewById(R.id.rowcol36);
        token46 = (TextView) view.findViewById(R.id.rowcol46);
        token56 = (TextView) view.findViewById(R.id.rowcol56);


//        array[0][0] = token00; array[0][1] = token01; array[0][2] = token02; array[0][3] = token03; array[0][4] = token04; array[0][5] = token05; array[0][6] = token06;
//        array[1][0] = token10; array[1][1] = token11; array[1][2] = token12; array[1][3] = token13; array[1][4] = token14; array[1][5] = token15; array[1][6] = token16;
//        array[2][0] = token20; array[2][1] = token21; array[2][2] = token22; array[2][3] = token23; array[2][4] = token24; array[2][5] = token25; array[2][6] = token26;
//        array[3][0] = token30; array[3][1] = token31; array[3][2] = token32; array[3][3] = token33; array[3][4] = token34; array[3][5] = token35; array[3][6] = token36;
//        array[4][0] = token40; array[4][1] = token41; array[4][2] = token42; array[4][3] = token43; array[4][4] = token44; array[4][5] = token45; array[4][6] = token46;
//        array[5][0] = token50; array[5][1] = token51; array[5][2] = token52; array[5][3] = token53; array[5][4] = token54; array[5][5] = token55; array[5][6] = token56;


        return view;
    }



    public void setColumn0(String str){
        if(token00.getText().toString().equals("1") || token00.getText().toString().equals("2")){
            Toast.makeText(getContext(), "Sorry, column 0 full", Toast.LENGTH_SHORT).show();
            NewGame.toggleButton.toggle();
        }

        else if(token10.getText().toString().equals("1") || token10.getText().toString().equals("2") )
            token00.setText(str);
        else if(token20.getText().toString().equals("1") || token20.getText().toString().equals("2"))
            token10.setText(str);
        else if(token30.getText().toString().equals("1") || token30.getText().toString().equals("2"))
            token20.setText(str);
        else if(token40.getText().toString().equals("1") || token40.getText().toString().equals("2"))
            token30.setText(str);
        else if(token50.getText().toString().equals("1") || token50.getText().toString().equals("2"))
            token40.setText(str);
        else token50.setText(str);
    }
    public void setColumn1(String str){
        if(token01.getText().toString().equals("1") || token01.getText().toString().equals("2")){
            Toast.makeText(getContext(), "Sorry, column 1 full", Toast.LENGTH_SHORT).show();
            NewGame.toggleButton.toggle();
        }

        else if(token11.getText().toString().equals("1") || token11.getText().toString().equals("2") )
            token01.setText(str);
        else if(token21.getText().toString().equals("1") || token21.getText().toString().equals("2"))
            token11.setText(str);
        else if(token31.getText().toString().equals("1") || token31.getText().toString().equals("2"))
            token21.setText(str);
        else if(token41.getText().toString().equals("1") || token41.getText().toString().equals("2"))
            token31.setText(str);
        else if(token51.getText().toString().equals("1") || token51.getText().toString().equals("2"))
            token41.setText(str);
        else token51.setText(str);
    }
    public void setColumn2(String str){
        if(token02.getText().toString().equals("1") || token02.getText().toString().equals("2")){
            Toast.makeText(getContext(), "Sorry, column 2 full", Toast.LENGTH_SHORT).show();
            NewGame.toggleButton.toggle();
        }
        else if(token12.getText().toString().equals("1") || token12.getText().toString().equals("2") )
            token02.setText(str);
        else if(token22.getText().toString().equals("1") || token22.getText().toString().equals("2"))
            token12.setText(str);
        else if(token32.getText().toString().equals("1") || token32.getText().toString().equals("2"))
            token22.setText(str);
        else if(token42.getText().toString().equals("1") || token42.getText().toString().equals("2"))
            token32.setText(str);
        else if(token52.getText().toString().equals("1") || token52.getText().toString().equals("2"))
            token42.setText(str);
        else token52.setText(str);
    }
    public void setColumn3(String str){
        if(token03.getText().toString().equals("1") || token03.getText().toString().equals("2")){
            Toast.makeText(getContext(), "Sorry, column 3 full", Toast.LENGTH_SHORT).show();
            NewGame.toggleButton.toggle();
        }
        else if(token13.getText().toString().equals("1") || token13.getText().toString().equals("2") )
            token03.setText(str);
        else if(token23.getText().toString().equals("1") || token23.getText().toString().equals("2"))
            token13.setText(str);
        else if(token33.getText().toString().equals("1") || token33.getText().toString().equals("2"))
            token23.setText(str);
        else if(token43.getText().toString().equals("1") || token43.getText().toString().equals("2"))
            token33.setText(str);
        else if(token53.getText().toString().equals("1") || token53.getText().toString().equals("2"))
            token43.setText(str);
        else token53.setText(str);
    }
    public void setColumn4(String str){
        if(token04.getText().toString().equals("1") || token04.getText().toString().equals("2")){
            Toast.makeText(getContext(), "Sorry, column 4 full", Toast.LENGTH_SHORT).show();
            NewGame.toggleButton.toggle();
        }
        else if(token14.getText().toString().equals("1") || token14.getText().toString().equals("2") )
            token04.setText(str);
        else if(token24.getText().toString().equals("1") || token24.getText().toString().equals("2"))
            token14.setText(str);
        else if(token34.getText().toString().equals("1") || token34.getText().toString().equals("2"))
            token24.setText(str);
        else if(token44.getText().toString().equals("1") || token44.getText().toString().equals("2"))
            token34.setText(str);
        else if(token54.getText().toString().equals("1") || token54.getText().toString().equals("2"))
            token44.setText(str);
        else token54.setText(str);
    }
    public void setColumn5(String str){
        if(token05.getText().toString().equals("1") || token05.getText().toString().equals("2")){
            Toast.makeText(getContext(), "Sorry, column 5 full", Toast.LENGTH_SHORT).show();
            NewGame.toggleButton.toggle();
        }
        else if(token15.getText().toString().equals("1") || token15.getText().toString().equals("2") )
            token05.setText(str);
        else if(token25.getText().toString().equals("1") || token25.getText().toString().equals("2"))
            token15.setText(str);
        else if(token35.getText().toString().equals("1") || token35.getText().toString().equals("2"))
            token25.setText(str);
        else if(token45.getText().toString().equals("1") || token45.getText().toString().equals("2"))
            token35.setText(str);
        else if(token55.getText().toString().equals("1") || token55.getText().toString().equals("2"))
            token45.setText(str);
        else token55.setText(str);
    }
    public void setColumn6(String str){
        if(token06.getText().toString().equals("1") || token06.getText().toString().equals("2")){
            Toast.makeText(getContext(), "Sorry, column 6 full", Toast.LENGTH_SHORT).show();
            NewGame.toggleButton.toggle();
        }
        else if(token16.getText().toString().equals("1") || token16.getText().toString().equals("2") )
            token06.setText(str);
        else if(token26.getText().toString().equals("1") || token26.getText().toString().equals("2"))
            token16.setText(str);
        else if(token36.getText().toString().equals("1") || token36.getText().toString().equals("2"))
            token26.setText(str);
        else if(token46.getText().toString().equals("1") || token46.getText().toString().equals("2"))
            token36.setText(str);
        else if(token56.getText().toString().equals("1") || token56.getText().toString().equals("2"))
            token46.setText(str);
        else token56.setText(str);
    }
}
