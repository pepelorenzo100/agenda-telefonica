package com.agenda.agenda_telefonica.service;
import com.agenda.agenda_telefonica.dto.ContactoDTO;
import com.agenda.agenda_telefonica.entity.Contacto;
import com.agenda.agenda_telefonica.exception.RecursoDuplicadoException;
import com.agenda.agenda_telefonica.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactoService {

    private final ContactoRepository repository;

    @Autowired
    public ContactoService(ContactoRepository repository) {
        this.repository = repository;
    }

    public List<Contacto> listarTodos() {
        return repository.findAll();
    }

    public Contacto crear(ContactoDTO dto) {
        repository.findByEmail(dto.getEmail())
            .ifPresent(c -> {
                throw new RecursoDuplicadoException("Ya existe un contacto con ese email: " + dto.getEmail());
            });

        Contacto nuevo = new Contacto(dto.getNombre(), dto.getTelefono(), dto.getEmail());
        return repository.save(nuevo);
    }
}