package app.com.encyclopediaapp;

import android.app.Application;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by Faris on 11/21/15.
 */
public class MyApp  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(this));
    }
}
