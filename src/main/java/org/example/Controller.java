package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

    public class Controller {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextArea text;

        @FXML
        void button(ActionEvent event) {
            text.clear();
        }

        @FXML
        void buttonEar(ActionEvent event) {
            Patient p = new Patient("Александра", 27);
            p.dis.setSymptoms("ухо");
            p.complain();
            text.setText("Диагноз: острый отит.\nЛечение: ушные капли \nОтинум.");
        }

        @FXML
        void buttonNose(ActionEvent event) {
            Patient p = new Patient("Александра", 27);
            p.dis.setSymptoms("нос");
            p.complain();
            text.setText("Диагноз: насморк.\nЛечение: капли для носа\nРиностоп.");
        }

        @FXML
        void buttonThroat(ActionEvent event) {
            Patient p = new Patient("Александра", 27);
            p.dis.setSymptoms("горло");
            p.complain();
            text.setText("Диагноз: ОРВИ.\nЛечение: таблетки\nПарацетамол.");
        }

        @FXML
        void initialize() {
            assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'sample.fxml'.";
        }
    }
