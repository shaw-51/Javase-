package programPractice;
/**
 * 6）在 main  函数中生成 
一个公司对象； 
一个小时工的对象，每小时工资10，工作 200 小时； 
一个小时工的对象，每小时工资10，工作 230 小时； 
一个销售员工的对象，销售额5000； 
一个销售员工的对象，销售额200000； 
一个普通员工对象，工作小时205 小时。 
将以上员工对象加入公司对象中，然后调用输出所有员工工资和的方法，查看该公司该月应
该发的工资总和。 
 * @author user
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Company companyA=new Company();
		HourlyWorker workerA=new HourlyWorker("原野白之助");
		workerA.setWage(10);
		workerA.setWorktime(200);
		
		HourlyWorker workerB=new HourlyWorker("原野黑之助");
		workerB.setWage(10);
		workerB.setWorktime(230);
		
		SaleWorker workerC=new SaleWorker("猿飞日斩");
		workerC.setSaleSum(5000);
		
		SaleWorker workerD=new SaleWorker("志村团藏");
		workerD.setSaleSum(200000);
		
		NomalWorker workerE=new NomalWorker("大蛇丸");
		workerE.setWorktime(205);
		
		
		companyA.add1(workerA);
		companyA.add1(workerB);
		companyA.add2(workerC);
		companyA.add2(workerD);
		companyA.add3(workerE);
		
		companyA.Sum();
		
		
		/* 在main 函数中多生成一个首饰工人对象，生产首饰的数量30； 
将该对象加入公司对象中， 
然后调用输出所有员工工资和的方法，查看该公司该月应该发的工资总和。 */
		JewelWorker workerF=new JewelWorker("宇智波鼬");
		workerF.setNumber(30);
		companyA.add4(workerF);
		companyA.Sum();
		
		
		
		
		
	}

}
