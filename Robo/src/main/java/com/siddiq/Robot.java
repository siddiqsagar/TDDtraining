package com.siddiq;

public class Robot {
	
	private int Load = 0 ;
	private String currentStatus = "Welcome";
    private boolean isbatteryLow  = false;
    private double battery = 100;
    
    
    public int getLoad() {
		return Load;
	}
	public void setLoad(int load) {
		Load = load;
	}
	
	public boolean isIsbatteryLow() {
		return isbatteryLow;
	}
	
	public void setIsbatteryLow(boolean isbatteryLow) {
		this.isbatteryLow = isbatteryLow;
	}
	
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	

}
