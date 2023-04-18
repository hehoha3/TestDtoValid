package com.example.testDTO.service;

import com.example.testDTO.model.dto.UserRequest;
import com.example.testDTO.model.entity.User;
import com.example.testDTO.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepo userRepo;

    public List<User> getListUser(){
        return userRepo.findAll();
    }

    public User getUserById(Long id) {
        if (userRepo.existsById(id)){
            return userRepo.findAllById(id);
        } else {
            return null;
        }
    }

    public User addUser(UserRequest userRequest){
        User user = User.build(0L,
                userRequest.getName(),
                userRequest.getEmail(),
                userRequest.getMobile(),
                userRequest.getGender(),
                userRequest.getAge(),
                userRequest.getNationality());
        return userRepo.save(user);
    }

    public String updateUser(Long id, UserRequest userRequest){
        if (userRepo.existsById(id)){
            User user = userRepo.findAllById(id);
            user.setName(userRequest.getName());
            user.setEmail(userRequest.getEmail());
            user.setMobile(userRequest.getMobile());
            user.setGender(userRequest.getGender());
            user.setAge(userRequest.getAge());
            user.setNationality(userRequest.getNationality());
            userRepo.save(user);
            return "Update User Successfully";
        } else {
            return "Id Does Not Exist !!";
        }
    }

    public String deleteUser(Long id){
        if (userRepo.existsById(id)){
            userRepo.deleteById(id);
            return "Delete User Successfully";
        } else {
            return "Id Does Not Exist !!";
        }
    }
}
