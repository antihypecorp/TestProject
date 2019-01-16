package com.example.korzhik.testproject;

public class Quest {
    private String questName;
    private String short_description;
    private String long_description;
    private int id;
    private int level;
    private int experience;

    public String getQuestName() {
        return questName;
    }

    public String getShort_description() {
        return short_description;
    }

    public String getLong_description() {
        return long_description;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public Quest(String questName, String short_description, String long_description, int id, int level, int experience) {
        this.questName = questName;
        this.short_description = short_description;
        this.long_description = long_description;
        this.id = id;
        this.level = level;
        this.experience = experience;
    }
}
