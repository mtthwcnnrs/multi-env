package test.multi.env.service;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

@EachProperty(value = "env")
public class OtherService {
        private String other;
        private String env;

        public OtherService(@Parameter("env")String env){
            this.env = env;
        }

        public String getOther(){
            return other;
        }

        public void setOther(String other){
            this.other = other;
        }

        public String getEnv(){
            return env;
        }

        public void setEnv(String env){
            this.env = env;
        }
}

