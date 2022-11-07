public class Main {
    public static void main(String[] args){
        System.out.println("sueldo de pepe");
        IEmpleado pepe = new ConBuenRedimiento(new Cadete());
        System.out.println(String. format(
                "El sueldo total del empleado es %f",
                pepe.calcularSueldoTotal(0)
        ));
    }
}
