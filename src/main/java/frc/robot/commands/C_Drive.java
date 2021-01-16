// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SS_Drivebase;

/** An example command that uses an example subsystem. */
public class C_Drive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  /**
   * Creates a new ExampleCommand.
   *
   * @param SS_Drivebase The subsystem used by this command.
   */
  public C_Drive() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.drivebase);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftSpeed = -RobotContainer.controller.getRawAxis(Constants.XBOXCONTROLLER_LEFT_STICK_X_AXIS);
    double rightSpeed = RobotContainer.controller.getRawAxis(Constants.XBOXCONTROLLER_RIGHT_STICK_X_AXIS);

    SS_Drivebase.drive(leftSpeed, rightSpeed);
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
