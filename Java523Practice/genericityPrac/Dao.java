package genericityPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dao <T>{
	Map<String,T> map=new HashMap<>();
	
	public void save(String id,T entity) //����T���еĶ���map������
	{
		map.put(id,entity);
	}
	
	public T get(String id)  //��map�л�ȡid��Ӧ�Ķ���
	{
		return map.get(id);
	}
	
	public  void update(String id,T entity) //�滻map�е�keyΪid������ 
	{
		map.put(id,entity);
		
	}
	
	public List<T> list() //����map�����е� T ����
	{
		List<T> list=new ArrayList();
		for(String st:map.keySet()) {
		list.add(map.get(st));
		}
		return list;
	}
	
	public  void delete(String id)  //ɾ��ָ������
	{
		
		System.out.println("ɾ��["+this.map.get(id)+"]�ɹ���");
		map.remove(id);
	}
	
	

}
