package com.corejava.collectionframework.challenge5;

public class Staff {
	/*Write one encapsulation class as Staff. 
	 * Write three variables: staffId, staffName, and staffEmail. 
	 * Create another class with the main method and 
	 * create an ArrayList with Staff generic type. 
	 * Store 3 different staff data in that ArrayList. Output: Print only the 
	 * 2nd staff details in that ArrayList. Note. Must read all the data from the user.
	 */
	private int staffId;
	private String staffName;
	private String staffEmail;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffname) {
		this.staffName = staffname;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	

}
