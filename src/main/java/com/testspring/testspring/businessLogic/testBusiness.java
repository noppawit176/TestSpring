package com.testspring.testspring.businessLogic;

import com.testspring.testspring.model.registerModel;
import org.springframework.stereotype.Service;

@Service
public class testBusiness {
    public String registerRequest(registerModel rm){

        return "Get data" + rm;
    }

}
