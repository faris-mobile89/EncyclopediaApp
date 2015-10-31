package app.com.encyclopediaapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            } 
        };

        new android.os.Handler().postDelayed(runnable,3000);
    }

}
