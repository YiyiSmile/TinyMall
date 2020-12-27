package indi.tom.tinymall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import indi.tom.common.utils.R;

@FeignClient("tinymall-coupon")
public interface CouponService {
	
	@RequestMapping("/coupon/coupon/member/list")
	public R memberCoupons();
}
