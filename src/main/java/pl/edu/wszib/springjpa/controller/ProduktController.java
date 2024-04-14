package pl.edu.wszib.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springjpa.model.Produkt;
import pl.edu.wszib.springjpa.service.ProduktService;

import java.util.List;

@RestController
@RequestMapping("/produkt")
public class ProduktController {
    @Autowired
    private ProduktService service;
    @GetMapping
    List<Produkt> list() {
        return null;
    }

    @GetMapping("/page")
    Page<Produkt> page() {
        return null;
    }

    @GetMapping("/{id}")
    Produkt get(@PathVariable Integer id) {
        return null;
    }

    @PostMapping
    Produkt create(@RequestBody Produkt produkt) {
        return null;
    }

    @PutMapping("/{id}")
    Produkt update(@PathVariable Integer id, @RequestBody Produkt produkt) {
        return null;
    }

    @DeleteMapping("/{id}")
    void detete(@PathVariable Integer id) {

    }

}
