package org.example.interaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;


//todo: Подумать над рефакторингом класса org.example.interaction.JSONParser
public class JSONParser {
    public static String saveObject(Object paylod) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        AnnotationIntrospector introspector
                = new JaxbAnnotationIntrospector();
        mapper.setAnnotationIntrospector(introspector);

        return mapper.writeValueAsString(paylod);
    }

    public static Object getObject(String payload, Class clazz) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        AnnotationIntrospector introspector
                = new JaxbAnnotationIntrospector();
        mapper.setAnnotationIntrospector(introspector);

        return mapper.readValue(payload, clazz);
    }
}
