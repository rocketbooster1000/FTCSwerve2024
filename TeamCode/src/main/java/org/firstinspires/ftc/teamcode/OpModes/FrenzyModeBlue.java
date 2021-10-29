package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.autonomous.AutoRoute;

@TeleOp(name = "Frenzy Red", group = "Robot15173")
public class FrenzyModeBlue extends FrenzyModeBase {

    @Override
    protected String getSide(){
        return AutoRoute.NAME_BLUE;
    }
}
