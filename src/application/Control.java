package application;



import java.util.Random;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Control {
	int totalchance=5;
    int point=0;
	@FXML
	private Label message;
    @FXML
    private TextField t2;
	@FXML
	private TextField t1;
	@FXML
	private TextField t3;
	@FXML
	private TextField t4;
	@FXML
	
	public void guess(ActionEvent event) {
         String a=t1.getText();
         int number=Integer.parseInt(a);
         Random rand = new Random();
         int myrandomnumber=rand.nextInt(1,5);
         if(myrandomnumber==number) {
        	 t2.setText("Correct Answer");
        	 point++;
        	 message.setText("");
        	 
         }
         else if (myrandomnumber>number) {
        	t2.setText("Wrong Answer");
        	message.setText(number+" less than actual number");
			
		}
         else if (myrandomnumber<number) {
        	 t2.setText("Wrong Number");
        	 message.setText(number+" greater than actual number");
        	 
			
		}
         totalchance--;
         t3.setText(""+totalchance);
         t4.setText(""+point);
         if (totalchance==0) {
        	 t3.setText("no chance left");
        	 message.setText("click submit for exit");
			
		}
         if (totalchance==-1) {
        	 javafx.application.Platform.exit();
			
		}

}
}
