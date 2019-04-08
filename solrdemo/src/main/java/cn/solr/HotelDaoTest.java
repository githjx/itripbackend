package cn.solr;

import cn.solr.dao.HotelDao;
import org.junit.Test;

public class HotelDaoTest {
    @Test
    public void testQueryHotelList() {
        HotelDao hotelDao = new HotelDao();
        hotelDao.queryHotelList("北京");
    }

}
