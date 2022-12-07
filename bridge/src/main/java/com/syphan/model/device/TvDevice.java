package com.syphan.model.device;

public class TvDevice extends DeviceImp {

        @Override
        public void printStatus() {
            System.out.println("Tv is on: " + this.isOn());
            System.out.println("Tv volume is: " + this.getVolume());
            System.out.println("Tv channel is: " + this.getChannel());
        }
}
