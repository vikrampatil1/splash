/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash;

/**
 *
 * @author ek10
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Resource Monitor");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 250, Color.WHITE);

        TabPane tabPane = new TabPane();

        BorderPane borderPane = new BorderPane();
        //Making the CPU Tab
            Tab CPUtab = new Tab();
            CPUtab.setText("CPU");
            CPUtab.setStyle("-fx-border-color:black; -fx-background-color: grey;");
            HBox hbox = new HBox();
            hbox.getChildren().add(new Label(""));
            hbox.setAlignment(Pos.CENTER);
            CPUtab.setContent(hbox);
            tabPane.getTabs().add(CPUtab);
            
        //Making the Memory Tab
            Tab memorytab = new Tab();
            memorytab.setText("Memory");
            memorytab.setStyle("-fx-border-color:black; -fx-background-color: grey;");
            HBox hbox1 = new HBox();
            hbox1.getChildren().add(new Label(""));
            hbox1.setAlignment(Pos.CENTER);
            memorytab.setContent(hbox1);
            tabPane.getTabs().add(memorytab);
            
            //Making the Disk Tab
       box2);
            tabPane.getTabs().add(disktab);
            
            //Making the Network Tab
            Tab nwtab = new Tab();
            nwtab.setText("Network");
            nwtab.setStyle("-fx-border-color:black; -fx-background-color: grey;");
            HBox hbox3 = new HBox();
            hbox3.getChildren().add(new Label(""));
            hbox3.setAlignment(Pos.CENTER);
            nwtab.setContent(hbox3);
            tabPane.getTabs().add(nwtab);
            
            
        // bind to take available space
        borderPane.prefHeightProperty().bind(scene.heightProperty());
        borderPane.prefWidthProperty().bind(scene.widthProperty());
        
        borderPane.setCenter(tabPane);
        root.getChildren().add(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}