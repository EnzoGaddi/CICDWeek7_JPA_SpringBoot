package atu.ie.cicdlab5;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public Person create(Person p) {
        return repo.save(p);
    }

    public List<Person> findAll() {
        return repo.findAll();
    }

    public Person findByEmployeeId(String id) {
        return repo.findByEmployeeId(id)
                .orElseThrow(() -> new IllegalArgumentException("Person not found"));
    }

    public Person Update(Person p) {
        return repo.save(p);
    }

    public void delete(Long p) {
        repo.deleteById(p);
    }
}

