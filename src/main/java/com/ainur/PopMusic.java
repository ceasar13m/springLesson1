package com.ainur;

public class PopMusic implements Music {
    private PopMusic(){}

    public static PopMusic getPopMusic() {
        return new PopMusic();
    }
    @Override
    public String getSong() {
        return "No roots";
    }
}
