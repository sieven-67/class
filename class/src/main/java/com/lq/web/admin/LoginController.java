package com.lq.web.admin;

import com.lq.po.Admin;
import com.lq.po.Stu;
import com.lq.po.Teacher;
import com.lq.service.AdminService;
import com.lq.service.userService;
import com.lq.service.teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller

@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private userService userService;
    @Autowired
    private teacherservice teacherservice;
    @Autowired
    private AdminService adminservice;


    @GetMapping
    public String loginPage(){
        return "admin/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes){
        Stu s=userService.checkstu(name, password);
        Teacher t=teacherservice.checktea(name,password);
        Admin a= adminservice.checkadmin(name,password);
        if(s !=null){
                s.setPassword(null);
                session.setAttribute("s",s);
                return "admin/index";
        }else if(t!=null){
            t.setPassword(null);
            session.setAttribute("t",t);
            return "index";
        }else if(a!=null){
            a.setPassword(null);
            session.setAttribute("a",a);
            return "admin/admin-index";
        }else{
            attributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/admin";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("s");
        return "redirect:/admin";
    }
}
