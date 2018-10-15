package islamapp.islamicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class haj_image_video_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haj_image_video_activity);
    }

    public void byimages(View view) {
        Intent intent = new Intent(haj_image_video_activity.this, Fragment_Activity.class);
        intent.putExtra("destination", "hajj");
        startActivity(intent);

    }

    public void byvideo(View view) {

        Intent intent = new Intent(haj_image_video_activity.this, haj_by_videos.class);

        startActivity(intent);

    }
}
