package com.example.demo.models;

import com.example.demo.ResetDatabase;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BookTest extends ResetDatabase {
    @Test
    public void createSuccess() {
        // 1. Test DB를 바라봐야 함.
        // 2. 테스트 수행을 할 때마다, DB가 초기화되어야 함. (데이터의 상태에 따라 테스트 결과가 달라지는 것을 방지하기 위해)
        // 3. Book 개체가 DB에 생성되는지 테스트.
    }
}
