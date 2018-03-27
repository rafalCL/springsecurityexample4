package pl.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.company.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    void delete(User user);
}