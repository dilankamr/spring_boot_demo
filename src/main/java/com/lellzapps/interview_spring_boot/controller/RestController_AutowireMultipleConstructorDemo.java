package com.lellzapps.interview_spring_boot.controller;

import com.lellzapps.interview_spring_boot.service.*;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class RestController_AutowireMultipleConstructorDemo {

    A_DemoService a_demoService;

    B_DemoService b_demoService;

    C_DemoService c_demoService;

    D_DemoService d_demoService;

    E_DemoService e_demoService;

    @Autowired(required = false)
    RestController_AutowireMultipleConstructorDemo(@Qualifier("a_DemoService") A_DemoService a_demoService,
                                                   @Qualifier("b_DemoService") B_DemoService b_demoService,
//                                                   @Qualifier("x") C_DemoService c_demoService, // when this line available, calls 3rd constructor
                                                   @Nullable @Qualifier("x") C_DemoService c_demoService, // when this line available, calls this constructor
                                                   @Qualifier("d_DemoService") D_DemoService d_demoService,
                                                   @Qualifier("e_DemoService") E_DemoService e_demoService)
    {
        this.a_demoService = a_demoService;
        this.b_demoService = b_demoService;
        this.c_demoService = c_demoService;
        this.d_demoService = d_demoService;
        this.e_demoService = e_demoService;
    }

    @Autowired(required = false)
    RestController_AutowireMultipleConstructorDemo(@Qualifier("a_DemoService") A_DemoService a_demoService,
                                                   @Qualifier("b_DemoService") B_DemoService b_demoService,
                                                   @Qualifier("c_DemoService") C_DemoService c_demoService,
                                                   @Qualifier("d_DemoService_xxxx") D_DemoService d_demoService)
    {
        this.a_demoService = a_demoService;
        this.b_demoService = b_demoService;
        this.c_demoService = c_demoService;
        this.d_demoService = d_demoService;
    }

    @Autowired(required = false)
    RestController_AutowireMultipleConstructorDemo(@Qualifier("a_DemoService") A_DemoService a_demoService,
                                                   @Qualifier("b_DemoService") B_DemoService b_demoService,
                                                   @Qualifier("c_DemoService") C_DemoService c_demoService)
    {
        this.a_demoService = a_demoService;
        this.b_demoService = b_demoService;
        this.c_demoService = c_demoService;
    }

    @Autowired(required = false)
    RestController_AutowireMultipleConstructorDemo(@Qualifier("a_DemoService") A_DemoService a_demoService,
                                                   @Qualifier("b_DemoService") B_DemoService b_demoService)
    {
        this.a_demoService = a_demoService;
        this.b_demoService = b_demoService;
    }
}
