package com.industry.bank.persistence.repository;

import com.industry.bank.persistence.entity.user.RoleEntity;
import com.industry.bank.persistence.entity.user.UserEntity;
import com.industry.bank.persistence.mapper.RoleMapper;
import com.industry.bank.persistence.mapper.UserMapper;
import com.industry.bank.service.repository.UserStorage;
import com.industry.bank.service.repository.dto.RoleRequest;
import com.industry.bank.service.repository.dto.UserRequest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserStorageImpl implements UserStorage {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(UserRequest user) {
        UserEntity userEntity = UserMapper.INSTANCE.toEntity(user);
        entityManager.persist(userEntity);
    }

    @Override
    public void saveRole(RoleRequest role) {
        RoleEntity roleEntity = RoleMapper.INSTANCE.toEntity(role);
        entityManager.persist(roleEntity);
    }

    @Override
    public void addRoleToUser(String roleName, String username) {
        UserEntity user = entityManager.find(UserEntity.class,username);
        RoleEntity role = entityManager.find(RoleEntity.class,roleName);
        user.getRoles().add(role);
    }

    @Override
    public UserRequest getUser(String username) {
        UserRequest user = UserMapper.INSTANCE.toRequest(entityManager.find(UserEntity.class,username));
        return user;
    }

    @Override
    public List<UserRequest> getUsers() {
        //entityManager.find(UserEntity.class,);
        return null;
    }

}