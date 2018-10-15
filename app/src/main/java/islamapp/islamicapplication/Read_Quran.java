package islamapp.islamicapplication;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Read_Quran extends AppCompatActivity {
    ViewPager viewPager;
    Intent i ;
    private ArrayList<String> XMENArray = new ArrayList<String>();
    private String[] XMEN ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_quran);
        getSupportActionBar().setTitle("Quran Kareem");

        viewPager= (ViewPager) findViewById(R.id.quran);
        i=getIntent();
        XMEN = i.getStringArrayExtra("imagearray");

        for (int i = 0; i < XMEN.length; i++)
            XMENArray.add(XMEN[i]);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(this,XMENArray);

        viewPager.setAdapter(viewPagerAdapter);



    }
}
