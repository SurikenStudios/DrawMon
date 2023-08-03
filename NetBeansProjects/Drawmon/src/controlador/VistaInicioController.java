package controlador;

import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author jczr8
 */
public class VistaInicioController {

    @FXML
    private Button inicioButton;
    @FXML
    private Pane fondoInicio;

    public void initialize() {

        // Carga la imagen de fondo
        
        Image image = new Image("images/fInicioIcon.jpg");
        ImageView imageView = new ImageView(image);
        fondoInicio.getChildren().add(0, imageView);

        // Carga la musica
        
        String path = "C:/Users/jczr8/Documents/NetBeansProjects/Drawmon/NetBeansProjects/Drawmon/src/audios/Growing.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        

        inicioButton.setOnAction(e -> {
            try {
                
                // Carga la pantalla VistaDibujar
                
                Parent root = FXMLLoader.load(getClass().getResource("/igu/VistaDibujar.fxml"));

                // Cierra esta y abre la siguiente 
                
                Stage stage = (Stage) inicioButton.getScene().getWindow();
                stage.setScene(new Scene(root));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
