package islamapp.islamicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class Community_four extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<video> videoss=new Vector<video>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_four);
        getSupportActionBar().setTitle("Allama Ali Nasir Al Hussaini");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        recyclerView= (RecyclerView) findViewById(R.id.recycleview4);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/olfxwM_GKyA\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>" ));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HphiunesjiM\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/C2v8q1sQK84\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XmyS1rdM53Q\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YRscKmjoSKQ\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2M8CMwBwvKg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/v2Y8BmSSrgA\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zd2qGndzExk\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        VideoAdapter videoAdapter=new VideoAdapter(videoss);
        recyclerView.setAdapter(videoAdapter);

    }
}
