package com.show.blog.demo.Controller;

import com.show.blog.demo.domain.model.entity.Hello;
import com.show.blog.demo.infrastructure.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {

    @Autowired
    private HelloDao helloDao;

    @RequestMapping("/add")
    public Hello hello(Hello hello){
        Hello helloDate = helloDao.save(hello);
        return helloDate;
    }

    @RequestMapping("/list")
    public List<Hello> list(Model model){
        List<Hello> helloList = helloDao.findAll();
        return helloList;
    }

    @RequestMapping("/index")
    public String index(){
        return "helloWordl!";
    }
}
