package com.alone.comtroller;

import com.alone.pojo.Role;
import com.alone.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("{id}")
    public Role getRoleById(@PathVariable("id")Integer id){
        return roleService.getRoleById(id);
    }
}
