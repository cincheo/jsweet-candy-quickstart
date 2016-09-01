
## Description

This project is a JSweet Maven project that packages as a JSweet candy, so that you can use it as a candy in other JSweet projects. 

For the sake of example, this project defines a simple function ``JSweetCandyAPI.isPrime(n)``, which tells if ``n`` is a prime number. When the candy has been packaged and installed, this function be used by other JSweet projects.

You can use it as a template to create your own JSweet candies (i.e. JavaScript librairies compiled from Java). Note that JSweet candies can be used by JSweet programs, but they can also be used from third-party TypeScript and JavaScript programs, like a regular JavaScript library. Just use the output ``bundle.d.ts`` and ``bundle.js`` files.

## How to use

You first need to install the JSweet candy in your local Maven repository:

```
> mvn install
```

Then you can use it from another project. For example, clone the [jsweet-quickstart](https://github.com/cincheo/jsweet-quickstart) project and add the following dependency to the ``pom.xml``:

```
		<dependency>
			<groupId>myCandyGroup</groupId>
			<artifactId>myCandy</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
```

Now, edit the ``QuickStart.java`` class and in the ``main`` function, add something like:

```
System.out.println("isPrime: "+JSweetCandyAPI.isPrime(3));
```

Generate again the source and open the ``index.html`` as explained in the [jsweet-quickstart](https://github.com/cincheo/jsweet-quickstart) project. You should see the log ``isPrime: true`` showing in your browser's console.
