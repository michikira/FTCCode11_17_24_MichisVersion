package org.firstinspires.ftc.teamcode.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Claw extends SubsystemBase {

    private final DcMotor Claw;

    public Claw(HardwareMap ahwMap) {

        Claw = ahwMap.get(DcMotor.class, "Claw");

        Claw.setDirection(DcMotor.Direction.FORWARD);

        Claw.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void setClaw(double power) {
        Claw.setPower(power);
    }
}