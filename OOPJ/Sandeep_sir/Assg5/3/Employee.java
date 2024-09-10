package org.example.Assg5_3;

class Employee{
	private static int totalNoOfEmployees;
	private static double totalSalaryExpense;
	private String name;
	private static int ID;
	private double salary;

	
	{
		ID = ++totalNoOfEmployees;
		//totalNoOfEmployees++;
		
	}
	
	
	public Employee() {
		this("",0.0d);
	}


	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		totalSalaryExpense += salary ; //D
	}


	public int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}


	public void setTotalNoOfEmployees(int totalNoOfEmployees) {
		this.totalNoOfEmployees = totalNoOfEmployees;
	}


	/*public double getTotalSalaryExpense() {
		return totalSalaryExpense;
	}*/


	public void setTotalSalaryExpense(int totalSalaryExpense) {
		this.totalSalaryExpense = totalSalaryExpense;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getID() {
		return ID;
	}


	public void setID(int ID) {
		this.ID = ID;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "name = " + name + ", ID = " + ID + ", salary = " + salary ;
	}


	public static int getTotalEmployees() {
		
		return totalNoOfEmployees;
	} 
	
	
	public static void applyRaise(Employee[] e, double percentage) {
		for(Employee var: e) {
		double newsalary=+(var.salary*(percentage/100));
		var.updateSalary(newsalary);
		}
		
	}
	
	
	public static double calculateTotalSalaryExpense() {
		return totalSalaryExpense;
	}
	
	
	public void updateSalary(double newSalary) {
		totalSalaryExpense -= this.salary;
		this.salary = newSalary;
		totalSalaryExpense += newSalary;
		
	}
	
	
	
	
	
}


