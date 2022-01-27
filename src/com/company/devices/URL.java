package com.company.devices;

public class URL {
    public String appName;
    public String version;
    public String appProtocol;

    public URL(String appName, String version, String appProtocol) {
        this.appName = appName;
        this.version = version;
        this.appProtocol = appProtocol;
    }

    public String toString() {
        return "Application:" +
                "Application name: '" + appName + "\n" +
                "Version:'" + version + '\'' +
                "Application protocol:" + appProtocol;
    }

}
