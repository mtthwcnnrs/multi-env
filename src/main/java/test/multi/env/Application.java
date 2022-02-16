package test.multi.env;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.build(args)
                .environments("dev","stage","test")
                .mainClass(Application.class)
                .start();
    }
}
