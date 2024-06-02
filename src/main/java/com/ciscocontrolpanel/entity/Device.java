package com.ciscocontrolpanel.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "device")
public class Device {

    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="device_name")
    private String deviceName;

    @Column(name="device_location")
    private String deviceLocation;

    @Column(name="ip_address")
    private String ipAddress;

    @Column(name="username")
    private String userName;

    @Column(name="password")
    private String password;


    //define constructors

    public Device() {

    }

    public Device(String password, String deviceName, String deviceLocation, String ipAddress, String userName) {
        this.password = password;
        this.deviceName = deviceName;
        this.deviceLocation = deviceLocation;
        this.ipAddress = ipAddress;
        this.userName = userName;
    }

    //define getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //define toString() method

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", deviceName='" + deviceName + '\'' +
                ", deviceLocation='" + deviceLocation + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
