package genericityPrac;
//泛型训练第一题
public class MainTest {
	public static void main(String []args) {
	Dao<String> dao=new Dao<>();
	dao.save("清三","九日");
	dao.save("清四","目");
	dao.save("清无","九合");
	dao.save("清柳","彻底");
	dao.save("清琦","九");
	dao.save("清久","日");
	
	String str=(String)dao.get("清三");
	System.out.println(str);
	
	dao.update("清三","八日");
	System.out.println("清三对应的值是："+dao.get("清三"));
	
	System.out.println(dao.list());
	
	dao.delete("清四");
	
	}
}
