package package_planeta;

public class Planeta {

    private int numeroId;
    private String nombre;
    private String masa;
    private double densidad;
    private double diametro;
    private String distanciaAlSol;

    public  Planeta(){

    }


    public Planeta(int numeroId, String nombre, String masa, double densidad, double diametro, String distanciaAlSol) {
        this.numeroId = numeroId;
        this.nombre = nombre;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setDistanciaAlSol(String distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMasa() {
        return masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public String getDistanciaAlSol() {
        return distanciaAlSol;
    }

    @Override
    public String toString() {
        return "Planeta: " + numeroId +
                ", Nombre= " + nombre +
                ", Masa(kg)= " + masa +
                ", Densidad(g/cm³)= " + densidad +
                ", Diametro(km)= " + diametro +
                ", Distancia al sol(km)= " + distanciaAlSol;
    }

}
