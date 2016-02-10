package org.usfirst.frc.team4276.robot;

public class SemiAutoRunnable implements Runnable {
	static int semiAutoCounter;
	SemiAutoRunnable(String threadName) {
		semiAutoCounter = 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (DriveSystem.autoEnabled) {
			semiAutoCounter++;
		}
		
	}
}
