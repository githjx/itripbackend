package cn.solr.dao;

import cn.solr.Hotel;
import org.apache.solr.client.solrj.SolrQuery;

import java.util.List;

public class HotelDao {

    private String url = "http://localhost:8080/solr/hotel";
    private BaseDao<Hotel> hotelBaseDao = new BaseDao<Hotel>(url);

    public List<Hotel> queryHotelList(String keyword) {
        SolrQuery query = new SolrQuery("keyword:" + keyword);
        List<Hotel> hotelList = hotelBaseDao.queryList(query, Hotel.class);
        for (Hotel hotel : hotelList) {
            System.out.println(hotel.getHotelName());
        }
        return hotelList;
    }

}
