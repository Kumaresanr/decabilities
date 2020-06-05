@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@javax.persistence.Entity
class Employee {

  public Employee(java.lang.String name) {
    this.name = name;
  }

  @javax.persistence.Id
  @javax.persistence.GeneratedValue
  private java.lang.Long id;

  private java.lang.String name;
}