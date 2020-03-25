package Patterns.ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс сервер
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * Клиент подает готовую цепочку в сервере. Это увеличивает гибкость и
     * упрощает тестирование класса сервера.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * Сервер получает email и пароль от клиента и запускает проверку
     * авторизации у цепочки
     */
    public boolean logIn(String email, String password){
        if(middleware.check(email, password)){
            System.out.println("Authorization have been successful!");

            //Здесь должен быть какой-то полезный код, работающий для
            //авторизированных пользователей.

            return true;
        }
        return false;
    }

    public void registered(String email, String password){
        users.put(email, password);
    }

    public boolean hasEmail(String email){
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password){
        return users.get(email).equals(password);
    }
}
