package islamapp.islamicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class Community_three extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<video> videoss=new Vector<video>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_three);
        getSupportActionBar().setTitle("Syed Sabtain Naqvi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        recyclerView= (RecyclerView) findViewById(R.id.recycleview3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/dPAWwpsa9oI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/P-vRtTZ0-2Y\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/t_1SX1jDuq0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/g8uhGqYcLZ8\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/0xX62MsQAvI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z4vEFFwIi1c\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hBENBaf4ofY\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/W17kWUqnq8w\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QsFI0vpMSZA\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));

        VideoAdapter videoAdapter=new VideoAdapter(videoss);
        recyclerView.setAdapter(videoAdapter);

    }
}
