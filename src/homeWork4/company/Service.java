package homeWork4.company;

public class Service implements FindInterface {
    @Override
    public boolean find(Employee employee, String name) {
      Employee[] employees = employee.getEmployees();
      for (Employee empl : employees){
          String emplName = empl.name;
          if (emplName.equals(name)){
              return true;
          }
      }return false;
    }

}

