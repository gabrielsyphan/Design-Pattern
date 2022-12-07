package com.syphan.model.remote;

import com.syphan.model.device.Device;

public class LgRemote extends RemoteImp {

    public LgRemote(Device device) {
        super(device);
    }

    public void mute() {
        this.getDevice().setVolume(0);
    }

    public void nextChannel() {
        this.getDevice().setChannel(this.getDevice().getChannel() + 1);
    }

    public void previousChannel() {
        this.getDevice().setChannel(this.getDevice().getChannel() - 1);
    }
}
