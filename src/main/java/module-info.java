module ukf.sk.udalosti_subor {
    requires javafx.controls;
    requires javafx.fxml;


    opens ukf.sk.udalosti_subor to javafx.fxml;
    exports ukf.sk.udalosti_subor;
}