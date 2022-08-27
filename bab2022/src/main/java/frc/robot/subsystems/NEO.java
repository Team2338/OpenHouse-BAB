// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class NEO extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private static NEO instance = null;
  private static final CANSparkMax motor = new CANSparkMax(RobotMap.MOTOR_SPARKMAX_ONE, CANSparkMaxLowLevel.MotorType.kBrushless);
  private static final RelativeEncoder motorEncoder = motor.getEncoder();
  private static final SparkMaxPIDController motorPID = motor.getPIDController();

  public static NEO getInstance() {
    if (instance == null) {
      instance = new NEO();
    }
    return instance;
  }

  private NEO() {
    motor.setIdleMode(CANSparkMax.IdleMode.kCoast);

    setPID();
  }

  public void setPower(double power) {
    motor.setVoltage(power);
  }

  public void setSpeed(double speed) {
    motor.set(speed);
  }

  public double getSpeed() {
    return motorEncoder.getVelocity();
  }

  public void setPID() {
    motorPID.setP(0.0000023);
    motorPID.setFF(0.00000012);
  }
}
