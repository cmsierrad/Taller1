package clases;

public class CapacidadEndedudamiento {
    private Integer ingresosTotales;
    private Integer gastosFijos;
    private Integer gastoVaribales;
    final double POR_FIJO = 0.35;


    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public Integer getGastosFijos() {
        return gastosFijos;
    }

    public Integer getGastoVaribales() {
        return gastoVaribales;
    }

    public double getPOR_FIJO() {
        return POR_FIJO;
    }

    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public void setGastoVaribales(Integer gastoVaribales) {
        this.gastoVaribales = gastoVaribales;
    }

    // Cálculo del Endeudamiento.
    public String getCapacidadEndeudamiento() {
        Double CapacidadEndedudamiento;
        CapacidadEndedudamiento = (ingresosTotales -  gastosFijos - gastoVaribales) * POR_FIJO;
        return CapacidadEndedudamiento.toString();
    }

}
