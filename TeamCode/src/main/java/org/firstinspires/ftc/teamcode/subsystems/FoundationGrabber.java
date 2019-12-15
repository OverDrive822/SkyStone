package org.firstinspires.ftc.teamcode.subsystems;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.subsystems.subsystemutils.Subsystem;

public class FoundationGrabber implements Subsystem {

    private Gamepad controller;
    private Servo rightFoundationGrabber, leftFoundationGrabber;

    public FoundationGrabber (Gamepad controller, Servo rightFoundationGrabber, Servo leftFoundationGrabber){
     this.controller = controller;
     this.rightFoundationGrabber = rightFoundationGrabber;
     this.leftFoundationGrabber = leftFoundationGrabber;
    }

    public void init() {
        //not sure if it is 0 or 180 check @ build day
        rightFoundationGrabber.setPosition(0.0);
        leftFoundationGrabber.setPosition(0.0);
    }

    public void update() {
       if(controller.dpad_up){
           rightFoundationGrabber.setPosition(0.0);
           leftFoundationGrabber.setPosition(0.0);
       }
       if(controller.dpad_down){
           rightFoundationGrabber.setPosition(180.0);
           leftFoundationGrabber.setPosition(180.0);
       }
    }
}
