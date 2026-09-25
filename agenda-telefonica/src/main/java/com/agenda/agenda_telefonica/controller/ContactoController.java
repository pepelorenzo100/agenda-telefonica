package com.agenda.agenda_telefonica.controller;
import com.agenda.agenda_telefonica.dto.ContactoDTO;
import com.agenda.agenda_telefonica.entity.Contacto;
import com.agenda.agenda_telefonica.service.ContactoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contactos")
public class ContactoController {

    private final ContactoService service;

    public ContactoController(ContactoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contacto> listar() {
        return service.listarTodos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contacto crear(@RequestBody ContactoDTO dto) {
        return service.crear(dto);
    }
}