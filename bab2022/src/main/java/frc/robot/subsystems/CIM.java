package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.RobotMap;

/**
 * Describes the functionality of the CIM motor
 * Calling it the CIMShooter
 */
public class CIM extends SubsystemBase {
  private static CIM instance = null;

  // creates a singleton class (only 1 instance can be instantiated)
  public static CIM getInstance() {
    if (instance == null) {
      instance = new CIM();
    }
    return instance;
  }

  private static final TalonSRX CIMShooterMotor = new TalonSRX(RobotMap.MOTOR_TALON_ONE);

  private CIM() {
    CIMShooterMotor.setNeutralMode(NeutralMode.Brake);
  }

  /**
   * Set Speed Of the Motor
   * @param speed % Speed Output
   */
  public void setSpeed(double speed) {
    CIMShooterMotor.set(ControlMode.PercentOutput, speed);
  }
}
