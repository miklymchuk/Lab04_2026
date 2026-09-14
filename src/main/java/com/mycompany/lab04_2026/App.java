package com.mycompany.lab04_2026;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {     
        var root = new GridPane();
        
        // Fields to fill for the business trip.
        var days = new Label("Number of days:");
        var days2 = new TextField();
        
        var airfare = new Label("Airfare:");
        var airfare2 = new TextField();
        
        var rental = new Label("Car rental fees:");
        var rental2 = new TextField();
        
        var miles = new Label("Miles Driven:");
        var miles2 = new TextField();
        
        var parking = new Label("Parking fees:");
        var parking2 = new TextField();
        
        var taxi = new Label("Taxi charges:");
        var taxi2 = new TextField();
        
        var conference = new Label("Conference or seminar charges:");
        var conference2 = new TextField();
        
        var lodging = new Label("Lodging charges:");
        var lodging2 = new TextField();
        
        var confirmation = new Button("Confirm");
        
        // Data (cost & reimbursement) of the business trip
        var expenses = new Label("");
        var allowable = new Label("");
        var excess = new Label("");
        var moneySaved = new Label("");
        
        // Adding fields to fill & data to the root GridPane
        root.add(days, 0, 0);
        root.add(days2, 1, 0);
        root.add(airfare, 0, 1);
        root.add(airfare2, 1, 1);
        root.add(rental, 0, 2);
        root.add(rental2, 1, 2);
        root.add(miles, 0, 3);
        root.add(miles2, 1, 3);
        root.add(parking, 0, 4);
        root.add(parking2, 1, 4);
        root.add(taxi, 0, 5);
        root.add(taxi2, 1, 5);
        root.add(conference, 0, 6);
        root.add(conference2, 1, 6);
        root.add(lodging, 0, 7);
        root.add(lodging2, 1, 7);
        root.add(confirmation, 1, 8);
        root.add(expenses, 0, 9);
        root.add(allowable, 0, 10);
        root.add(excess, 0, 11);
        root.add(moneySaved, 0, 12);
        
        
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
