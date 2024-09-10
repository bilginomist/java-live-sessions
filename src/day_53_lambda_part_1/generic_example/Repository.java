package day_53_lambda_part_1.generic_example;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {

  private   List<T> list=new ArrayList<>();


  public void add(T item){

      list.add(item);
  }

  public List<T> getAll(){


      return list;
  }



}
