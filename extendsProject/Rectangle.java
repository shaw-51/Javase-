package extendsProject;
/*��1������һ���࣬����һ�����Σ������г������������ԣ��ͼ������������
��2����дһ���࣬�̳��Ծ����࣬ͬʱ�������������壬���г����������ԣ��ͼ�������ķ�����
��3����дһ�������࣬��������������в��ԣ�����һ�������壬�����䳤�����ߣ���������������*/
public class Rectangle {
	protected int length;
	protected int width;
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	Rectangle(){
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int computingMethod(){
		return length*width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	

}
