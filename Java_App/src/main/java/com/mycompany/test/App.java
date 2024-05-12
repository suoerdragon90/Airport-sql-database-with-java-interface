package com.mycompany.test;

//connection imports
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App extends Frame implements ActionListener {

//variables for game
    long cookies = 0;

//frames
    Frame f1 = new Frame("Home");
    Frame f9 = new Frame("Reservation");
    Frame f2 = new Frame("Airport");
    Frame f3 = new Frame("Airline");
    Frame f4 = new Frame("Flight");
    Frame f5 = new Frame("Flight leg");
    Frame f8 = new Frame("Leg instance");
    Frame f7 = new Frame("Airplane");
    Frame f6 = new Frame("Airplane type");
    Frame f10 = new Frame("Game");

    //Home frame
    Button f1b1 = new Button("Reservation");
    Button f1b2 = new Button("Airport");
    Button f1b3 = new Button("Airline");
    Button f1b4 = new Button("Flight");
    Button f1b5 = new Button("Flight leg");
    Button f1b6 = new Button("Leg instance");
    Button f1b7 = new Button("Airplane");
    Button f1b8 = new Button("Airplane type");
    Button f1b9 = new Button("Game");
    Label f1l1 = new Label("");
    //Reservation frame
    Label f9l1 = new Label("ID");
    TextField f9t1 = new TextField();
    Label f9l2 = new Label("Name");
    TextField f9t2 = new TextField();
    Label f9l3 = new Label("Phone");
    TextField f9t3 = new TextField();
    Label f9l4 = new Label("Seat Number");
    TextField f9t4 = new TextField();
    Label f9l5 = new Label("Leg instance id");
    TextField f9t5 = new TextField();
    Button f9b1 = new Button("Insert");
    Button f9b2 = new Button("Delete");
    Button f9b3 = new Button("View");
    Button f9b4 = new Button("Update");
    Button f9b5 = new Button("Back");
    TextArea f9A = new TextArea();
    Label fG1 = new Label("Supremeking_Khaled1YT = 99999999999999999");
    Label fG2 = new Label("Mohamed = 90000000000");
    Label fG3 = new Label("Survivor = 8999999999");
    Label fG4 = new Label("Manuel = 10000");
    Label fG5 = new Label("Mostafa = 6000");
    //Airport Frame
    Label f2l1 = new Label("Airport code");
    TextField f2t1 = new TextField("");
    Label f2l2 = new Label("Airport name");
    TextField f2t2 = new TextField();
    Label f2l3 = new Label("City");
    TextField f2t3 = new TextField();
    Label f2l4 = new Label("State");
    TextField f2t4 = new TextField();
    TextArea f2A = new TextArea();
    Button f2b1 = new Button("Insert");
    Button f2b2 = new Button("Delete");
    Button f2b3 = new Button("View");
    Button f2b4 = new Button("Update");
    Button f2b5 = new Button("Back");

    //Airline Frame
    Label f3l1 = new Label("Airline code");
    TextField f3t1 = new TextField();
    Label f3l2 = new Label("Airline name");
    TextField f3t2 = new TextField();
    TextArea f3A = new TextArea();

    Button f3b1 = new Button("Insert");
    Button f3b2 = new Button("Delete");
    Button f3b3 = new Button("View");
    Button f3b4 = new Button("Update");
    Button f3b5 = new Button("Back");

    //Flight Frame
    Label f4l1 = new Label("Flight Number");
    TextField f4t1 = new TextField();
    Label f4l2 = new Label("Weekdays");
    TextField f4t2 = new TextField();
    Label f4l3 = new Label("Airline code");
    TextField f4t3 = new TextField();
    TextArea f4A = new TextArea();

    Button f4b1 = new Button("Insert");
    Button f4b2 = new Button("Delete");
    Button f4b3 = new Button("View");
    Button f4b4 = new Button("Update");
    Button f4b5 = new Button("Back");

    //Flight leg Frame
    Label f5l1 = new Label("Leg Number");
    TextField f5t1 = new TextField();
    Label f5l2 = new Label("Sheduled Deprature time");
    TextField f5t2 = new TextField();
    Label f5l3 = new Label("Sheduled Arrival time");
    TextField f5t3 = new TextField();
    Label f5l4 = new Label("Deparure Airport");
    TextField f5t4 = new TextField();
    Label fa6l5 = new Label("Flight Number");
    TextField f5t5 = new TextField();
    Label f5l6 = new Label("Arrival Airport");
    TextField f5t6 = new TextField();
    TextArea f5A = new TextArea();

    Button f5b1 = new Button("Insert");
    Button f5b2 = new Button("Delete");
    Button f5b3 = new Button("View");
    Button f5b4 = new Button("Update");
    Button f5b5 = new Button("Back");

    //Leg instance Frame
    Label f8l1 = new Label("Leg instance ID");
    TextField f8t1 = new TextField();
    Label f8l2 = new Label("Date ");
    TextField f8t2 = new TextField();
    Label f8l3 = new Label("Depature Airport");
    TextField f8t3 = new TextField();
    Label f8l4 = new Label("Depature Time");
    TextField f8t4 = new TextField();
    Label f8l5 = new Label("Arrival Airport");
    TextField f8t5 = new TextField();
    Label f8l6 = new Label("Arrival Time");
    TextField f8t6 = new TextField();
    Label f8l7 = new Label("Leg Number");
    TextField f8t7 = new TextField();
    Label f8l8 = new Label("Airplane ID");
    TextField f8t8 = new TextField();
    Label f8l9 = new Label("Numper of available seats");
    TextField f8t9 = new TextField();
    TextArea f8A = new TextArea();

    Button f8b1 = new Button("Insert");
    Button f8b2 = new Button("Delete");
    Button f8b3 = new Button("View");
    Button f8b4 = new Button("Update");
    Button f8b5 = new Button("Back");

    //Airplane Frame
    Label f7l1 = new Label("Airplane ID");
    TextField f7t1 = new TextField();
    Label f7l2 = new Label("Total Number of seats");
    TextField f7t2 = new TextField();
    Label f7l3 = new Label("Airplane Type ID");
    TextField f7t3 = new TextField();
    TextArea f7A = new TextArea();

    Button f7b1 = new Button("Insert");
    Button f7b2 = new Button("Delete");
    Button f7b3 = new Button("View");
    Button f7b4 = new Button("Update");
    Button f7b5 = new Button("Back");

    //Airplane type Frame
    Label f6l1 = new Label("Type Name");
    TextField f6t1 = new TextField();
    Label f6l2 = new Label("Manufacturing Name");
    TextField f6t2 = new TextField();
    Label f6l3 = new Label("Maximum Number of Seats");
    TextField f6t3 = new TextField();
    TextArea f6A = new TextArea();

    Button f6b1 = new Button("Insert");
    Button f6b2 = new Button("Delete");
    Button f6b3 = new Button("View");
    Button f6b4 = new Button("Update");
    Button f6b5 = new Button("Back");

    //Game_center
    Label f10l1 = new Label("cookie clicker");
    Button f10b1 = new Button("cookie");
    Label f10Cookie = new Label("Cookies = " + "0");
    Button f10back = new Button("Back");

    //constructor
    App() {
        //Home
        //Frames
        f1.setLayout(null);
        f1.setBounds(500, 100, 610, 600);
        f1.setVisible(true);
        f1.setBackground(Color.lightGray);
        f1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        //Component check sizes
        f1b2.setBounds(200, 50, 200, 50);
        f1b3.setBounds(200, 105, 200, 50);
        f1b4.setBounds(200, 160, 200, 50);
        f1b5.setBounds(200, 215, 200, 50);
        f1b8.setBounds(200, 270, 200, 50);
        f1b7.setBounds(200, 325, 200, 50);
        f1b6.setBounds(200, 380, 200, 50);
        f1b1.setBounds(200, 435, 200, 50);
        f1b9.setBounds(200, 500, 200, 50);
        f1l1.setBounds(200, 555, 150, 20);
        //add Component
        f1.add(f1b1);
        f1.add(f1b2);
        f1.add(f1b3);
        f1.add(f1b4);
        f1.add(f1b5);
        f1.add(f1b6);
        f1.add(f1b7);
        f1.add(f1b8);
        f1.add(f1b9);
        f1.add(f1l1);

        //Action
        f1b1.addActionListener(this);
        f1b2.addActionListener(this);
        f1b3.addActionListener(this);
        f1b4.addActionListener(this);
        f1b5.addActionListener(this);
        f1b6.addActionListener(this);
        f1b7.addActionListener(this);
        f1b8.addActionListener(this);
        f1b9.addActionListener(this);
        //Reserve
        //Frames
        f9.setLayout(null);
        f9.setBounds(500, 100, 610, 600);
        f9.setBackground(Color.lightGray);
        f9.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        //Component check sizes
        f9l1.setBounds(10, 50, 150, 50);
        f9t1.setBounds(160, 50, 100, 50);
        f9l2.setBounds(10, 100, 150, 50);
        f9t2.setBounds(160, 100, 100, 50);
        f9l3.setBounds(10, 150, 150, 50);
        f9t3.setBounds(160, 150, 100, 50);
        f9l4.setBounds(10, 200, 150, 50);
        f9t4.setBounds(160, 200, 100, 50);
        f9l5.setBounds(10, 250, 120, 50);
        f9t5.setBounds(160, 250, 100, 50);
        f9A.setBounds(300, 50, 300, 300);

        f9b1.setBounds(100, 500, 50, 50);
        f9b2.setBounds(200, 500, 50, 50);
        f9b3.setBounds(300, 500, 50, 50);
        f9b4.setBounds(400, 500, 50, 50);
        f9b5.setBounds(500, 500, 50, 50);

        //add Component
        f9.add(f9l1);
        f9.add(f9t1);
        f9.add(f9l2);
        f9.add(f9t2);
        f9.add(f9l3);
        f9.add(f9t3);
        f9.add(f9l4);
        f9.add(f9t4);
        f9.add(f9l5);
        f9.add(f9t5);
        f9.add(f9b1);
        f9.add(f9b2);
        f9.add(f9b3);
        f9.add(f9b4);
        f9.add(f9b5);
        f9.add(f9A);
        //Action
        f9b1.addActionListener(this);
        f9b2.addActionListener(this);
        f9b3.addActionListener(this);
        f9b4.addActionListener(this);
        f9b5.addActionListener(this);

        //Airport
        //Frame
        f2.setLayout(null);
        f2.setBounds(500, 100, 610, 600);
        f2.setBackground(Color.lightGray);
        f2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
//Airport
        //components check size
        f2l1.setBounds(10, 50, 150, 50);
        f2t1.setBounds(160, 50, 100, 50);
        f2l2.setBounds(10, 100, 150, 50);
        f2t2.setBounds(160, 100, 100, 50);
        f2l3.setBounds(10, 150, 150, 50);
        f2t3.setBounds(160, 150, 100, 50);
        f2l4.setBounds(10, 200, 150, 50);
        f2t4.setBounds(160, 200, 100, 50);
        f2A.setBounds(300, 50, 300, 300);

        f2b1.setBounds(100, 500, 50, 50);
        f2b2.setBounds(200, 500, 50, 50);
        f2b3.setBounds(300, 500, 50, 50);
        f2b4.setBounds(400, 500, 50, 50);
        f2b5.setBounds(500, 500, 50, 50);

        //add
        f2.add(f2l1);
        f2.add(f2t1);
        f2.add(f2l2);
        f2.add(f2t2);
        f2.add(f2l3);
        f2.add(f2t3);
        f2.add(f2l4);
        f2.add(f2t4);
        f2.add(f2A);

        f2.add(f2b1);
        f2.add(f2b2);
        f2.add(f2b3);
        f2.add(f2b4);
        f2.add(f2b5);
        //Action
        f2b1.addActionListener(this);
        f2b2.addActionListener(this);
        f2b3.addActionListener(this);
        f2b4.addActionListener(this);
        f2b5.addActionListener(this);

        //Airline
        //Frame
        f3.setLayout(null);
        f3.setBounds(500, 100, 610, 600);
        f3.setBackground(Color.lightGray);
        f3.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        //components check size
        f3l1.setBounds(10, 50, 150, 50);
        f3t1.setBounds(160, 50, 100, 50);
        f3l2.setBounds(10, 100, 150, 50);
        f3t2.setBounds(160, 100, 100, 50);
        f3A.setBounds(300, 50, 300, 300);

        f3b1.setBounds(100, 500, 50, 50);
        f3b2.setBounds(200, 500, 50, 50);
        f3b3.setBounds(300, 500, 50, 50);
        f3b4.setBounds(400, 500, 50, 50);
        f3b5.setBounds(500, 500, 50, 50);

        //add
        f3.add(f3l1);
        f3.add(f3t1);
        f3.add(f3l2);
        f3.add(f3t2);
        f3.add(f3A);
        f3.add(f3b1);
        f3.add(f3b2);
        f3.add(f3b3);
        f3.add(f3b4);
        f3.add(f3b5);

        //Action
        f3b1.addActionListener(this);
        f3b2.addActionListener(this);
        f3b3.addActionListener(this);
        f3b4.addActionListener(this);
        f3b5.addActionListener(this);

        //Flight
        //Frame
        f4.setLayout(null);
        f4.setBounds(500, 100, 610, 600);
        f4.setBackground(Color.lightGray);
        f4.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        //components check size
        f4l1.setBounds(10, 50, 150, 50);
        f4t1.setBounds(160, 50, 100, 50);
        f4l2.setBounds(10, 100, 150, 50);
        f4t2.setBounds(160, 100, 100, 50);
        f4l3.setBounds(10, 150, 150, 50);
        f4t3.setBounds(160, 150, 100, 50);
        f4A.setBounds(300, 50, 300, 300);

        f4b1.setBounds(100, 500, 50, 50);
        f4b2.setBounds(200, 500, 50, 50);
        f4b3.setBounds(300, 500, 50, 50);
        f4b4.setBounds(400, 500, 50, 50);
        f4b5.setBounds(500, 500, 50, 50);

        //add
        f4.add(f4l1);
        f4.add(f4t1);
        f4.add(f4l2);
        f4.add(f4t2);
        f4.add(f4l3);
        f4.add(f4t3);
        f4.add(f4A);
        f4.add(f4b1);
        f4.add(f4b2);
        f4.add(f4b3);
        f4.add(f4b4);
        f4.add(f4b5);
        //Action
        f4b1.addActionListener(this);
        f4b2.addActionListener(this);
        f4b3.addActionListener(this);
        f4b4.addActionListener(this);
        f4b5.addActionListener(this);

        //Flight leg 
        //Frame
        f5.setLayout(null);
        f5.setBounds(500, 100, 610, 600);
        f5.setBackground(Color.lightGray);
        f5.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        //components check size
        f5l1.setBounds(10, 50, 150, 50);
        f5t1.setBounds(160, 50, 100, 50);
        f5l2.setBounds(10, 100, 150, 50);
        f5t2.setBounds(160, 100, 100, 50);
        f5l3.setBounds(10, 150, 150, 50);
        f5t3.setBounds(160, 150, 100, 50);
        f5l4.setBounds(10, 200, 150, 50);
        f5t4.setBounds(160, 200, 100, 50);
        fa6l5.setBounds(10, 250, 150, 50);
        f5t5.setBounds(160, 250, 100, 50);
        f5l6.setBounds(10, 300, 150, 50);
        f5t6.setBounds(160, 300, 100, 50);
        f5A.setBounds(300, 50, 300, 300);

        f5b1.setBounds(100, 500, 50, 50);
        f5b2.setBounds(200, 500, 50, 50);
        f5b3.setBounds(300, 500, 50, 50);
        f5b4.setBounds(400, 500, 50, 50);
        f5b5.setBounds(500, 500, 50, 50);

        //add
        f5.add(f5l1);
        f5.add(f5t1);
        f5.add(f5l2);
        f5.add(f5t2);
        f5.add(f5l3);
        f5.add(f5t3);
        f5.add(f5l4);
        f5.add(f5t4);
        f5.add(fa6l5);
        f5.add(f5t5);
        f5.add(f5l6);
        f5.add(f5t6);

        f5.add(f5A);
        f5.add(f5b1);
        f5.add(f5b2);
        f5.add(f5b3);
        f5.add(f5b4);
        f5.add(f5b5);
        //Action
        f5b1.addActionListener(this);
        f5b2.addActionListener(this);
        f5b3.addActionListener(this);
        f5b4.addActionListener(this);
        f5b5.addActionListener(this);

        //Leg instance
        //Frame
        f8.setLayout(null);
        f8.setBounds(500, 100, 610, 600);
        f8.setBackground(Color.lightGray);
        f8.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        //components check size
        f8l1.setBounds(10, 50, 150, 50);
        f8t1.setBounds(160, 50, 100, 50);
        f8l2.setBounds(10, 100, 150, 50);
        f8t2.setBounds(160, 100, 100, 50);
        f8l3.setBounds(10, 150, 150, 50);
        f8t3.setBounds(160, 150, 100, 50);
        f8l4.setBounds(10, 200, 150, 50);
        f8t4.setBounds(160, 200, 100, 50);
        f8l5.setBounds(10, 250, 150, 50);
        f8t5.setBounds(160, 250, 100, 50);
        f8l6.setBounds(10, 300, 150, 50);
        f8t6.setBounds(160, 300, 100, 50);
        f8l7.setBounds(10, 350, 150, 50);
        f8t7.setBounds(160, 350, 100, 50);
        f8l8.setBounds(10, 400, 150, 50);
        f8t8.setBounds(160, 400, 100, 40);
        f8l9.setBounds(10, 440, 150, 50);
        f8t9.setBounds(160, 440, 100, 40);
        f8A.setBounds(300, 50, 300, 300);

        f8b1.setBounds(100, 500, 50, 50);
        f8b2.setBounds(200, 500, 50, 50);
        f8b3.setBounds(300, 500, 50, 50);
        f8b4.setBounds(400, 500, 50, 50);
        f8b5.setBounds(500, 500, 50, 50);

        //add
        f8.add(f8l1);
        f8.add(f8t1);
        f8.add(f8l2);
        f8.add(f8t2);
        f8.add(f8l3);
        f8.add(f8t3);
        f8.add(f8l4);
        f8.add(f8t4);
        f8.add(f8l5);
        f8.add(f8t5);
        f8.add(f8l6);
        f8.add(f8t6);
        f8.add(f8l7);
        f8.add(f8t7);
        f8.add(f8l8);
        f8.add(f8t8);
        f8.add(f8l9);
        f8.add(f8t9);

        f8.add(f8A);
        f8.add(f8b1);
        f8.add(f8b2);
        f8.add(f8b3);
        f8.add(f8b4);
        f8.add(f8b5);
        //Action
        f8b1.addActionListener(this);
        f8b2.addActionListener(this);
        f8b3.addActionListener(this);
        f8b4.addActionListener(this);
        f8b5.addActionListener(this);

//Airplane
        //Frame
        f7.setLayout(null);
        f7.setBounds(500, 100, 610, 600);
        f7.setBackground(Color.lightGray);
        f7.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        //components check size
        f7l1.setBounds(10, 50, 150, 50);
        f7t1.setBounds(160, 50, 100, 50);
        f7l2.setBounds(10, 100, 150, 50);
        f7t2.setBounds(160, 100, 100, 50);
        f7l3.setBounds(10, 150, 150, 50);
        f7t3.setBounds(160, 150, 100, 50);
        f7A.setBounds(300, 50, 300, 300);

        f7b1.setBounds(100, 500, 50, 50);
        f7b2.setBounds(200, 500, 50, 50);
        f7b3.setBounds(300, 500, 50, 50);
        f7b4.setBounds(400, 500, 50, 50);
        f7b5.setBounds(500, 500, 50, 50);

        //add
        f7.add(f7l1);
        f7.add(f7t1);
        f7.add(f7l2);
        f7.add(f7t2);
        f7.add(f7l3);
        f7.add(f7t3);
        f7.add(f7A);
        f7.add(f7b1);
        f7.add(f7b2);
        f7.add(f7b3);
        f7.add(f7b4);
        f7.add(f7b5);
        //Action
        f7b1.addActionListener(this);
        f7b2.addActionListener(this);
        f7b3.addActionListener(this);
        f7b4.addActionListener(this);
        f7b5.addActionListener(this);

        //Airplane Type
        //Frames
        f6.setLayout(null);
        f6.setBounds(500, 100, 610, 600);
        f6.setBackground(Color.lightGray);
        f6.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        //Plane type
        //Component check sizes
        f6l1.setBounds(10, 50, 150, 50);
        f6t1.setBounds(160, 50, 100, 50);
        f6l2.setBounds(10, 100, 150, 50);
        f6t2.setBounds(160, 100, 100, 50);
        f6l3.setBounds(10, 150, 150, 50);
        f6t3.setBounds(160, 150, 100, 50);

        f6b1.setBounds(100, 500, 50, 50);
        f6b2.setBounds(200, 500, 50, 50);
        f6b3.setBounds(300, 500, 50, 50);
        f6b4.setBounds(400, 500, 50, 50);
        f6b5.setBounds(500, 500, 50, 50);
        f6A.setBounds(300, 50, 300, 300);

        //add Component
        f6.add(f6l1);
        f6.add(f6t1);
        f6.add(f6l2);
        f6.add(f6t2);
        f6.add(f6l3);
        f6.add(f6t3);
        f6.add(f6b1);
        f6.add(f6b2);
        f6.add(f6b3);
        f6.add(f6b4);
        f6.add(f6b5);
        f6.add(f6A);
        //Action
        f6b1.addActionListener(this);
        f6b2.addActionListener(this);
        f6b3.addActionListener(this);
        f6b4.addActionListener(this);
        f6b5.addActionListener(this);
        //Edit TextArea
        f9A.setEditable(false);
        f2A.setEditable(false);
        f3A.setEditable(false);
        f4A.setEditable(false);
        f5A.setEditable(false);
        f8A.setEditable(false);
        f7A.setEditable(false);
        f6A.setEditable(false);
        //Icon Frame
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\main\\resources\\Database.png");
        f1.setIconImage(icon);
        f9.setIconImage(icon);
        f2.setIconImage(icon);
        f3.setIconImage(icon);
        f4.setIconImage(icon);
        f5.setIconImage(icon);
        f8.setIconImage(icon);
        f7.setIconImage(icon);
        f6.setIconImage(icon);
        f10.setIconImage(icon);

        //Game_corner

        f10.setLayout(null);
        f10.setBounds(500, 100, 610, 600);
        f10.setBackground(Color.gray);
        f10.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        f10l1.setBounds(270, 20, 110, 50);
        f10b1.setBounds(270, 80, 100, 50);
        f10Cookie.setBounds(270, 140, 100, 50);
        f10back.setBounds(500, 500, 50, 50);
        f10.add(f10l1);
        f10.add(f10b1);
        f10.add(f10Cookie);
        f10.add(f10back);
        f10back.addActionListener(this);
        f10b1.addActionListener(this);
        fG1.setBounds(100, 200, 300, 50);
        fG2.setBounds(100, 250, 200, 50);
        fG3.setBounds(100, 300, 200, 50);
        fG4.setBounds(100, 350, 200, 50);
        fG5.setBounds(100, 400, 200, 50);
f10.add(fG1);f10.add(fG2);f10.add(fG3);f10.add(fG4);f10.add(fG5);




    }

    public static void main(String[] args) {
        //frame
        App ap = new App();
        //Connection
        String Url = "jdbc:sqlserver://localhost:1433;" + "database=Airport;" + "user=project;" + "password=1234;" + "encrypt=false;" + "trustServerCertificate=true;";
        try {
            Connection Con = DriverManager.getConnection(Url);
            ap.f1l1.setText("Connection Established");

        } catch (SQLException e) {
            ap.f1l1.setText("Connection Failed");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Home
        if (e.getSource() == f1b1) {
            f1.setVisible(false);
            f9.setVisible(true);
        }
        if (e.getSource() == f1b2) {
            f1.setVisible(false);
            f2.setVisible(true);
        }
        if (e.getSource() == f1b3) {
            f1.setVisible(false);
            f3.setVisible(true);
        }
        if (e.getSource() == f1b4) {
            f1.setVisible(false);
            f4.setVisible(true);
        }
        if (e.getSource() == f1b5) {
            f1.setVisible(false);
            f5.setVisible(true);
        }
        if (e.getSource() == f1b6) {
            f1.setVisible(false);
            f8.setVisible(true);
        }
        if (e.getSource() == f1b7) {
            f1.setVisible(false);
            f7.setVisible(true);
        }
        if (e.getSource() == f1b8) {
            f1.setVisible(false);
            f6.setVisible(true);
        }
        if (e.getSource() == f1b9) {
            f1.setVisible(false);
            f10.setVisible(true);
        }
        String Url = "jdbc:sqlserver://localhost:1433;" + "database=Airport;" + "user=project;" + "password=1234;" + "encrypt=false;" + "trustServerCertificate=true;";
        //Airport 
        //insert
        if (e.getSource() == f2b1) {
            String x = f2t1.getText() + "\n" + f2t2.getText() + "\n" + f2t3.getText() + "\n" + f2t4.getText();
            f2A.setText(x);
            String airportCode = f2t1.getText();
            String airportName = f2t2.getText();
            String city = f2t3.getText();
            String state = f2t4.getText();

            String insertQuery = "INSERT INTO Airport (Airport_Code, Airport_Name, City, State) VALUES (?, ?, ?, ?)";

            try (Connection Con = DriverManager.getConnection(Url); PreparedStatement pst = Con.prepareStatement(insertQuery)) {

                pst.setString(1, airportCode);
                pst.setString(2, airportName);
                pst.setString(3, city);
                pst.setString(4, state);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airport record inserted successfully.");
                } else {
                    System.out.println("Failed to insert Airport record.");
                }
            } catch (SQLException ex) {
                System.out.println("Error inserting Airport record: " + ex.getMessage());
            }
        }
//delete
        if (e.getSource() == f2b2) {
            String airportCodeToDelete = f2t1.getText();
            f2t1.setText("");
            f2t2.setText("");
            f2t3.setText("");
            f2t4.setText("");
            f2A.setText("");

            String deleteQuery = "DELETE FROM Airport WHERE Airport_Code = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(deleteQuery)) {

                pst.setString(1, airportCodeToDelete);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airport record with Airport_Code = " + airportCodeToDelete + " deleted successfully.");
                } else {
                    System.out.println("No records deleted. Airport record with Airport_Code = " + airportCodeToDelete + " not found.");
                }
            } catch (SQLException ex) {
                System.out.println("Error deleting Airport record: " + ex.getMessage());
            }
        }
//select
        if (e.getSource() == f2b3) {
            String selectAllQuery = "SELECT * FROM Airport";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(selectAllQuery)) {

                ResultSet rs = pst.executeQuery();

                StringBuilder result = new StringBuilder();

                while (rs.next()) {
                    result.append("Airport Code: ").append(rs.getString("Airport_Code")).append("\n")
                            .append("Airport Name: ").append(rs.getString("Airport_Name")).append("\n")
                            .append("City: ").append(rs.getString("City")).append("\n")
                            .append("State: ").append(rs.getString("State")).append("\n\n");
                }

                if (result.length() > 0) {
                    f2A.setText(result.toString());
                } else {
                    f2A.setText("No records found in the Airport table");
                }

            } catch (SQLException ex) {
                System.out.println("Error Viewing for Airport records: " + ex.getMessage());
            }
        }
//update
        if (e.getSource() == f2b4) {
            String airportCodeToUpdate = f2t1.getText();
            String newAirportName = f2t2.getText();
            String newCity = f2t3.getText();
            String newState = f2t4.getText();

            String updateQuery = "UPDATE Airport SET Airport_Name = ?, City = ?, State = ? WHERE Airport_Code = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(updateQuery)) {

                pst.setString(1, newAirportName);
                pst.setString(2, newCity);
                pst.setString(3, newState);
                pst.setString(4, airportCodeToUpdate);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airport record with AirportCode = " + airportCodeToUpdate + " updated successfully.");
                } else {
                    System.out.println("No records updated. Airport record with AirportCode = " + airportCodeToUpdate + " not found.");
                }

            } catch (SQLException ex) {
                System.out.println("Error updating Airport record: " + ex.getMessage());
            }
        }

        if (e.getSource() == f2b5) {
            f2.setVisible(false);
            f1.setVisible(true);
        }

        //Airline
        //insert
        if (e.getSource() == f3b1) {
            String x = f3t1.getText() + "\n" + f3t2.getText();
            f3A.setText(x);
            String Airline_code = f3t1.getText();
            String Name = f3t2.getText();

            String insertQuery = "INSERT INTO Airline (Airline_code, Name) VALUES (?, ?)";

            try (Connection Con = DriverManager.getConnection(Url); PreparedStatement pst = Con.prepareStatement(insertQuery)) {

                pst.setString(1, Airline_code);
                pst.setString(2, Name);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airline record inserted successfully.");
                } else {
                    System.out.println("Failed to insert Airline record.");
                }
            } catch (SQLException ex) {
                System.out.println("Error inserting Airline record: " + ex.getMessage());
            }
        }
//delete
        if (e.getSource() == f3b2) {
            String airlineCodeToDelete = f3t1.getText();
            f3t1.setText("");
            f3t2.setText("");
            f3A.setText("");
            String deleteQuery = "DELETE FROM Airline WHERE Airline_Code = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(deleteQuery)) {

                pst.setString(1, airlineCodeToDelete);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airline record with Airline_Code = " + airlineCodeToDelete + " deleted successfully.");
                } else {
                    System.out.println("No records deleted. Airline record with Airline_Code = " + airlineCodeToDelete + " not found.");
                }
            } catch (SQLException ex) {
                System.out.println("Error deleting Airline record: " + ex.getMessage());
            }
        }
//select
        if (e.getSource() == f3b3) {
            String selectAllQuery = "SELECT * FROM Airline";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(selectAllQuery)) {

                ResultSet rs = pst.executeQuery();

                StringBuilder result = new StringBuilder();

                while (rs.next()) {
                    result.append("Airline code: ").append(rs.getString("Airline_code")).append("\n")
                            .append("Name: ").append(rs.getString("Name")).append("\n\n");
                }

                if (result.length() > 0) {
                    f3A.setText(result.toString());
                } else {
                    f3A.setText("No records found in the Airline table");
                }

            } catch (SQLException ex) {
                System.out.println("Error Viewing for Airline records: " + ex.getMessage());
            }
        }
//update
        if (e.getSource() == f3b4) {
            String airlineCodeToUpdate = f3t1.getText();
            String newAirlineName = f3t2.getText();
            String updateQuery = "UPDATE airline SET Name = ? WHERE Airline_code = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(updateQuery)) {

                pst.setString(1, newAirlineName);
                pst.setString(2, airlineCodeToUpdate);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airline record with AirportCode = " + airlineCodeToUpdate + " updated successfully.");
                } else {
                    System.out.println("No records updated. Airline record with Airline = " + airlineCodeToUpdate + " not found.");
                }

            } catch (SQLException ex) {
                System.out.println("Error updating Airport record: " + ex.getMessage());
            }
        }

        if (e.getSource() == f3b5) {
            f3.setVisible(false);
            f1.setVisible(true);
        }
        //Flight
//insert
        if (e.getSource() == f4b1) {
            String x = f4t1.getText() + "\n" + f4t2.getText() + "\n" + f4t3.getText();
            f4A.setText(x);
            String Flight_number = f4t1.getText();
            String weekdays = f4t2.getText();
            String Airline_code = f4t3.getText();
            String insertQuery = "INSERT INTO Flight (Flight_number, weekdays,Airline_code) VALUES (?, ?, ?)";

            try (Connection Con = DriverManager.getConnection(Url); PreparedStatement pst = Con.prepareStatement(insertQuery)) {

                pst.setString(1, Flight_number);
                pst.setString(2, weekdays);
                pst.setString(3, Airline_code);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Flight record inserted successfully.");
                } else {
                    System.out.println("Failed to insert Flight record.");
                }
            } catch (SQLException ex) {
                System.out.println("Error inserting Flight record: " + ex.getMessage());
            }
        }
        //delete
        if (e.getSource() == f4b2) {
            String Flight_numberToDelete = f4t1.getText();
            f4t1.setText("");
            f4t2.setText("");
            f4t3.setText("");
            f4A.setText("");
            String deleteQuery = "DELETE FROM Flight WHERE Flight_number = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(deleteQuery)) {

                pst.setString(1, Flight_numberToDelete);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Flight record with Flight number = " + Flight_numberToDelete + " deleted successfully.");
                } else {
                    System.out.println("No records deleted. Flight record with Flight number = " + Flight_numberToDelete + " not found.");
                }
            } catch (SQLException ex) {
                System.out.println("Error deleting Flight record: " + ex.getMessage());
            }
        }
//select
        if (e.getSource() == f4b3) {
            String selectAllQuery = "SELECT * FROM Flight";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(selectAllQuery)) {

                ResultSet rs = pst.executeQuery();

                StringBuilder result = new StringBuilder();

                while (rs.next()) {
                    result.append("Flight number: ").append(rs.getString("Flight_number")).append("\n")
                            .append("weekdays: ").append(rs.getString("weekdays")).append("\n")
                            .append("Airline code: ").append(rs.getString("Airline_code")).append("\n\n");
                }

                if (result.length() > 0) {
                    f4A.setText(result.toString());
                } else {
                    f4A.setText("No records found in the Flight table");
                }

            } catch (SQLException ex) {
                System.out.println("Error Viewing for Flight records: " + ex.getMessage());
            }
        }
//update
        if (e.getSource() == f4b4) {
            String Flight_numbercodetoupdate = f4t1.getText();
            String newweekdays = f4t2.getText();
            String newAirline_code = f4t3.getText();
            String updateQuery = "UPDATE airline SET weekdays = ?,Airline_code=? WHERE Flight_number = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(updateQuery)) {

                pst.setString(1, newweekdays);
                pst.setString(2, newAirline_code);
                pst.setString(3, Flight_numbercodetoupdate);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Flight record with Flight_numbercodetoupdate = " + Flight_numbercodetoupdate + " updated successfully.");
                } else {
                    System.out.println("No records updated. Flight record with Flight_numbercodetoupdate = " + Flight_numbercodetoupdate + " not found.");
                }

            } catch (SQLException ex) {
                System.out.println("Error updating Airport record: " + ex.getMessage());
            }
        }

        if (e.getSource() == f4b5) {
            f4.setVisible(false);
            f1.setVisible(true);
        }

        //Flight leg
        //insert
        if (e.getSource() == f5b1) {
            String x = f5t1.getText() + "\n" + f5t2.getText() + "\n" + f5t3.getText() + "\n" + f5t4.getText() + "\n" + f5t5.getText() + "\n" + f5t6.getText();
            f5A.setText(x);
            String Leg_number = f5t1.getText();
            String scheduled_Departure_time = f5t2.getText();
            String scheduled_Arrival_time = f5t3.getText();
            String Departure_Airport = f5t4.getText();
            String Flight_number = f5t5.getText();
            String Arrival_Airport = f5t6.getText();
            String insertQuery = "INSERT INTO Flight_leg (Leg_number,scheduled_Departure_time,scheduled_Arrival_time,Departure_Airport,Flight_number,Arrival_Airport) VALUES (?, ?, ?, ?, ?, ?)";

            try (Connection Con = DriverManager.getConnection(Url); PreparedStatement pst = Con.prepareStatement(insertQuery)) {

                pst.setString(1, Leg_number);
                pst.setString(2, scheduled_Departure_time);
                pst.setString(3, scheduled_Arrival_time);
                pst.setString(4, Departure_Airport);
                pst.setString(5, Flight_number);
                pst.setString(6, Arrival_Airport);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Flight_leg record inserted successfully.");
                } else {
                    System.out.println("Failed to insert Flight_leg record.");
                }
            } catch (SQLException ex) {
                System.out.println("Error inserting Flight_leg record: " + ex.getMessage());
            }
        }
        //dele
        if (e.getSource() == f5b2) {
            String Leg_numberCodeToDelete = f5t1.getText();
            f5t1.setText("");
            f5t2.setText("");
            f5t3.setText("");
            f5t4.setText("");
            f5t5.setText("");
            f5t6.setText("");
            f5A.setText("");
            String deleteQuery = "DELETE FROM Flight_leg WHERE Leg_number = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(deleteQuery)) {

                pst.setString(1, Leg_numberCodeToDelete);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Leg number record with Leg_number = " + Leg_numberCodeToDelete + " deleted successfully.");
                } else {
                    System.out.println("No records deleted. Leg number record with Leg_number = " + Leg_numberCodeToDelete + " not found.");
                }
            } catch (SQLException ex) {
                System.out.println("Error deleting Leg number record: " + ex.getMessage());
            }
        }
//select
        if (e.getSource() == f5b3) {
            String selectAllQuery = "SELECT * FROM Flight_leg";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(selectAllQuery)) {

                ResultSet rs = pst.executeQuery();

                StringBuilder result = new StringBuilder();

                while (rs.next()) {
                    result.append("Leg number: ").append(rs.getString("Leg_number")).append("\n")
                            .append("scheduled Departure time: ").append(rs.getString("scheduled_Departure_time")).append("\n")
                            .append("scheduled Arrival time: ").append(rs.getString("scheduled_Arrival_time")).append("\n")
                            .append("Departure Airport: ").append(rs.getString("Departure_Airport")).append("\n")
                            .append("Flight number: ").append(rs.getString("Flight_number")).append("\n")
                            .append("Arrival Airport: ").append(rs.getString("Arrival_Airport")).append("\n\n");
                }

                if (result.length() > 0) {
                    f5A.setText(result.toString());
                } else {
                    f5A.setText("No records found in the Flight_leg table");
                }

            } catch (SQLException ex) {
                System.out.println("Error Viewing for Flight_leg records: " + ex.getMessage());
            }
        }
//update
        if (e.getSource() == f5b4) {
            String leg_number = f5t1.getText();
            String scheduled_Departure_time = f5t2.getText();
            String scheduled_Arrival_time = f5t3.getText();
            String Departure_Airport = f5t4.getText();
            String Flight_number = f5t5.getText();
            String Arrival_Airport = f5t6.getText();
            String updateQuery = "UPDATE Flight_leg SET scheduled_Departure_time=?,scheduled_Arrival_time=?,Departure_Airport=?,Flight_number=?,Arrival_Airport=? WHERE Leg_number = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(updateQuery)) {

                pst.setString(1, scheduled_Departure_time);
                pst.setString(2, scheduled_Arrival_time);
                pst.setString(3, Departure_Airport);
                pst.setString(4, Flight_number);
                pst.setString(5, Arrival_Airport);
                pst.setString(6, leg_number);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Flight leg record with FLeg_number = " + leg_number + " updated successfully.");
                } else {
                    System.out.println("No records updated. Flight leg record with Leg_number = " + leg_number + " not found.");
                }

            } catch (SQLException ex) {
                System.out.println("Error updating Flight leg record: " + ex.getMessage());
            }
        }

        if (e.getSource() == f5b5) {
            f5.setVisible(false);
            f1.setVisible(true);
        }

        //Airplane_type
        //insert
        if (e.getSource() == f6b1) {
            String x = f6t1.getText() + "\n" + f6t2.getText() + "\n" + f6t3.getText() + "\n";
            f6A.setText(x);
            String Airplane_Type_name = f6t1.getText();
            String Manufactring_name = f6t2.getText();
            String Max_num_of_seats = f6t3.getText();
            String insertQuery = "INSERT INTO Airplane_type (Airplane_Type_name,Manufactring_name,Max_num_of_seats) VALUES (?, ?, ?)";

            try (Connection Con = DriverManager.getConnection(Url); PreparedStatement pst = Con.prepareStatement(insertQuery)) {

                pst.setString(1, Airplane_Type_name);
                pst.setString(2, Manufactring_name);
                pst.setString(3, Max_num_of_seats);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airplane_type record inserted successfully.");
                } else {
                    System.out.println("Failed to insert Airplane_type record.");
                }
            } catch (SQLException ex) {
                System.out.println("Error inserting Airplane_type record: " + ex.getMessage());
            }
        }
        //delete
        if (e.getSource() == f6b2) {
            String Airplane_TypeCodeToDelete = f6t1.getText();
            f6t1.setText("");
            f6t2.setText("");
            f6t3.setText("");
            f6A.setText("");
            String deleteQuery = "DELETE FROM Airplane_Type WHERE Airplane_Type_name = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(deleteQuery)) {

                pst.setString(1, Airplane_TypeCodeToDelete);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airplane Type record with Airplane_Type_name = " + Airplane_TypeCodeToDelete + " deleted successfully.");
                } else {
                    System.out.println("No records deleted. Airplane Type record with Airplane_Type_name = " + Airplane_TypeCodeToDelete + " not found.");
                }
            } catch (SQLException ex) {
                System.out.println("Error deleting Airplane Type record: " + ex.getMessage());
            }
        }
        //select
        if (e.getSource() == f6b3) {
            String selectAllQuery = "SELECT * FROM Airplane_type";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(selectAllQuery)) {

                ResultSet rs = pst.executeQuery();

                StringBuilder result = new StringBuilder();

                while (rs.next()) {
                    result.append("Airplane Type name: ").append(rs.getString("Airplane_Type_name")).append("\n")
                            .append("Manufactring name: ").append(rs.getString("Manufactring_name")).append("\n")
                            .append("Max num of seats: ").append(rs.getString("Max_num_of_seats")).append("\n\n");
                }

                if (result.length() > 0) {
                    f6A.setText(result.toString());
                } else {
                    f6A.setText("No records found in the Airplane_type table");
                }

            } catch (SQLException ex) {
                System.out.println("Error Viewing for Airplane_type records: " + ex.getMessage());
            }
        }
        //update
        if (e.getSource() == f6b4) {
            String Airplane_Type_name = f6t1.getText();
            String Manufactring_name = f6t2.getText();
            String Max_num_of_seats = f6t3.getText();
            String updateQuery = "UPDATE Airplane_type SET Manufactring_name=?,Max_num_of_seats=? WHERE Airplane_Type_name = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(updateQuery)) {

                pst.setString(1, Manufactring_name);
                pst.setString(2, Max_num_of_seats);
                pst.setString(3, Airplane_Type_name);
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airplane Type record with Airplane Type name = " + Airplane_Type_name + " updated successfully.");
                } else {
                    System.out.println("No records updated. Airplane Type record with Airplane Type name = " + Airplane_Type_name + " not found.");
                }

            } catch (SQLException ex) {
                System.out.println("Error updating Airplane Type record: " + ex.getMessage());
            }
        }

        if (e.getSource() == f6b5) {
            f6.setVisible(false);
            f1.setVisible(true);
        }
        //Airplane
//insert
        if (e.getSource() == f7b1) {
            String x = f7t1.getText() + "\n" + f7t2.getText() + "\n" + f7t3.getText();
            f7A.setText(x);
            String Airplane_id = f7t1.getText();
            String Total_num_of_seats = f7t2.getText();
            String Airplane_type_id = f7t3.getText();
            String insertQuery = "INSERT INTO Airplane (Airplane_id,Total_num_of_seats,Airplane_type_id) VALUES (?, ?, ?)";

            try (Connection Con = DriverManager.getConnection(Url); PreparedStatement pst = Con.prepareStatement(insertQuery)) {

                pst.setString(1, Airplane_id);
                pst.setString(2, Total_num_of_seats);
                pst.setString(3, Airplane_type_id);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airplane record inserted successfully.");
                } else {
                    System.out.println("Failed to insert Airplane record.");
                }
            } catch (SQLException ex) {
                System.out.println("Error inserting Airplane record: " + ex.getMessage());
            }
        }
        //delete
        if (e.getSource() == f7b2) {
            String Airplane_idCodeToDelete = f7t1.getText();
            f7t1.setText("");
            f7t2.setText("");
            f7t3.setText("");
            f7A.setText("");
            String deleteQuery = "DELETE FROM Airplane WHERE Airplane_id = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(deleteQuery)) {

                pst.setString(1, Airplane_idCodeToDelete);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airplane record with Airplane_id = " + Airplane_idCodeToDelete + " deleted successfully.");
                } else {
                    System.out.println("No records deleted. Airplane record with Airplane_id = " + Airplane_idCodeToDelete + " not found.");
                }
            } catch (SQLException ex) {
                System.out.println("Error deleting Airplane record: " + ex.getMessage());
            }
        }
//select
        if (e.getSource() == f7b3) {
            String selectAllQuery = "SELECT * FROM Airplane";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(selectAllQuery)) {

                ResultSet rs = pst.executeQuery();

                StringBuilder result = new StringBuilder();

                while (rs.next()) {
                    result.append("Airplane id: ").append(rs.getString("Airplane_id")).append("\n")
                            .append("Total num of seats: ").append(rs.getString("Total_num_of_seats")).append("\n")
                            .append("Airplane type id: ").append(rs.getString("Airplane_type_id")).append("\n\n");
                }

                if (result.length() > 0) {
                    f7A.setText(result.toString());
                } else {
                    f7A.setText("No records found in the Airplane table");
                }

            } catch (SQLException ex) {
                System.out.println("Error Viewing for Airplane records: " + ex.getMessage());
            }
        }
//update
        if (e.getSource() == f7b4) {
            String Airplane_id = f7t1.getText();
            String Total_num_of_seats = f7t2.getText();
            String Airplane_type_id = f7t3.getText();

            String updateQuery = "UPDATE Airplane SET Total_num_of_seats = ?, Airplane_type_id = ? WHERE Airplane_id = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(updateQuery)) {

                pst.setString(1, Total_num_of_seats);
                pst.setString(2, Airplane_type_id);
                pst.setString(3, Airplane_id);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Airplane record with Airplane_id=" + Airplane_id + " updated successfully.");
                } else {
                    System.out.println("No records updated. Airplane record with Airplane_id=" + Airplane_id + " not found.");
                }

            } catch (SQLException ex) {
                System.out.println("Error updating Airplane record: " + ex.getMessage());
            }
        }

        if (e.getSource() == f7b5) {
            f7.setVisible(false);
            f1.setVisible(true);
        }
        //Leg instance
        //insert
        if (e.getSource() == f8b1) {
            String x = f8t1.getText() + "\n" + f8t2.getText() + "\n" + f8t3.getText() + "\n" + f8t4.getText() + "\n" + f8t5.getText() + "\n" + f8t6.getText() + "\n" + f8t7.getText() + "\n" + f8t8.getText() + "\n" + f8t9.getText();
            f8A.setText(x);
            String Leg_instance_id = f8t1.getText();
            String Date = f8t2.getText();
            String Departure_Airport = f8t3.getText();
            String Departure_time = f8t4.getText();
            String Arrival_Airport = f8t5.getText();
            String Arrival_time = f8t6.getText();
            String Leg_Number = f8t7.getText();
            String Airplane_id = f8t8.getText();
            String Number_of_available_seats = f8t9.getText();

            String insertQuery = "INSERT INTO Leg_instance (Leg_instance_id,Date,Departure_Airport,Departure_time,Arrival_Airport,Arrival_time,Leg_Number,Airplane_id,Number_of_available_seats) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (Connection Con = DriverManager.getConnection(Url); PreparedStatement pst = Con.prepareStatement(insertQuery)) {

                pst.setString(1, Leg_instance_id);
                pst.setString(2, Date);
                pst.setString(3, Departure_Airport);
                pst.setString(4, Departure_time);
                pst.setString(5, Arrival_Airport);
                pst.setString(6, Arrival_time);
                pst.setString(7, Leg_Number);
                pst.setString(8, Airplane_id);
                pst.setString(9, Number_of_available_seats);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Leg_instance record inserted successfully.");
                } else {
                    System.out.println("Failed to insert Leg_instance record.");
                }
            } catch (SQLException ex) {
                System.out.println("Error inserting Leg_instance record: " + ex.getMessage());
            }
        }
        //delete
        if (e.getSource() == f8b2) {
            String Leg_instance_idCodeToDelete = f8t1.getText();
            f8t1.setText("");
            f8t2.setText("");
            f8t3.setText("");
            f8t4.setText("");
            f8t5.setText("");
            f8t6.setText("");
            f8t7.setText("");
            f8t8.setText("");
            f8t9.setText("");
            f8A.setText("");
            String deleteQuery = "DELETE FROM Leg_instance WHERE Leg_instance_id = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(deleteQuery)) {

                pst.setString(1, Leg_instance_idCodeToDelete);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Leg_instance record with Leg_instance_id = " + Leg_instance_idCodeToDelete + " deleted successfully.");
                } else {
                    System.out.println("No records deleted. Leg_instance record with Leg_instance_id = " + Leg_instance_idCodeToDelete + " not found.");
                }
            } catch (SQLException ex) {
                System.out.println("Error deleting Leg_instance record: " + ex.getMessage());
            }
        }
//select
        if (e.getSource() == f8b3) {
            String selectAllQuery = "SELECT * FROM Leg_instance";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(selectAllQuery)) {

                ResultSet rs = pst.executeQuery();

                StringBuilder result = new StringBuilder();

                while (rs.next()) {
                    result.append("Leg instance id: ").append(rs.getString("Leg_instance_id")).append("\n")
                            .append("Date: ").append(rs.getString("Date")).append("\n")
                            .append("Departure Airport: ").append(rs.getString("Departure_Airport")).append("\n")
                            .append("Departure time: ").append(rs.getString("Departure_time")).append("\n")
                            .append("Arrival Airport: ").append(rs.getString("Arrival_Airport")).append("\n")
                            .append("Arrival time: ").append(rs.getString("Arrival_time")).append("\n")
                            .append("Leg number: ").append(rs.getString("Leg_number")).append("\n")
                            .append("Airplane id: ").append(rs.getString("Airplane_id")).append("\n")
                            .append("Number of available seats: ").append(rs.getString("Number_of_available_seats")).append("\n\n");
                }
                if (result.length() > 0) {
                    f8A.setText(result.toString());
                } else {
                    f8A.setText("No records found in the Leg_instance table");
                }

            } catch (SQLException ex) {
                System.out.println("Error Viewing for Leg_instance records: " + ex.getMessage());
            }
        }
//update
        if (e.getSource() == f8b4) {
            String Leg_instance_id = f8t1.getText();
            String Date = f8t2.getText();
            String Departure_Airport = f8t3.getText();
            String Departure_time = f8t4.getText();
            String Arrival_Airport = f8t5.getText();
            String Arrival_time = f8t6.getText();
            String Leg_Number = f8t7.getText();
            String Airplane_id = f8t8.getText();
            String Number_of_available_seats = f8t9.getText();

            String updateQuery = "UPDATE Leg_instance SET Date = ?, Departure_Airport = ?, Departure_time = ?,Arrival_Airport = ?,Arrival_time = ?,Leg_Number = ?,Airplane_id =?,Number_of_available_seats =? WHERE Leg_instance_id = ?";
            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(updateQuery)) {
                pst.setString(1, Date);
                pst.setString(2, Departure_Airport);
                pst.setString(3, Departure_time);
                pst.setString(4, Arrival_Airport);
                pst.setString(5, Arrival_time);
                pst.setString(6, Leg_Number);
                pst.setString(7, Airplane_id);
                pst.setString(8, Number_of_available_seats);
                pst.setString(9, Leg_instance_id);
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Leg_instance record with Leg_instance_id=" + Leg_instance_id + " updated successfully.");
                } else {
                    System.out.println("No records updated. Leg_instance record with Leg_instance_id=" + Leg_instance_id + " not found.");
                }

            } catch (SQLException ex) {
                System.out.println("Error updating Leg_instance record: " + ex.getMessage());
            }
        }

        if (e.getSource() == f8b5) {
            f8.setVisible(false);
            f1.setVisible(true);
        }
        //Reservation
        //insert
        if (e.getSource() == f9b1) {
            String x = f9t1.getText() + "\n" + f9t2.getText() + "\n" + f9t3.getText() + "\n" + f9t4.getText() + "\n";
            f9A.setText(x);
            String Researvation_id = f9t1.getText();
            String customer_name = f9t2.getText();
            String Phone = f9t3.getText();
            String Seat_number = f9t4.getText();
            String Leg_instance_id = f9t5.getText();

            String insertQuery = "INSERT INTO Reservation (Researvation_id,customer_name,Phone,Seat_number,Leg_instance_id) VALUES (?, ?, ?, ?, ?)";

            try (Connection Con = DriverManager.getConnection(Url); PreparedStatement pst = Con.prepareStatement(insertQuery)) {

                pst.setString(1, Researvation_id);
                pst.setString(2, customer_name);
                pst.setString(3, Phone);
                pst.setString(4, Seat_number);
                pst.setString(5, Leg_instance_id);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Reservation record inserted successfully.");
                } else {
                    System.out.println("Failed to insert Reservation record.");
                }
            } catch (SQLException ex) {
                System.out.println("Error inserting Reservation record: " + ex.getMessage());
            }
        }
        //delete
        if (e.getSource() == f9b2) {
            String Researvation_idCodeToDelete = f9t1.getText();
            f9t1.setText("");
            f9t2.setText("");
            f9t3.setText("");
            f9t4.setText("");
            f9t5.setText("");
            f9A.setText("");
            String deleteQuery = "DELETE FROM Reservation WHERE Researvation_id = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(deleteQuery)) {

                pst.setString(1, Researvation_idCodeToDelete);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Researvation record with Researvation_id = " + Researvation_idCodeToDelete + " deleted successfully.");
                } else {
                    System.out.println("No records deleted. Researvation record with Researvation_id = " + Researvation_idCodeToDelete + " not found.");
                }
            } catch (SQLException ex) {
                System.out.println("Error deleting Researvation record: " + ex.getMessage());
            }
        }
        //select
        if (e.getSource() == f9b3) {
            String selectAllQuery = "SELECT * FROM Reservation";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(selectAllQuery)) {

                ResultSet rs = pst.executeQuery();

                StringBuilder result = new StringBuilder();

                while (rs.next()) {
                    result.append("Researvation id: ").append(rs.getString("Researvation_id")).append("\n")
                            .append("customer name: ").append(rs.getString("customer_name")).append("\n")
                            .append("Phone: ").append(rs.getString("Phone")).append("\n")
                            .append("Seat number: ").append(rs.getString("Seat_number")).append("\n")
                            .append("Leg instance id: ").append(rs.getString("Leg_instance_id")).append("\n\n");
                }

                if (result.length() > 0) {
                    f9A.setText(result.toString());
                } else {
                    f9A.setText("No records found in the Reservation table");
                }

            } catch (SQLException ex) {
                System.out.println("Error Viewing for Reservation records: " + ex.getMessage());
            }
        }
        //update
        if (e.getSource() == f9b4) {
            String Researvation_id = f9t1.getText();
            String customer_name = f9t2.getText();
            String Phone = f9t3.getText();
            String Seat_number = f9t4.getText();
            String Leg_instance_id = f9t5.getText();
            String updateQuery = "UPDATE Reservation SET customer_name = ?, Phone = ?, Seat_number = ?,Leg_instance_id=? WHERE Researvation_id = ?";

            try (Connection con = DriverManager.getConnection(Url); PreparedStatement pst = con.prepareStatement(updateQuery)) {

                pst.setString(1, customer_name);
                pst.setString(2, Phone);
                pst.setString(3, Seat_number);
                pst.setString(4, Leg_instance_id);
                pst.setString(5, Researvation_id);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Reservation record with Researvation_id=" + Researvation_id + " updated successfully.");
                } else {
                    System.out.println("No records updated. Researvation record with Researvation_id=" + Researvation_id + " not found.");
                }

            } catch (SQLException ex) {
                System.out.println("Error updating Researvation record: " + ex.getMessage());
            }
        }
        if (e.getSource() == f9b5) {
            f9.setVisible(false);
            f1.setVisible(true);
        }

        //game
        if (e.getSource() == f10b1) {
            cookies++;
            f10Cookie.setText("Cookies = " + String.valueOf(cookies));
        }
        if (e.getSource() == f10back) {
            f10.setVisible(false);
            f1.setVisible(true);
        }
    }

}
