package javase523ClassWork;

public interface Function <T>{
    //���
    void   add(T  t);
  
    //ɾ��
    boolean  delete(T  t);
  
    //��ѯ
    boolean    queryByT(T   t);
  
    //�޸�
    T  update (T  t,T a);  //��t��a�滻


}
