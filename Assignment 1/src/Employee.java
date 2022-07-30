public class Employee{
	public int empId;
	public String empName;
	public int salary;
	
	
	public Employee(int id, String name, int salary){
		this.empId = id;
		this.empName = name;
		this.salary = salary;
	}

	
	public String toString() {
        return 
                "empId=" + empId +
                ", empName= " + empName  +
                ", salary=" + salary;
    }
	
	public static void main(String []args){		
		Employee emp1 = new Employee(19288, "Ramasen Dora", 60000);
		Employee emp2 = new Employee(19267, "Asish Bhanshali", 50000);		
		Employee emp3 = new Employee(19273, "Avinash Rajput", 65000);
		System.out.println("Employee 1 : "+ emp1);
		System.out.println("Employee 2 : "+emp2);
		System.out.println("Employee 3 : "+emp3);
	}	
}