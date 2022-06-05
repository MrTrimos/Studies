import javafx.application.Application;
import javafx.stage.Stage;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.ArcType;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private void reset(Canvas canvas, Color color) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
    int width = 2, hight = 2;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Рисование основных фигур");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();



        //увеличение ластика при скроле колесика
        canvas.addEventHandler(ScrollEvent.SCROLL, (ScrollEvent e) ->{
            System.out.println(e.getY());
            width++;
            hight++;
        });

        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                gc.clearRect(e.getX() - 1, e.getY() - 1,  width, hight);
            }
        });


        canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                if (t.getClickCount() >2) {
                    reset(canvas, Color.WHITE);
                }
            }
        });

    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.RED);
//        gc.setStroke(Color.AQUAMARINE);
//        gc.setLineWidth(5);
//        gc.strokeLine(40, 10, 10, 40);
//        gc.fillOval(10, 60, 30, 30);
//        gc.strokeOval(60, 60, 30, 30);
//        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
//        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
//        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.OPEN);
//        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
//
//        gc.fillArc(110, 110, 300, 300, 50, 280, ArcType.ROUND);
//
//        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
//        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
//        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
//


        gc.moveTo(75,40);
        gc.bezierCurveTo(75,37,70,25,50,25);
        gc.bezierCurveTo(20,25,20,62.5,20,62.5);
        gc.bezierCurveTo(20,80,40,102,75,120);
        gc.bezierCurveTo(110,102,130,80,130,62.5);
        gc.bezierCurveTo(130,62.5,130,25,100,25);
        gc.bezierCurveTo(85,25,75,37,75,40);
        gc.fill();

//
//        gc.fillPolygon(new double[]{10, 40, 10, 40},
//                new double[]{210, 210, 240, 240}, 4);
//        gc.strokePolygon(new double[]{60, 90, 60, 90},
//                new double[]{210, 210, 240, 240}, 4);
    }
}
