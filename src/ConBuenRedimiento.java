public class ConBuenRedimiento implements IEmpleado{
    IEmpleado empleado;
    ConBuenRedimiento(IEmpleado empleado){
        this.empleado =empleado;
    }

    @Override
    public double calcularSueldoTotal(int diasAusente) {
        return  calcularSueldoNeto()
                + calcularBonoPorPresentismo(diasAusente)
                + calcularBonoPorResultado();
    }

    @Override
    public double calcularSueldoNeto() {
        return empleado.calcularSueldoNeto();
    }

    @Override
    public double calcularBonoPorPresentismo(int diasAusente) {
        return empleado.calcularBonoPorPresentismo(diasAusente);
    }

    @Override
    public double calcularBonoPorResultado() {
        return 0.1 * empleado.calcularSueldoNeto();
    }
}
