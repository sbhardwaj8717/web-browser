package browerFiles;

import javax.swing.JFrame;   // javax = java extender package
import javax.swing.SwingUtilities;


import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.application.*;

public  class Home extends JFrame implements Runnable{


	private JFXPanel panel; 
	public void run() {
		
		setTitle("S.Bhardwaj8717 's BROWSER ");
		
		setBounds(0,0,1800,1500);
		setVisible(true);
		
		
		panel = new  JFXPanel();
		add(panel);
		
		Platform.runLater(() -> {
		
		WebView view = new WebView();
		view.getEngine().load("https://duckduckgo.com/");
		panel.setScene(new Scene(view));
	
		});
	}
		

	public static void main(String[] args) {
		SwingUtilities.invokeLater( new Home());
	}

}
