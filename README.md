<div align="center">

  <h1>décence</h1>

<a href="https://travis-ci.org/manparvesh/politeness"><img src="https://img.shields.io/travis/manparvesh/politeness.svg?style=flat-square" alt="Build status"></a> <a href="https://manparvesh.mit-license.org/"><img src="https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square" alt="License"></a> 

  <p>
    [WIP] Programming language based on decency and good manners, implemented on the JVM
  </p>
  
  <br>

</div>

See [specification](specification.md) for more details.

## Requirements

* JDK version 8

### Compile and run tests

```
./gradlew test
```

### IDE Setup

#### Intellij

```
./gradlew cleanIdea idea
```

#### Eclipse

```
./gradlew cleanEclipse eclipse
```

### Run the application
```
> ./gradlew shadowJar
> java -jar build/libs/politeness-all.jar [options] [command] [command options]
```

