package com.registration.registration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registration.registration.repository.StudentRepository;
import com.registration.registration.model.Student;
@Service
public class StudentService
{
    @Autowired
    private StudentRepository repository;

    public void save(Student student) {
        repository.save(student);
    }
}
//save and flush - search
//@transaction ?
// findByID - how to fetch data using another column
// findByColumnName
//What is hibernate Cache
// cascading - hibernate main feature - how saving in database.
//fetchTYpes - lazy fetch....
// Handle the execeptions
//EntityManager.getReference.
// Decrypt the password and save it in the DB.
// Authenticate the password.
// Hiding the password and sending it in URL (JWT) in springboot.
// Streams and optional.
// immutable List
// transient keyword ,