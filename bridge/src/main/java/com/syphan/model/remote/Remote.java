package com.syphan.model.remote;

import com.syphan.model.device.Device;

public interface Remote {

    public void turnOn();
    public void turnOff();
    public void setChannel(int channel);
    public void setVolume(int volume);
    public Device getDevice();
    public void printStatus();
}
