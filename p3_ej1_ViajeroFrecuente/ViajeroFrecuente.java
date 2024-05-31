package p3_ej1;

public class ViajeroFrecuente {
    private Integer numero;
    private String dni;
    private String nombre;
    private String apellido; 
    private Integer millas;

    // Constructor para la clase ViajeroFrecuente
    public ViajeroFrecuente(Integer numero, String dni, String nombre, String apellido, Integer millas) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.millas = millas;
    }

    // Getters y Setters (opcional, para acceso a los atributos)
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getMillas() {
        return millas;
    }

    public void setMillas(Integer millas) {
        this.millas = millas;
    }
 
    public Integer acumularMillas(Integer millasacum) {
        this.millas += millasacum;
        return millas;
    }

    public Integer canjearMillas (Integer millascanj) {
        if (this.millas >= millascanj) {
            this.millas -= millascanj;
        }else { 
            System.out.println("No se pudo canjear");
        }
        return millas;
    }

    @Override
    public String toString(){
        return "ViajeroFrecuente {" + "numero= "+numero+", dni= "+dni+", nombre= "+nombre+", apellido= "+apellido+", millas= "+millas+"}";
    }
}
