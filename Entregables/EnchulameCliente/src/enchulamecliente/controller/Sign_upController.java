/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchulamecliente.controller;


import com.enchulame.autor.AutorService;
import com.enchulame.autor.AutorWS;
import com.enchulame.revisor.RevisorService;
import com.enchulame.revisor.RevisorWS;
import com.enchulame.usuario.UsuarioService;
import com.enchulame.usuario.UsuarioWS;
import com.enchulame.ws.Usuario;
import enchulamecliente.EnchulameManager;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Popup;

/**
 * FXML Controller class
 *
 * @author Oscar
 */
public class Sign_upController implements Initializable {

    private EnchulameManager em;
    @FXML
    private Button registro;
    @FXML
    private TextField nombres, apellidos, email, contrasena, confcontra;
    @FXML
    private Label mensaje;
    @FXML
    private TableView especialidad;
    @FXML
    private ListView abc;
    @FXML
    private CheckBox revisor, autor, editor;

    @FXML
    private void clickRegistrar(ActionEvent event) throws IOException {
       
       
        RevisorService rs= new RevisorService();
        UsuarioService us = new UsuarioService();
        AutorService as = new AutorService();
        mensaje.setText("");
        if (nombres.getText().equals("")) {
            mensaje.setText("Ingrese su nombre");
            return;
        }
        if (apellidos.getText().equals("")) {
            mensaje.setText("Ingrese su apellido");
            return;
        }
        if (!email.getText().matches( "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            mensaje.setText("Ingrese un correo válido");
            return;
        }
        if (!isStrong()) {
            return;
        }
        System.out.println("Registrando a: " + nombres.getText() + " " + apellidos.getText());
        RevisorWS rws = rs.getRevisorWS();
        UsuarioWS uws = us.getUsuarioWS();
        AutorWS aws= as.getAutorWS();
        
        List<String> seleccion= abc.getSelectionModel().getSelectedItems();

        Usuario usuario= uws.crearUsuario(nombres.getText(), apellidos.getText(), contrasena.getText(), email.getText());
       if(autor.isSelected())
           aws.crearAutor(usuario);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        RevisorService res= new RevisorService();
        RevisorWS rws= res.getRevisorWS();
        List<String>val=rws.palabrasClaves();
       
        ListProperty<String> listProperty = new SimpleListProperty<>();
         listProperty.set(FXCollections.observableArrayList(val));
        abc.itemsProperty().bind(listProperty);
        abc.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        revisor.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
               // revisor.setSelected(!newValue);
                System.out.println(":D");
                if(!revisor.isSelected())
                    abc.setDisable(true);
                else
                     abc.setDisable(false);
            }
          });
       
    }

    public void initManager(EnchulameManager enchulame) {
        em = enchulame;
    }

private boolean isStrong(){
    
    String pass= contrasena.getText();
    if(pass.equals(confcontra.getText()))
        if(!pass.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=.]).*$")){
           mensaje.setText("Contraseña débil: 8 caracteres. Mayús, letras y números");
           return false;
        }
        else
            return true;
    else
    {
      mensaje.setText("Contraseñas diferentes");
           return false;
    }
  }

}
