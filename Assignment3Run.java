/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment3herschellejaphta;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zlatan
 */
public class Assignment3Run extends CustomerReadAndSort
{
    public Assignment3Run(String stHolderId, String firstName, String surName, String addr, String dob, double cred, boolean canRent) {
        super(stHolderId, firstName, surName, addr, dob, cred, canRent);
    }
    public static void main(String[] args) 
    {
       CustomerReadAndSort crs = new CustomerReadAndSort();
       crs.toString();
       
       
       
    }

    

    
}
