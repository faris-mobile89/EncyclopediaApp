package app.com.encyclopediaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;;
import android.view.View;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @Bind(R.id.imageButton) ImageButton numberIcon;
    @Bind(R.id.imageButton) ImageButton ColorsIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        numberIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent master = new Intent(MainActivity.this, MasterActivity.class);
                master.putExtra("type","numbers");
                startActivity(master);
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(this,
                BackgroundSoundService.class));
    }
}
