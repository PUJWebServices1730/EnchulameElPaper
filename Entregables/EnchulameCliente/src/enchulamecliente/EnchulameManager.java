/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchulamecliente;

import enchulamecliente.controller.LoginController;
import enchulamecliente.controller.Sign_upController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Oscar
 */
public class EnchulameManager {

    private Scene scene;

    public EnchulameManager(Scene scene) {
        this.scene = scene;
    }

    public FXMLLoader vista(String archivo) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(archivo)
            );
            Parent parent = loader.load();
            scene.setRoot(parent);
            return loader;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void showLoginScreen() {
        FXMLLoader loader = vista("interfaces/Login.fxml");
        if (loader == null) {
            return;
        }
        LoginController controller = loader.<LoginController>getController();
        controller.initManager(this);

    }

    public void showRegister() {
       FXMLLoader loader = vista("interfaces/Sign_up.fxml");
        if (loader == null) {
            return;
        }
        Sign_upController controller = loader.<Sign_upController>getController();
        controller.initManager(this);

    }
}
