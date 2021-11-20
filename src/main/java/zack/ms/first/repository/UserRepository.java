package zack.ms.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zack.ms.first.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {


  List<User> findAll();

  @Override
  Optional<User> findBySalaireAndSalaireIsLessThan(Long aLong);
}
