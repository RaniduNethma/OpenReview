package com.openreview.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration properties for GitHub integration.
 */

@Configuration
@ConfigurationProperties(prefix = "app.github")
@Data
public class GitHubProperties {

    private String webhookSecret;
    private String token;
    private String appId;
    private String privateKey;
    private String installationId;
    private Api api = new Api();

    @Data
    public static class Api{
        private String baseUrl = "https://api.github.com";
        private int timeout = 30000;
        private int maxRetries = 3;
    }
}
