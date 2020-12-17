package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Star extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        javafx.scene.shape.Rectangle star1 = new javafx.scene.shape.Rectangle();
        star1.setFill(Color.GRAY);
        star1.setX(235);
        star1.setY(-20);
        star1.setWidth(30);
        star1.setHeight(30);
        star1.setRotate(127);
        javafx.scene.shape.Rectangle starp2 = new javafx.scene.shape.Rectangle();
        starp2.setFill(Color.GRAY);
        starp2.setX(235);
        starp2.setY(-20);
        starp2.setWidth(30);
        starp2.setHeight(30);
        Group star11 = new Group(star1, starp2);


        javafx.scene.shape.Rectangle star2 = new javafx.scene.shape.Rectangle();
        star2.setFill(Color.GRAY);
        star2.setX(235);
        star2.setY(-20);
        star2.setWidth(30);
        star2.setHeight(30);
        star2.setRotate(127);
        javafx.scene.shape.Rectangle starr2 = new Rectangle();
        starr2.setFill(Color.GRAY);
        starr2.setX(235);
        starr2.setY(-20);
        starr2.setWidth(30);
        starr2.setHeight(30);
        Group star12 = new Group(star2, starr2);


    }
}
