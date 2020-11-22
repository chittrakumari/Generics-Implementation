package main;

import genericClasses.Student;
import Name.Name;
public class main {

        public static void main(String[] args){
            //invoking type parameter
            Student<Integer,String> gla;

            //instantiating
            gla=new Student<>();

            //The reference of Student Class gla has rollNo field as Integer.
            gla.setRollNo(12);
            gla.setName("ayushi");

            //In angular braces we can only mention class names
            //First,we need to make a class with name Name
            Student<String,Name> rgpv=new Student<>();

            //But,rgpv reference of Student Class has rollNo field as String.
            rgpv.setRollNo("13");
            Name obj=new Name();
            obj.setFirstName("Chittra");
            obj.setMiddleName("Kumari");
            obj.setLastName("Jha");
            rgpv.setName(obj);

            System.out.println(gla);
            System.out.println(rgpv);

        }
    }

