package app.com.encyclopediaapp;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import java.io.IOException;

/**
 * Created by Faris on 11/7/15.
 */
public class AppFunctions {


    public static void play(Context context, String file) {
        try {
            AssetFileDescriptor afd = context.getAssets().openFd(file);
            MediaPlayer mediaPlayer = new MediaPlayer();
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
}
