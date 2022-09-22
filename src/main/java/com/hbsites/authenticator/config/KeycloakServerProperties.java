package com.hbsites.authenticator.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
    String contextPath = "/auth";
    String realmImportFile = "hbsites-realm.json";
    AdminUser adminUser = new AdminUser();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AdminUser {
        String username = "admin";
        String password = "admin";
    }
}
