package com.aoyang.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aoyang.shortlink.admin.dao.entity.UserDO;
import com.aoyang.shortlink.admin.dto.req.UserLoginReqDTO;
import com.aoyang.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.aoyang.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.aoyang.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.aoyang.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {
    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     *
     * @param username 用户名
     * @return 用户名存在返回 True，不存在返回 False
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     * @param requestParam
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登陆
     * @param requestParam 用户登陆请求参数
     * @return 用户登陆返回参数
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     *
     * @param username 用户名
     * @param token    用户登录 Token
     * @return 用户是否登录标识
     */
    Boolean checkLogin(String username, String token);

    /**
     * 退出登录
     *
     * @param username 用户名
     * @param token    用户登录 Token
     */
    void logout(String username, String token);
}