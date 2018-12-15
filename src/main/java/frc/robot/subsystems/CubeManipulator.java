/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class CubeManipulator extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  int currentState = 0;

  static final int s0 = 0;
  static final int s1 = 1;
  static final int s2 = 2;
  static final int s3 = 3;
  static final int s4 = 4;

  boolean wantsIntake = false;
  boolean sensorTriggered = false;
  boolean scoeringPostion = false;
  boolean wantsScoring = false;

  Spark elevator1 = new Spark(0);
  Spark elevator2 = new Spark(1);
  Spark intakeLeft = new Spark(2);
  Spark intakeRight = new Spark(3);

  public void intake() {
    intakeLeft.set(1.0);
    intakeRight.set(-1.0);
  }

  public void outtake() {
    intakeLeft.set(-1.0);
    intakeRight.set(1.0);
  }

  public void elevatorUp() {
    elevator1.set(0.5);
    elevator2.set(0.5);
  }

  public void elevatorDown() {
    elevator1.set(-0.5);
    elevator2.set(-0.5);
  }

  public void periodicFunction(){

    switch (currentState) {
      case s0:

      break;
      case s1:

      break;
      case s2:

      break;
      case s3:

      break;
      case s4:

      break;
    }

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
