package StuMIB;

import java.util.Objects;



//试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
public class Test {
	private int num2;//试题编号
	private String des;//试题名称
	private Character option;//试题选项
	private Character rop;//试题答案
	int each=10;
	
	public Test() {
		
	}
	public Test(int num2,String des,Character rop) {
		this.num2=num2;
		this.des=des;
		this.rop=rop;
	}
	public int getNum2() {
		return num2;
	}
	public void setNam2(int num2) {
		this.num2 = num2;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Character getOption() {
		return option;
	}
	public void setOption(Character option) {
		this.option = option;
	}
	public Character getRop() {
		return rop;
	}
	public void setRop(Character rop) {
		this.rop = rop;
	}
	
	public boolean isRight(Character ch) {
		return Objects.equals(ch,this.rop);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(num2,des,option,rop);
	}

	@Override
	public boolean equals(Object o) {
	     if(this==o) {
	    	 return true;
	     }
	     if(o==null||getClass()!=o.getClass()) {
	    	 return false;
	     }
	     
	     Test test=(Test)o;
	     return Objects.equals(num2,test.num2)
	    		 &&Objects.equals(des,test.des)
	    		 &&Objects.equals(option,test.option)
	    		 &&Objects.equals(rop,test.rop);
	}
	
	
	

	
	
	
	
	

}
