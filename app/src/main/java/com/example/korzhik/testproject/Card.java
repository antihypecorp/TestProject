package com.example.korzhik.testproject;

import android.widget.TextView;

public class Card {
    private TextView questName;
    private TextView shortDescription;

    public Card(TextView questName, TextView shortDescription) {
        this.questName = questName;
        this.shortDescription = shortDescription;
    }

    public TextView getQuestName() {
        return questName;
    }
    public TextView getShortDescription() {
        return shortDescription;
    }
}
