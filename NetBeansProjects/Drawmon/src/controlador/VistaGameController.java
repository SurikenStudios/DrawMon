package controlador;

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
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

        TranslateTransition tt1 = new TranslateTransition(Duration.millis(2000), mascota);
        tt1.setByX(100);
        tt1.setCycleCount(1);
        tt1.setAutoReverse(true);

        // Crea una transición de escala para aplastar y estirar la imagen
        ScaleTransition st = new ScaleTransition(Duration.millis(100), mascota);
        st.setByY(-0.2);
        st.setCycleCount(2);
        st.setAutoReverse(true);

// Crea una transición de rotación para hacer vibrar la imagen
        RotateTransition rt = new RotateTransition(Duration.millis(50), mascota);
        rt.setByAngle(10);
        rt.setCycleCount(8);
        rt.setAutoReverse(true);

// Crea una transición de traslación para hacer saltar la imagen
        TranslateTransition tt = new TranslateTransition(Duration.millis(200), mascota);
        tt.setByY(-50);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        // Combina las transiciones en una secuencia
     

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), e -> {
            // Select a random animation
            int rand = new Random().nextInt(4);
            switch (rand) {
                case 0:
                    tt.play();
                    break;
                case 1:
                    st.play();
                    break;
                case 2:
                    rt.play();
                    break;
                case 3:
                    tt1.play();
                    break;
                   
            }
        }));
        
        
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}


