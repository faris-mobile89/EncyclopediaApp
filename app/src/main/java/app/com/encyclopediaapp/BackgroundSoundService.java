package app.com.encyclopediaapp;


import android.app.Service;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import java.io.IOException;

//http://stackoverflow.com/questions/8209858/android-background-music-service/8209975#8209975

public class BackgroundSoundService extends Service {


    private static final String TAG = null;
    MediaPlayer player;
    public IBinder onBind(Intent arg0) {

        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            AssetFileDescriptor afd = this.getAssets().openFd("ar/bg_sound.mp3");
            player = new MediaPlayer();
            player.setDataSource(
                    afd.getFileDescriptor(),
                    afd.getStartOffset(),
                    afd.getLength()
            );
            player.setLooping(true); // Set looping
            player.setVolume(50, 50);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("service", "onStartCommand");
        try {
            player.prepare();
            player.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public void onStart(Intent intent, int startId) {
    }
    public IBinder onUnBind(Intent arg0) {
        return null;
    }

    public void onStop() {

    }
    public void onPause() {

    }
    @Override
    public void onDestroy() {
        player.stop();
        player.release();
    }

    @Override
    public void onLowMemory() {

    }
}