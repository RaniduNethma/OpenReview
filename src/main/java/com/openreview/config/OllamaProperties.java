package com.openreview.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration properties for Ollama LLM integration.
 */

@Configuration
@ConfigurationProperties(prefix = "app.ollama")
@Data
public class OllamaProperties {

    private String baseUrl = "http://localhost:11434";
    private String model = "deepseek-coder:6.7b";
    private int timeout = 120000;
    private int maxTokens = 2048;
    private double temperature = 0.2;
    private double topP = 0.9;
    private int topK = 40;
    private int maxRetries = 3;
    private int retryDelay = 1000;
}
