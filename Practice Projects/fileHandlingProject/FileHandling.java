package fileHandlingProject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class FileHandling{
    public static void main(String args[]) throws FileNotFoundException, IOException {
    
        System.out.println("Please select one of the below operations:");
        System.out.println(" W for write mode ");
        System.out.println(" R for read mode ");
        System.out.println(" A for append mode ");
        Scanner sca =new Scanner(System.in);
        String s=sca.nextLine();
        if(s.equalsIgnoreCase("R"))
        {
            new FReading();
        }
        else if(s.equalsIgnoreCase("W")||s.equalsIgnoreCase("A"))
        {
            writingToFile(s);
        }
        else
        {
            System.out.println("Better luck next time ");
        }     
        sca.close();
    }
    
    public static void writingToFile(String s)
    {
        Scanner sc=null;
        try
        {
            String source = "";
            File f=new File("file1.txt");
            
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            //For writing new Content every time you run
            FileWriter f0 =null;
            if(s.equalsIgnoreCase("W"))
            {
                f0 = new FileWriter(f,false);
                System.out.println("CAUTION >> Please understand it will over write the content of the file ");
                System.out.println("Type 'no' to exit");
                System.out.println("Do you want to proceed :type 'yes' ");
                sc=new Scanner(System.in);
                String s1=sc.nextLine();
                if(s1.equals("no"))
                System.exit(0);
                System.out.println("Write 'stop' when you finish writing file ");
                f.delete();
                f.createNewFile();
                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.write(source + System.getProperty("line.separator"));
                    
                }
                sc.close();
            }
            //For appending the content
            else
            {  f0 = new FileWriter(f,true);
                System.out.println("Write 'stop' when you finish appending file ");
                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.append(source+ System.getProperty("line.separator"));
                }
            }
            f0.close();   
        }
        catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
        }       
    } 
}

class FReading {
    public static String str="";
    public FReading() {
        try{
            File f5=new File("file1.txt");
            if(! f5.exists())
            f5.createNewFile();
            FileReader fl=new FileReader(f5);
            BufferedReader bf=new BufferedReader(fl);
            //For reading till end
            while((str=bf.readLine())!=null){
                System.out.println(str);
            }
            fl.close();
            }catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
        }
    }
}