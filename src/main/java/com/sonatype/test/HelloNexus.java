package com.sonatype.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple test class for Maven deployment with Nexus OIDC tokens.
 */
public class HelloNexus {
    private static final Logger logger = LoggerFactory.getLogger(HelloNexus.class);

    public static void main(String[] args) {
        logger.info("Hello from Nexus OIDC Test Project!");
        System.out.println("This artifact was deployed using GitHub Actions OIDC tokens!");
        System.out.println("No credentials were stored in the repository.");
    }

    public String getMessage() {
        return "Deployed with OIDC tokens - secure and simple!";
    }
}
