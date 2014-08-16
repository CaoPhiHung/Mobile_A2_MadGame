package vn.edu.rmit.thelazytryhard.madgame;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.parse.Parse;
import com.parse.ParseAnalytics;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Parse.initialize(this, "oZp8SfUKHMdonpoQLr04dQjuLtuLl4ppLoSnRWJ5", "TWQwPMtiHA9g4ej7idOdjMY67SEfp0lCnewrid1k"); 
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = true;
        ParseAnalytics.trackAppOpened(getIntent());
        initialize(new MadGame(), cfg);
    }
}