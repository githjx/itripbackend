package cn.itrip.dao.image;

import cn.itrip.beans.pojo.ItripImage;
import cn.itrip.beans.vo.ItripImageVO;

import java.util.List;
import java.util.Map;

public interface ItripImageMapper {

    //根据targetId查询酒店图片
    public List<ItripImageVO> getItripImageListByMap(Map<String, Object> param)throws Exception;

    public Integer insertItripImage(ItripImage itripImage)throws Exception;
}
