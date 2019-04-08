package cn.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.io.IOException;
import java.util.List;

public class TestSolrj {
    //请求的URL：solr访问的url路径+core的名称
    public static String url="http://localhost:8080/solr/hotel";

    public static void main(String [] args) {
        //1、创建httpSolrClient对象
        HttpSolrClient httpSolrClient = new HttpSolrClient(url);
        //配置解析器
        httpSolrClient.setParser(new XMLResponseParser());
        //设置连接超时的时间
        httpSolrClient.setConnectionTimeout(500);
        //2、创建SolrQuery对象，设置查询参数。
        SolrQuery query = new SolrQuery();
        query.setQuery("address:北京");  //设置q的查询参数
        //query.addFilterQuery(); //设置fq的查询参数
        query.setSort("id", SolrQuery.ORDER.desc); //设置排序字段为id，降序排。
        query.setStart(0);  //从第一行数据开始显示
        query.setRows(5);   //每一页显示5行数据//3、接收返回的数据转化成为对象，queryResponse。
        //3、创建QueryResponse数据接收对象
        QueryResponse response = null;
        List<Hotel> hotelList = null;
        try {
            response = httpSolrClient.query(query);
            //4、接收数据，转化数据。
            hotelList = response.getBeans(Hotel.class);
            for (Hotel hotel : hotelList) {
                System.out.println(hotel.getHotelName() + "=======");
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
