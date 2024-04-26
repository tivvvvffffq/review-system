package com.nxj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nxj.dto.Result;
import com.nxj.entity.Voucher;

public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
