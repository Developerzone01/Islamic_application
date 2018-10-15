package islamapp.islamicapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

/**
 * Created by Haider Ali on 6/30/2018.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<video> videoList;

    public VideoAdapter(List<video> videoList) {
        this.videoList = videoList;
    }

    public VideoAdapter() {
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext() ).inflate(R.layout.card_video, parent,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {

        holder.videoWeb.loadData(videoList.get(position).getUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder
    {
        WebView videoWeb;
        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb= (WebView) itemView.findViewById(R.id.webvideo);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient()
            {

            });
        }
    }
}
