package com.java8.demo.swapping;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	//private List<String> techStack;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary
			/*List<String> techStack*/) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		//this.techStack = techStack;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	public List<String> getTechStack() {
//		return techStack;
//	}
//
//	public void setTechStack(List<String> techStack) {
//		this.techStack = techStack;
//	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
//				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + ", techStack=" + techStack
//				+ "]";
//	}
	

	@Override
	public String toString() {
		return "id: " + this.id + " | name: " + this.name + " | age: " + this.age + " | gender: " + this.gender
				+ "| department: " + this.department + "| yearOfJoining: " + this.yearOfJoining + " |salary: "
				+ this.salary /* + "| techStack : " + this.techStack */;
	}

}