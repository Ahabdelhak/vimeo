package com.vimeo.androidvimeoplayer.listeners;

public interface VimeoPlayerStateListener {
    void onPlaying(float duration);

    void onPaused(float seconds);

    void onEnded(float duration);
}
