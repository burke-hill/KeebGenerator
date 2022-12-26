package com.chuckbuckney.keebGenerator.Repository;

import com.chuckbuckney.keebGenerator.Domain.Keyboard;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

public interface KeyboardRepository extends CrudRepository<Keyboard, Id> {
}
