package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

public class Application extends Controller {

    public static void index() {
    	render();
    }
    
    public static void analyze() {
        renderJSON("{\"message\": \"Tell me about your father.\"}");
    }

}