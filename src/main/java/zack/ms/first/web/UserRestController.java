package zack.ms.first.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zack.ms.first.entities.User;
import zack.ms.first.repository.UserRepository;

import java.util.List;

@RestController
public class UserRestController {


  private UserRepository userRepository;

  @Autowired
  public UserRestController(UserRepository userRepository) {
    this.userRepository=userRepository;

  }

  @GetMapping("/users")
  List<User> getListUserFromDatabase(){

    return this.userRepository.findAll();




  }





}
