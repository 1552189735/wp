package com.wp;

import com.wp.ESHelper;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.junit.Test;

/**
 * Created by 浅笑 on 2018/7/27.
 */
public class CreateIndex {
    @Test
    public void test(){
        CreateIndexResponse response= ESHelper.getClient().admin().indices().prepareCreate(ESHelper.indexName).execute().actionGet();
        if(response.isAcknowledged()){
            System.out.println("OK");
        }else {
            System.out.println("no");
        }
    }
}
