package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

public class Application extends Controller {

    public static void index() {
    	render();
    }
    
    public static void analyze(String message) {
    	System.out.println("Got message from router!");
    	String response = "Why do you think you want to talk about " + message;
        renderJSON("{\"message\":" + response + "}");
    }

}