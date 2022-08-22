module com.pertemuan12.praktikum12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pertemuan12.praktikum12 to javafx.fxml;
    exports com.pertemuan12.praktikum12;
}