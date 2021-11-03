package com.toan.springcloud.couponservice.web;

import com.toan.springcloud.couponservice.model.Coupon;
import com.toan.springcloud.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/counpon-api")
public class CounponRestControler {
    @Autowired
    CouponRepository repository;

    @RequestMapping(value = "/coupon",method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon){
        return repository.save(coupon);
    }

    @RequestMapping(value = "/coupon/{code}",method = RequestMethod.GET)
    public Coupon getCoupont(@PathVariable("code") String code){
        return repository.findByCode(code);
    }
}
