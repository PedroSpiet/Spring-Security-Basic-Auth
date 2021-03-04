package com.security.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class testResource {

    @GetMapping(value = "/public")
    public ResponseEntity<String> publicRoute() {
        return ResponseEntity.ok().body("Rota Publica");
    }

    @GetMapping(value = "private")
    public ResponseEntity<String> privateRoute() {
        return ResponseEntity.ok().body("Rota Privada");
    }
}
