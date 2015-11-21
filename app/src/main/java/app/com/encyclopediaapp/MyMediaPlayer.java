package app.com.encyclopediaapp;


import android.media.MediaPlayer;

public class MyMediaPlayer {
    static MediaPlayer mp;

    private static volatile MyMediaPlayer instance = null;
    private MyMediaPlayer() { }

    public static MyMediaPlayer getInstance() {
        if (instance == null) {
            synchronized (MyMediaPlayer.class) {
                if (instance == null) {
                    instance = new MyMediaPlayer();
                    mp = new MediaPlayer();
                }
            }
        }
        return instance;
    }
}