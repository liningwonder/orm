package com.lining.orm;

import com.lining.orm.mapper.UserMapper;
import com.lining.orm.model.User;
import com.lining.orm.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * description:
 * date 2018-03-02
 *
 * @author lining1
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) throws Exception {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setId(5);
            user.setEmail("liiining@163.com");
            user.setName("liiining");
            userMapper.insertUser(user);
            //userMapper.deleteUser(2);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
