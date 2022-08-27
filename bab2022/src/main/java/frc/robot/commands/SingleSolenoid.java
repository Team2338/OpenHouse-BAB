// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Globals;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Solenoids;

/** An example command that uses an example subsystem. */
public class SingleSolenoid extends CommandBase {

  public SingleSolenoid() {
    addRequirements(Solenoids.getInstance());
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if(Globals.lm3) {
      Solenoids.getInstance().singleDoSomething(true);
      return;
    }

    Solenoids.getInstance().singleDoSomething(false);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
