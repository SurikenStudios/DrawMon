package controlador;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;

public class VistaDibujarController {

    private static final int NUM_CELDAS = 10;

    @FXML
    private Canvas canvas;
    @FXML
    private ToggleButton borrarButton;
    @FXML
    private Button terminarButton;
    @FXML
    private ToggleButton blancoButton;
    @FXML
    private ToggleButton negroButton;

    
    public void initialize() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setImageSmoothing(false);
        
        double tamanoCelda = canvas.getWidth() / NUM_CELDAS;

        canvas.setOnMouseClicked(e -> {
            int columna = (int) (e.getX() / tamanoCelda);
            int fila = (int) (e.getY() / tamanoCelda);
            if (borrarButton.isSelected()) {
                gc.clearRect(columna * tamanoCelda, fila * tamanoCelda, tamanoCelda, tamanoCelda);
            } else {
                Color color = blancoButton.isSelected() ? Color.WHITE : Color.BLACK;
                gc.setFill(color);
                gc.fillRect(columna * tamanoCelda, fila * tamanoCelda, tamanoCelda, tamanoCelda);
            }
            dibujarCuadricula(gc, tamanoCelda);
        });

        terminarButton.setOnAction(e -> {
            WritableImage imagen = canvas.snapshot(null, null);
            try {
                ImageIO.write(SwingFXUtils.fromFXImage(imagen, null), "png", new File("mascota.png"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        ToggleGroup toggleGroup = new ToggleGroup();
        borrarButton.setToggleGroup(toggleGroup);
        blancoButton.setToggleGroup(toggleGroup);
        negroButton.setToggleGroup(toggleGroup);
        negroButton.setSelected(true);

        dibujarCuadricula(gc, tamanoCelda);
    }

    private void dibujarCuadricula(GraphicsContext gc, double tamanoCelda) {
        gc.setStroke(Color.GRAY);
        for (int i = 0; i <= NUM_CELDAS; i++) {
            gc.strokeLine(i * tamanoCelda, 0, i * tamanoCelda, canvas.getHeight());
            gc.strokeLine(0, i * tamanoCelda, canvas.getWidth(), i * tamanoCelda);
        }
    }
}
