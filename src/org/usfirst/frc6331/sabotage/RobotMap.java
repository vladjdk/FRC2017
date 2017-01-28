// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6331.sabotage;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * @author Vlad 
 *
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static VictorSP backRight;
    public static VictorSP frontRight;
    public static VictorSP frontLeft;
    public static VictorSP backLeft;
    public static RobotDrive driveRobotMotors;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        backRight = new VictorSP(0);
        LiveWindow.addActuator("Drive", "Motor 0", (VictorSP) backRight);
        
        frontRight = new VictorSP(1);
        LiveWindow.addActuator("Drive", "Motor 1", (VictorSP) frontRight);
        
        frontLeft = new VictorSP(2);
        LiveWindow.addActuator("Drive", "Motor 2", (VictorSP) frontLeft);
        
        backLeft = new VictorSP(3);
        LiveWindow.addActuator("Drive", "Motor 3", (VictorSP) backLeft);
        
        driveRobotMotors = new RobotDrive(frontLeft, backLeft,
              backRight, frontRight);
        
        driveRobotMotors.setSafetyEnabled(Constants.SAFETY);
        driveRobotMotors.setExpiration(Constants.EXPIRATION);
        driveRobotMotors.setSensitivity(Constants.SENSITIVITY);
        driveRobotMotors.setMaxOutput(Constants.MAX_OUTPUT);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}