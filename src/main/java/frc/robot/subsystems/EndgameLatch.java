// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class EndgameLatch extends SubsystemBase {
  /** Creates a new EndgameLatch. */

  public Solenoid latch;

  public EndgameLatch() 
  {
      // latch = new Solenoid(Constants.LATCH);
  }


  public void toggle()
  {
    latch.toggle();
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
