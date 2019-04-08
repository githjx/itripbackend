package cn.itrip.dao.auth;

import cn.itrip.beans.pojo.ItripUser;

import java.util.List;
import java.util.Map;

public interface ItripUserMapper {
    public List<ItripUser> getItripUserListByMap(Map<String,Object> param);

    //邮箱注册
    public Integer insertItripUser(ItripUser itripUser)throws Exception;

    //修改用户的方法
    public Integer updateItripUser(ItripUser itripUser)throws Exception;
}
