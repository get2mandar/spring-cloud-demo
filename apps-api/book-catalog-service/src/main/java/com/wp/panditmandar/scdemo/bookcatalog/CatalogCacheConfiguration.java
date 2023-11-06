package com.wp.panditmandar.scdemo.bookcatalog;

import static java.util.Arrays.asList;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.cache.CacheBuilder;

@Configuration
@EnableCaching
public class CatalogCacheConfiguration {

    @Bean
    CacheManager cacheManager() {
		ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager() {
			@Override
			protected Cache createConcurrentMapCache(final String name) {
				return new ConcurrentMapCache(name, CacheBuilder.newBuilder().expireAfterWrite(30, TimeUnit.MINUTES)
						.maximumSize(100).build().asMap(), false);
			}
		};

		cacheManager.setCacheNames(asList("books", "authors", "publishers"));
		return cacheManager;
	}
}