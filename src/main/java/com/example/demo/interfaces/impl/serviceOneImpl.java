package com.example.demo.interfaces.impl;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import com.example.demo.interfaces.selectOne;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("serviceOneImpl")
@CacheConfig(cacheNames = {"serviceOneImplCache"})
public class serviceOneImpl implements selectOne {

    @Resource(name = "selectOne")
    private  selectOne selectOne;

    @Override
    @Cacheable(key = "'fredis'")
    public List<String> getall() {
        return selectOne.getall();
    }
}
