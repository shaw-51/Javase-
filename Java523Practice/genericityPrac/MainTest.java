package genericityPrac;
//����ѵ����һ��
public class MainTest {
	public static void main(String []args) {
	Dao<String> dao=new Dao<>();
	dao.save("����","����");
	dao.save("����","Ŀ");
	dao.save("����","�ź�");
	dao.save("����","����");
	dao.save("����","��");
	dao.save("���","��");
	
	String str=(String)dao.get("����");
	System.out.println(str);
	
	dao.update("����","����");
	System.out.println("������Ӧ��ֵ�ǣ�"+dao.get("����"));
	
	System.out.println(dao.list());
	
	dao.delete("����");
	
	}
}
