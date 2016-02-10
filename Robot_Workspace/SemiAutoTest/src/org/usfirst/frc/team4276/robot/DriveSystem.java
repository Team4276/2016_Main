package org.usfirst.frc.team4276.robot;

import edu.wpi.first.wpilibj.Joystick;

public class DriveSystem {
	TalonEncapsulator talons;
	Joystick stick;
	static int teleopCounter;
	static boolean autoEnabled;
	
	DriveSystem(int stickChan) {
		stick = new Joystick(stickChan);
		talons = new TalonEncapsulator(0,1,2,3,4,5);
		teleopCounter = 0;
	}
	
	void drive() {
		autoEnabled = stick.getRawButton(0);
		if (autoEnabled) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// arbitrary teleop drive code
			teleopCounter++;
		}
		System.out.println(teleopCounter + " " + SemiAutoRunnable.semiAutoCounter);
	}
}
