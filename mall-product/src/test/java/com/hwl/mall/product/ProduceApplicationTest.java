package com.hwl.mall.product;

import com.hwl.mall.product.entity.BrandEntity;
import com.hwl.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author lwh
 * @date 2024-09-11 22:39:39
 * @describe -
 */
@SpringBootTest
class ProduceApplicationTest {

    @Autowired
    private BrandService brandService;

    @Test
    void brandInsertTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("小米");
        brandEntity.setDescript("小米品牌");
        brandService.save(brandEntity);
    }
}