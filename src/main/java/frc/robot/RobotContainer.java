// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.Drive;
// import frc.robot.subsystems.Chain;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.EndgameLatch;
// import frc.robot.subsystems.Intake;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer 
{
  // The robot's subsystems and commands are defined here...
  private final Drivetrain m_drive = new Drivetrain();
  // private final Intake m_intake = new Intake();
  // private final Chain m_chain = new Chain();
  private final EndgameLatch m_latch = new EndgameLatch();

  private final Joystick left = new Joystick(0);
  private final Joystick right = new Joystick(1);

  private JoystickButton intakeIn, intakeOut, chainLift, chainLower, endgameLatch;
   
  private final Drive drive = new Drive(m_drive, -left.getRawAxis(1), right.getRawAxis(1)); 




  // private final ExampleCommand m_autoCommand = new ExampleCommand();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() { 
    // Configure the button bindings
    configureButtonBindings();
    m_drive.setDefaultCommand(drive);
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.  command.button.JoystickButton}.
   */
  private void configureButtonBindings() 
  {
    intakeIn = new JoystickButton(left, 0);
    //   intakeIn.whileHeld(new StartEndCommand(() -> m_intake.runIntake(-0.25), () -> m_intake.runIntake(0), m_intake));

    // intakeOut = new JoystickButton(right, 14);
    //   intakeOut.whileHeld(new StartEndCommand(() -> m_intake.runIntake(1), () -> m_intake.runIntake(0), m_intake));

    // chainLift = new JoystickButton(right, 10);
    //   chainLift.whileHeld(new StartEndCommand(() -> m_chain.runChain(1), () -> m_chain.runChain(0), m_chain));

    // chainLower = new JoystickButton(right, 15);
    //   chainLower.whileHeld(new StartEndCommand(() -> m_chain.runChain(-1), () -> m_chain.runChain(0), m_chain));

    endgameLatch = new JoystickButton(right, 3);
      endgameLatch.whenPressed(new InstantCommand(() -> m_latch.toggle(), m_latch));

  }
  

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
