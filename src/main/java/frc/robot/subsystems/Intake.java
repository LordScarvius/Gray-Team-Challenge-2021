// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */

  private CANSparkMax intake;

  public Intake() 
  {
    this.intake = new CANSparkMax(Constants.INTAKE, MotorType.kBrushless);
  }

  public void runIntake(double speed)
  {
    this.intake.set(speed);
  }

  public void runIntake()
  {
    this.intake.set(-0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
