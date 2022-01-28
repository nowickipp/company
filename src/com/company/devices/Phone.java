package com.company.devices;
import com.company.devices.URL;

public class Phone extends Device {
    public Phone(String producer, String model, Integer year, Double value) {
        super(producer, model, year, value);
    }


    String getOSVersion() {
        return "2.0.1";
    }

    public void installAppNo1(String appName) {
        System.out.println(appName + " installed");
    }

    public void installAppNo2(String appName, String version) {
        System.out.println(appName + version + " installed");
    }

    public void installAppNo3(String appName, String version, String defaultAppServerName) {
        System.out.println(appName + version + defaultAppServerName + " installed");
    }


    public void TurnOn() {
        System.out.println("Hello user, i'm your mobile phone personal assistant!");
    }


    @Override
    void turnOn() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

}

