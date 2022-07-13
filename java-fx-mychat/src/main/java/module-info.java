module ru.gb.javafxmychat {
    requires javafx.controls;
    requires javafx.fxml;


    exports ru.gb.javafxmychat.client;
    opens ru.gb.javafxmychat.client to javafx.fxml;
}