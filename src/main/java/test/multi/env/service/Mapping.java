package test.multi.env.service;

import jakarta.inject.Inject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {
    private final Map<String, TestService> testServices = new HashMap<>();
    private final Map<String, OtherService> otherServices = new HashMap<>();

    @Inject
    public Mapping(List<TestService> testServices, List<OtherService> otherServices) {
        for(TestService instance: testServices){
            this.testServices.put(instance.getEnv(), instance);
        }
        for(OtherService instance: otherServices){
            this.otherServices.put(instance.getEnv(), instance);
        }
    }

    public Map<String, TestService> getTestServices(){
        return this.testServices;
    }

    public Map<String, OtherService> getOtherServices(){
        return this.otherServices;
    }
}
