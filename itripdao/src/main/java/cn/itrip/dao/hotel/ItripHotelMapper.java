package cn.itrip.dao.hotel;

import cn.itrip.beans.pojo.ItripHotel;
import cn.itrip.beans.pojo.ItripLabelDic;
import cn.itrip.beans.vo.hotel.ItripSearchFacilitiesHotelVO;
import cn.itrip.beans.vo.hotel.ItripSearchPolicyHotelVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//根据酒店id查询酒店设施
public interface ItripHotelMapper {
    // 根据酒店id查询酒店设施
    public ItripSearchFacilitiesHotelVO getItripHotelFacilitiesById(@Param(value = "id") Long id) throws Exception;


    //根据酒店id查询酒店政策 -add by donghai
    public ItripSearchPolicyHotelVO queryHotelPolicy(@Param(value = "id") Long id) throws Exception;


    public ItripHotel getItripHotelById(@Param(value = "id") Long id)throws Exception;

    /**
     *  根据酒店ID获取特色
     * @param id 酒店ID
     */
    public List<ItripLabelDic> getHotelFeatureByHotelId(@Param(value = "id") Long id)throws Exception;

}
