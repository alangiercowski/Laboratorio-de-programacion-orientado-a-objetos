import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Empresa {
    private String nombre;
    HashSet<Empleado>empleados = new HashSet<>();

    public Empresa(String nombre, HashSet<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public int empleadosActuales(){
        return this.empleados.size();
    }
    public HashMap<DayOfWeek, Integer> cantidadEmpleadosDiarios(){
        int cantidad = 0;
        for (Empleado empleado : this.empleados){
            for(DayOfWeek dia : empleado.getDiasLaborales()){
                cantidad++;
                cantidadEmpleadosDiarios().put(dia,cantidad);
            }
        }
        return cantidadEmpleadosDiarios();
    }
    public void EmpleadoConAsistenciaPerfecta(){
        for (Empleado empleado : empleados){
            if (empleado.porcentajeAsistenciaMensual(03) == 100){
                System.out.println(empleado.getNombre());
                System.out.println(empleado.getApellido());
                System.out.println(empleado.getTelefono());
            }
        }
    }
    public void EmpleadoConAsistenciaMenorA50(){
        for (Empleado empleado : empleados){
            if (empleado.porcentajeAsistenciaMensual(10) <= 50){
                System.out.println(empleado.getNombre());
                System.out.println(empleado.getApellido());
                System.out.println(empleado.getTelefono());
            }
        }
    }
    public void Empleados5minutosTarde(){
        for (Empleado empleado : this.empleados){
            int tarde = empleado.getHoraEntrada().getMinute()+5;
            for (LocalDate fecha : empleado.getIngresosDiarios().keySet()){
                if(empleado.getIngresosDiarios().get(fecha).getMinute() >= tarde){
                    System.out.println(empleado.getNombre());
                    System.out.println(empleado.getApellido());
                    System.out.println(empleado.getTelefono());
                }
            }
        }
    }

}
