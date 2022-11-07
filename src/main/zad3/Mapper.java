package main.zad3;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {
    public final static ObjectMapper JSON_MAPPER;

    static {
        JSON_MAPPER = new ObjectMapper();
    }
}