import java.util.ArrayList;
import java.util.Scanner;

public class tallerf {
    private int id;
    private String nombre;
    private String correo;
    public tallerf(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }
     public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public static ArrayList<tallerf> cargarDatos(int n) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<tallerf> aprendices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese datos para el aprendiz #" + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Correo: ");
            String correo = scanner.nextLine();

            tallerf aprendiz = new tallerf(id, nombre, correo);
            aprendices.add(aprendiz);
        }

        return aprendices;
    }

    public static void consultarAprendiz(ArrayList<tallerf> aprendices, int id) {
        for (tallerf aprendiz : aprendices) {
            if (aprendiz.getId() == id) {
                System.out.println("Datos del aprendiz:");
                System.out.println("ID: " + aprendiz.getId());
                System.out.println("Nombre: " + aprendiz.getNombre());
                System.out.println("Correo: " + aprendiz.getCorreo());
                return;
            }
        }

        System.out.println("No se encontró un aprendiz con el ID proporcionado.");
    }

    public void actualizarDatos(int nuevoId, String nuevoNombre) {
        setId(nuevoId);
        setNombre(nuevoNombre);
    }

    public static void imprimirListado(ArrayList<tallerf> aprendices) {
        System.out.println("Listado de aprendices:");
        for (tallerf aprendiz : aprendices) {
            System.out.println("ID: " + aprendiz.getId());
            System.out.println("Nombre: " + aprendiz.getNombre());
            System.out.println("Correo: " + aprendiz.getCorreo());
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        ArrayList<tallerf> listaAprendices = cargarDatos(2);
        imprimirListado(listaAprendices);
    }
}