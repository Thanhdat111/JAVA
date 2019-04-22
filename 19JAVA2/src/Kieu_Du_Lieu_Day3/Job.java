package Kieu_Du_Lieu_Day3;

public class Job {
	int Id;
	String name;
	Job(int id, String name)
	{
		this.Id =id;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
