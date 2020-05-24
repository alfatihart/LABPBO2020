import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * scene
 */
public class No1 extends Application {
    private static final int beli = 0;
    Scene scene1, scene2, scene3;
    Button button1;
    TextField tfBakmi, tfKwetiau, tfMilshake, tTotal;

    Label lBakmi, lKwetiau, lMilshake, lHBakmi, lHKwetiau, lHMilshake, nameRestaurant;
    Stage window;
   //private TextInputControl beli;
    //Text welcome;
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("restaurant");

        Label label = new Label("Welcome to Barokah");
        label.setFont(new Font("Arial", 20));
        button1 = new Button("click it to continue");

        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(label, button1);
        vBox.setAlignment(Pos.CENTER);

        scene1 = new Scene(vBox, 400, 400);

        //scene 2
        button1.setOnAction(e->{
            GridPane gridPane = new GridPane();

            Node nameRestaurant = new Label("Barokah");
            ((Labeled) nameRestaurant).setFont(new Font("Comic Sans MS", 20));
            VBox vBox2 = new VBox(20);
            vBox2.getChildren().add(nameRestaurant);
            
           //bakmi
            tfBakmi = new TextField();
            tfBakmi.setPromptText("Bakmi");
            tfBakmi.setMaxWidth(30);
            lBakmi = new Label();
            lBakmi.setText("Bakmi");
            lHBakmi = new Label();
            lHBakmi.setText("Rp. 30.000");
//Kwetiau
            
            tfKwetiau = new TextField();
            tfKwetiau.setPromptText("kwetiau");
            tfKwetiau.setMaxWidth(30);
            lKwetiau = new Label();
            lKwetiau.setText("Kwetiau");
            lHKwetiau = new Label();
            lHKwetiau.setText("Rp. 15.000");
//Milshake
            tfMilshake= new TextField();
            tfMilshake.setPromptText("Milshake");
            tfMilshake.setMaxWidth(30);
            lMilshake = new Label();
            lMilshake.setText("Milshake");
            lHMilshake = new Label();
            lHMilshake.setText("Rp. 12.000");

            var ref = new Object(){
                Label total = new Label();
            
            };

            Button submit = new Button("submit");
            submit.setOnAction(p->{
                int Bakmi = Integer.parseInt(0 + tfBakmi.getText());
                int Kwetiau = Integer.parseInt(0 + tfKwetiau.getText());
                int Milshake = Integer.parseInt(0 + tfMilshake.getText());
               int beli = ((Bakmi*30000) + (Kwetiau*20000) + (Milshake*15000));
              


                ref.total.setTextFill(Color.BLACK);

                ref.total.setText("total " + beli);

                GridPane.setConstraints(ref.total, 1, 7);
                gridPane.getChildren().addAll(ref.total );
            });

            Button back = new Button("Back");
            back.setOnAction(j -> {
                gridPane.getChildren().removeAll(ref.total);
                window.setScene(scene1);
            });
            Button  clear = new Button("Clear");
            clear.setOnAction(c->{
                //int Bakmi = Integer.parseInt(0 + tfBakmi.getText());
                //int Kwetiau = Integer.parseInt(0 + tfKwetiau.getText());
                //int Milshake = Integer.parseInt(0 + tfMilshake.getText());
                //int diskon = (beli%Bakmi)+(beli%Kwetiau)+ (beli%Milshake);


               // ref.total.setTextFill(Color.BROWN);
                // ref.total.setText("beli " + diskon);
                
               gridPane.getChildren().clear();
               window.setScene(scene1);

               

        });

            gridPane.setHgap(10);
            gridPane.setVgap(10);
            gridPane.setAlignment(Pos.CENTER);
            GridPane.setConstraints(vBox2, 3, 0);
            GridPane.setConstraints(tfBakmi, 1, 1);
            GridPane.setConstraints(lBakmi, 2, 1);
            GridPane.setConstraints(lHBakmi, 6, 1);
            GridPane.setConstraints(tfKwetiau, 1, 2);
            GridPane.setConstraints(lKwetiau, 2, 2);
            GridPane.setConstraints(lHKwetiau, 6, 2);
            GridPane.setConstraints(tfMilshake, 1, 3);
            GridPane.setConstraints(lMilshake, 2, 3);
            GridPane.setConstraints(lHMilshake, 6, 3);
            GridPane.setConstraints(submit, 6, 4);
            GridPane.setConstraints(back, 6, 5);
            GridPane.setConstraints(clear, 5, 10);
            gridPane.getChildren().addAll(vBox2 , tfBakmi, lBakmi, lHBakmi, tfKwetiau, lKwetiau, lHKwetiau, tfMilshake, lMilshake, lHMilshake,  submit, back);

            scene2 = new Scene(gridPane, 500, 600);
            window.setScene(scene2);

        });

        window.setScene(scene1);
        window.show();

    }
} 