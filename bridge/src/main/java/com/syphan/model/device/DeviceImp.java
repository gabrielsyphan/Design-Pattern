package com.syphan.model.device;

public abstract class DeviceImp implements Device {

    private boolean on;
    private int volume;
    private int channel;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }
}
