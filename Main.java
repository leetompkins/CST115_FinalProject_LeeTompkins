import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Dispensor dispensor = new Dispensor(10);
		
		BorderPane bp1 = new BorderPane();
		HBox hbUpper = new HBox();
		HBox hbLower = new HBox();
		VBox vbCenter = new VBox();
		vbCenter.getChildren().addAll(hbUpper, hbLower);
		//Label labelDispensatron = new Label("SELECT A PRODUCT");
		
		
		//bp1.setTop(labelDispensatron);
		bp1.setCenter(vbCenter);
		
		Scene mainScene = new Scene(bp1,1280, 720);
		// TODO Auto-generated method stub
		
		
		primaryStage.setTitle("Despensatron");
		primaryStage.setScene(mainScene);
		primaryStage.show();
		
		
		dispensor.displayProduct();
		
		
		
		
		
		
		
		
		
		
	}

}