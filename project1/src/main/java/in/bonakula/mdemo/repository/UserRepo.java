package in.bonakula.mdemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bonakula.mdemo.model.User;



public interface UserRepo extends JpaRepository<User, Long> {

	Optional<User> findOneByName(String string);

}
