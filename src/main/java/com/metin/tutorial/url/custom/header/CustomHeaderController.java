package com.metin.tutorial.url.custom.header;

import com.metin.tutorial.model.StudentV1;
import com.metin.tutorial.model.StudentV2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomHeaderController {

    @GetMapping(value = "/students", headers = "X-API-VERSION=1")
    public ResponseEntity<List<StudentV1>> getStudentsV1() {
        return ResponseEntity.ok(Arrays.asList(new StudentV1("Yusuf"), new StudentV1("Metin")));
    }

    @GetMapping(value = "/students", headers = "X-API-VERSION=2")
    public ResponseEntity<List<StudentV2>> getStudentsV2() {
        return ResponseEntity.ok(Arrays.asList(
                new StudentV2("Yusuf", "Alnıaçık"), new StudentV2("Metin", "Alnıaçık")));
    }
}
