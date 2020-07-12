package MathSolve;

import java.util.Arrays;

/*
 * 第二题.定义泛型类，成员变量是Number类或其子类对象的数组
 * 成员方法有：求数组元素最小值、最大值和平均值。
 * 创建泛型类对象，分别求Integer和Double型数组的最小最大、平均值
 */
public class MathDealing <T extends Number>{
	T []num;

	public T[] getNum() {
		return num;
	}

	public void setNum(T[] num) {
		this.num = num;
	}
	
	public T Seek_Min(T[]num) {
		Arrays.sort(this.num);   //当做字符将数组重新排序，但不会改变其原来的数据类型
		return num[0];
		
	}
	
	public T Seek_Max(T []num) {
		Arrays.sort(this.num);
		return num[this.num.length-1];
	}
	
	public double Average(T []num) {
		double sum=0;
		for(int i=0;i<this.num.length;i++) {
			sum+=num[i].doubleValue();
		}
		return sum/this.num.length;
	}
	
	
}
