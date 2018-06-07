package com.barak.asher.keepup;

import android.app.Activity;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.SurfaceHolder;
import android.view.Window;
import android.view.WindowManager;

/**
 * The game activity
 */
public class MainGameActivity extends Activity  {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.gameView = new GameView(this);
        setContentView(gameView);
    }
}
