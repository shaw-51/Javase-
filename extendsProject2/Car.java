package extendsProject2;

public class Car extends Vehicle{
	private int loader;//ÔØÈËÊı

	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}
	public Car(){
		
	}
	public Car(int wheels,long weight,int loader){
		this.setWheels(wheels);
		this.setWeight(weight);
		this.setLoader(loader);
		
	}

	@Override
	public String toString() {
		return "Car [loader=" + loader + "]";
	}
	
	

}
