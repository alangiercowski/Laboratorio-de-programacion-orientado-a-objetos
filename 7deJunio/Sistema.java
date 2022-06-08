import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sistema {
    private HashMap<Programa, Conductores>programasPorConductor = new HashMap<>();

    public void carga(Conductores conductores, Programa programas){
        programas.getConductores().add(conductores);
        for (Programa key: programasPorConductor.keySet()) {
            for (LocalDateTime key2 : programas.getHorario().keySet()){
                if (key.getLocalDateTime(key2) == key2){
                    System.out.println("ya esta adentro");
                }else {
                    programasPorConductor.put(programas, conductores);
                }
            }
        }


}



    public static void main(String[] args) {
        Programa p = new Programa();
        Sistema s = new Sistema();
        System.out.print("inrgese el año: ");
        Scanner ingreso = new Scanner(System.in);
        int año = ingreso.nextInt();
        System.out.print("inrgese el mes: ");
        Scanner ingreso2 = new Scanner(System.in);
        int mes = ingreso2.nextInt();
        System.out.print("inrgese el dia: ");
        Scanner ingreso3 = new Scanner(System.in);
        int dia = ingreso3.nextInt();
        LocalDate date = LocalDate.of(año,mes,dia);
        for (Programa key : s.programasPorConductor.keySet()){
            for (LocalDateTime key2 : key.getHorario().keySet()){
                if (date == LocalDate.of(key2.getYear(), key2.getMonthValue(), key2.getDayOfMonth())){
                    System.out.println(key);
                }
            }
        }

    }
}
