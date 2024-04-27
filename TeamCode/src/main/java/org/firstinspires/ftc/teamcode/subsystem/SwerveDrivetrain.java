package org.firstinspires.ftc.teamcode.subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.geometry.Rotation2d;
import com.arcrobotics.ftclib.kinematics.wpilibkinematics.ChassisSpeeds;
import com.arcrobotics.ftclib.kinematics.wpilibkinematics.SwerveDriveKinematics;
import com.arcrobotics.ftclib.kinematics.wpilibkinematics.SwerveModuleState;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

public class SwerveDrivetrain extends SubsystemBase {
    public static double kDriveWidth = 2;
    public static double kDriveLength = 2;

    private SwerveDriveKinematics kinematics;
    private ChassisSpeeds speeds;

    private SwerveModuleIO[] modules;

    private double heading;

    private IMU imu;

    public SwerveDrivetrain(HardwareMap hardwareMap){
        this.imu = hardwareMap.get(IMU.class, "imu");
        this.speeds = new ChassisSpeeds();


    }

    public void setChassisSpeed(ChassisSpeeds speed){
        this.speeds = speed;
    }

    public void setChassisSpeed(double xMetersVelocity, double yMetersVelocity, double radiansPerSecond){
        this.speeds = ChassisSpeeds.fromFieldRelativeSpeeds(
                xMetersVelocity,
                yMetersVelocity,
                radiansPerSecond,
                new Rotation2d(this.heading)
        );
    }

    @Override
    public void periodic(){
        SwerveModuleState[] states = kinematics.toSwerveModuleStates(speeds);
        for (int i = 0; i < 4; i++){
            modules[i].setModuleState(states[i]);
        }
    }
}
