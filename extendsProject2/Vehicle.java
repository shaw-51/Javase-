package extendsProject2;

public class Vehicle {
	  private int wheels;//轮子个数
	  private long weight;//车重
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public Vehicle(){
		
	}
	public Vehicle(int wheels,long weight){
		this.wheels=wheels;
		this.weight=weight;
	}
	@Override
	public String toString() {
		return "Vehicle [wheels=" + wheels + ", weight=" + weight + "]";
	}
	
	  

}
