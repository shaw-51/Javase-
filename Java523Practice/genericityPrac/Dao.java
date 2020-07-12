package genericityPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dao <T>{
	Map<String,T> map=new HashMap<>();
	
	public void save(String id,T entity) //保存T乐行的对象到map集合中
	{
		map.put(id,entity);
	}
	
	public T get(String id)  //从map中获取id对应的对象
	{
		return map.get(id);
	}
	
	public  void update(String id,T entity) //替换map中的key为id的内容 
	{
		map.put(id,entity);
		
	}
	
	public List<T> list() //返回map中所有的 T 对象
	{
		List<T> list=new ArrayList();
		for(String st:map.keySet()) {
		list.add(map.get(st));
		}
		return list;
	}
	
	public  void delete(String id)  //删除指定对象
	{
		
		System.out.println("删除["+this.map.get(id)+"]成功！");
		map.remove(id);
	}
	
	

}
