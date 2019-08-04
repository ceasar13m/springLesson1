package com.ainur;

public class EDMusic implements Music {
    private EDMusic() {}

    public static EDMusic getEdMusic() {
        return new EDMusic();
    }
    @Override
    public String getSong() {
        return "Levels";
    }
}
