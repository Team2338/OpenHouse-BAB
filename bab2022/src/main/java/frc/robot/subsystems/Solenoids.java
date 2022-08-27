package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Solenoids extends SubsystemBase {

    private static Solenoids instance = null;

    public static Solenoids getInstance() {
        if (instance == null) {
            instance = new Solenoids();
        }
        return instance;
    }

    private Solenoids() {}

    private static final Solenoid pneumatic = new Solenoid(PneumaticsModuleType.CTREPCM, RobotMap.SINGLE_PNEUMATIC);
    private static final DoubleSolenoid doublePneumatic = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.DOUBLE_FORWARD, RobotMap.DOUBLE_REAR);

    public void doubleDoSomething(DoubleSolenoid.Value value) {
        doublePneumatic.set(value);
    }

    public void singleDoSomething(boolean seeWhatBreaks) { //DEPRESSION - CAN'T
        pneumatic.set(seeWhatBreaks);
    }
}
