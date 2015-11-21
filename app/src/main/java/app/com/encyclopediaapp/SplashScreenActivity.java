package app.com.encyclopediaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import butterknife.Bind;
import butterknife.ButterKnife;


public class SplashScreenActivity extends Activity {


    @Bind(R.id.background_img) ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);

        Intent svc = new Intent(this, BackgroundSoundService.class);
        //startService(svc);


        Runnable goToMain = new Runnable() {
          @Override
          public void run() {

              Intent mainActivity = new
                      Intent(SplashScreenActivity.this,MainActivity.class);
              startActivity(mainActivity);
              finish();
           }
        };

        new android.os.Handler().postDelayed(goToMain,3000);

    }

}
