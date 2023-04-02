package com.jusec.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jusec.user.dto.LoginFormDTO;
import com.jusec.user.entity.User;
import com.jusec.utils.dto.Result;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
