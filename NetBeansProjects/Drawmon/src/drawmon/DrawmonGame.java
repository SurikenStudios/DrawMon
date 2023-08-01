package drawmon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawmonGame extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../igu/VistaDibujar.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//    @Override
//    public void start(Stage stage) {
//        // Crear el Canvas
//        Canvas canvas = new Canvas(400, 400);
//
//        // Obtener el contexto gráfico del canvas
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//
//        // Dibujar la cuadrícula
//        for (int i = 0; i <= 10; i++) {
//            gc.strokeLine(i * 40, 0, i * 40, 400);
//            gc.strokeLine(0, i * 40, 400, i * 40);
//        }
//
//        // Crear el Pane
//        Pane root = new Pane();
//
//        // Agregar el Canvas al Pane
//        root.getChildren().add(canvas);
//
//        // Crear la Escena
//        Scene scene = new Scene(root);
//
//        // Agregar la Escena al Stage
//        stage.setScene(scene);
//
//        // Establecer el Título del Stage
//        stage.setTitle("JavaFX Canvas Example");
//
//        // Mostrar el Stage
//        stage.show();
//        
//        // Agregar un manejador de eventos al Canvas
//canvas.setOnMouseClicked(e -> {
//    // Obtener las coordenadas del clic
//    double x = e.getX();
//    double y = e.getY();
//
//    // Calcular la fila y la columna de la celda en la que se hizo clic
//    int row = (int) (y / 40);
//    int col = (int) (x / 40);
//
//    // Dibujar un rectángulo del color seleccionado en la celda correspondiente
//    gc.setFill(Color.RED);
//    gc.fillRect(col * 40, row * 40, 40, 40);
//});
//
//    }
//}
   
    

//    Monstruo m = new Monstruo();
//    
//    private static final int GRID_SIZE = 10;
//    private Color[][] grid = new Color[GRID_SIZE][GRID_SIZE];
//
//    public DrawmonGame() {
//        // Establecer el tamaño del Canvas
//        setSize(400, 400);
//
//        // Agregar un MouseListener para detectar clics en la cuadrícula
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                // Calcular la celda de la cuadrícula en la que se hizo clic
//                int cellX = e.getX() / (getWidth() / GRID_SIZE);
//                int cellY = e.getY() / (getHeight() / GRID_SIZE);
//
//                // Cambiar el color de la celda
//                grid[cellX][cellY] = Color.BLACK;
//
//                // Repintar el Canvas
//                repaint();
//            }
//        });
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        // Dibujar la cuadrícula
//        int cellWidth = getWidth() / GRID_SIZE;
//        int cellHeight = getHeight() / GRID_SIZE;
//        for (int x = 0; x < GRID_SIZE; x++) {
//            for (int y = 0; y < GRID_SIZE; y++) {
//                if (grid[x][y] != null) {
//                    g.setColor(grid[x][y]);
//                    g.fillRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
//                }
//                g.setColor(Color.GRAY);
//                g.drawRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
//            }
//        }
//    }
//
//    public void clearGrid() {
//        // Borrar la cuadrícula
//        for (int x = 0; x < GRID_SIZE; x++) {
//            for (int y = 0; y < GRID_SIZE; y++) {
//                grid[x][y] = null;
//            }
//        }
//
//        // Repintar el Canvas
//        repaint();
//    }
//
//    public void saveImage(File file) {
//        // Crear una imagen a partir del Canvas
//        BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
//        Graphics g = image.getGraphics();
//        paint(g);
//
//        try {
//            // Guardar la imagen en el archivo especificado
//            ImageIO.write(image, "png", file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//   public static void main(String[] args) {
//    // Crear un nuevo JFrame para mostrar el juego
//    JFrame frame = new JFrame("Tamagotchi Game");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    // Crear un nuevo JPanel para agrupar componentes de la interfaz de usuario
//    JPanel panel = new JPanel();
//
//    // Crear un nuevo TamagotchiGame
//    DrawmonGame game = new DrawmonGame();
//    panel.add(game);
//
//    // Crear un botón para borrar la cuadrícula
//    JButton clearButton = new JButton("Borrar");
//    clearButton.addActionListener(e -> game.clearGrid());
//    panel.add(clearButton);
//
//    // Crear un botón para guardar la imagen
//    JButton saveButton = new JButton("Guardar");
//    saveButton.addActionListener(e -> game.saveImage(new File("mascota.png")));
//    panel.add(saveButton);
//
//    // Agregar el JPanel al JFrame
//    frame.add(panel);
//    frame.pack();
//    frame.setVisible(true);
//}

        // Todo esto es lo de la pantalla para dibujar --------------------------------------------------------------------------
//        JFrame frame = new JFrame("Dibujo libre");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 400);
//
//        MyPanel panel = new MyPanel();
//        frame.add(panel);
//
//        JButton doneButton = new JButton("Hecho");
//        doneButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                BufferedImage image = panel.getImage();
//                // Usa la imagen como un modelo 2D para la mascota del jugador
//
//                // Guarda la imagen en un archivo
//                File file = new File("mascota.png");
//                try {
//                    ImageIO.write(image, "png", file);
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//
//                frame.dispose();
//
//             
//              
//            }
//        });
//
//        frame.add(doneButton, BorderLayout.SOUTH);
//
//        frame.setVisible(true);

//    }


