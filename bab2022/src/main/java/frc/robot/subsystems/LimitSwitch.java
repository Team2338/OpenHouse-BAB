// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.Globals;

public class LimitSwitch {
  /** Creates a new ExampleSubsystem. */

  private static DigitalInput lSwitch;
  private int id;

  /**
   *
   * @param port channel port
   * @param id 0-3
   */
  public LimitSwitch(int port, int id) {
    lSwitch = new DigitalInput(port);
    this.id = id;
  }

  public boolean getLSwitchState() {
    return lSwitch.get(); //TODO: Set the value based on wiring that Robert Set Up
  }

  public void updateGlobal() {
    switch (id) {
      case 0:
        Globals.lm0 = getLSwitchState();
      case 1:
        Globals.lm1 = getLSwitchState();
      case 2:
        Globals.lm2 = getLSwitchState();
      case 3:
        Globals.lm3 = getLSwitchState();
    }
  }
}
