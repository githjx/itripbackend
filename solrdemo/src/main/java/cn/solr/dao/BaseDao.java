package cn.solr.dao;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.io.IOException;
import java.util.List;

//Solrj的工具类
public class BaseDao<T> {

    private HttpSolrClient httpSolrClient = null;
    private QueryResponse response = null;
    public BaseDao(String url) {
        //1、创建httpSolrClient
        httpSolrClient = new HttpSolrClient(url);
        //配置解析器
        httpSolrClient.setParser(new XMLResponseParser());
        //设置连接超时的时间
        httpSolrClient.setConnectionTimeout(500);
    }

    public List<T> queryList(SolrQuery query, Class clazz) {
        List<T> list = null;
        try {
            //3、创建QueryResponse数据接收对象
            response = httpSolrClient.query(query);
            //4、接收数据，转化数据。
            list = response.getBeans(clazz);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
