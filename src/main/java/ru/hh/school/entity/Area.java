package ru.hh.school.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Area {

  @Id
  @Column(name = "area_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  public Area() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Area area = (Area) o;
    return name.equals(area.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
