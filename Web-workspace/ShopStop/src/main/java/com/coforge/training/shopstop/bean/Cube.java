package com.coforge.training.shopstop.bean;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 22, 2025
 * Time		:11:48:17 AM
 * Project	:ShopStop
*/

public class Cube {

	private int num;

	// generated constructor with no arguments
	public Cube() {
		
	}

	// generate getter and setter methods
	public int getNum() {
		return num*num*num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
