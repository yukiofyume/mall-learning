package com.hwl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwl.mall.common.util.PageUtils;
import com.hwl.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author lwh
 * @email leespring1220@gmail.com
 * @date 2024-09-11 21:58:31
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

