package br.com.stun106.todolist.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stun106.todolist.models.user.UserModel;

public interface IUsersRepository extends JpaRepository<UserModel, UUID> {
   UserModel findByname(String username);
}
