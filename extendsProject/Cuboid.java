package extendsProject;
class Cuboid extends Rectangle{
	private int height;

	public int getHeight() {
		return height;
	}
	Cuboid(){
		
	}
	Cuboid(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public int computingMethod(){
		return height*width*length;
		
	}

	@Override
	public String toString() {
		return "Cuboid [height=" + height + "]";
	}
}
