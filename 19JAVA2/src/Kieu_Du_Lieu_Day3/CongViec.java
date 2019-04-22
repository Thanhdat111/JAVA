package Kieu_Du_Lieu_Day3;

import java.util.ArrayList;
import java.util.List;

public class CongViec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job1 = new Job(1,"Director");
		Job job2 = new Job(2,"Developer");
		Job job3 = new Job(3,"HR");
		Job job4 = new Job(4,"CEO");
		Job job5 = new Job(5,"BA");
		Employee employee1 = new Employee("Nguyen Van A", 123,20, 100000000, true, job1);
		Employee employee2 = new Employee("Nguyen Van B", 123,21, 100000000, true, job2);
		Employee employee3 = new Employee("Nguyen Van C", 123,22, 100000000, true, job3);
		Employee employee4 = new Employee("Nguyen Van D", 123,23, 100000000, true, job4);
		Employee employee5 = new Employee("Nguyen Van E", 123,24, 100000000, true, job5);
		
		List<Employee> list = new ArrayList<Employee>();
		
		
		Employee arrayEmployee[] = new Employee[5];
		arrayEmployee[0] = employee1;
		arrayEmployee[1] = employee2;
		arrayEmployee[2] = employee3;
		arrayEmployee[3] = employee4;
		arrayEmployee[4] = employee5;
		
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		
		
		System.out.println("Name        " + " Salary   " + "  Age " + "Job Name " );
		for( Employee ep : list)
		{
			ep.Show();
		}
		
		arrayEmployee[arrayEmployee.length-1].Show();
		
		
		
		
		//System.out.printf(employee.getName() + employee.getSalary() + job1.getName());
		
	}

}
