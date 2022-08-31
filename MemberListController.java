package library.librarymanager;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class MemberListController {

    @FXML
    private TableColumn<?, ?> emailCol;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> mobileCol;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TableView<?> tableView;

}
