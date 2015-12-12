package app.com.encyclopediaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @OnClick(R.id.numbers) void lunchNumbers(){
        startMasterActivity("numbers");
    }

    @OnClick(R.id.alphabets) void lunchAlphabets(){
        startMasterActivity("alphabet");
    }

    @OnClick(R.id.imageView2) void lunchColors(){startMasterActivity("colors");}

    @OnClick(R.id.imageView3) void lunchAnimals(){
        startMasterActivity("animals");
    }

    @OnClick(R.id.imageView4) void lunchQuraan(){
        startMasterActivity("quraan");
    }

    @OnClick(R.id.imageView5) void lunchFruits(){
        startMasterActivity("fruits");
    }

    @OnClick(R.id.imageView6) void lunchMuseum(){

        Intent master = new Intent(MainActivity.this, MusemActivity.class);
        startActivity(master);

    }

    @Bind(R.id.buttonShare) Button btnShare;

    @OnClick(R.id.buttonShare) void share(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Share");
        stringBuilder.append("\n");
        String appPackageName = getPackageName();
        stringBuilder.append("http://play.google.com/store/apps/details?id=" + appPackageName);
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TEXT, stringBuilder.toString());
        shareIntent.setType("text/plain");
        startActivity(Intent.createChooser(shareIntent,"Share"));

    }

    @OnClick(R.id.button2) void quitApp(){
        stopService(new Intent(this,
                BackgroundSoundService.class));
        System.exit(0);
    }


    private void startMasterActivity(String type){

        Intent master = new Intent(MainActivity.this, MasterActivity.class);
        master.putExtra("type",type);
        startActivity(master);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnShare.setText("مشاركة");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(this, BackgroundSoundService.class));
    }

}
