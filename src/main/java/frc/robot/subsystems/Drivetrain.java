// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Drivetrain extends SubsystemBase {

  // private double resetR = 0;
  // private double resetL = 0;

  public final Spark frontL, frontR, backL, backR;
  private final SpeedControllerGroup left, right;
  private final DifferentialDrive drive;

  /** Creates a new Drivetrain. */
  public Drivetrain() 
  {
    frontL = new Spark(Constants.FRONTL);
    frontR = new Spark(Constants.FRONTR);
    backL = new Spark(Constants.BACKL);
    backR = new Spark(Constants.BACKR);
    
    left = new SpeedControllerGroup(frontL, backL);
    right = new SpeedControllerGroup(frontR, backR);

    drive = new DifferentialDrive(left, right);

    drive.setSafetyEnabled(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void tankDrive(double leftSpeed, double rightSpeed)
  {
    if (Math.abs(leftSpeed) < 0.1)
    {
        leftSpeed = 0;
      }
      if(Math.abs(rightSpeed) < 0.1)
      {
      rightSpeed = 0;
    }
    drive.tankDrive(leftSpeed, rightSpeed);
  }

}
