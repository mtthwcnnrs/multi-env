package test.multi.env.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import test.multi.env.service.Mapping;
import test.multi.env.service.OtherService;
import test.multi.env.service.TestService;

import java.util.Map;

@Controller("/detect/env")
public class EnvController {
    @Inject
    private Mapping mapping;

    public EnvController(Mapping mapping){
        this.mapping = mapping;
    }

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    public String index(String env) {
        Map<String, TestService> testMap = this.mapping.getTestServices();
        Map<String, OtherService> otherMap = this.mapping.getOtherServices();

        TestService myTestService = testMap.get(env);
        OtherService myOtherService = otherMap.get(env);

        return "Test Service: " + myTestService.getTest() + "\nOther Service: " + myOtherService.getOther();
    }
}
