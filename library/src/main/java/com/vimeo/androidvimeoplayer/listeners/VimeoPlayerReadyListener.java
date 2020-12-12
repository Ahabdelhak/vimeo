package com.vimeo.androidvimeoplayer.listeners;

import com.vimeo.androidvimeoplayer.model.TextTrack;

public interface VimeoPlayerReadyListener {
    void onReady(String title, float duration, TextTrack[] textTrackArray);

    void onInitFailed();
}
