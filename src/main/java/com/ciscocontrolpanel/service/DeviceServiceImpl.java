package com.ciscocontrolpanel.service;

import com.ciscocontrolpanel.dao.DeviceRepository;
import com.ciscocontrolpanel.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceServiceImpl implements DeviceService{

    private DeviceRepository deviceRepository;

    @Autowired
    public DeviceServiceImpl(DeviceRepository theDeviceRepository) {
        this.deviceRepository = theDeviceRepository;
    }

    @Override
    public List<Device> findAll() {
        return deviceRepository.findAll();
    }

    @Override
    public Device findById(int theId) {
        Optional<Device> result = deviceRepository.findById(theId);
        Device theDevice = null;

        if (result.isPresent()) {
            theDevice = result.get();
        }
        else{
            throw new RuntimeException("Did not find device with id: " + theId);
        }
        return theDevice;
    }

    @Override
    public Device save(Device theDevice) {
        return deviceRepository.save(theDevice);
    }

    @Override
    public void deleteById(int theId) {
        deviceRepository.deleteById(theId);
    }
}
