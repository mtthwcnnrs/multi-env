package test.multi.env.service;

import jakarta.inject.Inject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {
    private final Map<String, TestService> services = new HashMap<>();

    @Inject
    public Mapping(List<TestService> testServices) {
        for(TestService instance: testServices){
            services.put(instance.getEnv(), instance);
        }
    }

    public Map<String, TestService> getServices(){
        return services;
    }
}
