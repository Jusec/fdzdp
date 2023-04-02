package com.jusec.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.jusec.dto.Result;
import com.jusec.pojo.Shop;



/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
