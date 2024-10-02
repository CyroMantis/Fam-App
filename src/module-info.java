module TugasAkhirSkripsi {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.swing;
    requires java.sql;
    requires com.oracle.database.jdbc;
    requires mysql.connector.java;
    requires java.base;

    
    opens QualityResponAppFAM;
    opens QualityResponAppFAM.Model.UserDaoModel;
    opens QualityResponAppFAM.Model.InputsDaoModel;
    opens QualityResponAppFAM.Model.HasilProsesModel;
    

}
