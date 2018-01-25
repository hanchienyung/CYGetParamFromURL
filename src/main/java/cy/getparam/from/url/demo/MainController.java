package cy.getparam.from.url.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    @RequestMapping("/getname")
    public String showWithName(@RequestParam("name") String name,
                               @RequestParam("age") int age,
                               @RequestParam("color") String color)
    {
        return name+" "+age+" "+color;
    }


    @RequestMapping("/getothername")
    public String showWithName(HttpServletRequest param){

        String withName = param.getParameter("yourname");
        if (withName==null)
            return "Just Hello";
        else return "Hello "+withName;
    }

}
