package controlador;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
//ok
public class VIstaDibujarController {
    private static final int NUM_CELDAS = 10;

    @FXML
    private Canvas canvas;
    @FXML
    private Button borrarButton;
    @FXML
    private Button terminarButton;
    @FXML
    private Button cambiarColorButton;

    private boolean borrando = false;
    private Color color = Color.BLACK;

    public void initialize() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setImageSmoothing(false);

        double tamanoCelda = canvas.getWidth() / NUM_CELDAS;

        canvas.setOnMouseClicked(e -> {
            int columna = (int) (e.getX() / tamanoCelda);
            int fila = (int) (e.getY() / tamanoCelda);
            if (borrando) {
                gc.clearRect(columna * tamanoCelda, fila * tamanoCelda, tamanoCelda, tamanoCelda);
            } else {
                gc.setFill(color);
                gc.fillRect(columna * tamanoCelda, fila * tamanoCelda, tamanoCelda, tamanoCelda);
            }
        });

        borrarButton.setOnAction(e -> borrando = !borrando);

        terminarButton.setOnAction(e -> {
            WritableImage imagen = canvas.snapshot(null, null);
            try {
                ImageIO.write(SwingFXUtils.fromFXImage(imagen, null), "png", new File("mascota.png"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        cambiarColorButton.setOnAction(e -> color = color == Color.BLACK ? Color.WHITE : Color.BLACK);
    }
}
