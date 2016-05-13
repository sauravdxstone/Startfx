/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startfx;
import javafx.stage.*;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
/**
 *
 * @author SauravGupta
 */
public class Startfx extends Application {

    /**
     * @param args the command line arguments
     */
    Pane pane;
    
    Pane login()
    {
        Pane login = new Pane();
        
        DatePicker datePicker = new DatePicker();
        datePicker.setPrefSize(100, 20);
        datePicker.setLayoutX(230);
        datePicker.setLayoutY(500);
        
        login.setPrefSize(650, 650);
        login.setLayoutX(0.0);
        login.setLayoutY(0.0);
        login.setStyle("-fx-background-color: DARKGREY;");
        
        Button in = new Button("Log In");
        in.setPrefSize(20, 20);
        in.setLayoutX(130);
        in.setLayoutY(90);
       
        Label username = new Label("Enter Username");
        username.setPrefSize(200, 50);
        username.setLayoutX(150);
        username.setLayoutY(40);
        username.setFont(new Font("Comic Sans MS", 20));
        
        TextField textuser = new TextField();
        textuser.setPrefSize(180, 30);
        textuser.setLayoutX(130);
        textuser.setLayoutY(90);
        //textuser.getChildrenUnmodifiable().add(in);
        
        Label pass = new Label("Enter Password");
        pass.setPrefSize(200, 50);
        pass.setLayoutX(150);
        pass.setLayoutY(150);
        pass.setFont(new Font("Comic Sans MS", 20));
        
        PasswordField textpass = new PasswordField();
        textpass.setPrefSize(180, 30);
        textpass.setLayoutX(130);
        textpass.setLayoutY(200);

        
        Button loginbut = new Button("Log In");
        loginbut.setPrefSize(100, 50);
        loginbut.setLayoutX(170);
        loginbut.setLayoutY(260);
        
        Label acc = new Label("No Account ??");
        acc.setPrefSize(200, 50);
        acc.setLayoutX(150);
        acc.setLayoutY(350);
        acc.setFont(new Font("Comic Sans MS", 20));
        
        Label create = new Label("Create One ;)");
        create.setPrefSize(200, 50);
        create.setLayoutX(160);
        create.setLayoutY(390);
        create.setFont(new Font("Comic Sans MS", 20));
        
        Button signupbut = new Button("Sign Up");
        signupbut.setPrefSize(100, 50);
        signupbut.setLayoutX(160);
        signupbut.setLayoutY(450);
        signupbut.setFont(new Font("Comic Sans MS", 15));
        
             signupbut.setOnAction(new EventHandler<ActionEvent>() {
             @Override 
             public void handle(ActionEvent e) {

                pane.getChildren().add(signup());
                pane.getChildren().remove(login);
             
              }
});
        
        
        login.getChildren().addAll( datePicker, username, textuser, pass, textpass,loginbut, acc, create, signupbut);
        
   
        return login;
    }
    
    Pane signup()
    {
        
        Pane signup = new Pane();

        signup.setPrefSize(650, 650);
        signup.setLayoutX(0.0);
        signup.setLayoutY(0.0);
        signup.setStyle("-fx-background-color: yellow;");
        
        Label detail = new Label("Enter Your Details!!");
        detail.setPrefSize(400, 70);
        detail.setLayoutX(50);
        detail.setLayoutY(60);
        detail.setFont(new Font("Comic Sans MS", 40));
        
        Label fname = new Label("First Name:");
        fname.setPrefSize(200, 50);
        fname.setLayoutX(50);
        fname.setLayoutY(150);
        fname.setFont(new Font("Comic Sans MS", 20));
        
        TextField ftname = new TextField();
        ftname.setPrefSize(200, 30);
        ftname.setLayoutX(250);
        ftname.setLayoutY(160);
        
        Label lname = new Label("Last Name:");
        lname.setPrefSize(200, 50);
        lname.setLayoutX(50);
        lname.setLayoutY(200);
        lname.setFont(new Font("Comic Sans MS", 20));
        
        TextField ltname = new TextField();
        ltname.setPrefSize(200, 30);
        ltname.setLayoutX(250);
        ltname.setLayoutY(210);
        
        Label uname = new Label("Username:");
        uname.setPrefSize(200, 50);
        uname.setLayoutX(50);
        uname.setLayoutY(250);
        uname.setFont(new Font("Comic Sans MS", 20));
        
        TextField utname = new TextField();
        utname.setPrefSize(200, 30);
        utname.setLayoutX(250);
        utname.setLayoutY(260);
        
        Label pword = new Label("Password:");
        pword.setPrefSize(200, 50);
        pword.setLayoutX(50);
        pword.setLayoutY(300);
        pword.setFont(new Font("Comic Sans MS", 20));
        
        TextField ptword = new TextField();
        ptword.setPrefSize(200, 30);
        ptword.setLayoutX(250);
        ptword.setLayoutY(310);
        
        Label cpword = new Label("Confirm Password:");
        cpword.setPrefSize(200, 50);
        cpword.setLayoutX(50);
        cpword.setLayoutY(350);
        cpword.setFont(new Font("Comic Sans MS", 20));
        
        TextField cptword = new TextField();
        cptword.setPrefSize(200, 30);
        cptword.setLayoutX(250);
        cptword.setLayoutY(360);
        
        Button register = new Button("Register");
        register.setPrefSize(150, 50);
        register.setLayoutX(160);
        register.setLayoutY(450);
        register.setFont(new Font("Comic Sans MS", 15));
        
        Button goback = new Button("Go Back");
        goback.setPrefSize(100, 50);
        goback.setLayoutX(0);
        goback.setLayoutY(0);
        goback.setFont(new Font("Comic Sans MS", 15));
        
        
        
        goback.setOnAction(new EventHandler<ActionEvent>() {
             @Override 
             public void handle(ActionEvent e) {
             /*panel.remove(panel3);
                          panel.add(login());
                          panel.revalidate();
                          panel.repaint();*/
                pane.getChildren().remove(signup);
                pane.getChildren().addAll(login());
             
    }
});
        signup.getChildren().addAll(detail, fname, ftname, lname, ltname,uname, utname, pword, ptword, cpword, cptword, register, goback);
        
       
        return signup;
        
    }
    
    Pane calculator()
    {
        Pane calcul = new Pane();
        
        calcul.setPrefSize(450, 650);
        calcul.setLayoutX(650.0);
        calcul.setLayoutY(0.0);
        calcul.setStyle("-fx-background-color: GRAY;");
        
        ChoiceBox months = new ChoiceBox();
        months.getItems().addAll("January", "February","March","April","May", "June",
                            "July", "August", "September", "October", "November", "December");
        months.setPrefSize(130, 40);
        months.setLayoutX(100);
        months.setLayoutY(50);
        months.setStyle("-fx-font: 20px \"Serif\";");
        
        
        ChoiceBox years = new ChoiceBox();
        years.getItems().addAll("1997", "1998", "1999", "2000", "2001", "2002", "2003", 
            "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",  
            "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020");
        years.setPrefSize(100, 40);
        years.setLayoutX(300);
        years.setLayoutY(50);
        years.setStyle("-fx-font: 20px \"Serif\";");
        
        int i, j;
        
        Button [][] day = new Button[1][7];
        day[0][0] = new Button("Sun");
        day[0][1] = new Button("Mon");
        day[0][2] = new Button("Tue");
        day[0][3] = new Button("Wed");
        day[0][4] = new Button("Thu");
        day[0][5] = new Button("Fri");
        day[0][6] = new Button("Sat");
        
        for(j=0; j<7; j++)
        {
        day[0][j].setPrefSize(50, 35);
        day[0][j].setLayoutX(35 + j*50 );
        day[0][j].setLayoutY(160);
        day[0][j].setFont(new Font("Comic Sans MS", 13));
        day[0][j].setDisable(true);
        calcul.getChildren().addAll(day[0][j]);
        }
        
        calcul.getChildren().addAll(months, years);// day[0][7]);
        
        return calcul;
    }
    Pane mainpane()
    {
         pane = new Pane();
        pane.getChildren().add(login());
        pane.getChildren().add(calculator());
        return pane;
        
    }
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("TITLE of the window");
 
        Scene scene = new Scene(mainpane(), 1100, 650);
        
        primaryStage.setScene(scene);
        
       primaryStage.show();
 
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
