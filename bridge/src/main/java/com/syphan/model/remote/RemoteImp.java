package com.syphan.model.remote;

import com.syphan.model.device.Device;

public abstract class RemoteImp implements Remote {

    private final Device device;

    public RemoteImp(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    public Device getDevice() {
        return device;
    }

    public void printStatus() {
        device.printStatus();
    }
}
