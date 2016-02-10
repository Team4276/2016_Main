package org.usfirst.frc.team4276.robot;

import edu.wpi.first.wpilibj.Talon;

public class TalonEncapsulator {
	Talon tl1; // Talon t(alon)l(eft)1(forward-most motor)
	Talon tl2;
	Talon tl3;
	Talon tr1;
	Talon tr2;
	Talon tr3;
	
	TalonEncapsulator(int l1chan, int l2chan, int l3chan, int r1chan, int r2chan, int r3chan) {
		tl1 = new Talon(l1chan);
		tl2 = new Talon(l2chan);
		tl3 = new Talon(l3chan);
		tr1 = new Talon(r1chan);
		tr2 = new Talon(r2chan);
		tr3 = new Talon(r3chan);
	}
	
	void drive(double lspeed, double rspeed) {
		tl1.set(lspeed);
		tl2.set(lspeed);
		tl3.set(lspeed);
		tr1.set(-rspeed);
		tr2.set(-rspeed);
		tr3.set(-rspeed);
	}
}
