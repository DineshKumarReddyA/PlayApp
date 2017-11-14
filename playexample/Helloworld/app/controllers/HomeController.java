package controllers;

import java.util.ArrayList;
import java.util.List;

import Model.Person;
import play.libs.Json;
import views.html.*;
import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("WELCOME TO DINESH."));
    }
    
    
    public  Result hello(String name) {
        return ok("Hello"+ name);

    }
    
    public  Result hello1(String name) {
        return ok(views.html.hello.render(name));

    }
    
    
    public Result getPersons() {
    	
    	Person ps =new Person();
    	ps.setId("123");
    	ps.setName("DINESH");
    	Person ps1 =new Person();
    	ps1.setId("1234");
    	ps1.setName("DINESHR");
    	
    	List<Person> ls = new ArrayList<>();
    	ls.add(ps);
    	ls.add(ps1);
    	
    	return ok(Json.toJson(ls));
    }

}
