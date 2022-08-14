package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFX extends Application
{
    @Override
    public void start(Stage stage) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Calculator v1");
        stage.setScene(scene);
        stage.show();
        System.out.println(stage.getHeight());
        System.out.println(stage.getWidth());
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
