package javase523ClassWork;

public interface Function <T>{
    //添加
    void   add(T  t);
  
    //删除
    boolean  delete(T  t);
  
    //查询
    boolean    queryByT(T   t);
  
    //修改
    T  update (T  t,T a);  //将t用a替换


}
