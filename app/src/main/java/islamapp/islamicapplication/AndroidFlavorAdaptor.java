package islamapp.islamicapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Haider Ali on 8/26/2018.
 */

public class AndroidFlavorAdaptor extends ArrayAdapter<AndroidFlavor> {
    public AndroidFlavorAdaptor(Context context, ArrayList<AndroidFlavor> androidFlavors) {
        super(context,0,androidFlavors);
    }

    @Override
    public View getView(int position , View convertView , ViewGroup parent){
        View ListItemView = convertView;

        if (ListItemView==null){
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_menu,parent,false);
        }
        AndroidFlavor currentAndroidFlavor = getItem(position);
        Log.d("The value of Position",""+position);

        TextView nameTextView = (TextView) ListItemView.findViewById(R.id.listView_name);
        nameTextView.setText(currentAndroidFlavor.getmVersion_name());


        ImageView iconView = (ImageView) ListItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentAndroidFlavor.getmImageResource());

        return ListItemView;
    }
}
