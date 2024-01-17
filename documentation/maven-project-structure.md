## Layout of Maven projects

```
MavenProject
    ├───pom.xml
    └───src
        ├───main
        │   ├───java
        │   │   └───SourceCodeFile.java
        │   ├───groovy
        │   │   └───SourceCodeFile.groovy
        │   └───resources
        │       └───picture.png
        └───test
            ├───java
            │   └───TestSourceCode.java
            └───resources
                └───test-picture.png
```

## Layout of Maven dependency file

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.quadient.internship.artur</groupId>
    <artifactId>internship-artur-parent</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <property.name>the value of the property</property.name>
    </properties>

    <dependencies>
        <dependency>
            <groupId>co.transcurity</groupId>
            <artifactId>peparser-core</artifactId>
            <version>5.10.1</version>
        </dependency>
        <dependency>
            ...
            <version>${property.name}</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.7.0</version>
                <configuration>
                    <source>${maven.compiler.source}</source>
                    <target>${maven.compiler.target}</target>
                    <release>${maven.compiler.release}</release>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

```
