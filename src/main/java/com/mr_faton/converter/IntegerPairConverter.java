package com.mr_faton.converter;

import com.mr_faton.entity.IntegerPair;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * Created by root on 24.06.2015.
 */
@FacesConverter("IntegerPairConverter")
public class IntegerPairConverter implements Converter{
    //convert received string to IntegerPair
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String str) {
        int pointPos = str.indexOf(".");
        try {
            int num1 = Integer.valueOf(str.substring(0, pointPos));
            int num2 = Integer.valueOf(str.substring(pointPos + 1, str.length()));
            return new IntegerPair(num1, num2);
        } catch (RuntimeException ex) {
                /*Something wrong*/
        }
        //so throw error message
        FacesMessage facesMessage = new FacesMessage(
                "Bad integer pair",
                "Integer pair must have format '123.456'");
        facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ConverterException(facesMessage);
    }
    //How object like as a string
    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        IntegerPair integerPair = (IntegerPair) o;
        return integerPair.toString();
    }
}
/*
This class needed for conversion string, which was received from user, to object called IntegerPair.
So, it's entity who receive string, try to construct object and return it or throw Converter Exception if it can't to
convert string yo object.
 */