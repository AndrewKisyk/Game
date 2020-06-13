package com.softtouch.game;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;



public class SBGMenuScreen extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.mainmenu);


        ImageButton start = (ImageButton)findViewById(R.id.btnStart);
        ImageButton exit = (ImageButton)findViewById(R.id.btnExit);

        start.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                /** Start Game!!!! */
                Intent game = new Intent(getApplicationContext(),SBGGameMain.class);
                SBGMenuScreen.this.startActivity(game);

            }

        });

        exit.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                //boolean clean = false;
                //clean = engine.onExit(v);
                //if (clean)
                //{
                int pid= android.os.Process.myPid();
                android.os.Process.killProcess(pid);
                //}
            }
        });
    }
}