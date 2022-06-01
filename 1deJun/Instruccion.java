public class Instruccion extends Programa {

    private  String nombre;
    private Double numero;
    private String key;

    public Instruccion(String nombre) {
        this.nombre = nombre;

    }
    public Instruccion(String nombre, Double numero) {
        this.nombre = nombre;
        this.numero = numero;

    }

    public Instruccion(String nombre,String key) {
        this.nombre = nombre;
        this.key = key;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void push(Double k){
        this.getPila().add(k);
    }
    public void add(){
        if(this.getPila().size() > 1){
            Double aux = 0.00;
            aux = this.getPila().get(this.getPila().size()-1);
            this.getPila().remove(this.getPila().size()-1);
            aux += this.getPila().get(this.getPila().size()-1);
            this.getPila().remove(this.getPila().size()-1);
            this.getPila().add(aux);
        }
    }

    public void sub(){
        if(this.getPila().size() > 1){
            Double aux1 = 0.00;
            Double aux2 = 0.00;
            aux1 = this.getPila().get(this.getPila().size()-1);
            this.getPila().remove(this.getPila().size()-1);
            aux2 = this.getPila().get(this.getPila().size()-1);
            this.getPila().remove(this.getPila().size()-1);
            aux2 -= aux1;
            this.getPila().add(aux2);
        }
    }
    public void mul(){
        if(this.getPila().size()>1) {
            Double aux = 0.00;
            aux = this.getPila().get(this.getPila().size() - 1);
            this.getPila().remove(this.getPila().size() - 1);
            aux *= this.getPila().get(this.getPila().size() - 1);
            this.getPila().remove(this.getPila().size() - 1);
            this.getPila().add(aux);
        }
    }
    public void write(String variable){
        if(this.getPila().size()>1){
            Double aux= this.getPila().get(this.getPila().size()-1);
            this.getPila().remove(this.getPila().size()-1);
            for (String i : this.getMemoria().keySet()){
                if(variable==i){
                    this.getMemoria().put(i,aux);
                }
            }
        }
    }

    public void read(String variable){
        for(String i : this.getMemoria().keySet()){
             if(variable==i){
                 this.getPila().add(this.getMemoria().get(i));
             }

        }
    }



}
