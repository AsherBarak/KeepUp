package com.barak.asher.keepup;

import android.os.Handler;

import java.lang.ref.WeakReference;

class GameRendererThreadHandler extends Handler {
    private WeakReference<GameRendererThread> mWeakRenderThread;
}
