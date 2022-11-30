package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartPage {
@FXML
public void start(ActionEvent event)throws Exception {
	Stage primaryStage = new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("Funbrain.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
}
