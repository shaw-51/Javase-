package javaseProjects;

public class Practice04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
