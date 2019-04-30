package org.artemy63.service;

import lombok.extern.slf4j.Slf4j;
import org.artemy63.configuration.AnotherPropertiesConfiguration;
import org.artemy63.configuration.ExternalPropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ExternalPropertiesClientService {

    private final ExternalPropertiesConfiguration externalPropertiesConfiguration;
    private final AnotherPropertiesConfiguration anotherPropertiesConfiguration;

    @Autowired
    public ExternalPropertiesClientService(ExternalPropertiesConfiguration externalPropertiesConfiguration, AnotherPropertiesConfiguration anotherPropertiesConfiguration) {
        this.externalPropertiesConfiguration = externalPropertiesConfiguration;
        this.anotherPropertiesConfiguration = anotherPropertiesConfiguration;

        this.logProperties();
    }

//    package private for test
    private void logProperties() {
        log.info("externalPropertiesConfiguration::whoAmI = {}", this.externalPropertiesConfiguration.getWhoAmI());
        log.info("externalPropertiesConfiguration::propertyOne = {}", this.externalPropertiesConfiguration.getPropertyOne());
        log.info("externalPropertiesConfiguration::propertyTwo = {}", this.externalPropertiesConfiguration.getPropertyTwo());
        log.info("externalPropertiesConfiguration::propertyThree = {}", this.externalPropertiesConfiguration.getPropertyThree());
        log.info("externalPropertiesConfiguration::propertyFour = {}", this.externalPropertiesConfiguration.getPropertyFour());

        log.info("anotherPropertiesConfiguration::whoAmI = {}", this.anotherPropertiesConfiguration.getWhoAmI());
        log.info("anotherPropertiesConfiguration::propertyOne = {}", this.anotherPropertiesConfiguration.getPropertyOne());
        log.info("anotherPropertiesConfiguration::propertyTwo = {}", this.anotherPropertiesConfiguration.getPropertyTwo());
        log.info("anotherPropertiesConfiguration::propertyThree = {}", this.anotherPropertiesConfiguration.getPropertyThree());
        log.info("anotherPropertiesConfiguration::propertyFour = {}", this.anotherPropertiesConfiguration.getPropertyFour());
    }
}
