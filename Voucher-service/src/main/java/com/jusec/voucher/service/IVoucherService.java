package com.jusec.voucher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jusec.dto.Result;
import com.jusec.pojo.Voucher;




/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
