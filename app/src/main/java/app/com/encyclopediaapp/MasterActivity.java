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
import android.widget.ImageView;
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
    @Bind (R.id.imageViewItem) ImageView imageView;

    ArrayList<Item> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        ButterKnife.bind(this);

        items = new ArrayList<>();

        Item item = new Item();
        item.setId("");
        item.setImageUrl("aan1.jpg");
        item.setText("");
        item.setVoiceUrl("a7.mp3");

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

                doActionOnClickAtIndex(index);

            }
        });

    }


    private void doActionOnClickAtIndex( int index){

        Toast.makeText(MasterActivity.this,"index ="+index,Toast.LENGTH_LONG).show();

        Item clickedItem = items.get(index);
        clickedItem.getImageUrl();
        clickedItem.getText();

        imageView.setImageResource(R.drawable.aan1);
        AppFunctions.play(this,"letters/a7.mp3");
    }


}
