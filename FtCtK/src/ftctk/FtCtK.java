package ftctk;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class FtCtK {

    public static void main(String[] args) throws FileNotFoundException {
        DList list = new DList();
        Node node;
        DecimalFormat deci = new DecimalFormat("#.00");
        File file = new File("C:\\Users\\Student\\Documents\\NetBeansProjects\\FtCtK\\data\\temp.txt");     
        Scanner scan = new Scanner(file);
        
        while(scan.hasNextLine())
        {
            node = new Node(Double.parseDouble(scan.nextLine()));
            list.addLast(node);
        }
        
        while(true)
        {
            System.out.println ("Farenheit: " + deci.format(list.current.getTemp()) + " | Celsius:  " + deci.format(list.current.getCTemp()) + " | Kelvin: " + deci.format(list.current.getKTemp()));
            if (list.current.next != null)
            {list.forward();}
            else
            {break;}
        }
        
        System.out.println("           <<<<<<<< NOW BACK IT UP >>>>>>>>");
        list.current = list.last;
        while(true)
        {
            System.out.println ("Farenheit: " + deci.format(list.current.getTemp()) + " | Celsius:  " + deci.format(list.current.getCTemp()) + " | Kelvin: " + deci.format(list.current.getKTemp()));
            if (list.current.prev != null)
            {list.backward();}
            else
            {break;}
        }
    }
    
}
