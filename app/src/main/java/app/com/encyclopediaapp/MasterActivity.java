package app.com.encyclopediaapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import org.lucasr.twowayview.TwoWayView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import app.com.encyclopediaapp.adapter.ItemsAdapter;
import app.com.encyclopediaapp.model.Item;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MasterActivity extends Activity {


    @Bind(R.id.sliderTabs) TwoWayView tabView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        ButterKnife.bind(this);

        ArrayList<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setId("");
        item.setImageUrl("");
        item.setText("");
        item.setVoiceUrl("");

        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);


        ItemsAdapter adapter = new ItemsAdapter(this,items);
        tabView.setAdapter(adapter);


        tabView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {

                Toast.makeText(MasterActivity.this,"index ="+index,Toast.LENGTH_LONG).show();
            }
        });


    }
}
