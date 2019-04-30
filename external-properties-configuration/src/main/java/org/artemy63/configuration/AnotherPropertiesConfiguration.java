package org.artemy63.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "another-config-properties")
@Data
public class AnotherPropertiesConfiguration {

    private String whoAmI;
    private String propertyOne;
    private String propertyTwo;
    private String propertyThree;
    private String propertyFour;
}
