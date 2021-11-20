package zack.ms.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import zack.ms.first.entities.User;
import zack.ms.first.enums.Sex;
import zack.ms.first.repository.UserRepository;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}



	@Bean
	CommandLineRunner start(UserRepository userRepository){

	  return args -> {
	    userRepository.save(new User(null,"salim","amiar",new Date(),Sex.HOMME,33,12000.0));
      userRepository.save(new User(null,"zyed","farhaoui",new Date(),Sex.HOMME,37,14300.0));
      userRepository.save(new User(null,"zack","amiar",new Date(),Sex.HOMME,18,550.0));
      userRepository.save(new User(null,"fares","salem",new Date(),Sex.HOMME,33,5000.0));
      userRepository.save(new User(null,"imane","amiar",new Date(),Sex.FEMME,33,30000.0));
      userRepository.save(new User(null,"andrea","nowankiewicz",new Date(),Sex.HOMME,29,7561.0));
      userRepository.save(new User(null,"dominique","zanaletti",new Date(),Sex.HOMME,33,6755.0));
      userRepository.save(new User(null,"rania","amiar",new Date(),Sex.HOMME,33,120.0));
      userRepository.save(new User(null,"amine","bouchane",new Date(),Sex.HOMME,33,6345.0));
      userRepository.save(new User(null,"rami","belkacem",new Date(),Sex.HOMME,33,3233.0));


    };
  }

}
