package org.java8recipes.chapter02.recipe2_9;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Embedding Swing in JavaFX
 * <p>
 * Problem: You want to embed some standard Java Swing code into a JavaFX application
 * <p>
 * Solution: Use a SwingNode to embed the Swing content into the application. In the following simple JavaFX application,
 * a front-end is created with JavaFX, and a Swing JLabel component is embedded in it.
 * <p>
 *
 * How It Works
 *
 * Swing was once the preferred means for developing graphical user interfaces and desktop applications for the Java
 * platform. Swing is part of the Java Foundation Classes (JFC), a grouping of features for developing graphical user
 * interfaces. The Swing API consists of a multitude of components (JComponent classes), event handling classes, look
 * and feel classes, and so forth. The API is quite capable of developing highly sophisticated applications. However, the
 * API is so immense that it can be difficult to learn, and technology has evolved in a way such that many of the Swing
 * classes and features have become outdated. That being said, JavaFX has become the preferred API for developing
 * modern graphical user interfaces and desktop applications for the Java platform. As such, many developers need
 * a way to meld the two APIs together in order to transition. Even applications written entirely in JavaFX can benefit
 * from the use of some Swing components. The javafx.embed.swing.SwingNode class makes it possible to embed
 * a JComponent instance into a JavaFX application with little effort, by passing the JComponent to the SwingNode
 * setContent() method. The content is repainted automatically and all events are forwarded to the JComponent
 * instance without user intervention.
 * In the example to this recipe, a Swing JLabel component is embedded into a JavaFX application by passing
 * the Swing component to the SwingNode setContent() method. The Swing content should run on the Event
 * Dispatch Thread (EDT), so any Swing access should be made on the EDT. That said, a new thread is created using
 * SwingUtilities.invokeLater, and a lambda expression encapsulates the Runnable that is used to set the Swing content.
 *
 *
 * Created by æBelu on 17/2/2018.
 */
public class Recipe02_09 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        final SwingNode swingNode = new SwingNode();
        createSwingContent(swingNode);

        StackPane pane = new StackPane();
        pane.getChildren().add(swingNode);

        primaryStage.setScene(new Scene(pane, 100, 50));
        primaryStage.show();
    }

    private void createSwingContent(final SwingNode swingNode) {
        SwingUtilities.invokeLater(() -> {
            swingNode.setContent(new JLabel("Hello Swing"));
        });
    }

    /**
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
