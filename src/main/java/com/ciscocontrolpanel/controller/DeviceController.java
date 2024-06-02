package com.ciscocontrolpanel.controller;

import com.ciscocontrolpanel.entity.Device;
import com.ciscocontrolpanel.service.DeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class DeviceController {

    private DeviceService deviceService;
    public DeviceController(DeviceService theDeviceService) {
        deviceService = theDeviceService;
    }

    // homepage, showing list
    @GetMapping("/")
    public String showHome(Model theModel) {
        //get the devices from Db
        List<Device> theDevices = deviceService.findAll();

        //add the devices to spring model to be accesses from thymeleaf template
        theModel.addAttribute("devices", theDevices);
        return "home";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        //create model attribute to bind from data
        Device theDevice = new Device();

        theModel.addAttribute("device", theDevice);
        return "new-device";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("deviceId") int theId, Model theModel){

        //get the device from the service
        Device theDevice = deviceService.findById(theId);

        //set the device in the model to prepopulate the form
        theModel.addAttribute("device", theDevice);

        return "edit-device";
    }

    @PostMapping("/save")
    public String saveDevice(@ModelAttribute("deviceId") Device theDevice){
        deviceService.save(theDevice);
        return ("redirect:/");
    }

    @GetMapping("delete")
    public String delete(@RequestParam("deviceId") int theId){
        deviceService.deleteById(theId);
        return ("redirect:/");
    }
    //init first login
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }
}
