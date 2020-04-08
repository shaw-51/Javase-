package extendsProject2;

public class Truck extends Car{
	private long payload;//‘ÿ÷ÿ¡ø

	public long getPayload() {
		return payload;
	}

	public void setPayload(long payload) {
		this.payload = payload;
	}
	public Truck(){
		
	}
	public Truck(int wheels,long weight,int loader,long payload){
		this.setWheels(wheels);
		this.setWeight(weight);
		this.setLoader(loader);
		this.setPayload(payload);
		
	}

	@Override
	public String toString() {
		return "Truck [payload=" + payload + "]";
	}
	

}
