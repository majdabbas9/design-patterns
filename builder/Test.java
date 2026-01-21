package builder;

import builder.HttpRequest.HttpBuilder;

public class Test {
    public static void main(String[] args) {
        HttpRequest r1 = new HttpRequest.HttpBuilder("https://api.myapp.com/users")
                .addBody("hi").addHead("hi", "hi").build();
        System.out.println(r1);

    }
}
