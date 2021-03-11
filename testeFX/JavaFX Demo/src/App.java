import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception { 
        Parent root = FXMLLoader.load(getClass().getResource("SceneDemo.fxml"));
        
        stage.setScene(new Scene(root));
        stage.show();
    }
}

