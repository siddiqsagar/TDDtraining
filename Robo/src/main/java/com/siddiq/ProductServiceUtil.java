package com.siddiq;

public class ProductServiceUtil{

	public static double getPriceFromBarcode(String barcode) {
		double  price = Integer.parseInt(barcode);
		return price;
	}

}
