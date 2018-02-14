package org.java8recipes.chapter02.recipe2_01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * Problem: You want to write an action for a JavaFX button without generating an anonymous inner class.
 * Solution: Utiliez a lambda expression to incorporate the action functionality using compact, inline syntax. The following JavaFX
 * application contains a button that utiliezs a lambda expression to encapsulate the functionality of the button, rather
 * than an anonymous inner class.
 *
 * is JavaFX application produces a simple application that looks like Figure
 * 2-1. When you press the button, the ActionListener, which is a lambda expression, is invoked.
 *
 * ->), and a body. The following model represents the structure of a lambda expression:
 *
 * (argument list) -> { body }
 *
 * The argument list for a lambda expression can include zero or more arguments. If there are no arguments,
 * then an empty set of parentheses can be used. If there is only one argument, then no parentheses are required. Each
 * argument in the list can include an optional type specification. If the type of the argument is not specified, then the
 * type is derived from the current context.
 * Lambda expressions are built on functional interfaces, which are simply Java interfaces containing a single
 * abstract method. Simply put, the lambda expression itself is an anonymous inner class that implements a functional
 * interface, which can then be assigned to a variable and invoked. This recipe is merely a primer for lambda
 * expressions; to learn more about them, refer to Chapter 6.

 * Created by æBelu on 12/2/2017.
 */

public class Recipe_02_01 extends Application {

    final Group root = new Group();

    /**
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Hello Lambda");
        Scene scene = new Scene(root, 300, 250);
        Button btn = new Button();
        Label message = new Label();
        btn.setLayoutX(60);
        btn.setLayoutY(80);
        btn.setText("Invoke Lambda Expression");
        btn.setOnAction((event) -> {
            message.setText("Lambda expression invoked!");
        });
        root.getChildren().add(btn);
        message.setLayoutX(300 / 2 - 90);
        message.setLayoutY(30);
        root.getChildren().add(message);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
