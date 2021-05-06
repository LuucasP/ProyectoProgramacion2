package edu.central.central.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



import org.springframework.ui.Model;

import edu.central.central.domain.Persona;
//import edu.central.central.repository.UserRepository;
//import java.util.Optional;
import edu.central.central.domain.Persona;
import edu.central.central.domain.User;
import edu.central.central.repository.IPersonaRepo;

//import org.springframework.validation.BindingResult;


@Controller
public class PersonaController {
    
    @Autowired
    private IPersonaRepo repo;
    

    @GetMapping("/")
    public String index (Model model){
        User usuario = new User();
        model.addAttribute("user", usuario);
        return "user/index";
    }

    @PostMapping("/user/login")
    public String login(Model model) {
        User usuario = new User();
        String mensaje = "Registro exitoso";
        model.addAttribute("user", usuario);
        model.addAttribute("message", mensaje);
        return "user/index";
    }



    @GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //lógica
        Persona p = new Persona();
        repo.save(p);
		model.addAttribute("name", name);
		return "greeting";
	}

    @GetMapping("/listar")
    public String greeting (Model model){
        //lógica
        model.addAttribute("personas", repo.findAll());
        return "greeting";
    }


}
