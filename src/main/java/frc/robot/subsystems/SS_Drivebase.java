// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.RobotContainer;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SS_Drivebase extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public SS_Drivebase() {}

  public static void drive(double leftSpeed, double rightSpeed) {

    RobotContainer.leftMotor.set(ControlMode.PercentOutput, leftSpeed);
    RobotContainer.rightMotor.set(ControlMode.PercentOutput, rightSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}