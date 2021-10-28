package com.example.solosgui;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class MainController {
    public TextField produto;
    public TextField municipio;
    public TextField talhao;
    public TextField data;
    public TextField lote;
    public TextField totalArea;
    public TextField areaTalhao;
    public TextField matriculaLote;
    public TextField texturaSolo;
    public TextField sistemaDeCultivo;
    public TextField responsavel;
    public TextField profundidade;

    public TextField fosforoNoSolo;
    public Text fosforoIdeal;
    public Text fosforoAposCorrecoes;

    public TextField calcioNoSolo;
    public Text calcioIdeal;
    public Text calcioAposCorrecoes;

    public TextField potassioNoSolo;
    public Text potassioIdeal;
    public Text potassioAposCorrecoes;

    public TextField magnesioNoSolo;
    public Text magnesioIdeal;
    public Text magnesioAposCorrecoes;

    public TextField enxofreNoSolo;
    public Text enxofreIdeal;
    public Text enxofreAposCorrecoes;

    public TextField aluminioNoSolo;
    public Text aluminioIdeal;
    public Text aluminioAposCorrecoes;

    public TextField hPlusAlNoSolo;
    public Text hPlusAlIdeal;
    public Text hPlusAlAposCorrecoes;

    //fosforo controller
    public TextField teorFosforoAtingir;
    public TextField fonteFosforo;
    public TextField eficienciaFosforo;
    public Text custoTotalFosforo;
    public Text quantidadeAplicarFosforo;
    public Text primeiroNutrienteAdicionalFosforo;
    public Text segundoNutrienteAdicionalFosforo;
    public Button buttonCalcularFosforo;
    
    //calciomag controller

    public TextField potassioCTCDesejada;
    public TextField fontePotassio;
    public Text custoTotalCalcioMag;
    public Text participacaoCTCAtual;
    public Text primeiroIngredienteAdicionalCalcioMag;
    public Text secondIngredienteAdicionalCalcioMag;
    public Text quantidadeAplicarCalcioMag;
    public Button buttonCalcularCalcioMag;
    
    //postasio controller 
    public TextField fonteCorretivo;
    public TextField calcioCTCDesejada;
    public TextField pRNT;
    public TextField teorCaOCorretivo;
    public Text custoTotalPotassio;
    public Text potassioCTCAtual;
    public Text primeiroNutrienteAdicionalPotasio;
    public Text segundoNutrienteAdicionalPotasio;
    public Text quantidadeAplicarPotassio;
    public Text vPorcentagemAtual;
    public Text vPorcentagemAosCorrecoes;
    public Button buttonCalcularPotassio;

    public void actionTextura(ActionEvent actionEvent) {
        texturaEscolhida();
    }

    private void texturaEscolhida(){
        try{
            if(Integer.parseInt(texturaSolo.getCharacters().toString())==1){
                fosforoIdeal.setText("9.0");
                potassioIdeal.setText("0.35");
                calcioIdeal.setText("6.0");
                magnesioIdeal.setText("1.5");
                enxofreIdeal.setText("9.0");
                aluminioIdeal.setText("0.0");
                hPlusAlIdeal.setText("0.0");
            }else{
                Alert warningAlert = new Alert(Alert.AlertType.WARNING);
                warningAlert.setHeaderText("Unavailable");
                warningAlert.setContentText("The input used is unavailable");
                warningAlert.showAndWait();
            }
        }catch(Exception e){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Invalid input");
            errorAlert.setContentText("The input used is invalid");
            errorAlert.showAndWait();
        }
    }

    public void buttonCalcularFosforoAction(ActionEvent actionEvent) {
        quantidadeAplicarFosforo.setText(calculaQuantidadeAplicar(teorFosforoAtingir, fonteFosforo));
        fosforoAposCorrecoes.setText(teorFosforoAtingir.getText());
        custoTotalFosforo.setText(String.valueOf(Double.parseDouble(quantidadeAplicarFosforo.getText()) * Double.parseDouble(fonteFosforo.getText())));
    }
    public void buttonCalcularCalcioMagAction(ActionEvent actionEvent) {
        quantidadeAplicarCalcioMag.setText(calculaQuantidadeAplicar(calcioCTCDesejada,teorCaOCorretivo ));
        calcioAposCorrecoes.setText(calcioCTCDesejada.getText());
        magnesioAposCorrecoes.setText(calcioCTCDesejada.getText());
        custoTotalCalcioMag.setText(String.valueOf(Double.parseDouble(quantidadeAplicarCalcioMag.getText()) * Double.parseDouble(fonteCorretivo.getText())));
    }
    public void buttonCalcularPotassioAction(ActionEvent actionEvent) {
        quantidadeAplicarPotassio.setText(calculaQuantidadeAplicar(potassioCTCDesejada, fontePotassio));
        potassioAposCorrecoes.setText(potassioCTCDesejada.getText());
        custoTotalPotassio.setText(String.valueOf(Double.parseDouble(quantidadeAplicarPotassio.getText()) * Double.parseDouble(fontePotassio.getText())));
    }

    public String calculaQuantidadeAplicar(
            TextField necessidade,
            TextField teor) {
        try{
            double necessidade_double = Double.parseDouble(necessidade.getCharacters().toString());
            double teor_double = Double.parseDouble(teor.getCharacters().toString());
            if (necessidade_double <= 0) {
                throw new IllegalArgumentException();
            }
            return String.valueOf( necessidade_double / teor_double);
        }catch (Exception e){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Invalid input");
            errorAlert.setContentText("The input used is invalid");
            errorAlert.showAndWait();
            return "error";
        }

    }
}
