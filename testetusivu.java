//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.oht_ii_projekti_sustalli;

import java.io.IOException;
import java.text.ParseException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.jdom2.JDOMException;

public class Etusivu extends Application {
    public void start(Stage stage) {
        Label otsikko = new Label("ETUSIVU");
        otsikko.setStyle("-fx-font-size: 28px; -fx-font-weight: bold; -fx-text-fill: white;");
        HBox otsikkoBox = new HBox(new Node[]{otsikko});
        otsikkoBox.setAlignment(Pos.CENTER);
        TextField l1 = new TextField("LAIDUN 1");
        TextField l2 = new TextField("LAIDUN 2");
        TextField l3 = new TextField("LAIDUN 3");
        TextField l4 = new TextField("LAIDUN 4");
        l1.setEditable(false);
        l2.setEditable(false);
        l3.setEditable(false);
        l4.setEditable(false);
        Label tieto1 = new Label("Tietoa laitumesta");
        Label tieto2 = new Label("Tietoa laitumesta");
        Label tieto3 = new Label("Tietoa laitumesta");
        Label tieto4 = new Label("Tietoa laitumesta");
        String pinkButtonStyle = "-fx-background-color: #ffb3d9;-fx-text-fill: black;-fx-font-weight: bold;-fx-background-radius: 12;-fx-padding: 6 12 6 12;";
        Button b1 = new Button("Muokkaa Laidun 1");
        Button b2 = new Button("Muokkaa Laidun 2");
        Button b3 = new Button("Muokkaa Laidun 3");
        Button b4 = new Button("Muokkaa Laidun 4");
        b1.setStyle(pinkButtonStyle);
        b2.setStyle(pinkButtonStyle);
        b3.setStyle(pinkButtonStyle);
        b4.setStyle(pinkButtonStyle);
        b1.setOnAction((e) -> (new MuokkaaLaidunta("Laidun 1")).show());
        b2.setOnAction((e) -> (new MuokkaaLaidunta("Laidun 2")).show());
        b3.setOnAction((e) -> (new MuokkaaLaidunta("Laidun 3")).show());
        b4.setOnAction((e) -> (new MuokkaaLaidunta("Laidun 4")).show());
        GridPane grid = new GridPane();
        grid.setHgap((double)20.0F);
        grid.setVgap((double)10.0F);
        grid.setPadding(new Insets((double)20.0F));
        grid.add(l1, 0, 0);
        grid.add(tieto1, 0, 1);
        grid.add(b1, 0, 2);
        grid.add(l2, 1, 0);
        grid.add(tieto2, 1, 1);
        grid.add(b2, 1, 2);
        grid.add(l3, 2, 0);
        grid.add(tieto3, 2, 1);
        grid.add(b3, 2, 2);
        grid.add(l4, 3, 0);
        grid.add(tieto4, 3, 1);
        grid.add(b4, 3, 2);
        String darkPinkButtonStyle = "-fx-background-color: #b30086;-fx-text-fill: white;-fx-font-size: 15px;-fx-font-weight: bold;-fx-background-radius: 20;-fx-padding: 10 20 10 20;";
        Button btnElaimet = new Button("Muokkaa eläinten määrää tallilla");
        Button btnSiirra = new Button("Siirrä eläimiä laidunten välillä");
        Button btnRaportti = new Button("Luo raportti");
        Button btnLisaaLaidun = new Button("Lisää uusi laidun");
        Button btnToimenpide = new Button("Kirjaa toimenpide laitumella");
        Button btnSade = new Button("Sade nappi");
        btnElaimet.setStyle(darkPinkButtonStyle);
        btnSiirra.setStyle(darkPinkButtonStyle);
        btnRaportti.setStyle(darkPinkButtonStyle);
        btnLisaaLaidun.setStyle(darkPinkButtonStyle);
        btnToimenpide.setStyle(darkPinkButtonStyle);
        btnSade.setStyle(darkPinkButtonStyle);
        btnElaimet.setOnAction((e) -> (new TallinElaimet()).show());
        btnSiirra.setOnAction((e) -> (new SiirraElaimia()).show());
        btnRaportti.setOnAction((e) -> (new LuoRaportti()).show());
        btnLisaaLaidun.setOnAction((e) -> (new LisaaLaidun()).show());
        btnToimenpide.setOnAction((e) -> (new ToimenpideLaidun()).show());
        btnSade.setOnAction((e) -> {
            try {
                (new Sadepaivat()).show();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ParseException | JDOMException ex) {
                throw new RuntimeException(ex);
            }
        });
        HBox rivi1 = new HBox((double)20.0F, new Node[]{btnElaimet, btnSiirra, btnRaportti});
        HBox rivi2 = new HBox((double)20.0F, new Node[]{btnLisaaLaidun, btnToimenpide, btnSade});
        rivi1.setAlignment(Pos.CENTER);
        rivi2.setAlignment(Pos.CENTER);
        VBox uudetPainikkeet = new VBox((double)15.0F, new Node[]{rivi1, rivi2});
        VBox root = new VBox((double)20.0F, new Node[]{otsikkoBox, grid, uudetPainikkeet});
        root.setPadding(new Insets((double)20.0F));
        root.setStyle("-fx-background-image: url('com/example/oht_ii_projekti_sustalli/taustakuva01.jpg');-fx-background-size: cover;-fx-background-position: center center;");
        stage.setScene(new Scene(root, (double)900.0F, (double)650.0F));
        stage.setTitle("SUSTALLI – Etusivu");
        stage.show();
    }
}
