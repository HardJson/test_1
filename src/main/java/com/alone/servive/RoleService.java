package com.alone.servive;


import com.alone.mapper.RoleMapper;
import com.alone.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role getRole(Integer id){
        Role role = roleMapper.selectByPrimaryKey(id);
        return role;
    }
}
