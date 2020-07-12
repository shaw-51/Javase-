package MathSolve;

import java.util.Arrays;

/*
 * �ڶ���.���巺���࣬��Ա������Number�����������������
 * ��Ա�����У�������Ԫ����Сֵ�����ֵ��ƽ��ֵ��
 * ������������󣬷ֱ���Integer��Double���������С���ƽ��ֵ
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
		Arrays.sort(this.num);   //�����ַ��������������򣬵�����ı���ԭ������������
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
