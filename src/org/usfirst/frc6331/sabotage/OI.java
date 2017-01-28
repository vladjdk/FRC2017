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

import org.usfirst.frc6331.sabotage.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc6331.sabotage.subsystems.*;

/**
 * 
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 *
 * @author Vlad
 * 
 * 
 */


public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton joystickButtonA;
    public JoystickButton joystickButtonB;
    public JoystickButton joystickButtonX;
    public JoystickButton joystickButtonY; 
    public Joystick joystick1;
    public Joystick rightJoystick;
    public Joystick  leftJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

       /* joystick1 = new Joystick(1);
        
        joystickButtonA = new JoystickButton(joystick1, Constants.A);
        joystickButtonA.whileHeld(new DriveWithJoysticks());
        joystickButtonB = new JoystickButton(joystick1, Constants.B);
        joystickButtonB.whileHeld(new DriveWithJoysticks());
        joystickButtonX = new JoystickButton(joystick1, Constants.X);
        joystickButtonX.whileHeld(new DriveWithJoysticks());
        joystickButtonY = new JoystickButton(joystick1, Constants.Y);
        joystickButtonY.whileHeld(new DriveWithJoysticks());
        
        double leftX = joystick1.getRawAxis(1);
        double leftY = joystick1.getRawAxis(2);
        double rightX = joystick1.getRawAxis(4);
        double rightY = joystick1.getRawAxis(5);*/


        // SmartDashboard Buttons
        SmartDashboard.putData("DriveWithJoysticks", new DriveWithJoysticks());
        SmartDashboard.putData("DriveForward", new DriveForward());
        SmartDashboard.putData("DriveBack", new DriveBack());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
