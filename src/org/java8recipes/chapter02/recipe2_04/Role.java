package org.java8recipes.chapter02.recipe2_04;

import java.lang.annotation.Repeatable;

/**
 *
 * Applying the Same Annotation Multiple Times in a Declaration or Type Use
 *
 * Problem: You want to apply the same annotation more than once to a specified declaration or type.
 *
 * Solution: The same annotation can be applied to a declaration or type more than once, given that each annotation is marked
 * as @Repeatable. In the following code, the @Repeatable annotation is used to develop an annotation that can be
 * repeated, rather than grouped together as in previous releases of Java. In this situation, an annotation named Role is
 * being created, and it will be used to signify a role for an annotated class or method.
 *
 * The Role annotation uses the Roles annotation when used more than one time on a specification. The Roles
 * annotation simply generates an array of Role annotations. The code for Roles is as follows:
 *
 * public @interface Roles {
 *      Role[] value();
 *  }
 *
 *  Now, if you want to assign two different roles to a particular method, you can use the following syntax:
 *
 *  @Role(name="AUTHOR")
 *  @Role(name="REVIEWER")
 *  public void assignWork(){
 *  ...
 *  }
 *
 *  How It Works
 *
 *  Repeating annotations are a handy new feature of Java 8, as they allow you to assign multiple versions of an
 *  annotation to a single field, method, or class. To perform the same assignment in previous releases, you had to
 *  enclose the two @Role annotations within a @Roles group, as follows:
 *
 *  @Roles({
 *      @Role(name="AUTHOR"),
 *      @Role(name="REVIEWER")
 * )}
 *
 * To develop a repeatable annotation, an enclosing container annotation must be created with a field that is used
 * to hold multiple instances of the annotation. In the recipe example, the Roles annotation is used for holding multiple
 * Role annotations in a repeatable situation. Each of the Role annotations is added to the Role[] array that is declared
 * within the Roles annotation.
 *

 * Created by ÊBelu on 17/2/2018.
 */

@Repeatable(value=Roles.class)
public @interface Role {
    String name() default "AUTHOR";

}

