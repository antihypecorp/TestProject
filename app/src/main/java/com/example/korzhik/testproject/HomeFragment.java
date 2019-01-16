package com.example.korzhik.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {//начальный экран

    String name = "name";
    ConstraintLayout pre_exs[] = new ConstraintLayout[10];
    View supView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        supView = inflater.inflate(R.layout.fragment_home, container, false);

        pre_exs[0] = supView.findViewById(R.id.ex_1);
        pre_exs[1] = supView.findViewById(R.id.ex_2);
        pre_exs[2] = supView.findViewById(R.id.ex_3);
        pre_exs[3] = supView.findViewById(R.id.ex_4);
        pre_exs[4] = supView.findViewById(R.id.ex_5);

        TextView name1 = supView.findViewById(R.id.quest_1_name);
        TextView name2 = supView.findViewById(R.id.quest_2_name);
        TextView name3 = supView.findViewById(R.id.quest_3_name);
        TextView name4 = supView.findViewById(R.id.quest_4_name);
        TextView name5 = supView.findViewById(R.id.quest_5_name);
        //name1.setText(getResources().getString(R.string.id101_names));
        //name2.setText(getResources().getString(R.string.id102_names));
        //name3.setText(getResources().getString(R.string.id103_names));
        //name4.setText(getResources().getString(R.string.id104_names));
        //name5.setText(getResources().getString(R.string.id105_names));

        TextView sD1 = supView.findViewById(R.id.quest_1_name);
        TextView sD2 = supView.findViewById(R.id.quest_2_name);
        TextView sD3 = supView.findViewById(R.id.quest_3_name);
        TextView sD4 = supView.findViewById(R.id.quest_4_name);
        TextView sD5 = supView.findViewById(R.id.quest_5_name);
       sD1.setText("@string/id101_names");
       sD2.setText("@string/id102_names");
       sD3.setText("@string/id103_names");
       sD4.setText("@string/id104_names");
       sD5.setText("@string/id105_names");

        final Card[] full_exs = new Card[5];
        full_exs[0] = new Card((TextView)supView.findViewById(R.id.quest_1_name),
                (TextView)supView.findViewById(R.id.quest_1_short_description));
        full_exs[1] = new Card((TextView)supView.findViewById(R.id.quest_2_name),
                (TextView)supView.findViewById(R.id.quest_2_short_description));
        full_exs[2] = new Card((TextView)supView.findViewById(R.id.quest_3_name),
                (TextView)supView.findViewById(R.id.quest_3_short_description));
        full_exs[3] = new Card((TextView)supView.findViewById(R.id.quest_4_name),
                (TextView)supView.findViewById(R.id.quest_4_short_description));
        full_exs[4] = new Card((TextView)supView.findViewById(R.id.quest_5_name),
                (TextView)supView.findViewById(R.id.quest_5_short_description));

        final String longDescroptions[] = new String[5];
        longDescroptions[0] = "@string/id101_long_desc";
        longDescroptions[1] = "@string/id102_long_desc";
        longDescroptions[2] = "@string/id103_long_desc";
        longDescroptions[3] = "@string/id104_long_desc";
        longDescroptions[4] = "@string/id105_long_desc";

        //TextView txtTest = supView.findViewById(R.id.);
        for(int i=0;i<5;++i){
            pre_exs[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    TextView questName = supView.findViewById(R.id.quest_name_large);
                    TextView shortDecription= supView.findViewById(R.id.quest_description_short_large);
                    TextView longDecription= supView.findViewById(R.id.quest_description_long_large);

                    if(view == supView.findViewById(R.id.ex_1)){
                        questName.setText(full_exs[0].getQuestName().getText());
                        shortDecription.setText(full_exs[0].getShortDescription().getText());
                        longDecription.setText(longDescroptions[0]);
                    }
                    else if(view == supView.findViewById(R.id.ex_2)){
                        questName.setText(full_exs[1].getQuestName().getText());
                        shortDecription.setText(full_exs[1].getShortDescription().getText());
                        longDecription.setText(longDescroptions[1]);
                    }
                    else if(view == supView.findViewById(R.id.ex_3)){
                        questName.setText(full_exs[2].getQuestName().getText());
                        shortDecription.setText(full_exs[2].getShortDescription().getText());
                        longDecription.setText(longDescroptions[2]);
                    }
                    else if(view == supView.findViewById(R.id.ex_4)){
                        questName.setText(full_exs[3].getQuestName().getText());
                        shortDecription.setText(full_exs[3].getShortDescription().getText());
                        longDecription.setText(longDescroptions[3]);
                    }
                    else{
                        questName.setText(full_exs[4].getQuestName().getText());
                        shortDecription.setText(full_exs[4].getShortDescription().getText());
                        longDecription.setText(longDescroptions[4]);
                    }

                    Intent intent = new Intent(getActivity(), QuestActivity.class);
                    intent.putExtra(QuestActivity.KEY_NAME, name);
                    startActivity(intent);
                }
            });
        }
        return supView;
    }
}