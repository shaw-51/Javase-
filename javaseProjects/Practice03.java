package javaseProjects;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte b = 10;
		b++;          
		b = (byte)(b+1);  
		//b=b+1;报错，int 不能直接转化为byte型
		System.out.println(b);

	}

}
