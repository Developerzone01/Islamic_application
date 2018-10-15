package islamapp.islamicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class Community_two extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<video> videoss=new Vector<video>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_two);
        getSupportActionBar().setTitle("Molana Tariq Jameel");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        recyclerView= (RecyclerView) findViewById(R.id.recycleview2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ubzQ_rSUKgg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/O7IJ7x0Aj5o\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6pcGIbbeN7s\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/iFYcQF1zbwM\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/t2oWErAFILg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lYfygBYaOb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7-v5iAmh3jQ\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DOWX--lHRzc\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tVzm1lqjlg8?list=PLTuxjD1pItJU2K0IP8nSk7LJpzRG3l2oc\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        VideoAdapter videoAdapter=new VideoAdapter(videoss);
        recyclerView.setAdapter(videoAdapter);

    }
}
