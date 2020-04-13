package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import static java.lang.Integer.parseInt;

public class Controller <T> implements Initializable {

    @FXML
    private TextField txt_type;

    @FXML
    private TextField txt_antallcore;

    @FXML
    private TextField txt_antallthreads;

    @FXML
    private Label lbl_output;

    @FXML
    private Label lbl_feilmelding;

    @FXML
    private TextField txt_pris;


    public Controller(){

    }
    @FXML
    void btn_add_prosessor(ActionEvent event) throws Unntakk{
        try{
         Prosessor pros=new Prosessor (); //klasse-instans


        pros.setType(txt_type.getText());

        pros.setAntallCore(txt_antallcore.getText());

        pros.setAntallThreads(txt_antallthreads.getText());

        pros.setPris(txt_pris.getText());
        //må være tabel- eller listeview

        lbl_output.setText(pros.toString());

        lbl_feilmelding.setText("Du har lagt et nytt element til TabelView!");
        } catch (Unntakk e){
            lbl_feilmelding.setText( e.getMessage());
        }

    }

//......................................................................................................................



//Minne
    @FXML
    private TextField txt_produsenter;

    @FXML
    private TextField txt_kapasitet;

    @FXML
    private TextField txt_hastighet;

    @FXML
    private Label lbl_feilmelding_minne;

    @FXML
    private TextField txt_pris_minne;

    @FXML
    void btn_add_minne(ActionEvent event) {
        try {
            //minne obj
            Minne obj = new Minne();
            obj.setProdusenter( new SimpleStringProperty(txt_produsenter.getText()));
            obj.setHastighet (new SimpleStringProperty(txt_hastighet.getText() ) );
            obj.setKapasitet (new SimpleStringProperty(txt_kapasitet.getText()));
            obj.setPris(txt_pris_minne.getText());
            lbl_feilmelding.setText("Du har lagt et nytt element til TabelView!");
            komponenter_list.add( obj); //forslag   bruk SimpleObjectProperty()
        }catch (Unntakk e){
            lbl_feilmelding_minne.setText( e.getMessage());
         }


    }
//......................................................................................................................

    ArrayList <Minne>arraylist= new ArrayList<>();
    //Tableview-del

    @FXML
    TableView <Minne>tableView;

    private  TableColumn<Minne, String> komponentnavn;
    private TableColumn<Minne, String> kompBeskrivelse;
    ObservableList<Minne> komponenter_list= FXCollections.observableArrayList();

    @Override
    public void initialize (URL location, ResourceBundle resources) {
        //legge kolonner til tabelview
        //komponentnavn.setCellValueFactory(new PropertyValueFactory<Minne,String>("komponentnavn"));
        //kompBeskrivelse.setCellValueFactory(new PropertyValueFactory<Minne,String>("kompBeskrivelse"));

        tableView.setItems(komponenter_list);


    }
    }