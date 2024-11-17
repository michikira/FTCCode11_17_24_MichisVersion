package org.firstinspires.ftc.teamcode.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class LowerArm extends SubsystemBase {

    public DcMotor thrustMaster;


    public LowerArm(HardwareMap ahwMap){

        //REV UltraPlanetary Hex Motor, the lowest and biggest one on the arm
        thrustMaster = ahwMap.get(DcMotor.class, "thrustMaster");


    }

    public void setPower (double power){
        thrustMaster.setPower(power);
    }
}
