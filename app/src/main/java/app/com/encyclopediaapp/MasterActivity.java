package app.com.encyclopediaapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.ImageLoader;
import org.lucasr.twowayview.TwoWayView;
import java.util.ArrayList;
import app.com.encyclopediaapp.adapter.ItemsAdapter;
import app.com.encyclopediaapp.model.AppData;
import app.com.encyclopediaapp.model.Item;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MasterActivity extends Activity {


    @Bind(R.id.sliderTabs) TwoWayView tabView;
    @Bind (R.id.imageViewItem) ImageView imageView;

    ArrayList<Item> items;
    private String type;


    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        ButterKnife.bind(this);
        imageLoader = ImageLoader.getInstance();
        items = new ArrayList<>();

        type = getIntent().getExtras().getString("type");

        if (type.equals("alphabet")) {
            items = AppData.getAlphabetsData();

        } else if (type.equals("alphabet")) {
            items = AppData.getAlphabetsData();

        } else if (type.equals("numbers")) {
            items = AppData.getArabicNumbersData();

        }  else if (type.equals("alphabet")) {
            items = AppData.getAlphabetsData();

        } else if (type.equals("alphabet")) {
            items = AppData.getAlphabetsData();

        }  else if (type.equals("alphabet")) {
            items = AppData.getAlphabetsData();
        }


        ItemsAdapter adapter = new ItemsAdapter(this,items);
        tabView.setAdapter(adapter);
        doActionOnClickAtIndex(0);

        tabView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                doActionOnClickAtIndex(index);
            }
        });
    }

    private void doActionOnClickAtIndex( int index){

        Item  clickedItem     = items.get(index);
        final String imgUrl   = clickedItem.getImagePath();
        final String soundUrl = clickedItem.getVoiceUrl();

        imageLoader.displayImage(imgUrl, imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppFunctions.play(MasterActivity.this, soundUrl);
            }
        });
    }
}
