package com.testspring.testspring.api;
import com.testspring.testspring.businessLogic.testBusiness;
import com.testspring.testspring.model.registerModel;
import com.testspring.testspring.model.testRestspose;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class testapi {

    private final testBusiness testB;

    public testapi(testBusiness testB) {
        this.testB = testB;
    }

    @GetMapping
    public testRestspose test(){
        testRestspose data = new testRestspose();
        data.setName("Aong");
        data.setFood("Noodle");
        return data;
    }

    @RequestMapping("/register")
    @PostMapping
    public String register(@RequestBody registerModel rData){
        String res = testB.registerRequest(rData);

        return res ;
    }
}
