package com.dentistappointment.app05;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class SocialMedia extends AppCompatActivity {

     RecyclerView recyclerView;
     Vector<YoutubeVideos> youtubeVideos = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trends);


        if (getSupportActionBar() != null)  //remove top actionbar
        {
            getSupportActionBar().hide();
        }

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"http://www.youtube.com/embed/watch?v=d4V3qheys0s\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"http://www.youtube.com/embed/watch?v=09X7X5kh3VI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"http://www.youtube.com/embed/watch?v=frpVmrGFvN4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"http://www.youtube.com/embed/watch?v=scJH8HA8zAM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"http://www.youtube.com/embed/watch?v=_BGbzO9DWDM\" frameborder=\"0\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
         recyclerView.setAdapter(videoAdapter);
    }
}
