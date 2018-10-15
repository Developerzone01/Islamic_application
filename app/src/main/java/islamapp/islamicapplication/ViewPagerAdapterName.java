package islamapp.islamicapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Haider Ali on 5/24/2018.
 */

public class ViewPagerAdapterName extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images={R.drawable.allah_1,R.drawable.allah_2,R.drawable.allah_3,R.drawable.allah_4,R.drawable.allah_5,R.drawable.allah_6,R.drawable.allah_7,R.drawable.allah_8,R.drawable.allah_9,R.drawable.allah_10,R.drawable.allah_11,
            R.drawable.allah_12,R.drawable.allah_13,R.drawable.allah_14,R.drawable.allah_15,R.drawable.allah_16,R.drawable.allah_17,R.drawable.allah_18,R.drawable.allah_19,R.drawable.allah_20,R.drawable.allah_21,R.drawable.allah_22,
            R.drawable.allah_23,R.drawable.allah_24,R.drawable.allah_25,R.drawable.allah_26,R.drawable.allah_27,R.drawable.allah_28,R.drawable.allah_29,R.drawable.allah_30,R.drawable.allah_31,R.drawable.allah_32,R.drawable.allah_33,
            R.drawable.allah_34,R.drawable.allah_35,R.drawable.allah_36,R.drawable.allah_37,R.drawable.allah_38,R.drawable.allah_39,R.drawable.allah_40,R.drawable.allah_41,R.drawable.allah_42,R.drawable.allah_43,R.drawable.allah_44,
            R.drawable.allah_45,R.drawable.allah_46,R.drawable.allah_47,R.drawable.allah_48,R.drawable.allah_49,R.drawable.allah_50,R.drawable.allah_51,R.drawable.allah_52,R.drawable.allah_53,R.drawable.allah_54,R.drawable.allah_55,
            R.drawable.allah_56,R.drawable.allah_57,R.drawable.allah_58,R.drawable.allah_59,R.drawable.allah_60,R.drawable.allah_61,R.drawable.allah_62,R.drawable.allah_63,R.drawable.allah_64,R.drawable.allah_65,R.drawable.allah_66,
            R.drawable.allah_67,R.drawable.allah_68,R.drawable.allah_69,R.drawable.allah_70,R.drawable.allah_71,R.drawable.allah_72,R.drawable.allah_73,R.drawable.allah_74,R.drawable.allah_75,R.drawable.allah_76,R.drawable.allah_77,
            R.drawable.allah_78,R.drawable.allah_79,R.drawable.allah_80,R.drawable.allah_81,R.drawable.allah_82,R.drawable.allah_83,R.drawable.allah_84,R.drawable.allah_85,R.drawable.allah_86,R.drawable.allah_87,R.drawable.allah_88,
            R.drawable.allah_89,R.drawable.allah_90,R.drawable.allah_91,R.drawable.allah_92,R.drawable.allah_93,R.drawable.allah_94,R.drawable.allah_95,R.drawable.allah_96,R.drawable.allah_97,R.drawable.allah_98,R.drawable.allah_99,


    };
    public ViewPagerAdapterName(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.custom_layout,null);
        ImageView imageView= (ImageView) view.findViewById(R.id.image_allah_name);
        imageView.setImageResource(images[position]);
        ViewPager vp=(ViewPager) container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp=(ViewPager) container;
        View view=(View) object;
        vp.removeView(view);




    }}
