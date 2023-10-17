package br.com.stun106.todolist.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.stun106.todolist.interfaces.IUsersRepository;
import br.com.stun106.todolist.models.user.UserModel;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private IUsersRepository usersRepository;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody UserModel userModel) {

        var user = this.usersRepository.findByname(userModel.getUsername());
        if (user != null){
            Map<String,String> msg = new HashMap<String,String>();
            msg.put("msg", "Usuario ja existe!");
            return ResponseEntity.status(500).body(msg);
        }
        
        var cryptPassword = BCrypt.withDefaults().hashToString(12,userModel.getPassword().toCharArray());

        userModel.setPassword(cryptPassword);

        var data =  this.usersRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(data);        
    }
}
