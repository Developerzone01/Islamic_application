package islamapp.islamicapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class Dua_Fragment extends android.app.Fragment {
    private Button previous, next;
    private ImageView duaImage;

    int position = 0;

    int[] duaImages = {

            R.drawable.dua1, R.drawable.dua2, R.drawable.dua3, R.drawable.dua4, R.drawable.dua5,
            R.drawable.dua6, R.drawable.dua7, R.drawable.dua8, R.drawable.dua9, R.drawable.dua10,
            R.drawable.dua11, R.drawable.dua12, R.drawable.dua13, R.drawable.dua14, R.drawable.dua15
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {

        View view = inflater.inflate(R.layout.fragment_dua_, container, false);

        duaImage = (ImageView) view.findViewById(R.id.duaImage);
        duaImage.setImageResource(R.drawable.dua1);
        previous = (Button) view.findViewById(R.id.previous);
        next = (Button) view.findViewById(R.id.next);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == previous) {

                    duaImage.setImageResource((position == 0) ? duaImages[position] : duaImages[--position]);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == next) {

                    duaImage.setImageResource((position == 14) ? duaImages[position] : duaImages[++position]);
                }
            }
        });

        return view;
    }


}
