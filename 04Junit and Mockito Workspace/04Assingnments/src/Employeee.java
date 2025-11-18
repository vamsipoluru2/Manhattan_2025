class Employeee{
	String firstName;
	String lastaName;
	double salary;
	
	Employeee(String firstName,String lastName,Double salary) {
		this.firstName=firstName;
		this.lastaName=lastName;
		this.salary=salary;
		
	}

	
	@Override
	public String toString() {
		return "Employeee [firstName=" + firstName + ", lastaName=" + lastaName + ", salary=" + salary + "]";
	}



	public static Employeee[] readEmployee() {
		
		Employeee[] employees=new Employeee[3];
		
		employees[0] =new Employeee("poluru", "vamsi", 4000.600d);
		employees[1] =new Employeee("vamsi", "poluru", 6000.400d);
		employees[2] =new Employeee("mudit", "mudit", 8000.200d);

		return employees;
	}
	
	
	public static void DisplayEmp(Employeee[] employees) {
		for(Employeee e:employees) {
			System.out.println("First Name: "+e.firstName+"\tLastName: "+e.lastaName+"      Salary: "+e.salary);
		}
	}
	

	public static void main(String[] args) {
		Employeee[] emp= Employeee.readEmployee();
		DisplayEmp(emp);
		System.out.println(emp[0]);
	}
}
