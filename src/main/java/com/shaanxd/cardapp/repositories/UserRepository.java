package com.shaanxd.cardapp.repositories;

import com.shaanxd.cardapp.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
