package com.tkn.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tkn.mybatisplus.product.Product;
import com.tkn.mybatisplus.service.ProductService;
import com.tkn.mybatisplus.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author tkn
* @description 针对表【product】的数据库操作Service实现
* @createDate 2022-05-22 20:20:42
*/
@DS("slave_1")
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




