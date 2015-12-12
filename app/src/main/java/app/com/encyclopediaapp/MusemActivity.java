package app.com.encyclopediaapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MusemActivity extends Activity {

    @Bind(R.id.img1) ImageView image1;
    @Bind(R.id.img2) ImageView image2;
    @Bind(R.id.img3) ImageView image3;
    @Bind(R.id.img4) ImageView image4;
    @Bind(R.id.img5) ImageView image5;
    @Bind(R.id.img6) ImageView image6;
    @Bind(R.id.img7) ImageView image7;
    @Bind(R.id.img8) ImageView image8;
    @Bind(R.id.img9) ImageView image9;
    @Bind(R.id.img10) ImageView image10;
    @Bind(R.id.imgmap) ImageView imgMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musem);
        ButterKnife.bind(this);

        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage("assets://musem/" + "image006.jpg", image1);
        imageLoader.displayImage("assets://musem/" + "image007.jpg", image2);
        imageLoader.displayImage("assets://musem/" + "image008.jpg", image3);
        imageLoader.displayImage("assets://musem/" + "image009.jpg", image4);
        imageLoader.displayImage("assets://musem/" + "image010.jpg", image5);
        imageLoader.displayImage("assets://musem/" + "image011.jpg", image6);
        imageLoader.displayImage("assets://musem/" + "image012.jpg", image7);
        imageLoader.displayImage("assets://musem/" + "image013.jpg", image8);
        imageLoader.displayImage("assets://musem/" + "image014.png", image9);
        imageLoader.displayImage("assets://musem/" + "image015.jpg", image10);
        imageLoader.displayImage("assets://musem/" + "map.png", imgMap);

    }
}
