package com.bosquebrisa.tienda_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicController {

    @GetMapping("/hello")
    public String helloPublic() {
        return "¡Hola! Este endpoint es público y no requiere autenticación.";
    }
}