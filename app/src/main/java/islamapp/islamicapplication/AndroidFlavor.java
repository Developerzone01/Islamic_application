package islamapp.islamicapplication;

/**
 * Created by Haider Ali on 8/26/2018.
 */

public class AndroidFlavor  {

    private String mListItem_name;
    private int mImageResource;

    public AndroidFlavor(String mVersion_name, int mImageResource) {
        this.mListItem_name = mVersion_name;
        this.mImageResource = mImageResource;
    }

    public String getmVersion_name() {
        return mListItem_name;
    }

    public int getmImageResource() {
        return mImageResource;
    }
}

