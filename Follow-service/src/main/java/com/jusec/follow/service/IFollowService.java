package com.jusec.follow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jusec.follow.entity.Follow;
import com.jusec.utils.dto.Result;


/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);

}
