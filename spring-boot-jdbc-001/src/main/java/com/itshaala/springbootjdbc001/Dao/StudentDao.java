package com.itshaala.springbootjdbc001.Dao;

import com.itshaala.springbootjdbc001.Model.Student;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
@Nullable

public class StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void createStudent(Student student) {
        String query= "insert into students (name,course )values(?,?)";
        jdbcTemplate.update(query,student.getName(),student.getCourse());
    }

    public void updateStudent(Student student) {
        String query= "update students set name=?,course=? where id=?";
        jdbcTemplate.update(query,student.getName(),student.getCourse(),student.getId());
    }

    public void deleteStudent(Student student) {
        String query= "delete from students where id=?";
        jdbcTemplate.update(query, id);
    }
    public Student getStudentById(int id) {
        String query= "select * from students where id=?";

        RowMapper<Student> studentRowMapper = (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCourse(rs.getString("course"));
            return student;


    };
        return queryForObject(query, rowMapper, id);
    }
    public List<Student> getAllStudents() {
        return null;
    }
}
