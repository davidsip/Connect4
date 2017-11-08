package com.example.david.assignment2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ToggleButton;
import com.example.david.assignment2.NewGame;


public class InputFragment extends Fragment{
    public Data data;


    UserInputListener activityCommander;

    public interface UserInputListener  {
        public void selectedColumn0(String token);
        public void selectedColumn1(String token);
        public void selectedColumn2(String token);
        public void selectedColumn3(String token);
        public void selectedColumn4(String token);
        public void selectedColumn5(String token);
        public void selectedColumn6(String token);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (UserInputListener) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_input_fragment, container, false);
       //  final View view2 = inflater.inflate(R.layout.activity_new_game, container, false);




        Button colZero = (Button) view.findViewById(R.id.column0);
        Button colOne = (Button) view.findViewById(R.id.column1);
        Button colTwo = (Button) view.findViewById(R.id.column2);
        Button colThree = (Button) view.findViewById(R.id.column3);
        Button colFour = (Button) view.findViewById(R.id.column4);
        Button colFive = (Button) view.findViewById(R.id.column5);
        Button colSix = (Button) view.findViewById(R.id.column6);
       // final ToggleButton toggleButton = (ToggleButton) view.findViewById(R.id.toggle);

        //toggleButton.setChecked(false); // set to false when Red player's turn


        colZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NewGame.toggleButton.isChecked())
                activityCommander.selectedColumn0("2");
                else activityCommander.selectedColumn0("1");
                NewGame.toggleButton.toggle();
                NewGame.winnerButton.performClick();
//                data = Data.getInstance();
//                data.setString();
            }
        });

        colOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NewGame.toggleButton.isChecked())
                    activityCommander.selectedColumn1("2");
                else activityCommander.selectedColumn1("1");
                NewGame.toggleButton.toggle();
            }
        });

        colTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NewGame.toggleButton.isChecked())
                    activityCommander.selectedColumn2("2");
                else activityCommander.selectedColumn2("1");
                NewGame.toggleButton.toggle();
            }
        });

        colThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NewGame.toggleButton.isChecked())
                    activityCommander.selectedColumn3("2");
                else activityCommander.selectedColumn3("1");
                NewGame.toggleButton.toggle();
            }
        });

        colFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NewGame.toggleButton.isChecked())
                    activityCommander.selectedColumn4("2");
                else activityCommander.selectedColumn4("1");
                NewGame.toggleButton.toggle();
            }
        });

        colFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NewGame.toggleButton.isChecked())
                    activityCommander.selectedColumn5("2");
                else activityCommander.selectedColumn5("1");
                NewGame.toggleButton.toggle();
            }
        });

        colSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NewGame.toggleButton.isChecked())
                    activityCommander.selectedColumn6("2");
                else activityCommander.selectedColumn6("1");
                NewGame.toggleButton.toggle();
            }
        });


        return view;
    }


}
