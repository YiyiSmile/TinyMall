package indi.tom.tinymall.member.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import indi.tom.tinymall.member.entity.MemberEntity;
import indi.tom.tinymall.member.feign.CouponService;
import indi.tom.tinymall.member.service.MemberService;
import indi.tom.common.utils.PageUtils;
import indi.tom.common.utils.R;



/**
 * 会员
 *
 * @author tom098
 * @email tom098@gmail.com
 * @date 2020-12-26 14:23:45
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    
    @Autowired
    private CouponService couponService;
    
    @RequestMapping("/coupon/list")
    public HashMap<String,String> couponList() {
    	R coupons = couponService.memberCoupons();
    	HashMap<String,String> hashMap = new HashMap<>();
    	hashMap.put("coupon", coupons.get("coupons").toString());
    	return hashMap;
    	
		/*
		 * MemberEntity memberEntity = new MemberEntity();
		 * memberEntity.setUsername("张三");
		 * 
		 * return R.ok().put("member", memberEntity).put("coupons", coupons);
		 */
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
