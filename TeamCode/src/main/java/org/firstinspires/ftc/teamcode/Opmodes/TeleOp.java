package org.firstinspires.ftc.teamcode.Opmodes;

import android.icu.text.CaseMap;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Subsystems.Arm;
import org.firstinspires.ftc.teamcode.Subsystems.Claw;
import org.firstinspires.ftc.teamcode.Subsystems.Drivebase;
import org.firstinspires.ftc.teamcode.Subsystems.HighArm;
import org.firstinspires.ftc.teamcode.Subsystems.LowerArm;
import com.qualcomm.robotcore.hardware.HardwareMap;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp
    public class TeleOp extends CommandOpMode {

        private GamepadEx driverOP;
        private GamepadEx buttonOP;
        private Drivebase drivebase;

        private Arm Arm;

      //  private Claw Claw;

        private HighArm HighArm;

        private LowerArm LowerArm;


        @Override
        public void initialize() {



            driverOP = new GamepadEx(gamepad1);
            buttonOP = new GamepadEx(gamepad2);

            Arm = new Arm(hardwareMap);
          //  Claw = new Claw(hardwareMap);
            HighArm = new HighArm(hardwareMap);
            LowerArm = new LowerArm(hardwareMap);
            drivebase = new Drivebase(hardwareMap);

            GamepadButton armUp = new GamepadButton(buttonOP, GamepadKeys.Button.X);
            GamepadButton armDown = new GamepadButton(buttonOP, GamepadKeys.Button.Y);
            GamepadButton gripUp = new GamepadButton(buttonOP, GamepadKeys.Button.B);
            GamepadButton gripDown = new GamepadButton(buttonOP, GamepadKeys.Button.A);



            //armUp.whenPressed(new InstantCommand(() -> arm.setPower(1.0), arm));

            drivebase.setDefaultCommand(new RunCommand(() ->
                    drivebase.driveRobotCentric(driverOP.getLeftX(), driverOP.getLeftY() * -1, driverOP.getRightX()),
                    drivebase
            ));
        }



}


