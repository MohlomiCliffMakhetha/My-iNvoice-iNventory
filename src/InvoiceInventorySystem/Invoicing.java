


package InvoiceInventorySystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Invoicing extends SQLLoginInformation{
    private final String[] invoiceTemplet = {
        "##   #        ##          #   ####    ##     ####      ####\n",
        "##  ## #####   ##        #  ##    #   ##   ##    #   ##     #\n",
        "    ###    ##   ##      #  ##      #      ##        ##       #\n",
        "##  ##      #    ##    #   ##      #  ##  ##        ##########\n",
        "##  ##      #     ##  #    ##      #  ##  ##        ##\n",
        "##  ##      #      ###      ##    #   ##   ##    #   ##      #\n",
        "##  ##      #       #         ####    ##     ####     ######\n",
        "__________________________________________________________________\n",
        "					  Invoice No.#:   12AB34CE\n",
	"	              			  Invoice Date: 12-07-2021\n",
        "Invoice Generated by  :\n",
        "Time                  :\n",
        "------------------------------------------------------------------\n",
        "Company Bill Provider :\n",
        "Street                :\n",
        "city/sub              :\n",
        "postal code           :\n",
        "province/state        :\n",
        "------------------------------------------------------------------\n",
        "Bill Requester        :\n",
        "Street                :\n",
        "city/sub              :\n",
        "postal code           :\n",
        "province/state        :\n",
        "__________________________________________________________________\n",
        "Description	      	    | Quatity | Unit price |     TOTAL\n",	
        "----------------------------|---------|------------|--------------\n",
        "                            |         |            |\n",
        "----------------------------|---------|------------|--------------\n",
        "                                         Net Total |\n",
        "                                         VAT Total |\n",
        "                                      Gross  Total |\n",
        "                                       Gross payed |\n",
        "                                         Gross Due |\n",
        "___________________________________________________|_______________\n"
    };
    Invoicing(){}
    public String invoiceNumGenerator(){
        String codeDataAlpa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String codeDataNum="123456789";
        String invoiceNum = new String();
        ArrayList<Character> chaCodeDataAlpa = new ArrayList<>();
        ArrayList<Character> chaCodeDataNum = new ArrayList<>();
            for (char i: codeDataNum.toCharArray()) {chaCodeDataNum.add(i);}
            for (char i: codeDataAlpa.toCharArray()) {chaCodeDataAlpa.add(i);}
          while(invoiceNum.length()<8){
                for(int i=0;i<2;i++){
                    Collections.shuffle(chaCodeDataNum);
                    invoiceNum=""+invoiceNum+chaCodeDataNum.get(0);
                }
                for(int i=0;i<2;i++){
                    Collections.shuffle(chaCodeDataAlpa);
                    invoiceNum=""+invoiceNum+chaCodeDataAlpa.get(0);
                }
            }
        return invoiceNum;
    }
    public String invoiceDateGenerator(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String[] dateTime=dateFormat.format(date).split(" ");
        return dateTime[0];
    }
    public String invoiceTimeGenerator(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String[] dateTime=dateFormat.format(date).split(" ");
        return dateTime[1];
    }
    public String[] creatInvoiceTemp(String entity,String inventory,String street,String city,String postal,String province){
        String[] templet=new String[31];
        System.arraycopy(invoiceTemplet, 0, templet, 0, 8);
        templet[8]="					  Invoice No.#:   "+invoiceNumGenerator()+"\n";
        templet[9]="	              			  Invoice Date: "+invoiceDateGenerator()+"\n";
        templet[10]="Invoice Generated by  :Admin Personal\n";
        templet[11]="Time                  :"+invoiceTimeGenerator()+"\n";
        templet[12]="------------------------------------------------------------------\n";
        templet[13]="Company Bill Provider :"+entity+"\n";
        templet[14]="Street                :"+street+"\n";
        templet[15]="city/sub              :"+city+"\n";
        templet[16]="postal code           :"+postal+"\n";
        templet[17]="province/state        :"+province+"\n";
        for(int i=18;i<29;i++){templet[i]=invoiceTemplet[6+i];}
        templet[29]="Inventory             :"+inventory+"\n";
        try {
      FileWriter file = new FileWriter(entity.toLowerCase()+" "+inventory.toLowerCase()+" invoice Templet.txt");
      BufferedWriter output = new BufferedWriter(file);
      for(int i=0;i<templet.length;i++){output.append(templet[i]);}
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
        return templet;
    }
    public String[] callInvoiceTemp(String company,String inventory){
        String strLine=new String();
    String[] templet=new String[30];
    try {
      FileReader file = new FileReader(""+company.toLowerCase()+" "+inventory.toLowerCase()+" invoice Templet.txt");
      BufferedReader input = new BufferedReader(file);
      for(int i=0;(strLine = input.readLine()) != null;i++)   {
        templet[i]=strLine+"\n";
    }
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
    return templet;
    }
    public String[] generateInvoice(String[] amounts,String company,String entity,String inventory,String street,String city,String postal,String province){
        String strLine=new String();
    String[] template=new String[30];
    try {
      FileReader file = new FileReader(""+company.toLowerCase()+" "+inventory.toLowerCase()+" invoice Templet.txt");
      BufferedReader input = new BufferedReader(file);
      for(int i=0;(strLine = input.readLine()) != null;i++)   {
         template[i]=strLine;
    }
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
        String[] templet=new String[33+amounts.length];
        System.arraycopy(invoiceTemplet, 0, templet, 0, 8);
        templet[8]="					  Invoice No.#:   "+invoiceNumGenerator()+"\n";
        templet[9]="	              			  Invoice Date: "+invoiceDateGenerator()+"\n";
        templet[10]="Invoice Generated by  :Admin Personal\n";
        templet[11]="Time                  :"+invoiceTimeGenerator()+"\n";
        for(int i=12;i<18;i++){templet[i]=template[i]+"\n";}
        templet[18]="------------------------------------------------------------------\n";
        templet[19]="Bill Requester        :"+entity+"\n";
        templet[20]="Street                :"+street+"\n";
        templet[21]="city/sub              :"+city+"\n";
        templet[22]="postal code           :"+postal+"\n";
        templet[23]="province/state        :"+province+"\n";
        templet[24]="__________________________________________________________________\n";
        templet[25]="Description                     | Quatity | Unit price |     TOTAL\n";	
        templet[26]="--------------------------------|---------|------------|--------------\n";
        for(int i=0;i<amounts.length-5;i++){templet[i+27]=amounts[i]+"\n";}
        templet[33+amounts.length-8]="--------------------------------|---------|------------|--------------\n";
        templet[33+amounts.length-7]="                                             Net Total |"+amounts[amounts.length-5]+"\n";
        templet[33+amounts.length-6]="                                             VAT Total |"+amounts[amounts.length-4]+"\n";
        templet[33+amounts.length-5]="                                          Gross  Total |"+amounts[amounts.length-3]+"\n";
        templet[33+amounts.length-4]="                                           Gross payed |"+amounts[amounts.length-2]+"\n";
        templet[33+amounts.length-3]="                                             Gross Due |"+amounts[amounts.length-1]+"\n";
        templet[33+amounts.length-2]="_______________________________________________________|_______________\n";
        templet[33+amounts.length-1]="Inventory             :"+inventory+"\n";
        try {
      FileWriter file = new FileWriter(entity+" "+inventory.toLowerCase()+" invoice "+invoiceNumGenerator()+".txt");
      BufferedWriter output = new BufferedWriter(file);
      for(int i=0;i<templet.length;i++){output.append(templet[i]);}
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
        return templet;
    }
    
}