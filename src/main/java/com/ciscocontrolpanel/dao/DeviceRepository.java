package com.ciscocontrolpanel.dao;

import com.ciscocontrolpanel.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
