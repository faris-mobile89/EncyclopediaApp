package app.com.encyclopediaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @Bind(R.id.imageButton) ImageButton numberIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        numberIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goToNumberActivity = new Intent(MainActivity.this,
                        NumbersActivity.class);
                startActivity(goToNumberActivity);

                // Github

            }
        });



    }

}
