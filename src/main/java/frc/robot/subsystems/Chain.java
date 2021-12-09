// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chain extends SubsystemBase {
  /** Creates a new Chainmotor. */

  private final CANSparkMax chain;

  public Chain() 
  {
    this.chain = new CANSparkMax(Constants.CHAIN, MotorType.kBrushless);
    // adding motor for chain
  }

  public void runChain(double speed)
  {
    chain.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
