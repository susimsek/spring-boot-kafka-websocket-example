package com.spring.websocket.config;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import static com.spring.websocket.config.WebMvcConfig.MEDIA_TYPE_YAML;


final class YamlJacksonConverter extends AbstractJackson2HttpMessageConverter {
    YamlJacksonConverter() {
        super(new YAMLMapper(), MEDIA_TYPE_YAML);
    }
}