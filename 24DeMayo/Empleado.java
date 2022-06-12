import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Empleado {
    private String nombre;
    private String apellido;
    private int telefono;
    private LocalDate fechaDeNacimiento;
    private HashSet<DayOfWeek> diasLaborales = new HashSet<>();
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private HashMap<LocalDate, LocalTime> ingresosDiarios = new HashMap<>();

    public Empleado(String nombre, String apellido, int telefono, LocalDate fechaDeNacimiento, HashSet<DayOfWeek> diasLaborales, LocalTime horaEntrada, LocalTime horaSalida, HashMap<LocalDate, LocalTime> ingresosDiarios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.diasLaborales = diasLaborales;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.ingresosDiarios = ingresosDiarios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public HashSet<DayOfWeek> getDiasLaborales() {
        return diasLaborales;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public HashMap<LocalDate, LocalTime> getIngresosDiarios() {
        return ingresosDiarios;
    }

    public Float porcentajeAsistenciaMensual(int mes) {

        Float total = Float.valueOf(this.getDiasLaborales().size() * 4);
        Float asistido = 0.f;
        for (LocalDate fecha : ingresosDiarios.keySet()) {
            if (fecha.getMonthValue() == mes) {
                for (DayOfWeek dia : this.diasLaborales) {
                    if (fecha.getDayOfWeek() == dia && this.ingresosDiarios.get(fecha) != null) {
                        asistido++;
                    }
                }
            }


        }
        return (asistido * 100) / total;
    }
}
