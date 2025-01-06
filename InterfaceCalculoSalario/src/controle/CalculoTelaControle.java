package controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculoTelaControle {

    @FXML
    private Button btnCalcular;

    @FXML
    private TextField txtE1;

    @FXML
    private TextField txtE2;
    
    @FXML
    private TextField txtE3;
    
    @FXML
    private TextField txtE4;

    @FXML
    private TextField txtE5;

    @FXML
    private TextField txtE6;

    @FXML
    private TextField txtE7;

    @FXML
    private TextField txtE8;

    @FXML
    private TextField txtE9;
    
    @FXML
    private TextField txtE10;

    @FXML
    private TextField txtE11;

    @FXML
    private TextField txtE12;

    @FXML
    private TextField txtE13;

    @FXML
    private TextField txtE14;

    @FXML
    private TextField txtE15;

    @FXML
    private TextField txtE16;

    @FXML
    private TextField txtE17;

    @FXML
    private TextField txtE18;

    @FXML
    private TextField txtE19;

    @FXML
    private TextField txtE20;

    @FXML
    private TextField txtE21;

    @FXML
    private TextField txtE22;

    @FXML
    private TextField txtE23;

    @FXML
    private TextField txtE24;

    @FXML
    private TextField txtE25;

    @FXML
    private TextField txtE26;

    @FXML
    private TextField txtE27;

    @FXML
    private TextField txtE28;

    @FXML
    private TextField txtE29;

    @FXML
    private TextField txtE30;

    @FXML
    private TextField txtS1;

    @FXML
    private TextField txtS2;
    
    @FXML
    private TextField txtS3;

    @FXML
    private TextField txtS4;

    @FXML
    private TextField txtS5;

    @FXML
    private TextField txtS6;

    @FXML
    private TextField txtS7;

    @FXML
    private TextField txtS8;

    @FXML
    private TextField txtS9;

    @FXML
    private TextField txtS10;

    @FXML
    private TextField txtS11;

    @FXML
    private TextField txtS12;

    @FXML
    private TextField txtS13;

    @FXML
    private TextField txtS14;

    @FXML
    private TextField txtS15;

    @FXML
    private TextField txtS16;

    @FXML
    private TextField txtS17;

    @FXML
    private TextField txtS18;

    @FXML
    private TextField txtS19;

    @FXML
    private TextField txtS20;

    @FXML
    private TextField txtS21;

    @FXML
    private TextField txtS22;

    @FXML
    private TextField txtS23;

    @FXML
    private TextField txtS24;

    @FXML
    private TextField txtS25;

    @FXML
    private TextField txtS26;

    @FXML
    private TextField txtS27;

    @FXML
    private TextField txtS28;

    @FXML
    private TextField txtS29;
    
    @FXML
    private TextField txtS30;

    @FXML
    private TextField txtVE1;
    
    @FXML
    private TextField txtVE2;

    @FXML
    private TextField txtVE3;
    
    @FXML
    private TextField txtVE4;

    @FXML
    private TextField txtVE5;

    @FXML
    private TextField txtVE6;

    @FXML
    private TextField txtVE7;

    @FXML
    private TextField txtVE8;

    @FXML
    private TextField txtVE9;

    @FXML
    private TextField txtVE10;

    @FXML
    private TextField txtVE11;

    @FXML
    private TextField txtVE12;

    @FXML
    private TextField txtVE13;

    @FXML
    private TextField txtVE14;

    @FXML
    private TextField txtVE15;

    @FXML
    private TextField txtVE16;

    @FXML
    private TextField txtVE17;

    @FXML
    private TextField txtVE18;

    @FXML
    private TextField txtVE19;

    @FXML
    private TextField txtVE20;

    @FXML
    private TextField txtVE21;

    @FXML
    private TextField txtVE22;

    @FXML
    private TextField txtVE23;

    @FXML
    private TextField txtVE24;

    @FXML
    private TextField txtVE25;

    @FXML
    private TextField txtVE26;

    @FXML
    private TextField txtVE27;

    @FXML
    private TextField txtVE28;

    @FXML
    private TextField txtVE29;

    @FXML
    private TextField txtVE30;

    @FXML
    private TextField txtVS1;

    @FXML
    private TextField txtVS2;

    @FXML
    private TextField txtVS3;

    @FXML
    private TextField txtVS4;

    @FXML
    private TextField txtVS5;

    @FXML
    private TextField txtVS6;

    @FXML
    private TextField txtVS7;

    @FXML
    private TextField txtVS8;

    @FXML
    private TextField txtVS9;

    @FXML
    private TextField txtVS10;

    @FXML
    private TextField txtVS11;

    @FXML
    private TextField txtVS12;

    @FXML
    private TextField txtVS13;

    @FXML
    private TextField txtVS14;

    @FXML
    private TextField txtVS15;

    @FXML
    private TextField txtVS16;

    @FXML
    private TextField txtVS17;

    @FXML
    private TextField txtVS18;

    @FXML
    private TextField txtVS19;

    @FXML
    private TextField txtVS20;

    @FXML
    private TextField txtVS21;

    @FXML
    private TextField txtVS22;

    @FXML
    private TextField txtVS23;

    @FXML
    private TextField txtVS24;

    @FXML
    private TextField txtVS25;

    @FXML
    private TextField txtVS26;

    @FXML
    private TextField txtVS27;

    @FXML
    private TextField txtVS28;

    @FXML
    private TextField txtVS29;

    @FXML
    private TextField txtVS30;

    @FXML
    private TextField txtValorHora;

    @FXML
    void CalcularOnCLick(ActionEvent event) {
    	float HoraTotal = 0;
    	
    	//Caso não informado o valor da hora do funcionario
    	if(txtValorHora.getText().isEmpty()) {
    		Alert faltaValor = new Alert(Alert.AlertType.INFORMATION);
    		faltaValor.setTitle("Valor das Horas!");
    		faltaValor.setContentText("Valor das horas não informado!");
    		faltaValor.showAndWait();
    	}else {
    	
    	//Soma das horas trabalhadas!
    	/*pensar em uma forma de colocar isso em um for, modificando o valor do nome do textfield */
    	HoraTotal = Verificar(HoraTotal, txtE1, txtS1);
    	HoraTotal = Verificar(HoraTotal, txtVE1, txtVS1);
    	
    	HoraTotal = Verificar(HoraTotal, txtE2, txtS2);
    	HoraTotal = Verificar(HoraTotal, txtVE2, txtVS2);
    	
    	HoraTotal = Verificar(HoraTotal, txtE3, txtS3);
    	HoraTotal = Verificar(HoraTotal, txtVE3, txtVS3);
    	
    	HoraTotal = Verificar(HoraTotal, txtE4, txtS4);
    	HoraTotal = Verificar(HoraTotal, txtVE4, txtVS4);
    	
    	HoraTotal = Verificar(HoraTotal, txtE5, txtS5);
    	HoraTotal = Verificar(HoraTotal, txtVE5, txtVS5);
    	
    	HoraTotal = Verificar(HoraTotal, txtE6, txtS6);
    	HoraTotal = Verificar(HoraTotal, txtVE6, txtVS6);
    	
    	HoraTotal = Verificar(HoraTotal, txtE7, txtS7);
    	HoraTotal = Verificar(HoraTotal, txtVE7, txtVS7);
    	
    	HoraTotal = Verificar(HoraTotal, txtE8, txtS8);
    	HoraTotal = Verificar(HoraTotal, txtVE8, txtVS8);
    	
    	HoraTotal = Verificar(HoraTotal, txtE9, txtS9);
    	HoraTotal = Verificar(HoraTotal, txtVE9, txtVS9);
    	
    	HoraTotal = Verificar(HoraTotal, txtE10, txtS10);
    	HoraTotal = Verificar(HoraTotal, txtVE10, txtVS10);
    	
    	HoraTotal = Verificar(HoraTotal, txtE11, txtS11);
    	HoraTotal = Verificar(HoraTotal, txtVE11, txtVS11);
    	
    	HoraTotal = Verificar(HoraTotal, txtE12, txtS12);
    	HoraTotal = Verificar(HoraTotal, txtVE12, txtVS12);
    	
    	HoraTotal = Verificar(HoraTotal, txtE13, txtS13);
    	HoraTotal = Verificar(HoraTotal, txtVE13, txtVS13);
    	
    	HoraTotal = Verificar(HoraTotal, txtE14, txtS14);
    	HoraTotal = Verificar(HoraTotal, txtVE14, txtVS14);
    	
    	HoraTotal = Verificar(HoraTotal, txtE15, txtS15);
    	HoraTotal = Verificar(HoraTotal, txtVE15, txtVS15);
    	
    	HoraTotal = Verificar(HoraTotal, txtE16, txtS16);
    	HoraTotal = Verificar(HoraTotal, txtVE16, txtVS16);
    	
    	HoraTotal = Verificar(HoraTotal, txtE17, txtS17);
    	HoraTotal = Verificar(HoraTotal, txtVE17, txtVS17);
    	
    	HoraTotal = Verificar(HoraTotal, txtE18, txtS18);
    	HoraTotal = Verificar(HoraTotal, txtVE18, txtVS18);
    	
    	HoraTotal = Verificar(HoraTotal, txtE19, txtS19);
    	HoraTotal = Verificar(HoraTotal, txtVE19, txtVS19);
    	
    	HoraTotal = Verificar(HoraTotal, txtE20, txtS20);
    	HoraTotal = Verificar(HoraTotal, txtVE20, txtVS20);
    	
    	HoraTotal = Verificar(HoraTotal, txtE21, txtS21);
    	HoraTotal = Verificar(HoraTotal, txtVE21, txtVS21);
    	
    	HoraTotal = Verificar(HoraTotal, txtE22, txtS22);
    	HoraTotal = Verificar(HoraTotal, txtVE22, txtVS22);
    	
    	HoraTotal = Verificar(HoraTotal, txtE23, txtS23);
    	HoraTotal = Verificar(HoraTotal, txtVE23, txtVS23);
    	
    	HoraTotal = Verificar(HoraTotal, txtE24, txtS24);
    	HoraTotal = Verificar(HoraTotal, txtVE24, txtVS24);
    	
    	HoraTotal = Verificar(HoraTotal, txtE25, txtS25);
    	HoraTotal = Verificar(HoraTotal, txtVE25, txtVS25);
    	
    	HoraTotal = Verificar(HoraTotal, txtE26, txtS26);
    	HoraTotal = Verificar(HoraTotal, txtVE26, txtVS26);
    	
    	HoraTotal = Verificar(HoraTotal, txtE27, txtS27);
    	HoraTotal = Verificar(HoraTotal, txtVE27, txtVS27);
    	
    	HoraTotal = Verificar(HoraTotal, txtE28, txtS28);
    	HoraTotal = Verificar(HoraTotal, txtVE28, txtVS28);
    	
    	HoraTotal = Verificar(HoraTotal, txtE29, txtS29);
    	HoraTotal = Verificar(HoraTotal, txtVE29, txtVS29);
    	
    	HoraTotal = Verificar(HoraTotal, txtE30, txtS30); 
    	HoraTotal = Verificar(HoraTotal, txtVE30, txtVS30);
    	
    	//tranformando o valor do salario em float
   
    	float fValorHora = Float.valueOf(txtValorHora.getText());
    
    	float salario = SalarioFinal(HoraTotal, fValorHora);
  
    	//Informando o salario
    	if(salario != 0) {
	    	Alert alerta = new Alert(Alert.AlertType.INFORMATION);
	    	alerta.setTitle("Salario!");
	    	alerta.setHeaderText("Valor do salario");
	    	alerta.setContentText("Valor do salario do funcionario e: "+ salario);
	    	alerta.showAndWait();
    	}
    	}
    }
   float Verificar (float horasTotais, TextField horaE, TextField horaS) {
	   if(!horaE.getText().isEmpty() && !horaS.getText().isEmpty()) {
		  return(HoraTransformada(horasTotais, horaE.getText(), horaS.getText()));
	   }else {
		   return(horasTotais + 0);
	   }
	   
   }
//Calculo da hora de entrada e saida, que resulta na hora trabalhada;
    float HoraTransformada(float horasTotais, String horasE, String horasS ) {
    	float HoraTrans = 0, HoraSTrans = 0; 
	    	float horasFloat = Float.valueOf(horasE);
	    	int horasInt = (int)horasFloat;
	    	HoraTrans = (((horasFloat - horasInt)/60)*100)+ horasInt; 
    	
        	float horasSFloat = Float.valueOf(horasS);
	    	int horasSInt = (int)horasSFloat;
	    	HoraSTrans = (((horasSFloat - horasSInt)/60)*100)+ horasSInt;
    	horasTotais = horasTotais + (HoraSTrans - HoraTrans);
    	return(horasTotais);
    }
    
    float SalarioFinal(float HoraTotal, float ValorHora){
    	float CalcSalario = HoraTotal * ValorHora;
    	return(CalcSalario);
    }
}
