package Kieu_Du_Lieu_Day3;

import java.util.Scanner;
//them tim kiem
//them sua tat ca khi cung ten
public class ManagerEmployee {
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber=0;
	public static int employNumber ;
	public static Employee employees[];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
		System.out.println("The program end!!!");
	}

	
	public static void showMenu()
	{
		
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
				addEmployee();
				break;
			case 2:
				if(employNumber!=0)
				show();
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
				Seach(name);
				break;
			case 5:
				scanner.nextLine();
				System.out.println("Input name");
				String na = scanner.nextLine();
				Update(na);
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
		show();
		break;
		case 0:
			break;
		}
	}
	public static void addEmployee() {
		//Employee employee = new Employee(Name, Id, Salary, age, Married, job)
		System.out.println("How many people you want to input");
		employNumber = scanner.nextInt();
		
		employees = new Employee[employNumber];
		
		for(int i=0;i<employees.length;i++)
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
		employees[i] = emp;
		}
	}
	public static void show()
	{
		System.out.println("--------------");
		System.out.println("LIST EMPLOYEE");
		System.out.println("--------------");
		for(int i=0;i<employees.length;i++)
		{
			employees[i].Show();
		}
	}
	public static void Seach(String name)
	{
		
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].getName().equals(name)==true) {
				employees[i].Show();
			}	
		}
	}
	public static void Update(String name)
	{
		System.out.println("Update Salary");
		double salary = scanner.nextDouble();
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].getName().equals(name)==true) {
				
				employees[i].setSalary(salary);
				System.out.println("Done Update");
			}
		}
	}

}
