// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chain extends SubsystemBase {
  /** Creates a new Chainmotor. */

  private final Spark chain;

  public Chain() 
  {
    this.chain = new Spark(Constants.CHAIN);
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
