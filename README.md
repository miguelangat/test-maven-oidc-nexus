# Nexus OIDC Test Project

This is a test project demonstrating Maven artifact deployment to Nexus Repository Manager using GitHub Actions OIDC tokens.

## Features

- ✅ No credentials stored in repository
- ✅ Automatic token exchange using GitHub OIDC
- ✅ Secure, short-lived access tokens
- ✅ Complete CI/CD pipeline with GitHub Actions

## How It Works

1. GitHub Actions workflow requests OIDC token from GitHub
2. Token is exchanged for Nexus access token via RFC 8693 token exchange
3. Maven deployment uses Bearer token authentication
4. Artifacts deployed to Nexus without any stored credentials

## Project Structure

```
.
├── .github/
│   └── workflows/
│       └── maven-deploy.yml    # GitHub Actions workflow
├── src/
│   └── main/
│       └── java/
│           └── com/sonatype/test/
│               └── HelloNexus.java
├── pom.xml
└── README.md
```

## Testing Locally

```bash
# Build the project
mvn clean verify

# To deploy (requires manual token setup)
mvn deploy
```

## GitHub Actions Workflow

The workflow automatically:
- Builds on every push and PR
- Deploys to Nexus on pushes to main/master (not PRs)
- Uses GitHub OIDC for authentication
- Verifies successful deployment

## Requirements

- Java 21+
- Maven 3.9+
- Nexus Repository Manager Pro Edition with OIDC Token Plugin
- GitHub repository with Actions enabled

# Testing with correct claims
