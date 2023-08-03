package controlador;

import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 *
 * @author jczr8
 */
public class VistaEleccionesController {

    @FXML
    private Pane fondoPaneElecciones;
    @FXML
    private Button terminarButton;
    
    public void initialize() {
        Image imageFondo = new Image("images/fondoPaneDibujar.jpg");
        ImageView imageViewFondo = new ImageView(imageFondo);
        fondoPaneElecciones.getChildren().add(0, imageViewFondo);
        
         terminarButton.setOnAction(e -> {
         
            // Abre la ventana de Game -------------------------------------------
            try {
                // Load the VistaDibujar FXML file
                Parent root = FXMLLoader.load(getClass().getResource("/igu/VistaGame.fxml"));

                // Get the current stage and set the new scene
                Stage stage = (Stage) terminarButton.getScene().getWindow();
                stage.setScene(new Scene(root));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
