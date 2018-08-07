package com.wp;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 浅笑 on 2018/7/30.
 */
public class AddData {
    //添加数据
    @Test
    public void addData(){
      //  Book book=new Book(1,"预约死亡","毕淑敏",50,new Date());
        Book book=new Book(1,"预约死亡","毕淑敏",50,new Date());
        Map<String,Book> map=new HashMap<String,Book>();
        map.put(book.getBookid().toString(),book);
        IndexResponse response= ESHelper.getClient().prepareIndex(
                        ESHelper.indexName,ESHelper.documentType).
                setId(book.getBookid().toString()).setSource(map).get();
        System.out.println(response.getResult());
    }

    //获取数据
   @Test
    public void getData(){
       GetResponse response=ESHelper.getClient().prepareGet(
               ESHelper.indexName,ESHelper.documentType,"1").get();
       System.out.println(response.getSourceAsString());
   }
}
