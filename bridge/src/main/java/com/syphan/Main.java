package com.syphan;

import com.syphan.model.device.RadioDevice;
import com.syphan.model.device.TvDevice;
import com.syphan.model.remote.LgRemote;
import com.syphan.model.remote.MultilaserRemote;
import com.syphan.model.remote.Remote;

public class Main {
    public static void main(String[] args) {
        Remote remoteLgTv = new LgRemote(new TvDevice());
        remoteLgTv.turnOn();
        remoteLgTv.setChannel(16);
        remoteLgTv.printStatus();

        Remote remoteLgRadio = new LgRemote(new RadioDevice());
        remoteLgRadio.turnOn();
        remoteLgRadio.setChannel(21);
        remoteLgRadio.setVolume(10);
        remoteLgRadio.printStatus();

        Remote remoteMultilaserTv = new MultilaserRemote(new TvDevice());
        remoteMultilaserTv.turnOn();
        remoteMultilaserTv.setVolume(23);
        remoteMultilaserTv.setChannel(12);
        remoteMultilaserTv.printStatus();
    }
}