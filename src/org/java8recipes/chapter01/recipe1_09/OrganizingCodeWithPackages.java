package org.java8recipes.chapter01.recipe1_09;

/**
 *
 * Problem: Your application consists of a set of Java classes, interfaces, and other types. You want to organize these source files to
 * make them easier to maintain and avoid potential class-naming conflicts.
 *
 * Solution: Create Java packages and place source files within them much like a filing system. Java packages can be used to
 * organize logical groups of source files within an application. Packages can help to organize code, reduce naming
 * conflicts among different classes and other Java type files, and provide access control. To create a package, simply
 * create a directory within the root of your application source folder and name it. Packages are usually nested
 * within each other and conform to a standard naming convention. For the purposes of this recipe, assume that the
 * organization is named Juneau and that the organization makes widgets. To organize all the code for the widget
 * application, create a group of nested packages conforming to the following directory structure:
 *
 * /org/juneau
 *
 * Any source files that are placed within a package must contain the package statement as the first line in the
 * source. The package statement lists the name of the package in which the source file is contained. For instance,
 * suppose that the main class for the widget application is named JuneauWidgets.java. To place this class into a
 * package named org.juneau, physically move the source file into a directory named juneau, which resides within
 * the org directory, which in turn resides within the root of the source folder for the application. The directory structure
 * should look like the following:
 *
 * /org/juneau/JuneauWidgets.java
 *
 * The source for JuneauWidgets.java is as follows:
 *
 * package org.juneau;
 * /

 /**
 * The main class for the Juneau Widgets application.
 * @author juneau
 * */
/*
    public class JuneauWidgets {
    public static void main(String[] args){
        System.out println("Welcome to my app!");
        }
    }
*/

/**
 * The first line in the source contains the package statement, which lists the name of the package that the source file
 * is located within. The entire package path is listed in the statement, and the names in the path are separated by dot
 *
 * An application can consist of any number of packages. If the widget application contains a few classes that
 * represent widget objects, they could be placed within the org.juneau.widget package. The application may have
 * interfaces that can be used to interact with the widget objects. In this case, a package named org.juneau.interfaces
 * may also exist to contain any such interfaces.
 *
 * How It Works
 *
 * Java packages are useful for organizing source files, controlling access to different classes, and ensuring that there are
 * no naming conflicts. Packages are represented by a series of physical directories on a file system, and they can contain
 * any number of Java source files. Each source file must contain a package statement before any other statements in the
 * file. This package statement lists the name of the package in which the source file resides. In the solution to this recipe,
 * the source included the following package statement:
 *
 * package org.juneau;
 *
 * This package statement indicates that the source file resides within a directory named juneau, and that directory
 * resides within another directory named org. Package-naming conventions can vary by company or organization.
 * However, it is important that words are in lowercase so they do not conflict with any Java class file names. Many
 * companies or organizations will use the reverse of their domain name for package naming. However, if a domain
 * name includes hyphens, underscores should be used instead.
 *
 * Packages are very useful for establishing levels of security as well as organization. By default, different classes
 * that reside within the same package have access to each other. If a source file resides within a different package than
 * another file that it needs to use, an import statement must be declared at the top of the source file (underneath the
 * package statement) to import that other file for use; otherwise, the fully qualified package.class name must be used
 * within the code. Classes may be imported separately, as demonstrated in the following import statement:
 *
 * import org.juneau.JuneauWidgets;
 *
 * However, it is often likely that all classes and type files that reside within a package need to be used. A single
 * import statement utilizing a wildcard character (*) can import all files within a named package as follows:
 *
 * import org.juneau.*;
 *
 * Although it is possible to import all files, it is not recommended unless absolutely necessary. As a matter of fact,
 * it is considered a poor programming practice to include many import statements that use the wildcard. Instead,
 * classes and type files should be imported individually.
 * Organizing classes within packages can prove to be very helpful. Suppose that the widget application that was
 * described in the solution to this recipe includes different Java classes for each different widget object. Each of the
 * widget classes could be grouped into a single package named org.juneau.widgets. Similarly, each of the widgets
 * could extend some Java type or interface. All such interfaces could be organized into a package named
 * org.juneau.interfaces.
 * Any substantial Java application will include packages. Any Java library or Application Programming Interface
 * (API) that you use includes packages. When you import classes or types from those libraries and APIs, you are really
 * importing packages.
 *
 * Created by ÊBelu on 11/2/2018.
 */
public class OrganizingCodeWithPackages {
}
