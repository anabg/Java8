package org.java8recipes.chapter02.recipe2_10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.awt.*;
import java.time.LocalDate;

/**
 * Adding a DatePicker
 * <p>
 * Problem: You want to add a component to your JavaFX application that will allow you to select a calendar date.
 * <p>
 * <p>
 * Solution: Utilize the new JavaFX DatePicker component. In the following example, a DatePicker component is used to select a
 * date and display it in a label.
 *
 * How It Works
 *
 * For a number of years, the JavaFX platform did not have a standard DatePicker component. The DatePicker component,
 * new to JavaFX 8, fills that void by providing developers with a way to select a date from a given calendar. The DatePicker
 * component goes hand-in-hand with the Date-Time API, which enables easy date selection and date calculations.
 * The DatePicker includes a Month selector, Year selector, and Day selector. To add the component to your
 * application, import javafx.scene.control.DatePicker and create a new instance of the component. By default, if
 * no date is passed into the component it will display a blank text box. The constructor for the component allows you to
 * pass in a LocalDate object upon initialization, as shown in the example.
 * The DatePicker is very extensible, as it provides the ability for customization. For instance, the weeks of the
 * year can be set using the setShowWeekNumbers() method, and the chronology can be set using the setChronology()
 * method. The following code shows the same example from the solution, but this time the DatePicker has been
 * customized to show the week numbers and use Japanese chronology.
 *
 * public void start(Stage primaryStage) throws Exception {
 *  dateLabel = new Label("Select a date using the widget");
 *  datePicker = new DatePicker(LocalDate.now());
 *  datePicker.setOnAction(event -> {
 *      dateLabel.setText("The selected date is: " + datePicker.getValue());
 * });
 *
 *  datePicker.setShowWeekNumbers(true);
 *  datePicker.setChronology(JapaneseChronology.INSTANCE);
 *  FlowPane flow = new FlowPane();
 *  flow.setPadding(new Insets(5, 5, 5, 5));
 *  flow.getChildren().add(dateLabel);
 *  flow.getChildren().add(datePicker);
 *
 *  primaryStage.setScene(new Scene(flow, 300, 100));
 *  primaryStage.show();
 *  }
 *  
 * <p>
 * Created by æBelu on 18/2/2018.
 */
public class Recipe02_10 extends Application{

    private Label dateLabel;
    private DatePicker datePicker;

    @Override
    public void start(Stage primaryStage) throws Exception {
        dateLabel = new Label("Select a date using the widget");
        datePicker = new DatePicker(LocalDate.now());
        datePicker.setOnAction(event -> {
            dateLabel.setText("The selected date is: " + datePicker.getValue());
        });

        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(5, 5, 5, 5));
        flow.getChildren().add(dateLabel);
        flow.getChildren().add(datePicker);

        primaryStage.setScene(new Scene(flow, 300, 100));
        primaryStage.show();
    }

    /**
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
