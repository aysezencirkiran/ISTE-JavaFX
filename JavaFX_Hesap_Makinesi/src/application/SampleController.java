package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {

    public String islem="";
    public double sonuc=0;
    public double sayi1=0;
    public double ekran=0;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_sonuc;
    
    @FXML
    private Label label1;

    @FXML
    void btn_alti_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("6");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"6");
    	}
    }

    @FXML
    void btn_bes_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("5");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"5");
    	}
    }

    @FXML
    void btn_bir_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("1");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"1");
    	}
    }
    
    public double SonucGetir(String islemim, double sayi2, double sayi3) {
    	
    	if(islemim=="bol") {
    		sonuc=sayi2/sayi3;    	
    	}
    	else if(islemim=="topla") {
    		sonuc=sayi2+sayi3;    	
    	}
    	else if(islemim=="cikar") {
    		sonuc=sayi2-sayi3;	
    	}
    	else if(islemim=="carp") {
    		sonuc=sayi2*sayi3;	
    	}
    	//islem="";
    	return sonuc;
    }

    @FXML
    void btn_bol_tikla(ActionEvent event) {
    	islem="bol";
    	sayi1= Double.parseDouble(txt_sonuc.getText()) ;
    	label1.setText(txt_sonuc.getText()+"/");
    	txt_sonuc.setText("0");
    }

    @FXML
    void btn_carp_tikla(ActionEvent event) {
    	islem="carp";
    	sayi1= Double.parseDouble(txt_sonuc.getText()) ;    	
    	label1.setText(txt_sonuc.getText()+"x");
    	txt_sonuc.setText("0");
    }

    @FXML
    void btn_cikar_tikla(ActionEvent event) {
    	islem="ckar";
    	sayi1= Double.parseDouble(txt_sonuc.getText()) ;    	
    	label1.setText(txt_sonuc.getText()+"-");
    	txt_sonuc.setText("0");
    }

    @FXML
    void btn_dokuz_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("9");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"9");
    	}
    }

    @FXML
    void btn_dort_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("4");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"4");
    	}
    }

    @FXML
    void btn_esittir_tikla(ActionEvent event) {
    	ekran=SonucGetir(islem, sayi1, Double.parseDouble(txt_sonuc.getText()));
    	txt_sonuc.setText(String.valueOf(ekran));
    	label1.setText("");
    }

    @FXML
    void btn_iki_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("2");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"2");
    	}
    }

    @FXML
    void btn_nokta_tikla(ActionEvent event) {
    	if(!txt_sonuc.getText().contains(".")) {
    		txt_sonuc.setText(txt_sonuc.getText()+".");
    	}
    }

    @FXML
    void btn_sekiz_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("8");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"8");
    	}
    }

    @FXML
    void btn_sifir_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"0");
    	}
    }

    @FXML
    void btn_topla_tikla(ActionEvent event) {
    	islem="topla";
    	sayi1= Double.parseDouble(txt_sonuc.getText()) ;    	
    	label1.setText(txt_sonuc.getText()+"+");
    	txt_sonuc.setText("0");
    }

    @FXML
    void btn_uc_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("3");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"3");
    	}
    }

    @FXML
    void btn_yedi_tikla(ActionEvent event) {
    	if(txt_sonuc.getText().equals("0")) {
    		txt_sonuc.setText("7");
    	}
    	else {
    		txt_sonuc.setText(txt_sonuc.getText()+"7");
    	}
    }

    @FXML
    void initialize() {
        assert txt_sonuc != null : "fx:id=\"txt_sonuc\" was not injected: check your FXML file 'MainForm2.fxml'.";

    }
}