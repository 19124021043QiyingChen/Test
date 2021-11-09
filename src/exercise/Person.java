package exercise;

public class Person{
    private String name;//定义性名
    private double age;//定义年龄
	public Person() {
		super();
	}
	public Person(String name, double age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public void eat(){
        System.out.println("方法(吃)");
    }

}
