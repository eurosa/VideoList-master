package com.volokh.danylo.videolist.player;

public interface Message {
    void runMessage();
    void polledFromQueue();
    void messageFinished();
}
