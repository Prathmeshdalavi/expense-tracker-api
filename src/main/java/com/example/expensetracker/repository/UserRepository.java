
package com.example.expensetracker.repository;
import com.example.expensetracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {}
