package com.example.BANK_OF_GENNADZIY.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCache {

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("test");
    }
}

