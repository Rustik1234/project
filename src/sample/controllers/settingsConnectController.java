package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class settingsConnectController {

    @FXML
    private TextField dbPass_Field;

    @FXML
    private PasswordField dbName_Field;

    @FXML
    private TextField dbHost_Field;

    @FXML
    private TextField dbUser_Field;

    @FXML
    private Button testConnectButton;

}
