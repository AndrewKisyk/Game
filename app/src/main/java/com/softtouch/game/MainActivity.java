package com.softtouch.game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ConfigurationInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SBGVars.display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();

        setContentView(R.layout.activity_main);
        SBGVars.context = this;
        new Handler().postDelayed(new Thread() {
            @Override
            public void run() {
                setContentView(R.layout.mainmenu);

                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
                Intent mainMenu = new Intent(MainActivity.this, SBGMenuScreen.class);
                MainActivity.this.startActivity(mainMenu);
                MainActivity.this.finish();
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        }, SBGVars.GAME_THREAD_DELAY);
    }
}
