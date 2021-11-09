package exercise;

public class Teacher extends Person {
	public Teacher (){};
    public Teacher (String name,double age){
        super(name,age);
    }
    public void teaching_method(){
        System.out.println("教学方法");
    }
}