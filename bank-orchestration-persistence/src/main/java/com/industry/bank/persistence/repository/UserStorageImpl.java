package com.industry.bank.persistence.repository;

import com.industry.bank.api.dto.user.RoleDto;
import com.industry.bank.api.dto.user.UserDto;
import com.industry.bank.persistence.mapper.UserMapper;
import com.industry.bank.service.repository.UserStorage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserStorageImpl implements UserStorage {

    @PersistenceContext
    private EntityManager entityManager;

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public com.industry.bank.service.repository.dto.UserDto saveUser(UserDto user) {

        //userMapper.mapToDto();
        return  null;
    }

    @Override
    public com.industry.bank.service.repository.dto.RoleDto saveRole(RoleDto role) {
//        String queryStr = "SELECT c FROM user c WHERE c.name LIKE :name";
//        TypedQuery<UserEntity> query = entityManager.createQuery(queryStr, UserEntity.class);
//        query.setParameter("nameFragment", "%" + nameFragment + "%");
//        return query.getResultList();
        return null;
    }

    @Override
    public void addRoleToUser(com.industry.bank.service.repository.dto.RoleDto roleName, com.industry.bank.service.repository.dto.UserDto userName) {
    }
}