package cn.itrip.service.image;

import cn.itrip.beans.vo.ItripImageVO;

import java.util.List;
import java.util.Map;

public interface ItripImageService {
    //根据targetId查询评论照片
    public List<ItripImageVO> getItripImageListByMap(Map<String, Object> param)throws Exception;
}
