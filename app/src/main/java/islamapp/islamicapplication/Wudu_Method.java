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

public class Wudu_Method extends Fragment {
    private ImageView imageView;
    private TextView description;

    private Button previous, next, translate;

    private int position = 0;

    String[] englishDesc = new String[9];
    String[] urduDesc = new String[9];

    int[] imageResource = {

            R.drawable.wuzu_1, R.drawable.wuzu_2, R.drawable.wuzu_3,
            R.drawable.wuzu_4, R.drawable.wuzu_5, R.drawable.wuzu_6,
            R.drawable.wuzu_7, R.drawable.wuzu_8, R.drawable.wuzu_9
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {

        View view = inflater.inflate(R.layout.image_fragment, container, false);

        imageView = (ImageView) view.findViewById(R.id.image);
        description = (TextView) view.findViewById(R.id.description);
        previous = (Button) view.findViewById(R.id.previous);
        next = (Button) view.findViewById(R.id.next);
        translate = (Button) view.findViewById(R.id.translate);


        imageView.setImageResource(R.drawable.wuzu_1);
        description.setText(englishDesc[0]);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == previous) {
                    imageView.setImageResource((position == 0) ? imageResource[position] : imageResource[--position]);
                    updateDescription();

                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == next) {
                    imageView.setImageResource((position == 8) ? imageResource[position] : imageResource[++position]);
                    updateDescription();

                }
            }
        });
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == translate) {
                    translate.setText((translate.getText().equals("Urdu")) ? "English" : "Urdu");
                    updateDescription();
                }
            }
        });
        englishDesc = getResources().getStringArray(R.array.wude_english);
        urduDesc = getResources().getStringArray(R.array.wudu_urdu);

        imageView.setImageResource(R.drawable.nimaz_1);
        description.setText(englishDesc[0]);
        return view;
    }


    private void updateDescription() {

        description.setText((translate.getText().equals("English")) ? urduDesc[position] :
                englishDesc[position]);
    }
}
