package app.com.encyclopediaapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import app.com.encyclopediaapp.R;
import app.com.encyclopediaapp.model.Item;

public class ItemsAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Item> mItems;
    ImageLoader imageLoader;
    DisplayImageOptions options;

    public ItemsAdapter(Activity activity, List<Item> itemList) {
        this.mItems = itemList;
        inflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader = ImageLoader.getInstance();
        options = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).build();
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int location) {
        return mItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 0
        View vi = convertView; // empty

        ViewHolder holder = null;

        if (vi == null) {
            vi = inflater.inflate(R.layout.row_item, parent, false);
            holder = new ViewHolder();
            holder.imgThumbnail = (ImageView)vi.findViewById(R.id.imageView);
            vi.setTag(holder);
        } else {
            // View recycled !
            // no need to inflate
            // no need to findViews by id
            holder = (ViewHolder) vi.getTag();
        }

        Item item = getItem(position);

        imageLoader.displayImage(item.getThumbPath(), holder.imgThumbnail,options);
        return vi;
    }

    static class ViewHolder {
        public ImageView imgThumbnail;
        public TextView textViewM;
    }

}