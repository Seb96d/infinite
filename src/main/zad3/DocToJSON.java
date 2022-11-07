package main.zad3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DocToJSON {
    public static void writeDocToJSON(Dokument e) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(e.getDocumentNumber()+".json"), e.toString());
        System.out.println("Document saved as " +"'"+(e.getDocumentNumber()+".json"));
    }

}
