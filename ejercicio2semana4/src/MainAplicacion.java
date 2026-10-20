public class MainAplicacion {
    public static void main(String[] args) {
        Aplicacion app = new Aplicacion("SistemaVentas", "1.0");

        System.out.println("Aplicación creada: " + app.getNombre() + " (ID: " + app.getId() + ")");
        System.out.println("¿Está ejecutando?: " + app.isEjecutando());

        app.iniciar();
        System.out.println("Después de iniciar, ¿está ejecutando?: " + app.isEjecutando());

        System.out.println("Total de aplicaciones: " + Aplicacion.getTotalAplicaciones());
    }
}