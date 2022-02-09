package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javax.swing.*;

public class HelloApplication<args> extends Application {

    private CheckBox java;





    @Override
    public void start(Stage stage) throws Exception {

        Label selectedLangs = new Label("No languages seleted");

        java = new CheckBox("Java");
        CheckBox javaScript = new CheckBox("JavaScript");
        ButtonBase csharp = new CheckBox("C#");

        java.setOnAction(event -> show());
        javaScript.setOnAction(event -> show());
        csharp.setOnAction(event -> show());

        FlowPane root = new FlowPane(Orientation.VERTICAL, 0, 10);
        root.getChildren().addAll(java, javaScript, csharp, selectedLangs);
        root.setPadding(new Insets(0, 0, 0, 10));
        Scene scene = new Scene(root, 250, 200);

        stage.setScene(scene);

        stage.setTitle("Hello JavaFX");
        stage.show();
    }

    private void show(){

        String allSelected = "";

        if(java.isSelected()) allSelected += "Java ";
        AbstractButton javaScript = null;
        if(javaScript.isSelected()) allSelected += "JavaScript ";
        AbstractButton csharp = null;
        if(csharp.isSelected()) allSelected += "C#";

        java.awt.Label selectedLangs = new java.awt.Label();
        if(allSelected.equals(""))
            selectedLangs.setText("No languages selected");
        else
            selectedLangs.setText(allSelected);
    }
}
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
