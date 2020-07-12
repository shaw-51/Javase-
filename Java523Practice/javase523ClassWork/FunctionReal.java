package javase523ClassWork;

import java.util.ArrayList;
import java.util.List;

public class FunctionReal<T> implements Function<T> {
	List<T>list =new ArrayList<>();

	@Override
	public void add(T t) {
		list.add(t);
	}

	@Override
	public boolean delete(T t) {
		if(!this.list.contains(t)) {
			System.out.println("不含所删除的元素，删除失败！");
			return false;
		}
		else {
			this.list.remove(t);
			return true;
		}		
	}

	@Override
	public boolean queryByT(T t) {
		if(this.list.contains(t)) {
			System.out.println("查询成功！");
			return true;
		}
		return false;
	}

	@Override
	public T update(T t,T a) {
		if(this.queryByT(t)) {
			replaceAll(this.list,t,a);
			System.out.println(list.toArray());
		}
		return null;
	}

	private List<T> replaceAll(List<T> list2, T t, T a) {
		int i=list.indexOf(t);
		list.add(i,a);
		return list;
	}
	

}
