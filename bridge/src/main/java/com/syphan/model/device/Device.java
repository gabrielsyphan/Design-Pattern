package com.syphan.model.device;

public interface Device {

    public boolean isOn();
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
    public int getVolume();
    public void setChannel(int channel);
    public int getChannel();
    public void printStatus();
}
