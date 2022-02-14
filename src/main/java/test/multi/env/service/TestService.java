package test.multi.env.service;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

@EachProperty(value = "env")
public class TestService{
        private String test;
        private String env;

        public TestService(@Parameter("env")String env){
            this.env = env;
        }

        public String getTest(){
            return test;
        }

        public void setTest(String test){
            this.test = test;
        }

        public String getEnv(){
            return env;
        }

        public void setEnv(String env){
            this.env = env;
        }
}
