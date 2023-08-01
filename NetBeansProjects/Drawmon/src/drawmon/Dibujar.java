//package drawmon;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.control.Button;
//import javafx.scene.image.WritableImage;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//import javax.imageio.ImageIO;
//import java.io.File;
//import java.io.IOException;
//import javafx.embed.swing.SwingFXUtils;
//
//public class Dibujar extends Application {
//    private static final int NUM_CELDAS = 10;
//
//    private boolean borrando = false;
//    private Color color = Color.BLACK;
//
//    @Override
//    public void start(Stage stage) {
//        Canvas canvas = new Canvas(500, 500);
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        gc.setImageSmoothing(false);
//
//        double tamanoCelda = canvas.getWidth() / NUM_CELDAS;
//
//        canvas.setOnMouseClicked(e -> {
//            int columna = (int) (e.getX() / tamanoCelda);
//            int fila = (int) (e.getY() / tamanoCelda);
//            if (borrando) {
//                gc.clearRect(columna * tamanoCelda, fila * tamanoCelda, tamanoCelda, tamanoCelda);
//            } else {
//                gc.setFill(color);
//                gc.fillRect(columna * tamanoCelda, fila * tamanoCelda, tamanoCelda, tamanoCelda);
//            }
//        });
//
//        Button borrarButton = new Button("Borrar");
//        borrarButton.setOnAction(e -> borrando = !borrando);
//
//        Button terminarButton = new Button("Terminar");
//        terminarButton.setOnAction(e -> {
//            WritableImage imagen = canvas.snapshot(null, null);
//            try {
//                ImageIO.write(SwingFXUtils.fromFXImage(imagen, null), "png", new File("mascota.png"));
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });
//
//        Button cambiarColorButton = new Button("Cambiar color");
//        cambiarColorButton.setOnAction(e -> color = color == Color.BLACK ? Color.WHITE : Color.BLACK);
//
//        VBox root = new VBox(canvas, borrarButton, terminarButton, cambiarColorButton);
//        Scene scene = new Scene(root);
//        scene.setFill(Color.TRANSPARENT);
//
//        stage.setScene(scene);
//        stage.show();
//    }
//}