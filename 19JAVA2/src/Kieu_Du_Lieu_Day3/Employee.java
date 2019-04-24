package Kieu_Du_Lieu_Day3;

public class Employee {
		 String Name;
		 public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isMarried() {
			return Married;
		}
		public void setMarried(boolean married) {
			Married = married;
		}
		int Id;
		 double Salary;
		 int age;
		 boolean Married;
		 Job job;
		 Employee(String Name, int Id, double Salary, int age, boolean Married, Job job)
		 {
			 this.Name = Name;
			 this.Id = Id;
			 this.Salary = Salary;
			 this.age= age;
			 this.Married = Married;
			 this.job = job;
		 }
		 
		 public void Show()
		 {
			 System.out.println(this.getName() +" " + this.getAge()+ " " +this.isMarried()+"  "+this.getSalary() + " " +job.getName());
		 }
		
}
