package com.jusec.voucher.dto;

/**
 * @ClassName MqDTO
 * @description:
 * @Author: Mo
 * @Date: 2023/03/27 22:29
 * @Version 17.0.1
 **/

public class MqDTO {
    private Long id;
    private Long userId;
    private Long voucherId;

    public MqDTO() {
    }

    public MqDTO(Long id, Long userId, Long voucherId) {
        this.id = id;
        this.userId = userId;
        this.voucherId = voucherId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }
}
