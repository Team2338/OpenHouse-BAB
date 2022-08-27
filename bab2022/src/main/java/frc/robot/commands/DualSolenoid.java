// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Globals;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Solenoids;

/** An example command that uses an example subsystem. */
public class DualSolenoid extends CommandBase {

  private static int ctr = 0;
  public DualSolenoid() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Solenoids.getInstance());
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    switch (ctr % 3) {
      case 0:
        Solenoids.getInstance().doubleDoSomething(DoubleSolenoid.Value.kForward);
      case 1:
        Solenoids.getInstance().doubleDoSomething(DoubleSolenoid.Value.kOff);
      case 2:
        Solenoids.getInstance().doubleDoSomething(DoubleSolenoid.Value.kReverse);
    }

    ctr += (Globals.lm2) ? 1 : 0;
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
