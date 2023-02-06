package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.service.C_DemoService;
import com.lellzapps.interview_spring_boot.service.D_DemoService;
import com.lellzapps.interview_spring_boot.service.E_DemoService;
import com.lellzapps.interview_spring_boot.service.F_DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController_AutowireDemo {

    @Autowired
    private C_DemoService cDemoService;


    private D_DemoService dDemoService;

    @Autowired
    public void setDDemoService(D_DemoService dDemoService)
    {
        this.dDemoService = dDemoService;

        this.cDemoService.printMessage();
        this.dDemoService.printMessage();
    }


    private E_DemoService eDemoService1;
    private E_DemoService eDemoService2;
    private E_DemoService eDemoService3;
    private E_DemoService eDemoService4;
    private E_DemoService eDemoService5;
    private E_DemoService eDemoService6;


    @Autowired
    RestController_AutowireDemo(@Qualifier("e_DemoService") E_DemoService eDemoService1,
                                @Qualifier("getEDemoServiceBean_NamedByMethod") E_DemoService eDemoService2,
                                @Qualifier("eDemoServiceBean_NamedByBean") E_DemoService eDemoService3,
                                @Qualifier("eDemoServiceBean_NamedByQualifier") E_DemoService eDemoService4,
                                @Qualifier("eDemoServiceBean_NamedByBeanAndQualifierBoth_Qualifier") E_DemoService eDemoService5,
                                @Qualifier("eDemoServiceBean_NamedByBeanAndQualifierBoth_Bean") E_DemoService eDemoService6)
    {
        this.eDemoService1 = eDemoService1;
        this.eDemoService2 = eDemoService2;
        this.eDemoService3 = eDemoService3;
        this.eDemoService4 = eDemoService4;
        this.eDemoService5 = eDemoService5;
        this.eDemoService6 = eDemoService6;

        this.eDemoService1.printMessage();
        this.eDemoService2.printMessage();
        this.eDemoService3.printMessage();
        this.eDemoService4.printMessage();
        this.eDemoService5.printMessage();
        this.eDemoService6.printMessage();
    }


    private F_DemoService fDemoService1;
    private F_DemoService fDemoService2;
    private F_DemoService fDemoService3;

    @Autowired(required = false)
    void setFDemoServices(F_DemoService fDemoService, F_DemoService f_demoService, @Qualifier("f_demoService") F_DemoService f_DemoService)
    {
        this.fDemoService1 = fDemoService; // fDemoService()
        this.fDemoService2 = f_demoService; // @Service("f_demoService")
        this.fDemoService3 = f_DemoService; // @Qualifier("f_demoService") -> @Service("f_demoService")

        this.fDemoService1.printMessage();
        this.fDemoService2.printMessage();
        this.fDemoService3.printMessage();
    }
}
