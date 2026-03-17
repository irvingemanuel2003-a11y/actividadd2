package Observatorio;

public class PeriodoVisible {
    private String Periodo;
    private UbicacionEspacial Ubicacion;

    public PeriodoVisible(String periodo, UbicacionEspacial ubicacion) {
        Periodo = periodo;
        Ubicacion = ubicacion;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    public UbicacionEspacial getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(UbicacionEspacial ubicacion) {
        Ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "periodoVisible{" +
                "periodo='" + Periodo + '\'' +
                ", ubicacion=" + Ubicacion +
                '}';
    }
}
