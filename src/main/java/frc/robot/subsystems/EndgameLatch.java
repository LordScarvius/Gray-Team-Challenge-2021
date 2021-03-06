// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class EndgameLatch extends SubsystemBase {
  /** Creates a new EndgameLatch. */

  public Servo latch;

  public EndgameLatch() 
  {
      latch = new Servo(Constants.LATCH);
  }

  public void setPos(double deg)
  {
    latch.setPosition(deg);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
