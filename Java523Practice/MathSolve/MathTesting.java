package MathSolve;
//泛型训练第二题
import java.text.DecimalFormat;

public class MathTesting {
	public static void main( String []args) {
		MathDealing<Integer> ma=new MathDealing<Integer>();
		Integer []in=new Integer[] {12,15,46,48,561,12};
		ma.setNum(in);
		System.out.println(ma.Seek_Min(in));
		System.out.println(ma.Seek_Max(in));
		DecimalFormat df=new DecimalFormat("0.000");   //控制小数点位数
		System.out.println(df.format(ma.Average(in)));
		
		System.out.println("\n");
		MathDealing<Double> mb=new MathDealing<Double>();
		Double [] dg=new Double[] {12.2,15.8,46.2,48.8,561.8,12.2};
		mb.setNum(dg);
		System.out.println(mb.Seek_Min(dg));
		System.out.println(mb.Seek_Max(dg));
		DecimalFormat df2=new DecimalFormat("0.000");   //控制小数点位数
		System.out.println(df2.format(mb.Average(dg)));
		
		
		
		
		
		
	}

}
