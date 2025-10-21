package com.example.EE_Uppgifter_Lektion_1_Java_Enterprise.Service;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class JpaStudentService implements com.example.EE_Uppgifter_Lektion_1_Java_Enterprise.Service.StudentService {

    @Override
    public String getStudentInfo(long id) {
        return "Hello from JPA (id =" + id + ")";

    }

}
