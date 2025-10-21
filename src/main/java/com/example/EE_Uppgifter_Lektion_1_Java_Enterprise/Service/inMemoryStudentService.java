package com.example.EE_Uppgifter_Lektion_1_Java_Enterprise.Service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class inMemoryStudentService implements com.example.EE_Uppgifter_Lektion_1_Java_Enterprise.Service.StudentService {
    @Override
    public String getStudentInfo(long id) {
        return "Hello from inMemory (id = " + id + ")";
    }

}
