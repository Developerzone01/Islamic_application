package islamapp.islamicapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Namaz_by_videos extends AppCompatActivity {
    VideoView video;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_by_videos);
        getSupportActionBar().setTitle("Namaz Method");
        video= (VideoView) findViewById(R.id.video);
        mediaController=new MediaController(this);


    }
    public void step1(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz01;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step2(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz02;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step3(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz03;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step4(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz04;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step5(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz05;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step6(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz06;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step7(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz07;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step8(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz08;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step9(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.namaz09;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

    }
}
