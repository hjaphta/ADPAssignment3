/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment3herschellejaphta;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author zlatan
 */
public class CustomerReadAndSort extends Customer implements Serializable
{

    public CustomerReadAndSort() {
    }

    public CustomerReadAndSort(String stHolderId, String firstName, String surName, String addr, String dob, double cred, boolean canRent) {
        super(stHolderId, firstName, surName, addr, dob, cred, canRent);
    }

    
    
    public void readCustomer() throws FileNotFoundException, IOException
    {
       //"\\home\\zlatan\\NetBeansProjects\\ADPAssignment3HerschelleJaphta\\Stakeholder.ser");
       // ArrayList<String> namesList = new ArrayList<String>();
       //CreateStakeholderSer obj = null;
       //CreateStakeholderSer obj = new CreateStakeholderSer();
       /*// Throws an NPE with a custom error message if obj is null
Objects.requireNonNull(obj, "obj must not be null");*/
      /*try {
         FileInputStream fileIn = new FileInputStream("stakeholder.ser");
         InputStream buffer = new BufferedInputStream(fileIn);
         
         ObjectInputStream in = new ObjectInputStream(fileIn);
         
         obj = (CreateStakeholderSer) in.readObject();
         namesList = (ArrayList) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
        System.out.println(obj.toString());*/
        
        ArrayList<Customer> cust=new ArrayList<Customer>();
        
        
        
        BufferedReader br = new BufferedReader(new FileReader("stakeholder.ser"));
        String str=br.readLine();
        while(str!=null)
        {

        str=br.readLine();
        }
    }
    
        ArrayList<Customer> cust=new ArrayList<Customer>();
        
        for(int i=0;i<cust.size();i++)
        {
            for(int j=0;j<cust.size();j++)
            {
                if(cust.get(i).getFirstName() == cust.get(j).getsurName())
                {
                    Customer c=cust.get(i);
                    cust.set(i,cust.get(j));
                    cust.set(j,c);
                }
            }
        }
    
    
    
        
        
        
        int age[]= new int[cust.size()];
 
 

            for(int i=0;i<cust.size();i++)
            {
                LocalDate ld=LocalDate.parse(cust.get(i).getDateOfBirth());
                int year=ld.getYear();
                age[i]=2021-year;
            }
            
            String p="dd MMM yyyy";
            SimpleDateFormat sdf=new SimpleDateFormat(p, new Locale("da", "DK"));
            for(int i=0;i<cust.size();i++)
            {
            cust.get(i).getDateOfBirth(sdf.format(cust.get(i).getDateOfBirth));
            }
            
            BufferedWriter bw=new BufferedWriter( new FileWriter("customerOutFile.txt"));
            String str = "===============CUSTOMERS================";
            bw.write(str);
            bw.newLine();
            str="ID\tName\tSurname\tDate of birth\tAge";
            bw.write(str);
            bw.newLine();
            str="===========================================";
            bw.write(str);
            bw.newLine();
            
            for(int i=0;i<cust.size();i++)
                {
                str=cust.get(i).getstHolderId()+"\t"+cust.get(i).getfirstName()+"\t"+cust.get(i).getsurName()+"\t"+cust.get(i).getDateOfBirth()+"\t"+age[i];
                bw.write(str);
                bw.newLine();
                }
        // Call the method which calculates the total rented customers and non rented customers.  
            //declare r and nr below the array declaration of age.
            str="Number of customers who can rent:"+r; 
            bw.write(str);
            bw.newLine();
            str="Number of customers who cannot rent:"+nr;
            bw.write(str);
            bw.newLine();
            bw.close();
    }
      
}
   
