package com.jusec.voucher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jusec.utils.dto.Result;
import com.jusec.voucher.entity.VoucherOrder;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);
    void createVoucherOrder(VoucherOrder voucherOrder) ;
}
