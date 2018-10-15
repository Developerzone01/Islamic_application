package islamapp.islamicapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class haj_by_videos extends AppCompatActivity {
    VideoView video;
    MediaController mediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haj_by_videos);
        getSupportActionBar().setTitle("Haj Method");
        video= (VideoView) findViewById(R.id.video);
        mediaController=new MediaController(this);
    }

    public void eight_hijri(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.hajj01;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

    }

    public void ninth_hijri(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.hajj02;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

    }

    public void ten_hijri(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.haj03;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

    }
}
