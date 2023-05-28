package com.cgy;

import com.cgy.pojo.Course;
import com.cgy.pojo.School;
import com.cgy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest {
   // <!--需求1：查询 id=2 的课程信息-->
    @Test
    public void findCourseById(){
        SqlSession sqlSession= MyBatisUtils.getSession();
       Course course= sqlSession.selectOne("com.cgy.mapper.CourseMapper.findCourseById",2);
        System.out.println(course);
    }

    // <!--需求2：查询出所有计算机学院开设的课程信息 ；-->
    @Test
    public void findCourseBySchool(){
        SqlSession sqlSession= MyBatisUtils.getSession();
       List<Course>  list= sqlSession.selectList("com.cgy.mapper.CourseMapper.findCourseBySchool","计算机学院");
        for (Course c:list
             ) {
            System.out.println(c);
        }
        sqlSession.close();
    }

    // <!--需求3：将 id=4 这⻔课程的课时数修改为 32+8=40；
    @Test
    public void updateById(){
        SqlSession sqlSession= MyBatisUtils.getSession();

       int i= sqlSession.update("com.cgy.mapper.CourseMapper.updateById",4);
        if(i>0)
            System.out.println("修改成功"+i+"行数据");
        else
            System.out.println("修改失败");
        //修改数据库内容必须要手动提交数据
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateById2(){
        SqlSession sqlSession= MyBatisUtils.getSession();
        int i= sqlSession.update("com.cgy.mapper.CourseMapper.updateById2");
        if(i>0)
            System.out.println("修改成功"+i+"行数据");
        else
            System.out.println("修改失败");
        //修改数据库内容必须要手动提交数据
        sqlSession.commit();
        sqlSession.close();
    }

    //<!--需求4：插⼊⼀条新的课程记录： names=”⼤数据存储“，hours=32，schools =1；-->
    @Test
    public void insertCourse(){
        SqlSession sqlSession= MyBatisUtils.getSession();
        int i= sqlSession.insert("com.cgy.mapper.CourseMapper.insertCourse");
        if(i>0)
            System.out.println("插入成功"+i+"行数据");
        else
            System.out.println("插入失败");
        //修改数据库内容必须要手动提交数据
        sqlSession.commit();
        sqlSession.close();
    }

    // <!--需求5：输出所有的学院开设的课程信息。-->
    //方法1
    @Test
    public void findAllCourse(){
        SqlSession sqlSession= MyBatisUtils.getSession();
        Integer[] a= new Integer[]{1,2};
        List<Course> list= sqlSession.selectList("com.cgy.mapper.CourseMapper.findAllCourse",a);
        for (Course c:list
             ) {
            System.out.println(c);
        }
        //修改数据库内容必须要手动提交数据,不然在数据库中看不到更改
        sqlSession.commit();
        sqlSession.close();
    }

    //方法1
    @Test
    public void findSchoolWithCourseById(){
        SqlSession sqlSession= MyBatisUtils.getSession();
        Integer[] a= new Integer[]{1,2};
        List<School> list= sqlSession.selectList("com.cgy.mapper.SchoolMapper.findSchoolWithCourseById",a);
        for (School c:list
        ) {
            System.out.println(c);
        }
        //修改数据库内容必须要手动提交数据,不然在数据库中看不到更改
        sqlSession.commit();
        sqlSession.close();
    }


}
