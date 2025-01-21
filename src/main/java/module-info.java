module cuc.xh.filetransport.fts {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    opens cuc.xh.filetransport.fts to javafx.fxml;
    exports cuc.xh.filetransport.fts;
}