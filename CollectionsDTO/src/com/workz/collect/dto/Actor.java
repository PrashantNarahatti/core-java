package com.workz.collect.dto;

public class Actor {
	private String name;
	private String lang;
	private int age;
	private boolean married;
	private char gender;

	public Actor() {
		System.out.println("invoked no args const");
	}

	public Actor(String name, String lang, int age, boolean married, char gender) {
		super();
		this.name = name;
		this.lang = lang;
		this.age = age;
		this.married = married;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", lang=" + lang + ", age=" + age + ", married=" + married + ", gender=" + gender
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
