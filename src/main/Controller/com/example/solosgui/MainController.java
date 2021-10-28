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
    
    
}
