package com.coforge.training.shopstop.bean;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 22, 2025
 * Time		:12:22:51 PM
 * Project	:ShopStop
*/

public class Product {
	
		//Properties
		private int pId;
		private String pName;
		private double price;
		
		public Product() {
			super();
		}

		public int getpId() {
			return pId;
		}

		public void setpId(int pId) {
			this.pId = pId;
		}

		public String getpName() {
			return pName;
		}

		public void setpName(String pName) {
			this.pName = pName;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
}
