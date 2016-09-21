package com.siddiq;

public interface RobotService {
	
	public void addWeight(int weight);
	public void walk(double distanceInKms) throws CannotWalkException;
	public void ScanAndDisplay(Product product);
	public Robot getRobot();
	

}
