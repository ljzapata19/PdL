package p3_ej5;

public class Palabra {
    private String palabra;
    private Integer cantidad;

    public Palabra(String p){
        this.palabra=p;
        this.cantidad=1;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String p) {
        this.palabra = p;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void incremento (){
        this.cantidad++;
    }

}
