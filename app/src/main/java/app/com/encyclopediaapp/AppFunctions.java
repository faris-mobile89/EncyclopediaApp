package app.com.encyclopediaapp;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import java.io.IOException;

public class AppFunctions {

    public static MediaPlayer mediaPlayer;

    public static void play(Context context, String file) {
        try {

            mediaPlayer = MyMediaPlayer.getInstance().mp;

            try {
                if (mediaPlayer !=null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                }

                mediaPlayer.reset();

            }catch (Exception e){
                e.printStackTrace();
            }

            AssetFileDescriptor afd = context.getAssets().openFd(file);
            mediaPlayer.setDataSource(
                    afd.getFileDescriptor(),
                    afd.getStartOffset(),
                    afd.getLength()
            );

            afd.close();
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void stop(){

        mediaPlayer = MyMediaPlayer.getInstance().mp;

        try {
            if (mediaPlayer !=null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
