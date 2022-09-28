package com.mes.timer.task;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

import java.util.Properties;

public class YmlPropertySourceFactory extends DefaultPropertySourceFactory {
    @NotNull
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource encodedResource) {
        Resource resource = encodedResource.getResource();
        if (!resource.exists()) {
            throw new RuntimeException("file not exist");
        }
        if (resource.getFilename() == null || !resource.getFilename().endsWith(".yml")) {
            throw new RuntimeException("file is not yml");
        }
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources(resource);
        factory.afterPropertiesSet();
        Properties properties = factory.getObject();
        if (properties == null) {
            throw new RuntimeException("file properties is null");
        }
        String sourceName = name == null ? resource.getFilename() : name;
        return new PropertiesPropertySource(sourceName, properties);
    }
}

