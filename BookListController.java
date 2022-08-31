package library.librarymanager;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class BookListController {

    @FXML
    private TableColumn<?, ?> authorCol;

    @FXML
    private TableColumn<?, ?> availabilityCol;

    @FXML
    private TableColumn<?, ?> bookCol;

    @FXML
    private TableColumn<?, ?> publisherCol;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> titleCol;

}
