package com.model.repository;

import com.model.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionRepository extends JpaRepository<Question, Long> {
//    @Query(value = "select * from question where title like %?1%  && id_question_type = ?2 ",
//    nativeQuery = true)
    @Query(value = "select * from question " +
            "where  (title like %?1%) " +
            "and (id_question_type like %?2%) " +
            "order by id desc ", nativeQuery = true)
    Page<Question> findAllQuestion(String name, String questionType, Pageable pageable);

}
