package islamapp.islamicapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Allah_name extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allah_name);
        getSupportActionBar().setTitle("Name of Allah");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        viewPager= (ViewPager) findViewById(R.id.allah_name);
        ViewPagerAdapterName viewPagerAdapterName=new ViewPagerAdapterName(this);

        viewPager.setAdapter(viewPagerAdapterName);
    }

    public boolean onOptionitemSelected(MenuItem item) {
        int id = item.getItemId();
        {
            this.finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
