package app.com.encyclopediaapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import app.com.encyclopediaapp.R;
import app.com.encyclopediaapp.model.Item;

public class ItemsAdapter extends ArrayAdapter<Item> {

    public ItemsAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_item, parent, false);
            viewHolder.imageView = (ImageView)convertView.findViewById(R.id.imageView);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //viewHolder.imageView.setImageResource(R.mipmap.ic_launcher);
        // Return the completed view to render on screen
        return convertView;
    }


    // View lookup cache
    private static class ViewHolder {
        ImageView imageView;
    }


}