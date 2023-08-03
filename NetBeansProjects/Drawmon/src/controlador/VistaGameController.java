package controlador;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class VistaGameController {

    @FXML
    private ImageView mascota;
    @FXML
    private Pane fondoGame;

    public void initialize() {

        // Fondo 
        Image imageFondo = new Image("images/fondoGame.jpg");
        ImageView imageViewFondo = new ImageView(imageFondo);
        fondoGame.getChildren().add(0, imageViewFondo);
        imageViewFondo.setFitWidth(1280);
        imageViewFondo.setFitHeight(720);
        // Animacion mascota

        TranslateTransition tt = new TranslateTransition(Duration.millis(2000), mascota);
        tt.setByX(100);
        tt.setCycleCount(TranslateTransition.INDEFINITE);
        tt.setAutoReverse(true);
        tt.play();
    }

}
