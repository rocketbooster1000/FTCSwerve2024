package org.firstinspires.ftc.teamcode.subsystem;

import com.arcrobotics.ftclib.kinematics.wpilibkinematics.SwerveModuleState;

public interface SwerveModuleIO {
    void setModuleState(SwerveModuleState state);
    void update();
}
