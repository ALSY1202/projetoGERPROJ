package telas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.SplitPane;

import javafx.scene.layout.AnchorPane;

import javafx.scene.image.ImageView;

import javafx.scene.layout.VBox;

public class PrincipalController implements Initializable{
	@FXML
	private SplitPane spPrincipal;
	@FXML
	private AnchorPane apOpcoes;
	@FXML
	private VBox vbBotoes;
	@FXML
	private Button btnGarcom;
	@FXML
	private Button btnCardapio;
	@FXML
	private Button btnMesas;
	@FXML
	private Button btnPedido;
	@FXML
	private AnchorPane apVisualizar;
	@FXML
	private ImageView imgLogo;
	
	public void iniciarMysql() {
		/**
		 * Caso o mysql esteja no mesmo caminho descomentem a linha 65
		 * assim n�o ser� necess�rio executar o mysql manualmente antes
		 * de testar nossa aplica��o.
		 */
		String caminho = "C:\\xampp\\mysql\\bin\\mysqld.exe";  
		ProcessBuilder pb = new ProcessBuilder(caminho);  
		try{  
		     pb.start();  
		}catch(Exception ex){  
		     System.out.println(ex);  
		}  
	}
	public void chamarGarcom(){
		
		try {
			apVisualizar.getChildren().removeAll(apVisualizar.getChildren());
			apVisualizar.getChildren().add(FXMLLoader.load(getClass().getResource("/telas/CRUDgarcom.fxml")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//iniciarMysql();
		btnGarcom.setOnMouseClicked(event -> chamarGarcom());
		
	}

}
