package com.syphan.model.device;

public class RadioDevice extends DeviceImp {

    @Override
    public void printStatus() {
        System.out.println("Radio is on: " + this.isOn());
        System.out.println("Radio volume is: " + this.getVolume());
        System.out.println("Radio channel is: " + this.getChannel());
    }
}
