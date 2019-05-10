package Kieu_Du_Lieu_Day3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//them tim kiem
//them sua tat ca khi cung ten
public class ManagerEmployee implements EmployeeInterFace {
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber=0;
	public static int employNumber ;
	public static List<Employee> employees = new LinkedList<Employee>(); ;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
		System.out.println("The program end!!!");
	}

	
	public static void showMenu()
	{
		ManagerEmployee manager = new ManagerEmployee();
		do {
			System.out.println("-------------------------");
			System.out.println("Choose one number below");
			System.out.println("1.Add Employee");
			System.out.println("2.Show list Employee");
			System.out.println("3.Exit!");
			System.out.println("4.Seach");
			System.out.println("5.Update Salary");
			System.out.println("------------------------");
			System.out.println("Nhap vao 1 so :");
			inputNumber = scanner.nextInt();
			
			switch(inputNumber) {
			case 1:
				manager.addEmployee(employees);
				break;
			case 2:
				if(employNumber!=0)
					manager.show(employees);
				else
					System.out.println("Input employee !");
					showMenu();
				break;
			case 3:
				askForContinue();
				break;
			case 4:
				scanner.nextLine();
				System.out.println("Input name ");
				String name = scanner.nextLine();
				System.out.println("---------------");
				System.out.println("List was found ");
				System.out.println("---------------");
				manager.Seach(employees,name);
				break;
			case 5:
				scanner.nextLine();
				System.out.println("Input name");
				String na = scanner.nextLine();
				manager.Update(employees,na);
			default:
				System.out.println("you inputNumber wrong,please input again !!");
				break;
			}
		}
		while(inputNumber!=3);
		
	}
	public static void askForContinue()
	{
		System.out.println("1.Continue");
		System.out.println("0.Exit");
		int number = scanner.nextInt();
		
		switch(number)
		{
		case 1: showMenu();
		break;
		case 0:
			break;
		}
	}


	@Override
	public void addEmployee(List<Employee> list) {
		// TODO Auto-generated method stub
		//Employee employee = new Employee(Name, Id, Salary, age, Married, job)
				System.out.println("How many people you want to input");
				employNumber = scanner.nextInt();
				
				for(int i=0;i<employNumber;i++)
				{
				System.out.println("Nhap vao id :");
				int Id = scanner.nextInt();
				System.out.println("Nhap vao ten :");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("Nhap vao tuoi ");
				int age = scanner.nextInt();
				System.out.println("nhap tien luong");
				double salary = scanner.nextDouble();
				//System.out.println("nhap gioi tinh ");
				//boolean gennder =scanner.nextBoolean();
				System.out.println("name of Job");
				String nameJob = scanner.next();
				Job job = new Job(i, nameJob);
				Employee emp = new Employee(name, Id, salary, age, true, job);
				employees.add(emp);
				}
		
	}


	@Override
	public void show(List<Employee> list) {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		System.out.println("LIST EMPLOYEE");
		System.out.println("--------------");
		for (Employee emp : list) {
			emp.Show();
		}
	}


	@Override
	public void Seach(List<Employee> list, String name) {
		// TODO Auto-generated method stub
		 for (Employee emp : list) {
			 if(emp.getName().equals(name)) {
				 emp.Show();
				 break;
			 }
		 }
	}



	@Override
	public void Update(List<Employee> list, String name) {
		// TODO Auto-generated method stub
		System.out.println("Update Salary");
		double salary = scanner.nextDouble();
		for( Employee emp : list) {
			if(emp.getName().equals(name)){
				emp.setSalary(salary);
				System.out.println("DONE UPDATE !");
				break;
			}
		}
		
		
	}


}
