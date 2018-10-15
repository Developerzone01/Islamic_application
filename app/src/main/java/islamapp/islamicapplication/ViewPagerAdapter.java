package islamapp.islamicapplication;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Haider Ali on 5/28/2018.
 */

public class ViewPagerAdapter extends PagerAdapter  {



    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<String> image;
    /*private Integer [] image=
            {
                    R.drawable.para1_2, R.drawable.para1_3, R.drawable.para1_4, R.drawable.para1_5, R.drawable.para1_6,R.drawable.para1_7,R.drawable.para1_8,R.drawable.para1_9,R.drawable.para1_10,R.drawable.para1_11,R.drawable.para1_12,R.drawable.para1_13,R.drawable.para1_14,R.drawable.para1_15,R.drawable.para1_16,R.drawable.para1_17,R.drawable.para1_18,
                    R.drawable.para1_19,R.drawable.para1_20,R.drawable.para2_21,R.drawable.para2_22,R.drawable.para2_23,R.drawable.para2_24,R.drawable.para2_25,R.drawable.para2_26,R.drawable.para2_27,R.drawable.para2_28,R.drawable.para2_29,R.drawable.para2_30,R.drawable.para2_31,R.drawable.para2_32,R.drawable.para2_33,R.drawable.para2_34,R.drawable.para2_35,
                    R.drawable.para2_36,R.drawable.para2_37,R.drawable.para2_38,R.drawable.para3_39
                    ,R.drawable.para3_40,R.drawable.para3_41,R.drawable.para3_42,R.drawable.para3_43,R.drawable.para3_44,R.drawable.para3_45,R.drawable.para3_46,R.drawable.para3_47,R.drawable.para3_48,R.drawable.para3_49,R.drawable.para3_50,R.drawable.para3_51,R.drawable.para3_52,R.drawable.para3_53,R.drawable.para3_54,R.drawable.para3_55,R.drawable.para3_56,

            };*/
    public ViewPagerAdapter(Context context, ArrayList<String> images) {
        this.context = context;
        this.image = images;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return image.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.custom_layout_quran,null);
        Bitmap bitmap = getBitmapFromAsset(image.get(position));
        ImageView imageView= (ImageView) view.findViewById(R.id.image_quran);
        imageView.setImageBitmap(bitmap);
        ViewPager vp=(ViewPager) container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp=(ViewPager) container;
        View view=(View) object;
        vp.removeView(view);




    }

    private Bitmap getBitmapFromAsset(String id) {
        AssetManager assetManager = context.getAssets();
        InputStream stream = null;
        try {
            stream = assetManager.open(id + ".jpg");
            return BitmapFactory.decodeStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}



