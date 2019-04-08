package cn.itrip.service.hotelroom;

import cn.itrip.beans.pojo.ItripHotelRoom;
import cn.itrip.beans.vo.hotelroom.ItripHotelRoomVO;

import java.util.List;
import java.util.Map;

/**
 * 酒店业务
 */
public interface ItripHotelRoomService {
    public List<ItripHotelRoomVO> getItripHotelRoomListByMap(Map<String, Object> param)throws Exception;

    //预生成订单信息
    public ItripHotelRoom getItripHotelRoomById(Long id)throws Exception;
}
