package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class components extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        final Line[] line1 = {new Line(200, -50, 300, -50)}; //Line(startX,startY,endX,endY)
        line1[0].setStroke(Color.RED);
        line1[0].setStrokeWidth(10);

        final Line[] line2 = {new Line(200, 50, 300, 50)};
        line2[0].setStroke(Color.YELLOW);
        line2[0].setStrokeWidth(10);

        Line line3 = new Line(200, -50, 200, 50);
        line3.setStroke(Color.DARKGREEN);
        line3.setStrokeWidth(10);


        Line line4 = new Line(300, -50, 300, 50);
        line4.setStroke(Color.BLUE);
        line4.setStrokeWidth(10);

        Group rect = new Group(line1[0], line2[0], line3, line4);


        Arc arc1 = new Arc(250, 0, 70, 70, 0, 90);
        arc1.setType(ArcType.OPEN);
        arc1.setStroke(Color.RED);
        arc1.setStrokeWidth(10);
        arc1.setFill(Color.TRANSPARENT);
        Arc arc2 = new Arc(250, 0, 70, 70, 90, 90);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLUE);
        arc2.setStrokeWidth(10);
        arc2.setFill(Color.TRANSPARENT);
        Arc arc3 = new Arc(250, 0, 70, 70, 180, 90);
        arc3.setType(ArcType.OPEN);
        arc3.setStroke(Color.YELLOW);
        arc3.setStrokeWidth(10);
        arc3.setFill(Color.TRANSPARENT);
        Arc arc4 = new Arc(250, 0, 70, 70, 270, 90);
        arc4.setType(ArcType.OPEN);
        arc4.setStroke(Color.DARKGREEN);
        arc4.setStrokeWidth(10);
        arc4.setFill(Color.TRANSPARENT);

        Group Circle = new Group(arc1, arc2, arc3, arc4);

        Arc ar1 = new Arc(250, 0, 15, 15, 0, 90);
        ar1.setType(ArcType.ROUND);
        ar1.setStroke(Color.RED);
        ar1.setStrokeWidth(3);
        ar1.setFill(Color.RED);
        Arc ar2 = new Arc(250, 0, 15, 15, 90, 90);
        ar2.setType(ArcType.ROUND);
        ar2.setStroke(Color.BLUE);
        ar2.setStrokeWidth(3);
        ar2.setFill(Color.BLUE);
        Arc ar3 = new Arc(250, 0, 15, 15, 180, 90);
        ar3.setType(ArcType.ROUND);
        ar3.setStroke(Color.YELLOW);
        ar3.setStrokeWidth(3);
        ar3.setFill(Color.YELLOW);
        Arc ar4 = new Arc(250, 0, 15, 15, 270, 90);
        ar4.setType(ArcType.ROUND);
        ar4.setStroke(Color.DARKGREEN);
        ar4.setStrokeWidth(3);
        ar4.setFill(Color.DARKGREEN);
        Group smallCG1 = new Group(ar1, ar2, ar3, ar4);
        smallCG1.setTranslateY(-100);

        Arc arr1 = new Arc(250, 0, 15, 15, 0, 90);
        arr1.setType(ArcType.ROUND);
        arr1.setStroke(Color.RED);
        arr1.setStrokeWidth(3);
        arr1.setFill(Color.RED);
        Arc arr2 = new Arc(250, 0, 15, 15, 90, 90);
        arr2.setType(ArcType.ROUND);
        arr2.setStroke(Color.BLUE);
        arr2.setStrokeWidth(3);
        arr2.setFill(Color.BLUE);
        Arc arr3 = new Arc(250, 0, 15, 15, 180, 90);
        arr3.setType(ArcType.ROUND);
        arr3.setStroke(Color.YELLOW);
        arr3.setStrokeWidth(3);
        arr3.setFill(Color.YELLOW);
        Arc arr4 = new Arc(250, 0, 15, 15, 270, 90);
        arr4.setType(ArcType.ROUND);
        arr4.setStroke(Color.DARKGREEN);
        arr4.setStrokeWidth(3);
        arr4.setFill(Color.DARKGREEN);
        Group smallCG2 = new Group(arr1, arr2, arr3, arr4);
        smallCG2.setTranslateY(-100);

        Arc arrc1 = new Arc(250, 0, 15, 15, 0, 90);
        arrc1.setType(ArcType.ROUND);
        arrc1.setStroke(Color.RED);
        arrc1.setStrokeWidth(3);
        arrc1.setFill(Color.RED);
        Arc arrc2 = new Arc(250, 0, 15, 15, 90, 90);
        arrc2.setType(ArcType.ROUND);
        arrc2.setStroke(Color.BLUE);
        arrc2.setStrokeWidth(3);
        arrc2.setFill(Color.BLUE);
        Arc arrc3 = new Arc(250, 0, 15, 15, 180, 90);
        arrc3.setType(ArcType.ROUND);
        arrc3.setStroke(Color.YELLOW);
        arrc3.setStrokeWidth(3);
        arrc3.setFill(Color.YELLOW);
        Arc arrc4 = new Arc(250, 0, 15, 15, 270, 90);
        arrc4.setType(ArcType.ROUND);
        arrc4.setStroke(Color.DARKGREEN);
        arrc4.setStrokeWidth(3);
        arrc4.setFill(Color.DARKGREEN);
        Group smallCG3 = new Group(arrc1, arrc2, arrc3, arrc4);
        smallCG3.setTranslateY(-100);

        Line lt1 = new Line(200, 0, 200, 60);
        lt1.setStroke(Color.RED);
        lt1.setStrokeWidth(10);

        Line lt2 = new Line(200, -60, 200, 0);
        lt2.setStroke(Color.BLUE);
        lt2.setStrokeWidth(10);

        Line lt3 = new Line(200, 0, 260, 0);
        lt3.setStroke(Color.DARKGREEN);
        lt3.setStrokeWidth(10);

        Line lt4 = new Line(200, 0, 140, 0);
        lt4.setStroke(Color.YELLOW);
        lt4.setStrokeWidth(10);

        Group plus = new Group(lt1, lt2, lt3, lt4);


    }
}
