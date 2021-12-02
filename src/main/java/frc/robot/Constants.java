// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants 
{

    // JOYSTICKS
    public static final int GAMEPAD = 0;
    public static final int LEFT_STICK = 1;
    public static final int RIGHT_STICK = 0;

    // JOYSTICK BUTTONS
    public static final int INTAKE_BTN = 0;
    public static final int OUTPUT_BTN = 1; 
    public static final int LATCH_IN_BTN = 2;
    public static final int LATCH_OUT_BTN = 3; 
    //default values as usual

    // Motors 
    public static final int FRONTR = 1; 
    public static final int BACKR = 2; 
    public static final int FRONTL = 3;
    public static final int BACKL = 4; // default values rn

    // intake motor
    public static final int INTAKE = 5; 
    // roller conveyor output
    public static final int OUTPUT = 6;
    // latch
    public static final int LATCH = 7; 
    //again, default values; drivetrain not set up yet


}
