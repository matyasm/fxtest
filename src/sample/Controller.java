package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;


public class Controller {

    public Label myLabel;
    public void setLabel(ActionEvent actionEvent) {
        myLabel.setText("hi");
    }
}
