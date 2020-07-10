package com.internshala.javafxapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Optional;

public class Mymain extends Application {
    public static void main(String args[])
    {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
        VBox rootNode = loader.load();
        MenuBar menuBar = createMenu();
        rootNode.getChildren().addAll(menuBar);

        Scene scene = new Scene(rootNode, 300, 275);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello Core Java World");
        primaryStage.show();
    }

    private MenuBar createMenu(){


        javafx.scene.control.Menu fileMenu = new javafx.scene.control.Menu("File");
        MenuItem newmenuItem = new MenuItem("New");
        SeparatorMenuItem seperatorMenuItem = new SeparatorMenuItem();
        MenuItem quitMenuItem = new MenuItem("Quit");
        fileMenu.getItems().addAll(newmenuItem,seperatorMenuItem,quitMenuItem);

        newmenuItem.setOnAction(event -> System.out.println("New Item Is Clicked"));

        quitMenuItem.setOnAction(event -> {
            Platform.exit();
            System.exit(0);
        });
        
        javafx.scene.control.Menu helpMenu = new javafx.scene.control.Menu("Help");
        MenuItem aboutApp = new MenuItem("About");
        helpMenu.getItems().addAll(aboutApp);

        javafx.scene.control.MenuBar menuBar = new javafx.scene.control.MenuBar();
        menuBar.getMenus().addAll(fileMenu,helpMenu);

        aboutApp.setOnAction(event -> aboutApp());

        return menuBar;

    }

    private void aboutApp() {
        Alert alertDialog = new Alert(Alert.AlertType.INFORMATION);
        alertDialog.setTitle("MY JavaFX App");
        alertDialog.setHeaderText("WELCOME");
        alertDialog.setContentText("visit again!");
        ButtonType yesbtn = new ButtonType("YES");
        ButtonType nobtn = new ButtonType("NO");
        alertDialog.getButtonTypes().setAll(yesbtn,nobtn);
        Optional<ButtonType> clickbtn = alertDialog.showAndWait();

        if(clickbtn.isPresent()&&  clickbtn.get()==yesbtn)
            System.out.println("Yes Button is Click");
        else
            System.out.println("NO Button is Click");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
