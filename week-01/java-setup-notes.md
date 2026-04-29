# Java Development Environment Setup

## Tools Installed

| Tool | Version |
|------|---------|
| Oracle JDK | 17.0.12 |
| IntelliJ IDEA Community Edition | Latest |

## Key Concepts

| Acronym | Meaning | Purpose |
|---------|---------|---------|
| JDK | Java Development Kit | JRE + JVM + Dev Tools |
| JRE | Java Runtime Environment | Just runs Java (end users) |
| JVM | Java Virtual Machine | Executes bytecode |
| JAR | Java Archive | Packaged Java application |

| Tool | Purpose |
|------|---------|
| `javac` | Compiler (write → bytecode) |
| `java` | Runner (bytecode → output) |
| Maven/Gradle | Build tools |

## The Flow

```
Write .java → javac → .class (bytecode) → java/JVM → Output
```

## Key Commands

| Command | Purpose |
|---------|---------|
| `java -version` | Check Java runtime version |
| `javac -version` | Check compiler version |

## Edition Types

- **Java SE** = Standard Edition (what we use)
- **Jakarta EE** = Enterprise Edition (builds on top of SE)

## Important Configuration

⚠️ IntelliJ must be configured to use JDK 17, not the bundled JDK

## Summary

> "JDK lets you write, compile and run Java. IntelliJ makes you productive. JAR files let you share your app anywhere Java is installed."