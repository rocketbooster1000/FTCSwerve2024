package org.firstinspires.ftc.teamcode.opmode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.RobotContainer;
@TeleOp
public class myOp extends CommandOpMode {

    RobotContainer m_robot;
    @Override
    public void initialize() {
        m_robot= new RobotContainer(hardwareMap);
        enable();
        m_robot.bindCommands();
        enable();

    }
}
