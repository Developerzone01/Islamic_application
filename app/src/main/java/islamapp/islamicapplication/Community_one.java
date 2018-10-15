package islamapp.islamicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class Community_one extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<video> videoss=new Vector<video>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_one);
        getSupportActionBar().setTitle("Raza Saqib Mustafai");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        recyclerView= (RecyclerView) findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DFF0sdHHar8\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/K0rnPrLnmiY?list=PL2MyNrueDbLQ9nDP4m_2ou9Z3P7xtUHbe\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/l7rLtypnlbI?list=PL2MyNrueDbLQ9nDP4m_2ou9Z3P7xtUHbe\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/svTH8a2EF2Q?list=PL2MyNrueDbLQ9nDP4m_2ou9Z3P7xtUHbe\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XUqra1cv3nA?list=PL2MyNrueDbLQ9nDP4m_2ou9Z3P7xtUHbe\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        videoss.add(new video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/wRIVJQ-pulg?list=PL2MyNrueDbLQ9nDP4m_2ou9Z3P7xtUHbe\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter=new VideoAdapter(videoss);
        recyclerView.setAdapter(videoAdapter);
    }
    }

