package edu.central.central.web;
import java.util.ArrayList;
import java.util.Date;

import org.attoparser.trace.MarkupTraceEvent.AttributeTraceEvent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import aj.org.objectweb.asm.Attribute;

import java.util.List;
import java.util.stream.Collectors;

import edu.central.central.configuration.Pagina;
import edu.central.central.domain.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic{

    public List<Post> getPosts(){
        
        ArrayList<Post> post = new ArrayList<>();
        
        post.add(new Post(1, "Desarrollo web para la enseñanza universitaria", "http://localhost:8080/img/kirby.jpg", new Date(), "Desarrollo web"));
        post.add(new Post(2, "Desarrollo web para la enseñanza universitaria", "http://localhost:8080/img/kirbymalo.jpg", new Date(), "Desarrollo web Front End"));
        post.add(new Post(3, "Desarrollo web para la enseñanza universitaria", "http://localhost:8080/img/kirby.jpg", new Date(), "Desarrollo web Back End"));
        return post;
    } 
    
    @GetMapping(path = {"/posts","/"})
    public String saludar(Model model){
        model.addAttribute("posts", getPosts());
        return "index";
    }
    
    @GetMapping(path= {"/public"})
    public ModelAndView post(){
        ModelAndView modelAndView = new ModelAndView(Pagina.HOME);
        modelAndView.addObject("posts", getPosts());
        return modelAndView;
    }
    
    @GetMapping(path = {"/post"})
    public ModelAndView getPostIndividual( @RequestParam(defaultValue = "1", name = "id", required = false) int id )
    {
        ModelAndView modelAndView = new ModelAndView(Pagina.Post);
        List<Post> postFiltrado = this.getPosts().stream()
                            .filter( (p) -> {
                                return p.getId() == id;
                            }).collect(Collectors.toList());
        modelAndView.addObject("post", postFiltrado.get(0));
        return modelAndView;
    }
    
}