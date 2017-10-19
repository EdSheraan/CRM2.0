/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andres
 */
@Component
public class HibernateAwareObjectMapper extends ObjectMapper {

    public HibernateAwareObjectMapper() {
        setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        Hibernate4Module hm = new Hibernate4Module();
        hm.disable(Hibernate4Module.Feature.FORCE_LAZY_LOADING);
        hm.enable(Hibernate4Module.Feature.SERIALIZE_IDENTIFIER_FOR_LAZY_NOT_LOADED_OBJECTS);
        registerModule(hm);        
    }
    
}
