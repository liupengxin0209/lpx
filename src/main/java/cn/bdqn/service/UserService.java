package cn.bdqn.service;

import cn.bdqn.pojo.PageBean;
import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<User> list();

    void delete(Integer id);

    void add(User user);

    void update(User user);

    public PageBean<User> findlimit(Integer currPageNo, Integer pageSize);
    public Integer findTotal();
}
