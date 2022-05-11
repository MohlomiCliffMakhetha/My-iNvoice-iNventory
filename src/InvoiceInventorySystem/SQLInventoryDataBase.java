
package InvoiceInventorySystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class SQLInventoryDataBase extends SQLLoginInformation{
    private final ArrayList<String> inventoryTableColumnNames = new ArrayList<>();
    private String entityName;
    private String inventoryName;
    SQLInventoryDataBase(){
        inventoryTableColumnNames.add("Item_Description VARCHAR(255)");
        inventoryTableColumnNames.add("Item_Quantity VARCHAR(255)");
        inventoryTableColumnNames.add("Item_Unit_Price VARCHAR(255)");
        inventoryTableColumnNames.add("Item_VAT_Percentage VARCHAR(10)");}
    //methode for database creation and table
    public String SQLCreateDataBase(String dataBase, String nameOfTable){
        String outcome=new String();
        outcome="true";
        entityName=dataBaseNaming(dataBase);
        inventoryName=dataBaseNaming(nameOfTable);
        try {Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(address,user,password);
            Statement code = connect.createStatement();
            code.executeUpdate("CREATE DATABASE "+entityName+"");
        } catch (ClassNotFoundException | SQLException ex) {outcome="Entity already exsits, please Login to add or edit inventory type";
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
            String addressExtention = ""+address+""+entityName+"";
            String content=new String();
            content=inventoryTableColumnNames.toString();
            int i = content.length();
            content=(String) inventoryTableColumnNames.toString().subSequence(1, i-1);
        try {Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(addressExtention,user,password);
            Statement code = connect.createStatement();
            code.executeUpdate("create table "+inventoryName+"("+content+")");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outcome;
    }
    //methode of adding new column name to table
    public String addColumnName(String columnName){
        String nameReturn = new String();
        boolean done = false;
        if(Pattern.matches("[a-zA-Z ]*", columnName)==true){
            ArrayList<Character> chaArray = new ArrayList<>();
            for (char i: columnName.toCharArray()) {chaArray.add(i);}
            while(done==false){if(chaArray.get(0)==' '){chaArray.remove(0);}else{done = true;}}
            done=false;
            while(done==false){if(chaArray.get(chaArray.size()-1)==' '){chaArray.remove(chaArray.size()-1);}else{done = true;}}
            done=false;
            for(int i=0;i<chaArray.size()-1;i++){while(done==false&&chaArray.get(i)==' '){if(chaArray.get(i+1)==' '){chaArray.remove(i+1);}else{done = true;}} done=false;}
            for(int i=0;i<chaArray.size();i++){chaArray.set(i, Character.toLowerCase(chaArray.get(i)));}
            for(int i=0;i<chaArray.size();i++){chaArray.set(0, Character.toUpperCase(chaArray.get(0)));
            if(chaArray.get(i).equals(' ')){chaArray.set((i+1), Character.toUpperCase(chaArray.get(i+1)));}}
            for(int i=0;i<chaArray.size();i++){if(chaArray.get(i).equals(' ')){chaArray.set(i, '_');}}
            char[] stringArray = new char[chaArray.size()];
            for(int i=0;i<chaArray.size();i++){
            stringArray[i]=chaArray.get(i);}
            nameReturn = String.copyValueOf(stringArray);
            inventoryTableColumnNames.add(nameReturn+" VARCHAR(255)");
            nameReturn = "true";
        }
        else{nameReturn = "No special characters allowed";}  
        return nameReturn;
    }
    public String dataBaseNaming(String columnName){
        String nameReturn = new String();
        boolean done = false;
        
            ArrayList<Character> chaArray = new ArrayList<>();
            for (char i: columnName.toLowerCase().toCharArray()) {chaArray.add(i);}
            while(done==false){if(chaArray.get(0)==' '){chaArray.remove(0);}else{done = true;}}
            done=false;
            while(done==false){if(chaArray.get(chaArray.size()-1)==' '){chaArray.remove(chaArray.size()-1);}else{done = true;}}
            done=false;
            for(int i=0;i<chaArray.size()-1;i++){while(done==false&&chaArray.get(i)==' '){if(chaArray.get(i+1)==' '){chaArray.remove(i+1);}else{done = true;}} done=false;}
            for(int i=0;i<chaArray.size();i++){if(chaArray.get(i).equals(' ')){chaArray.set(i, '_');}}
            char[] stringArray = new char[chaArray.size()];
            for(int i=0;i<chaArray.size();i++){
            stringArray[i]=chaArray.get(i);}
            nameReturn = String.copyValueOf(stringArray);
        
        return nameReturn;
    }
    public String passwordString(char[] password){
            char[] passwordChar = password.clone();
            ArrayList<Character> chaArray = new ArrayList<>();
            String passwordString = new String();
            for (int i=0;i<passwordChar.length;i++){passwordString+=passwordChar[i];}
            for (char i: passwordString.toCharArray()) {chaArray.add(i);}
            for(int i=0;i<chaArray.size();i++){if(Pattern.matches("[a-zA-Z0-9]", ""+chaArray.get(i))==false){int x=chaArray.get(i)-1;
                char[] X=(""+x).toCharArray(); 
                chaArray.set(i,X[X.length-1]);}}
            char[] stringArray = new char[chaArray.size()];
            for(int i=0;i<chaArray.size();i++){
            stringArray[i]=chaArray.get(i);}
            passwordString = String.copyValueOf(stringArray);
            return passwordString;
    }
    //mathod for database check
    public boolean searchTable(String dataBaseName, String command, String searchColumn, String searchFor){
        boolean test = false;
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection mcon = DriverManager.getConnection(""+address+""+dataBaseName+"",user,password);
        Statement stmnt = mcon.createStatement();
        ResultSet result = stmnt.executeQuery(command);
        while(result.next()){
            if(searchFor.equals(result.getString(searchColumn))){
                test = true;
                break;
            }
            
        }
       
        mcon.close();  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
        }
        public Object[] SQLTableColumnTitle(String dataBase, String nameOfTable,String[] addedColumn){
            ArrayList<String> outcome=new ArrayList<>();
            String addressExtention = ""+address+""+dataBase+"";           
        try {Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(addressExtention,user,password);
            Statement code = connect.createStatement();
            ResultSet result = code.executeQuery("select * from "+nameOfTable);
            ResultSetMetaData metaData = (ResultSetMetaData) result.getMetaData();
         int counter = metaData.getColumnCount();
         String colName[] = new String[counter];
         for (int loop = 1; loop <= counter; loop++) {
            colName[loop-1] = metaData.getColumnLabel(loop);
            outcome.add(colName[loop-1]);
         }
        } catch (ClassNotFoundException | SQLException ex) {outcome.add("Item_Description");
            outcome.add("Item_Quantity");
            outcome.add("Item_Unit_Price");
            outcome.add("Item_VAT_Percentage");
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(addedColumn!=null){
        for (int loop = 0; loop <addedColumn.length; loop++) {
            outcome.add(addedColumn[loop]);
         }}
        
        return outcome.toArray();
        }
        
            public int rowSize(String dataBase, String nameOfTable){
                entityName=dataBaseNaming(dataBase);
                inventoryName=dataBaseNaming(nameOfTable);
                String addressExtention = ""+address+""+entityName+"";
                int size=0;

            try {Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connect = DriverManager.getConnection(addressExtention,user,password);
                Statement code = connect.createStatement();
                ResultSet result = code.executeQuery("select * from "+inventoryName);
                while(result.next()){size++;}
                code.close();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
            }return size;}
        
        public int columnSize(String dataBase ,String nameOfTable){
            entityName=dataBaseNaming(dataBase);
            inventoryName=dataBaseNaming(nameOfTable);
            String addressExtention = ""+address+""+entityName+"";
            int size=0;
        try {Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(addressExtention,user,password);
            Statement code = connect.createStatement();
            ResultSet result = code.executeQuery("select * from "+inventoryName);
            ResultSetMetaData rsmd = result.getMetaData();
            size = rsmd.getColumnCount();
            code.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }return size;
    }
        
        public Object[][] SQLTableElemnts(String dataBase, String nameOfTable,int sizeRow,int sizeColumn){
           Object[][] element=new Object[sizeRow][sizeColumn];
            entityName=dataBaseNaming(dataBase);
            inventoryName=dataBaseNaming(nameOfTable);
        
            String addressExtention = ""+address+""+entityName+"";           
        try {Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(addressExtention,user,password);
            Statement
                    code = connect.createStatement();
            ResultSet result = code.executeQuery("select * from "+inventoryName);
         for(int i=0;result.next();i++){
         for (int j = 0; j < sizeColumn; j++) {
            element[i][j] = result.getObject(j+1);
         }}
        } catch (ClassNotFoundException | SQLException ex) {element[0][0]=false;
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return element;
        }
        public boolean readInTable(Object[][] elements,String[] columnNames){
        boolean result=false;
        return result;
        }
        public void replaceInventory(Object[] columnTitle,Object[][] elements,String dataBase,String nameOfTable,int rowStart){
            entityName=dataBaseNaming(dataBase);
            inventoryName=dataBaseNaming(nameOfTable);
            String addressExtention = ""+address+""+entityName+"";
            try {Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(addressExtention,user,password);
            Statement code = connect.createStatement();
            String sql = "DROP TABLE "+inventoryName+"";
            code.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
            String column = new String();
            for(int i=0;i<columnTitle.length;i++){column+=columnTitle[i]+" varchar(255),";}
            column=column.substring(0, column.length()-1);
            try {Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(addressExtention,user,password);
            Statement code = connect.createStatement();
            code.executeUpdate("create table "+inventoryName+"("+column+")");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
            ArrayList<String> values = new ArrayList<>();
            String content = new String();
            for(int i=rowStart;i<elements.length;i++){
                content="";
                for(int j=0;j<columnTitle.length;j++){content+="'"+elements[i][j]+"',";}
                content=content.substring(0, content.length()-1);
                if(Pattern.matches("[^a-zA-Z0-9]*",content)==false){values.add(content);}
            }
            try {Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(addressExtention,user,password);
            Statement code = connect.createStatement();
            for(int i=0;i<values.size();i++){code.executeUpdate("insert into "+inventoryName+" values("+values.get(i)+")");
             }connect.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLInventoryDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }

    
}
