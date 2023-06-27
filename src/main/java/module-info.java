module com.senac.arithomazini.bibliotecadesktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senac.arithomazini.bibliotecadesktop to javafx.fxml;
    exports com.senac.arithomazini.bibliotecadesktop;
}