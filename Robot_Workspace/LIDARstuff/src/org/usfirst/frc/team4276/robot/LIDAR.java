package org.usfirst.frc.team4276.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Relay;

public class LIDAR {

	Encoder encode;
	Relay relay;
	static double encodeValue;
	
	public LIDAR (int encoder1, int encoder2, int relay1 )
	{
		encode = new Encoder(encoder1, encoder2);
		relay = new Relay(relay1);
	}
	
	public void rotate()
	{
		while (1 + 1 == 2)
		{
			encodeValue = encode.get();
			double maxAngle = 180; //translation of encoder value TBD
			double minAngle = 0; 
			
			if (encodeValue > maxAngle)
			{
				relay.set(Relay.Value.kForward);
			}
			else if (encodeValue < minAngle)
			{
				relay.set(Relay.Value.kReverse);
			}
		}
	}
}
