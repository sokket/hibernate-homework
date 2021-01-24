package ru.hh.school.entity;

import javax.persistence.*;

@Entity
public class Resume {
  // сделать так, чтобы id брался из sequence-а
  // таким образом, мы сможем отправлять в бд запросы батчами.
  // нужно учитывать, что описание sequence при создании таблицы также должно соответствовать
  // хиберовской сущности (см. create_resume.sql)
  //
  // Подробнее:
  // https://vladmihalcea.com/how-to-batch-insert-and-update-statements-with-hibernate/
  // https://vladmihalcea.com/from-jpa-to-hibernates-legacy-and-enhanced-identifier-generators/

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resume_id_generator")
  @SequenceGenerator(name="resume_id_generator", sequenceName = "resume_id_seq")
  private Integer id;

  private String description;

  public Resume() {}

  public Resume(String description) {
    this.description = description;
  }

}
