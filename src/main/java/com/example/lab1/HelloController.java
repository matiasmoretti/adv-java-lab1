package com.example.lab1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onClickButton() {
        welcomeText.setText("Welcome to Lab-01");
    }

}