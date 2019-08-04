package com.ainur;

public class MusicPlayer {
    Music music;

    void initMethod() {
        System.out.println("Init method");
    }

    void destroyMethod() {
        System.out.println("Destroy method");
    }
    public void playMusic() {
        System.out.println(music.getSong());
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
