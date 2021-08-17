package com.bridgelab;
import java.io.LineNumberInputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.io.Console;


public class Addressbook {
    public static void main(String[] args) {
        details();
        contactNewperson();
        editContactDetails();
        multiplePersonDetails();
    }

    public static void details() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first and last name of the person:");
        System.out.println("Enter the name of the Address:");
        System.out.println("Enter the name of the State:");
        System.out.println("Enter the name of the City:");
        System.out.println("Enter the zip code number:");
        System.out.println("Enter the name of the Phone number:");
        System.out.println("Enter the name of the Email Id:");
        String name = sc.nextline();
        System.out.println("Name of the person:" + name);
        String Address = sc.nextline();
        System.out.println("Address of the person:" + Address);
        String State = sc.nextline();
        System.out.println("Name of the person:" + State);
        String City = sc.nextline();
        System.out.println("Name of the person:" + City);
        String zip = sc.nextline();
        System.out.println("Enter the zip code:" + zip);
        String ph_no = sc.nextline();
        System.out.println("Name of the person:" + ph_no);
        String Email_Id = sc.nextline();
        System.out.println("Name of the person:" + Email_Id);
    }
    public static void contactNewperson() {
        Scanner sc = new Scanner(System.in);
        Console c = System.console();
        System.out.println("Enter the name");
        String n = c.readLine();
        System.out.println("Welcome" + n);
        System.out.println("Enter your Address:");
        String Address = c.readLine();
        System.out.println("Your Address is :" + Address);
        System.out.println("Enter your State:");
        String State = c.readLine();
        System.out.println("Your State is :" + State);
        System.out.println("Enter your City:");
        String City = c.readLine();
        System.out.println("Your City is :" + City);
        System.out.println("Enetr zip code");
        String zip = c.readLine();
        System.out.println("Enter your zip code:" + zip);
        System.out.println("Enter your ph_no:");
        String ph_no = c.readLine();
        System.out.println("Your Contact number is :" + ph_no);
        System.out.println("Enter your Email_Id:");
        String Email_Id = c.readLine();
        System.out.println("Your Email_id is :" + Email_Id);
    }
    public static void editContactDetails(){
        System.out.println("After Editing the existed contact the list of details are given below");
        contactNewperson();
    }
    public static void clearConsole(){
        final String name_person =System.getProperty("name_person.name");
        
        if (name_person.contains("things")){
            Runtime.getRuntime().exec("cls");
        }
    }
        catch (final Exception e)
    {
        e.printStackTrace();
    }

    public static void multiplePersonDetails(){
        List<String>langs=new  ArrayList<>();

        langs.add("Gauri");
        langs.add("Pl no 97, Indraprastha nagar");
                langs.add("Maharashtra");
                langs.add("Nagpur");
                langs.add("440022");
                langs.add("9689710299");
                langs.add("thegauriparhad@gmail.com");

                for (String lang:langs){

                        System.out.println(+lang);
                }
                System.out.println()
    }
}



