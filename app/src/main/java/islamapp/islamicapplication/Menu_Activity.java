package islamapp.islamicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Menu_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();

        androidFlavors.add(new AndroidFlavor("Method of Ablution",R.drawable.wuzu1));
        androidFlavors.add(new AndroidFlavor("Prayer Method",R.drawable.prayer1));
        androidFlavors.add(new AndroidFlavor("Hajj Method",R.drawable.hajj1));
        androidFlavors.add(new AndroidFlavor("Tasbih",R.drawable.tasbih1));
        androidFlavors.add(new AndroidFlavor("Prayer Timing and Alarm",R.drawable.time1));
        androidFlavors.add(new AndroidFlavor("Islamic Age Calculator",R.drawable.age1));
        androidFlavors.add(new AndroidFlavor("Islamic Dua's",R.drawable.dua1_1));
        androidFlavors.add(new AndroidFlavor("Names of Allah",R.drawable.names1));
        androidFlavors.add(new AndroidFlavor("Quran",R.drawable.quran1));
        androidFlavors.add(new AndroidFlavor("Islamic Scholars",R.drawable.scholars1));


        AndroidFlavorAdaptor flavorAdaptor = new AndroidFlavorAdaptor(this,androidFlavors);

        ListView listView = (ListView) findViewById(R.id.ListView_flavor);
        listView.setAdapter(flavorAdaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if (position == 0) {
                    Intent intent1 = new Intent(Menu_Activity.this, Wuzu_image_video_activity.class);
                    startActivity(intent1);


                } else if (position == 1) {
                    Intent intent1=new Intent(Menu_Activity.this,Namaz_image_video_activity.class);
                    startActivity(intent1);

                } else if (position == 2) {
                    Intent intent1=new Intent(Menu_Activity.this,haj_image_video_activity.class);
                    startActivity(intent1);
                }
                else if (position == 6) {
                    Intent intent = new Intent(Menu_Activity.this, Fragment_Activity.class);
                    intent.putExtra("destination", "dua");
                    startActivity(intent);
                }
                if (position==3)
                {
                    Intent intent4 =new Intent(Menu_Activity.this,Tasbih.class);
                    startActivity(intent4);
                }
                if (position==4)
                {
                    Intent intent2 =new Intent(Menu_Activity.this,MapsActivity.class);
                    startActivity(intent2);
                }
                if (position==5)
                {
                    Intent intent1 =new Intent(Menu_Activity.this,Age_Calculation.class);
                    startActivity(intent1);
                }

                if (position==7)
                {
                    Intent intent2 =new Intent(Menu_Activity.this,Allah_name.class);
                    startActivity(intent2);
                }

                if (position==8)
                {
                    Intent intent1 =new Intent(Menu_Activity.this,quran_list_view.class);
                    startActivity(intent1);
                }
                if (position==9)
                {
                    Intent intent1 =new Intent(Menu_Activity.this,Recomended_video.class);
                    startActivity(intent1);
                }
            }



        });
    }
}
