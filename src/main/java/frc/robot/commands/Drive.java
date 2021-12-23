// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class Drive extends CommandBase {

  private final Drivetrain m_drive;
  private final DoubleSupplier left, right; 
  
  /** Creates a new Drive. */
  public Drive(Drivetrain m_drive, DoubleSupplier left, DoubleSupplier right) 
  {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drive);

    this.m_drive = m_drive;
    this.left = left;
    this.right = right;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    m_drive.tankDrive(left.getAsDouble(), right.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
