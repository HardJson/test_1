package com.alone.consumer.web;


import com.alone.consumer.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("consumer")
public class SeeRoleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    public Role queryRoleById(@PathVariable("id") Integer id) {
        String url = "http://localhost:8081/role/" + id;
        Role role = restTemplate.getForObject(url, Role.class);
        return role;
    }
}
