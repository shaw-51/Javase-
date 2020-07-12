package StuMIB;

import java.util.Objects;

//.学生类,学生编号,学生姓名,学生密码,学生成绩
public class Student {

	private String name="";   //学生姓名
	private int num=01;    //学生编号
	private String password;  //学生密码
	private double grade=100;       //学生成绩
	
	public Student() {
		
	}
	
	public Student(String name,int num,String paaword) {
		this.name=name;
		this.num=num;
		this.password=password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

	public boolean define(String given) {
		if(given.equals(password)) {
			return true;
		}
		else
			return false;
		
	}
	
	public void DisCalculator() {
		this.grade-=10;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name,num,password,grade);
	}

	@Override
	public boolean equals(Object o) {
	     if(this==o) {
	    	 return true;
	     }
	     if(o==null||getClass()!=o.getClass()) {
	    	 return false;
	     }
	     
	     Student student=(Student)o;
	     return Objects.equals(password,student.password)
	    		 &&Objects.equals(name,student.name);
	}
}
