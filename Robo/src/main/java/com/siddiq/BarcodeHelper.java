package com.siddiq;

public class BarcodeHelper {
	public static double scanBarcode(String barcode) {
		double price= ProductServiceUtil.getPriceFromBarcode(barcode);
		return price;
	}
}
