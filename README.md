
## Description

This project is a JSweet Maven project that packages as a JSweet candy, so that you can use it in various contexts:

- as a candy in other JSweet projects (just include the dependency in your Maven ``pom.xml``) 
- as a regular Java artifact in regular Java projects, since the implementation does not use any JavaScript APIs (just include the dependency in your Maven ``pom.xml``)
- as a JavaScript library from a TypeScript project (use ``dist/myCandy.d.ts``)
- as a JavaScript library from a JavaScript project (use ``dist/myCandy.js``)

For the sake of example, this project defines a simple function ``myCandy.API.isPrime(n)``, which tells if ``n`` is a prime number.

This project can be used as a template to create your own JSweet candies. 

## How to install the candy

Get the project:

```bash
> git clone https://github.com/cincheo/jsweet-candy-quickstart myproject
> cd myproject
```

Install the JSweet candy in your local Maven repository:

```bash
> mvn install
```

Note: if you want to publish the candy in a remote Maven repository, please refer to existing documentation on that particular topic.

## Use from a Java/JSweet project

For example, clone the [jsweet-quickstart](https://github.com/cincheo/jsweet-quickstart) project and add the following dependency to the ``pom.xml``:

```xml
<dependency>
	<groupId>myCandyGroup</groupId>
	<artifactId>myCandy</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

Now, edit the ``QuickStart.java`` class and in the ``main`` function, add something like:

```java
System.out.println("isPrime: "+myCandy.API.isPrime(3));
```

Note that you can launch with Java and it will work if your project does not use any JavaScript API.

To run with JavaScript in a browser, the ``index.html`` file must include the JavaScript bundle. Add the following line in the HTML header:

```html
<script type="text/javascript" src="myCandy-0.0.1-SNAPSHOT/bundle.js"></script>
```

*Warning: the ``myCandy-0.0.1-SNAPSHOT/bundle.js`` gets extracted from the jar by JSweet, so it will not be available until you include the candy in your dependencies and run ``mvn generate-sources``. Note that the extract location depends on the ``candiesJsOut`` option.*

Generate again the source and open the ``index.html`` as explained in the [jsweet-quickstart](https://github.com/cincheo/jsweet-quickstart) project. You should see the log ``isPrime: true`` showing in your browser's console.

## Use from a TypeScript/JavaScript project

When installing the candy, Maven also puts the ``myCandy.d.ts`` and ``myCandy.js`` bundles in the ``dist`` directory.

From a TypeScript project, use the ``myCandy.d.ts`` to compile and include the ``myCandy.js`` bundle in your web page.

From a JavaScript project, include the ``myCandy.js`` bundle in your web page.

## How does it work?

TBD
