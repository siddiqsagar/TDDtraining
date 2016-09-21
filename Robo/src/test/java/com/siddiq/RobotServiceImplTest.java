package com.siddiq;
import org.junit.Assert;
import org.junit.Test;

import com.siddiq.RobotService;
import com.siddiq.RobotServiceImpl;


public class RobotServiceImplTest {

	RobotService robotService = new RobotServiceImpl();
	
	@Test
	public void walkingOverWeightCase(){
		robotService.addWeight(12);
		Assert.assertEquals("Overweight", robotService.getRobot().getCurrentStatus() );
	}
	
	@Test
	public void zeroKmWalkedWithoutWeight() throws CannotWalkException{
		robotService.walk(0);
		Assert.assertEquals(false, robotService.getRobot().isIsbatteryLow() );
	}
	
	@Test
	public void MinDistanceWalkedWithoutWeight() throws CannotWalkException{
		robotService.walk(2);
		Assert.assertEquals(false, robotService.getRobot().isIsbatteryLow() );
	}
	
	@Test
	public void MaxDistanceWalkedWithoutWeight() throws CannotWalkException{
		robotService.walk(12);
		Assert.assertEquals(true, robotService.getRobot().isIsbatteryLow() );
	}
	
	@Test(expected=CannotWalkException.class)
	public void walkWithWeight() throws CannotWalkException{
		robotService.addWeight(12);
		robotService.walk(3);
		Assert.assertEquals(true, robotService.getRobot().isIsbatteryLow() );
	}
	
	@Test
    public void ScanFailureOnBarCodeNotClear() {
		
       Assert.assertEquals("Scan Failure", robotService.getRobot().getCurrentStatus());
    }
}
