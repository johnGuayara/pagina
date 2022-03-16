package com.web.pagina.controller;



import com.web.pagina.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//Se inicializa la anotacion controller
@Controller
public class controllerIndex {
    //Se utiliza la anotacion de getmapping para obtener algun valor
    @GetMapping("/register")
    //se inicia el metodo 
    public String form(Model model){
        //creamos un usurio
        User user = new User();
        //agrega la variable user al modelo
        model.addAttribute("user",user);
        //y retorna el valor hacia pagina
        return "register_form";
    }
    //se utiliza la anotacion post para enviar la informacion
    @PostMapping("/register")
    //iniciamos un metodo que tenga como parametros un anotacion en este caso el @ModelAttribute donde le pasaremos un
    //atributo para mapear los nombres y el parametro User donde se encuentra nuestras variables para pode mostrar
    //los valores que mandamos con el formulario
    public String submitForm(@ModelAttribute("user")User user){
        System.out.println(user);
        return "register_success";
    }
}