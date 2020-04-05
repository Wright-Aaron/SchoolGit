package com.company;

import java.util.HashMap;

public class Controller {
    public static HashMap<String, Handler> handlerMap = new HashMap();

    public static void handleOperator(String operator){
        handlerMap.put("+", new Addition());
        handlerMap.put("-", new Subtraction());
        handlerMap.put("/", new Division());
        handlerMap.put("*", new Multiplication());

        Handler handler = handlerMap.get(operator);
        handler.execute();
    }
}
