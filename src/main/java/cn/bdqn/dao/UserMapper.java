package cn.bdqn.dao;

        import cn.bdqn.pojo.PageBean;
        import cn.bdqn.pojo.User;
        import org.apache.ibatis.annotations.Mapper;
        import org.apache.ibatis.annotations.Param;
        import org.apache.ibatis.annotations.Select;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Mapper
public interface UserMapper {
    //@Select("select * from User")
    List<User> list();



    void delete(@Param("id") Integer id);

    void add(User user);

    void update(User user);

    public List<User> findlimit(@Param("currPageNo") Integer currPageNo, @Param("pageSize") Integer pageSize);
    public Integer findTotal();
}
