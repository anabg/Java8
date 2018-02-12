package org.java8recipes.chapter01.recipe1_10;

/**
 * Created by ÊAnita on 12/2/2018.
 *
 * Problem: You want to execute a Java program, or include an external Java library in the application you are executing.
 *
 * Solution: Set the CLASSPATH variable equal to the directory location of the user-defined Java classes or Java Archive (JAR) files
 * that you need to have access to for executing your application. Letís say that you have a directory named JAVA_DEV
 * located at the root of your OS drive, and all the files your applications needs to access are located in this directory.
 * If this is the case, then you would execute a command such as the following:
 *
 * set CLASSPATH=C:\JAVA_DEV\some-jar.jar
 *
 * export CLASSPATH=/JAVA_DEV/some-jar.jar
 *
 * Alternately, the javac command provides an option for specifying the location of resources that need to be loaded
 * for an application. On all platforms, setting the CLASSPATH using this technique can be done via the -classpath option
 * as follows:
 *
 * javac ñclasspath /JAVA_DEV/some-jar.jar
 *
 * Of course, on Microsoft Windows machines the file path will use the backslash (\) instead.
 *
 *  NOTE: he javac ñcp option may be used, rather than specifying the ñclasspath option.
 *
 *  How It Works:
 *
 *  Java implements the concept of a class path. This is a directory search path that you can specify system-wide using the
 *  CLASSPATH environment variable. You can also specify the class path for a specific invocation of the JVM via the java
 *  commandís -classpath option. (See Recipe 1-3 for an example.)
 *  When executing Java programs, the JVM finds and loads classes as needed using the following search order:
 *  1. The classes that are fundamental to the Java platform and are contained in the Java installation directory.
 *  2. Any packages or JAR files that are located within the extension directory of the JDK.
 *  3. Packages, classes, JAR files, and libraries that are loaded somewhere on the specified  class path.
 *
 *  You may need to access more than one directory or JAR file for an application. This could be the case if your
 *  dependencies are located in more than one location. To do so, simply use the delimiter for your operating system
 *  (; or :) as a separator between the locations specified by the CLASSPATH variable. Following is an example
 *  of specifying multiple JAR files in the CLASSPATH environment variable on Unix and Linux systems:
 *
 *  export CLASSPATH=/JAVA_DEV/some-jar.jar:/JAVA_LIB/myjar.jar
 *
 *  Alternatively, you can specify the class path via a command-line option:
 *
 *  javac ñclasspath /JAVA_DEV/some-jar.jar:/JAVA_LIB/myjar.jar
 *
 *  When loading the resources for a Java application, the JVM loads all the classes and packages that are specified
 *  in the first location, followed by the second, and so on. This is important because the order of loading may make a
 *  difference in some instances.
 *
 *  NOTE: JAR files are used to package applications and Java libraries into a distributable format. If you have not
 *  packaged your application in that manner, you may simply specify the directory or directories in which your .class
 *  files reside
 *
 *  Sometimes youíll want to include all JAR files within a specified directory. Do that by specifying the wildcard
 *  character (*) after the directory containing the files. For example:
 *
 *  javac ñclasspath /JAVA_DEV/*:/JAVA_LIB/myjar.jar
 *
 *  Specifying a wildcard will tell the JVM that it should be loading JAR files only. It will not load class files that are
 *  located in a directory specified with the wildcard character. Youíll need to specify a separate path entry for the same
 *  directory if you also want the class files. For example:
 *
 *  javac ñclasspath /JAVA_DEV/*:/JAVA_DEV
 *
 *  Subdirectories within the class path will not be searched. In order to load files that are contained within
 *  subdirectories, those subdirectories and/or files must be explicitly listed in the class path. However, Java packages
 *  that are equivalent to the subdirectory structure will be loaded. Therefore, any Java classes that reside within a Java
 *  package that is equivalent to the subdirectory structure will be loaded.
 *
 *  Note: It is a good idea to organize your code; it is also good to organize where you place your code on the computer.
 *  A good practice is to place all your Java projects within the same directory; it can become your workspace. Place all the
 *  Java libraries that are contained in JAR files into the same directory for easier management
 */
public class ConfiguringTheCLASSPATH {
}
