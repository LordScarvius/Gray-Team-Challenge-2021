// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class Drive extends CommandBase {

  private Drivetrain m_drive;
  private double leftSpeed, rightSpeed; 
  
  /** Creates a new Drive. */
  public Drive(Drivetrain m_drive, double leftSpeed, double rightSpeed) 
  {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drive);

    this.m_drive = m_drive;
    this.leftSpeed = leftSpeed;
    this.rightSpeed = rightSpeed;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    m_drive.tankDrive(leftSpeed, rightSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {
    m_drive.tankDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
