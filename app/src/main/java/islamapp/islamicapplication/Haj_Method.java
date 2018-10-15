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

public class Haj_Method extends Fragment {
    private ImageView imageView;
    private TextView description;

    private Button previous, next, translate;

    private int position = 0;

    String[] englishDesc = new String[11];
    String[] urduDesc = new String[11];

    int[] imageResource = {

            R.drawable.hajj_1, R.drawable.hajj_2, R.drawable.hajj_3,
            R.drawable.hajj_4, R.drawable.hajj_5, R.drawable.hajj_6,
            R.drawable.hajj_7, R.drawable.hajj_8, R.drawable.hajj_9,
            R.drawable.hajj_10,R.drawable.hajj_11
    };

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {

        final View view = inflater.inflate(R.layout.image_fragment, container, false);

        imageView = (ImageView) view.findViewById(R.id.image);
        description = (TextView) view.findViewById(R.id.description);
        previous = (Button) view.findViewById(R.id.previous);
        next = (Button) view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == next) {
                    imageView.setImageResource((position == 10) ? imageResource[position] : imageResource[++position]);
                    updateDescription();

                }
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == previous) {
                    imageView.setImageResource((position == 0) ? imageResource[position] : imageResource[--position]);
                    updateDescription();

                }
            }
        });
        translate = (Button) view.findViewById(R.id.translate);
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == translate) {
                    translate.setText((translate.getText().equals("Urdu")) ? "English" : "Urdu");
                    updateDescription();
                }
            }
        });
        englishDesc = getResources().getStringArray(R.array.hajj_english);
        urduDesc = getResources().getStringArray(R.array.hajj_urdu);

        imageView.setImageResource(R.drawable.hajj_1);
        description.setText(englishDesc[0]);

                return view;

    }

    private void updateDescription() {

        description.setText((translate.getText().equals("English")) ? urduDesc[position] :
                englishDesc[position]);
    }
}
