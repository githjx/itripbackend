package cn.itrip.auth.service;

import cn.itrip.beans.pojo.ItripUser;

public interface TokenService {
    /**
     * 按指定的格式生成Token
     * @param userAgent 用户的唯一标识
     * @param user
     * @return
     */
    public String generateToken(String userAgent, ItripUser user);

    /**
     * 将Token保存至Redis缓存数据库中
     * @param token Token对象
     * @param user
     */
    public void save(String token,ItripUser user);

    /**
     * 验证Token
     * @param userAgent 为了保证每一个用户都使用同一个设备进行登录(访问服务器的客户端是唯一的)。
     * @param token token字符串
     * @return 返回验证后的结果，true表示验证通过。
     * userAget、token都是登录成功后保存客户端的请求头文件中——header
     */
    public boolean validate(String userAgent,String token);

    //退出
    public void delete(String token);
}
