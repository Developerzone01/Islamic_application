package islamapp.islamicapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fragment_Activity extends AppCompatActivity {
    FragmentManager manager;
    Wudu_Method wudu_method;
    Namaz_Method namaz_method;
    Haj_Method haj_method;
    Dua_Fragment dua_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity);
        getSupportActionBar().setTitle("Islamic Application");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        savedInstanceState = getIntent().getExtras();

        String destination = savedInstanceState.getString("destination");

        manager = getFragmentManager();

        if(destination.equals("wuzu"))
            loadWuzuFragment();
        else if(destination.equals("nimaz"))
            loadNimazFragment();
        else if(destination.equals("hajj"))
            loadHajjFragment();
        else if(destination.equals("dua"))
            loadDuaFragment();
    }

    private void loadWuzuFragment() {

        wudu_method= new Wudu_Method();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentContainer,wudu_method, "WuzuFrag");
        transaction.commit();
    }

    private void loadNimazFragment() {

        namaz_method = new Namaz_Method();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentContainer, namaz_method, "NimazFrag");
        transaction.commit();
    }

    private void loadHajjFragment() {

        haj_method= new Haj_Method();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentContainer, haj_method, "HajjFrag");
        transaction.commit();
    }

    private void loadDuaFragment() {

        dua_fragment = new Dua_Fragment();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentContainer,dua_fragment, "DuaFrag");
        transaction.commit();
    }
}
