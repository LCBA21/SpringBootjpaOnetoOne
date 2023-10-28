package com.kubudirira.jpaOnetoOne.service.implementation;


import com.kubudirira.jpaOnetoOne.model.User;
import com.kubudirira.jpaOnetoOne.repository.UserRepository;
import com.kubudirira.jpaOnetoOne.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl  implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {

        userRepository.save(user);
        return null;
    }

    @Override
    public List<User> saveAll(List<User> userList) {

        userRepository.saveAll(userList);
        return null;
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);

    }

    @Override
    public List<User> findAll() {
      return (List<User>) userRepository.findAll();
    }

    @Override
    public User update(int id, User user) {

       /* user.setId(id);
        userRepository.save(user);*/

        User foundUser = userRepository.findById(id).get();

        foundUser.setEmail(user.getEmail());
        foundUser.setFirst_name(user.getLast_name());
        foundUser.setLast_name(user.getLast_name());

        userRepository.save(foundUser);
        return foundUser;
    }

    @Override
    public void delete(User user) {

        userRepository.delete(user);

    }


    @Override
   public void deleteById(int id){
        userRepository.deleteById(id);

    }
}
