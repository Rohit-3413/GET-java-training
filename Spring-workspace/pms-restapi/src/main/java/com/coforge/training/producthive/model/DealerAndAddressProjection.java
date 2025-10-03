package com.coforge.training.producthive.model;

/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 3, 2025
* Time		:4:21:36 PM
* Project	:pms-restapi
* 
* Template class to perform Inner Join Dealer & Address classes
*/

public class DealerAndAddressProjection {

		private Long id;
		private String fname;
		private String lname;
		private String phoneNo;
		private String email;
		private String street;
		private  String city;
		private  int pincode;
		
		public DealerAndAddressProjection() {
			super();
		}

		public DealerAndAddressProjection(Long id, String fname, String lname, String phoneNo, String email,
				String street, String city, int pincode) {
			super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.phoneNo = phoneNo;
			this.email = email;
			this.street = street;
			this.city = city;
			this.pincode = pincode;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		
		
}

