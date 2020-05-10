package javaseProjects;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int i = 0;
         test(i);
         i = ++i;
        System.out.println("----" + i);
        i = i++;
        System.out.println("****" + i);         

	}
	public static void test(int i){
        i++;
        System.out.println("++++" + i);
    }

}
