package islamapp.islamicapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Wuzu_by_videos extends AppCompatActivity {

    VideoView video;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wuzu_by_videos);
        getSupportActionBar().setTitle("Wudu Steps");
        video= (VideoView) findViewById(R.id.video);
        mediaController=new MediaController(this);

    }

    public void step1(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step1;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step2(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step2;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step3(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step3;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step4(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step4;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step5(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step5;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step6(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step6;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step7(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step7;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step8(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step8;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);


    }

    public void Step9(View view) {
        String path="android.resource://"+getPackageName() +"/"+  R.raw.step9;
        Uri uri=Uri.parse(path);
        video.setVideoURI(uri);
        video.start();
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

    }
}
