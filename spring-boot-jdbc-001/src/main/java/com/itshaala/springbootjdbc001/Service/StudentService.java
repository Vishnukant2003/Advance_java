package com.itshaala.springbootjdbc001.Service;

import com.itshaala.springbootjdbc001.Dao.StudentDao;
import com.itshaala.springbootjdbc001.Model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    @AllArgsConstructor

    public class StudentService {
        private StudentDao studentDao;

        public void addStudent(Student student) {
            student.addStudent(student);
        }
        public void updateStudent(Student student) {
            studentDao.updateStudent(student);
        }
        public void deleteStudent(int id) {
            student.deleteStudent(id);
        }
        public Student getStudentById(int id) {
            return studentDao.getStudentById(id);
        } public List<Student> getAllStudents() {
            return studentDao.getAllStudents();
        }
    }

}
