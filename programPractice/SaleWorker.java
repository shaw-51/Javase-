package programPractice;
/**
 * 销售员工类，实现员工接口 

属性： 
销售的总金额 
基本工资

方法 
1. 设置销售的总金额 

2. 重写计算工资方法： 
基本工资+提成。 
提成的计算： 
当销售额再10000 以下时，则提成10%， 
等销售额再10000-100000之间是，则提成15%。 
再 100000以上是，提成18%。 

 * @author user
 *
 */
public class SaleWorker implements WorkerInterface{
	private double saleSum;  //销售总额
	private static final double baseSalary=5000;  //设置基本工资为5000
	public String name;
	
	public SaleWorker(String name){
		this.name=name;
	}
	
	public void setSaleSum(double saleSum) {   //设置销售金额
		this.saleSum = saleSum;
	}
	
	@Override
	public double Calculator(){
		double sum=SaleWorker.baseSalary;
		double commission=0;
		if(this.saleSum<10000){
			 commission=this.saleSum*0.1;
		}
		else{
			 commission=this.saleSum*0.15;
		}
		return sum+commission;
	}

}
