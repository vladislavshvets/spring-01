package spring.intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.intro.config.AppConfig;
import spring.intro.model.User;
import spring.intro.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(new User("Taras", "Sheva", "shevchencko@gmail.com"));
        userService.add(new User("Lesya", "Uk", "lesya@gmail.com"));
        userService.add(new User("Ayn", "Rend", "aynrend@gmail.com"));
        userService.listUsers();
    }
}
