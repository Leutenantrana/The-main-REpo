package part7.sorting.SortingArrayListStringType;
import java.util.ArrayList;

import part7.sorting.sorting;


public class main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("The Brethren by John Grisham , 2000");
        list.add("The Summons by John Grisham , 2002");
        list.add("Desecration by Tim LaHaye and Jerry B. Jenkins , 2001");
       
        list.add("The Broker by John Grisham , 2005");
        
        list.add("The Girl on the Train by Paula Hawkin , 2016");
        list.add("Go Set a Watchman by Harper Lee , 2015");
        list.add("The Da Vinci Code by Dan Brown , 2003");
        list.add("The Fault in Our Stars by John Green , 2014");
        list.add("The Fault in Our Stars by John Green , 2013");
        list.add("Fifty Shades of Grey by E L Jame , 2012");
        list.add("The Litigators by John Grisham,2011");
        list.add("The Girl Who Kicked the Hornets Nest by Stieg Larsson , 2010");
        list.add("The Lost Symbol by Dan Brown , 2009");
        list.add("The Appeal by John Grisham , 2008");
        list.add("A Thousand Splendid Suns by Khaled Hosseini , 2007");
        list.add("For One More Day by Mitch Albom , 2006");


        Sorting sorting = new Sorting(list);

        sorting.sort();

        
    }
  



    
}
