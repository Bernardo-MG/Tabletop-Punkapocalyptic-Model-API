# Tabletop's Punkapocalyptic Model API
API defining the model for the wargame Punkapocalyptic.

## Documentation
Documentation is always generated for the latest release:

- The [latest release documentation page][site-release].
- The [the latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [the latest snapshot Javadoc site][javadoc-develop].

The site sources come along the source code, so it is always possible to generate them using the Maven site command.

## Building the code
The application is coded in Java, using Maven to handle the project's configuration and tests.

### Prerequisites
The project has been tested on the following Java versions:
* JDK 7
* JDK 8
* OpenJDK 7

All other dependencies are handled through Maven, and noted in the included POM file.

### Installing

Thanks to Maven, the project is easy to install, by just using the following command:

```mvn install```

But the recommended way to install the project is by using the code repositories, where the releases and snapshots are stored. The way to set this is detailed on the documentation page.

## Collaborate

The project is still under ongoing development, and any help will be well received.

There are two ways to help: reporting errors and asking for extensions through the issues management, or forking the repository and extending the project.

### Issues management
Issues are managed at the GitHub [project issues page][issues].

Everybody is allowed to report bugs or ask for features.

### Getting the code
The latest version of the code can be found at the [GitHub project page][scm].

Feel free to fork it, and share the changes.

## License
The project is released under the [Apache 2.0 License][license].

[issues]: https://github.com/bernardo-mg/tabletop-punkapocalyptic-model-api/issues
[javadoc-develop]: http://docs.wandrell.com/development/maven/tabletop-punkapocalyptic-model-api/apidocs
[javadoc-release]: http://docs.wandrell.com/maven/tabletop-punkapocalyptic-model-api/apidocs
[license]: http://www.apache.org/licenses/LICENSE-2.0
[scm]: http://github.com/bernardo-mg/tabletop-punkapocalyptic-model-api
[site-develop]: http://docs.wandrell.com/development/maven/tabletop-punkapocalyptic-model-api
[site-release]: http://docs.wandrell.com/maven/tabletop-punkapocalyptic-model-api