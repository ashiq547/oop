module com.muaaz.tutorial_2.fishhatcharyfarm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.muaaz.tutorial_2.fishhatcharyfarm to javafx.fxml;
    exports com.muaaz.tutorial_2.fishhatcharyfarm;
}