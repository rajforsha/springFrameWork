package com.shashi.model;

/**
 * @author vagrant
 *
 */
public class Employee implements Domain {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2472314004282571826L;
	private String name;
	private String empId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

}
