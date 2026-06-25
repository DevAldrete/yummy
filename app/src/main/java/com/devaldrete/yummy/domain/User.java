import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Getter
  private Long Id;

  @Setter @Getter
  private String name;

  @Setter @Getter
  private String email;

  @Setter
  private String password;
}

interface UserRepository extends JpaRepository<User, Long> {}
