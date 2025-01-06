package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	public void start(Stage Stage)throws IOException {			
			FXMLLoader loader  = new FXMLLoader(getClass().getResource("/Visao/CalculoTela.fxml"));	
			Parent root = loader.load();
					 
			Scene cena = new Scene(root);
			
			Stage.setTitle("Horario");
			Stage.setScene(cena);
			Stage.show();
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
