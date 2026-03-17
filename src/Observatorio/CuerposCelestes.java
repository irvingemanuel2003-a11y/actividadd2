package Observatorio;

import java.util.ArrayList;

public class CuerposCelestes {
    private String Nombre;
    private String  Composicion;
    private double DistanciaTierra;
    private String UnidadTierra;
    private ArrayList<PeriodoVisible> Periodos;

    public CuerposCelestes(String nombre, String composicion, double distanciaTierra, String unidadTierra, ArrayList<PeriodoVisible> periodos) {
        Nombre = nombre;
        Composicion = composicion;
        DistanciaTierra = distanciaTierra;
        UnidadTierra = unidadTierra;
        Periodos = periodos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getComposicion() {
        return Composicion;
    }

    public void setComposicion(String composicion) {
        Composicion = composicion;
    }

    public double getDistanciaTierra() {
        return DistanciaTierra;
    }

    public void setDistanciaTierra(double distanciaTierra) {
        DistanciaTierra = distanciaTierra;
    }

    public String getUnidadTierra() {
        return UnidadTierra;
    }

    public void setUnidadTierra(String unidadTierra) {
        UnidadTierra = unidadTierra;
    }

    public ArrayList<PeriodoVisible> getPeriodos() {
        return Periodos;
    }

    public void agregarPeriodo(PeriodoVisible p){
        Periodos.add(p);
    }
    public void eliminarPeriodo(PeriodoVisible p){
        Periodos.remove(p);
    }

    @Override
    public String toString() {
        return "cuerposCelestes{" +
                "Nombre='" + Nombre + '\'' +
                ", Composicion='" + Composicion + '\'' +
                ", DistanciaTierra=" + DistanciaTierra +
                ", UnidadTierra='" + UnidadTierra + '\'' +
                '}';
    }
}
