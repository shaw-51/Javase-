package FilePrac1;
//（姓名,语文成绩,数学成绩,英语成绩)
public class Student {
	private String name;
	private double Yscore;
	private double Mscore;
	private double Escore;
	public double Score;
	
	public Student() {
		
	}
	
	public Student(String name,double Yscore,double Mscore,double Escore) {
		this.name=name;
		this.Yscore=Yscore;
		this.Mscore=Mscore;
		this.Escore=Escore;
		this.Score=Yscore+Mscore+Escore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getYscore() {
		return Yscore;
	}
	public void setYscore(double yscore) {
		Yscore = yscore;
	}
	public double getMscore() {
		return Mscore;
	}
	public void setMscore(double mscore) {
		Mscore = mscore;
	}
	public double getEscore() {
		return Escore;
	}
	public void setEscore(double escore) {
		Escore = escore;
	}
	@Override
	public String toString() {
		return "姓名：" + name + ",     语文成绩：" + Yscore + ",    数学成绩：" + Mscore + ",    英语成绩：" + Escore + ",  总分："+Score;
	}
	
	
	
}
