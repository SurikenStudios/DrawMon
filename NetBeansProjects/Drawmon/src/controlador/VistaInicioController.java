package controlador;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author jczr8
 */
public class VistaInicioController {

    @FXML
    private Button botonInicio;
    @FXML
    private Pane fondoInicio;

    public void initialize() {

        Image image = new Image("images/fInicioIcon.jpg");
        ImageView imageView = new ImageView(image);
        fondoInicio.getChildren().add(0, imageView);

        botonInicio.setOnAction(e -> {
            try {
                // Load the VistaDibujar FXML file
                Parent root = FXMLLoader.load(getClass().getResource("/igu/VistaDibujar.fxml"));

                // Get the current stage and set the new scene
                Stage stage = (Stage) botonInicio.getScene().getWindow();
                stage.setScene(new Scene(root));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
