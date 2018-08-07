package com.wp;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by 浅笑 on 2018/7/27.
 */
public class ESHelper {
    public static final String indexName="myindexAPI";
    public static final String documentType="product";
    public static TransportClient client=null;
    static {
        Settings settings=Settings.builder().put("cluster.name","my-es").put("client.transport.sniff",true).build();
        try {
            client=new PreBuiltTransportClient(settings).addTransportAddress(new TransportAddress(InetAddress.getByName("192.168.153.4"),9300));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    public static TransportClient getClient(){
        return client;
    }
}
