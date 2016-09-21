package com.siddiq;

public class RobotServiceImpl implements RobotService {

	Robot robot= new Robot();
	
	public void addWeight(int weight) {
	robot.setLoad(robot.getLoad()+weight);
	 if(robot.getLoad() > 10) {
         robot.setCurrentStatus("Overweight");
     }
	}

	public void walk(double distanceInKms) throws CannotWalkException {
		
		if (robot.getLoad()>10){
		//	throw load
		throw new CannotWalkException();
		}
		double battery = robot.getBattery(); 
		 double distanceInMeters = distanceInKms * 1000;
	        battery = battery - (2 * distanceInMeters / 100);
	        battery -= robot.getLoad() * 2;
	        if(battery < 15) {
	            robot.setIsbatteryLow(true);
	        }
	}

	public void ScanAndDisplay(Product product) {
		
		try{
	     double price=BarcodeHelper.scanBarcode(product.getBarcode());
	     robot.setCurrentStatus("Price of Product"+price);
		}catch(NumberFormatException ne){
			robot.setCurrentStatus("Scan Failure");
		}
	} 

	public Robot getRobot() {
		return robot;
	}

}
