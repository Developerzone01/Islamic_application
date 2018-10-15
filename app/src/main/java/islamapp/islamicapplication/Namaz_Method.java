package islamapp.islamicapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Haider Ali on 5/18/2018.
 */

public class Namaz_Method extends Fragment {

    private ImageView imageView;
    private TextView description;

    private Button previous, next, translate;

    private int position = 0;

    String[] englishDesc = new String[11];
    String[] urduDesc = new String[11];

    int[] imageResource = {

            R.drawable.nimaz_1, R.drawable.nimaz_2, R.drawable.nimaz_3,
            R.drawable.nimaz_4, R.drawable.nimaz_5, R.drawable.nimaz_6,
            R.drawable.nimaz_7, R.drawable.nimaz_8, R.drawable.nimaz_9,
            R.drawable.nimaz_10, R.drawable.nimaz_11
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {

        View view = inflater.inflate(R.layout.image_fragment, container, false);

        imageView = (ImageView) view.findViewById(R.id.image);
        description = (TextView) view.findViewById(R.id.description);
        previous = (Button) view.findViewById(R.id.previous);
        translate = (Button) view.findViewById(R.id.translate);
        next = (Button) view.findViewById(R.id.next);

        englishDesc = getResources().getStringArray(R.array.nimaz_eng);
        urduDesc = getResources().getStringArray(R.array.nimaz_ur);

        imageView.setImageResource(R.drawable.nimaz_1);
        description.setText(englishDesc[0]);

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == translate) {

                    translate.setText((translate.getText().equals("Urdu")) ? "English" :
                            "Urdu");
                    updateDescription();

                }
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == previous) {

                    imageView.setImageResource((position == 0) ? imageResource[position] :
                            imageResource[--position]);
                    updateDescription();

                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == next) {

                    imageView.setImageResource((position == 10) ? imageResource[position] :
                            imageResource[++position]);
                    updateDescription();

                }
            }
        });

        return view;
    }



    private void updateDescription() {

        description.setText((translate.getText().equals("English")) ? urduDesc[position] :
                englishDesc[position]);
    }
}
