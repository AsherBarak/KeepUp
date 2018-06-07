package com.barak.asher.keepup;

import android.content.Context;
import android.view.Choreographer;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements SurfaceHolder.Callback, Choreographer.FrameCallback {
    public GameView(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override
    public void doFrame(long l) {


        Choreographer.getInstance().postFrameCallback(this);
    }
}
