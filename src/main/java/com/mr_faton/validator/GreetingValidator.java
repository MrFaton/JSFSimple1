package com.mr_faton.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created by root on 24.06.2015.
 */
@FacesValidator("GreetingValidator")
public class GreetingValidator implements Validator{

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String text = o.toString();
        if (text.startsWith("abc")) {
            FacesMessage facesMessage = new FacesMessage(
                    "Validation fail. Bad input data",
                    "I don't like string witch starts with abc");
            facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(facesMessage);
        }
    }
}
/*
Simple validator who checks correctness of input namely that the string don't start with "abc" if it's true we throw
exception
 */