package cn.bdqn.controller;

import cn.bdqn.pojo.PageBean;
import cn.bdqn.pojo.User;
import cn.bdqn.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("list")
    public List<User> list(){
        List<User> list = userService.list();
        return list;
    }

    @RequestMapping("add")
    public String add(User user){
        userService.add(user);
        return "添加成功";
    }

    @RequestMapping("delete")
    public String delete(Integer id){
        userService.delete(id);
        return "删除成功";
    }


    @RequestMapping("update")
    public String update(User user){
        userService.update(user);
        return "修改成功";
    }


    @RequestMapping(value = "find",method = RequestMethod.GET)
    public PageBean<User> findUser(@RequestParam(value = "currPageNo",defaultValue = "1",required = false)int currPageNo, Model model){
        PageBean<User>pageBean = userService.findlimit(currPageNo,1);
        model.addAttribute("page",pageBean);
        return pageBean ;
    }
}
