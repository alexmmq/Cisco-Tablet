package com.ciscocontrolpanel.service;

import com.ciscocontrolpanel.entity.Device;

import java.util.List;

public interface DeviceService {
    List<Device> findAll();
    Device findById(int theId);
    Device save(Device theDevice);
    void deleteById(int theId);
}
