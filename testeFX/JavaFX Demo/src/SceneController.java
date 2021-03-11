import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class SceneController {

    @FXML
    private Label display;

    @FXML
    private TextField txtField;

    @FXML
    private Button submitBtn;

    @FXML
    void onSubmitBtnClick(ActionEvent event) {
        display.setText(txtField.getText());
        
    }

}
