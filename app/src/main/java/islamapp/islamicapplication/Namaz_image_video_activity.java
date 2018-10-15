package islamapp.islamicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Namaz_image_video_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.namaz_image_video_activity);
    }

    public void byimages(View view) {
        Intent intent = new Intent(Namaz_image_video_activity.this, Fragment_Activity.class);

        startActivity(intent);

    }

    public void byvideo(View view) {
        Intent intent = new Intent(Namaz_image_video_activity.this, Namaz_by_videos.class);

        startActivity(intent);
    }
}
