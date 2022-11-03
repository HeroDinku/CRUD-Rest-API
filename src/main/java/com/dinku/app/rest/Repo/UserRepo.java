package com.dinku.app.rest.Repo;

import com.dinku.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User, Long> {

}

