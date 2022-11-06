package main.zad3;

import java.io.FileWriter;
import java.io.IOException;

public class DocToCSV {
    public static void writeDocToCSV(Dokument e) {
        final String COMMA_DELIMITER = ",";
        final String LINE_SEPARATOR = "\n";
        final String HEADER = "documentNumber ,sender ,receiver ,dateOfIssue ";
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter((e.getDocumentNumber()+".csv"));
            fileWriter.append(HEADER);
            fileWriter.append(LINE_SEPARATOR);
            fileWriter.append(String.valueOf(e.getDocumentNumber()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(e.getSender());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(e.getReceiver());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(e.getDateOfIssue()));
            fileWriter.append(LINE_SEPARATOR);
            System.out.println("Document saved as " +"'"+(e.getDocumentNumber()+".csv")+"'");
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                fileWriter.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the fileWriter");
                ie.printStackTrace();
            }
        }
    }
    public static void writeDocToCSV(Invoice e) {
        final String COMMA_DELIMITER = ",";
        final String LINE_SEPARATOR = "\n";
        final String HEADER = "documentNumber ,sender ,receiver ,dateOfIssue ";
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter((e.getDocumentNumber()+".csv"));
            fileWriter.append(HEADER);
            fileWriter.append(LINE_SEPARATOR);
            fileWriter.append(String.valueOf(e.getDocumentNumber()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(e.getSender());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(e.getReceiver());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(e.getDateOfIssue()));
            fileWriter.append(LINE_SEPARATOR);
            System.out.println("Invoice saved as " +"'"+(e.getDocumentNumber()+".csv")+"'");
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                fileWriter.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the fileWriter");
                ie.printStackTrace();
            }
        }
    }
    public static void writeDocToCSV(Order e) {
        final String COMMA_DELIMITER = ",";
        final String LINE_SEPARATOR = "\n";
        final String HEADER = "documentNumber ,sender ,receiver ,dateOfIssue ";
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter((e.getDocumentNumber()+".csv"));
            fileWriter.append(HEADER);
            fileWriter.append(LINE_SEPARATOR);
            fileWriter.append(String.valueOf(e.getDocumentNumber()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(e.getSender());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(e.getReceiver());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(e.getDateOfIssue()));
            fileWriter.append(LINE_SEPARATOR);
            System.out.println("Order saved as " +"'"+(e.getDocumentNumber()+".csv")+"'");
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                fileWriter.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the fileWriter");
                ie.printStackTrace();
            }
        }
    }
}