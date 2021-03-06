package ru.itpark.service;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.itpark.entity.Shirt;
import ru.itpark.repository.ShirtRepository;

import java.util.List;
import java.util.Optional;

//import ru.itpark.entity.Product;

@Service
public class ShirtService {

    private final ShirtRepository shirtRepository;

    public ShirtService(ShirtRepository shirtRepository) {
        this.shirtRepository = shirtRepository;
    }

    public void save(Shirt shirt) {
        shirtRepository.saveAndFlush(shirt);
    }

    public List<Shirt> findAll() {
        return shirtRepository.findAll();
    }

    public List<Shirt> findByName(String name) {
        return shirtRepository.findByNameContains(name);
    }

    public List<Shirt> findAllByAccountId(int accountId) {
        return shirtRepository.findAllByAccount_Id(accountId);
    }

    public Optional<Shirt> findById(int id) {
         return shirtRepository.findById(id);
    }

//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void deleteById(int id) {
        shirtRepository.deleteById(id);
    }
}
