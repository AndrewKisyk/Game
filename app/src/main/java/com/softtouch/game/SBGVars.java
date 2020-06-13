package com.softtouch.game;

import android.content.Context;
import android.view.Display;

public class SBGVars {
    /*Constants that will be used in the game*/

    public static final int GAME_THREAD_DELAY = 4000;
    public static final int SBG_RUNNING_SSHEET = R.drawable.soilder;
    public static final int SBG_TILE_SSHEET = R.drawable.tiles;
    public static final int SBG_RUNNING_PTR = 1;
    public static final int SBG_TILE_PTR = 2;
    public static final int PLAYER_MOVE_LEFT = 1;
    public static final int PLAYER_STAND = 0;
    public static final int PLAYER_MOVE_RIGHT = 2;
    public static final int GAME_THREAD_FPS_SLEEP = (1000/30);
    public static float PLAYER_RUN_SPEED = .25f;
    public static final float STANDING_LEFT = .92f;
    public static final float STANDING_RIGHT = .84f;
    public static final int BACKGROUND_STARFIELD = R.drawable.starfield;
    public static float SCROLL_BACKGROUND_2  = .004f;
    public static float SCROLL_BACKGROUND_1  = .002f;
    public static int playeraction = 0;
    public static int totalGameLoops = 0;
    public static float playercurrentlocation = .84f;
    public static float currentrunaniframe = .76f;
    public static float currentstandingframe = .84f;
    public static Display display;
    public static Context context;
}
