package com.xworkz.dto;

public class DoctorDTO {
	private String name;
	private String specilization;
	private String hospitalName;
	private char gender;
	private Integer salary;
	private Integer age;

	public DoctorDTO() {
		System.out.println("invoked DoctorDTO no args const");
	}

	public DoctorDTO(String name, String specilization, String hospitalName, char gender, Integer salary, Integer age) {
		super();
		this.name = name;
		this.specilization = specilization;
		this.hospitalName = hospitalName;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
