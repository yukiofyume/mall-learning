package com.hwl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwl.mall.common.util.PageUtils;
import com.hwl.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author lwh
 * @email leespring1220@gmail.com
 * @date 2024-09-11 21:58:31
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

