
package InvoiceInventorySystem;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class InventoryCSV extends SQLLoginInformation{
    private String entityName;
    private String inventoryName;
    SQLInventoryDataBase obj = new SQLInventoryDataBase();
    InventoryCSV(){}
    
    public void downloadCSV(String company,String dataBase, String nameOfTable){
        entityName=obj.dataBaseNaming(dataBase);
        inventoryName=obj.dataBaseNaming(nameOfTable);
        
         String data = new String();
         File directory = new File("./");
         String [] packets =directory.getAbsolutePath().replaceAll(Pattern.quote("\\"),",").split(",");
            String path=new String();
        for (String packet : packets) {path += "\\\\"+packet;}
        path=path.substring(2, path.length()-1);
         for(int i=0;i<new SQLInventoryDataBase().SQLTableColumnTitle(entityName, inventoryName,null).length;i++){
             data+=new SQLInventoryDataBase().SQLTableColumnTitle(entityName, inventoryName,null)[i]+";";
         }

      try{
          FileWriter file = new FileWriter(path+"\\\\"+company.toLowerCase()+" "+nameOfTable.toLowerCase()+" inventory.csv");
      BufferedWriter output = new BufferedWriter(file);
            data=data.substring(0, data.length()-1);
            output.write(data);
            output.newLine();
      output.close();}
    catch (Exception e) {
      e.getStackTrace();
    }
      try{
           FileWriter file = new FileWriter(path+"\\\\"+company.toLowerCase()+" "+nameOfTable.toLowerCase()+" inventory.csv",true);
           BufferedWriter output = new BufferedWriter(file);
            if(new SQLInventoryDataBase().SQLTableElemnts(entityName, inventoryName, 
              new SQLInventoryDataBase().rowSize(entityName, inventoryName),
              new SQLInventoryDataBase().SQLTableColumnTitle(entityName, inventoryName,null).length)[0][0]!=(Object)false){
            for(int i=0;i<new SQLInventoryDataBase().rowSize(entityName, inventoryName);i++){
                data="";
            for(int j=0;j<new SQLInventoryDataBase().SQLTableColumnTitle(entityName, inventoryName,null).length;j++){
             data+=new SQLInventoryDataBase().SQLTableElemnts(entityName, inventoryName, 
              new SQLInventoryDataBase().rowSize(entityName, inventoryName),
              new SQLInventoryDataBase().SQLTableColumnTitle(entityName, inventoryName,null).length)[i][j]+";";
             }
            data=data.substring(0, data.length()-1);
            output.write(data);
            output.newLine();
         }
      }
      output.close();}
    catch (Exception e) {
      e.getStackTrace();
    }
 
try  
{  File file = new File(path+"\\\\"+company.toLowerCase()+" "+nameOfTable.toLowerCase()+" inventory.csv");   
    if(!Desktop.isDesktopSupported()){    
        return;  
        }  
        Desktop desktop = Desktop.getDesktop();  
        if(file.exists())             
            desktop.open(file); 
}  
catch(IOException e)  
{  
}  

    }
    public void csvFileUpload(String dataBase, String nameOfTable,String pathOfFile){
            entityName=new SQLInventoryDataBase().dataBaseNaming(dataBase);
            inventoryName=new SQLInventoryDataBase().dataBaseNaming(nameOfTable);
            String addressExtention = ""+address+""+entityName+"";
        SQLInventoryDataBase obj = new SQLInventoryDataBase();
        ArrayList<String> lineRead = new ArrayList<>();
        String [] packets =pathOfFile.replaceAll(Pattern.quote("\\"),",").split(",");
        String path=new String();
        for (String packet : packets) {path += "\\\\"+packet;}
        path=path.substring(2, path.length());
    String strLine=new String();
    try {
      FileReader file = new FileReader(path);
      BufferedReader input = new BufferedReader(file);
      while((strLine = input.readLine()) != null){
        lineRead.add(strLine);
    }
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
    
    
    String[][] result=new String[lineRead.size()][obj.SQLTableColumnTitle(entityName, inventoryName,null).length];
    
    for(int i=0;i<obj.SQLTableColumnTitle(entityName, inventoryName,null).length;i++){
        String[] titles=lineRead.get(0).split(";|,");
        if(!titles[i].equals(obj.SQLTableColumnTitle(entityName, inventoryName,null)[i])||titles.length!=obj.SQLTableColumnTitle(entityName, inventoryName,null).length){
            result[0][0]="File cannot be uploaded as it does not conform to \nmySQL format please download My iNventory .csv file";
            JOptionPane.showConfirmDialog(null,result[0][0],"Alert",JOptionPane.WARNING_MESSAGE);
                 break;}
    }
    if(result[0][0]==null){
      
    for(int i=1;i<lineRead.size();i++){
        String[] titles=lineRead.get(i).split(";|,");
        for(int j=0;j<obj.SQLTableColumnTitle(entityName, inventoryName,null).length;j++){
            result[i][j]=titles[j];
        }
    }
    String[] titles=lineRead.get(0).split(";|,");
    
    new SQLInventoryDataBase().replaceInventory(titles, result, dataBase, nameOfTable,1);
    /*try(
         Connection conn = DriverManager.getConnection(addressExtention,user,password);
         Statement stmt = conn.createStatement();
            
      ) {
        for(int i=1;i<lineRead.size();i++){
        String [] row =lineRead.get(i).replaceAll(Pattern.quote(";"),",").split(",");
        String values=new String();
        for (String packet : row) {values += "'"+packet+"',";}
        values=values.substring(0, values.length()-1);
         String sql = "INSERT INTO "+inventoryName+" VALUES ("+values+")";
         stmt.executeUpdate(sql);
        }   	  
      } catch (SQLException e) {
      } }*/
   // return result;
    }}
}

