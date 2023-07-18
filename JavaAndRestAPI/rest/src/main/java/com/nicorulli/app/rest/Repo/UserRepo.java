package com.nicorulli.app.rest.Repo;

import com.nicorulli.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
