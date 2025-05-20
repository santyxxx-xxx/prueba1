import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de postulantes: ");
        int n = sc.nextInt();
        sc.nextLine();

        Postulante[] ps = new Postulante[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPostulante " + (i + 1));
            System.out.print("Ingresa 2 (nombre y apellido), 3 (nombre, apellido, carrera) o 9 (todos los datos): ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 2) {
                System.out.print("Nombre: ");
                String nom = sc.nextLine();
                System.out.print("Apellido: ");
                String ape = sc.nextLine();
                ps[i] = new Postulante(nom, ape);

            } else if (op == 3) {
                System.out.print("Nombre: ");
                String nom = sc.nextLine();
                System.out.print("Apellido: ");
                String ape = sc.nextLine();
                System.out.print("Carrera: ");
                String car = sc.nextLine();
                Postulante p = new Postulante(nom, ape, car);

                System.out.print("Edad: ");
                p.setEdad(sc.nextInt());
                System.out.print("Promedio: ");
                p.setPromedio(sc.nextDouble());
                sc.nextLine();
                System.out.print("Condición socioeconómica: ");
                p.setCondicionSocioeconomica(sc.nextLine());
                System.out.print("Nacionalidad: ");
                p.setNacionalidad(sc.nextLine());

                ps[i] = p;

            } else if (op == 9) {
                System.out.print("Nombre: ");
                String nom = sc.nextLine();
                System.out.print("Apellido: ");
                String ape = sc.nextLine();
                System.out.print("Edad: ");
                int ed = sc.nextInt();
                sc.nextLine();
                System.out.print("Teléfono: ");
                String tel = sc.nextLine();
                System.out.print("Correo: ");
                String cor = sc.nextLine();
                System.out.print("Nacionalidad: ");
                String nac = sc.nextLine();
                System.out.print("Condición socioeconómica: ");
                String cs = sc.nextLine();
                System.out.print("Carrera: ");
                String car = sc.nextLine();
                System.out.print("Promedio: ");
                double pr = sc.nextDouble();
                sc.nextLine();

                ps[i] = new Postulante(nom, ape, ed, tel, cor, nac, cs, car, pr);
            }
        }

        System.out.println("\n----- RESULTADOS -----\n");
        for (Postulante p : ps) {
            p.mostrarDatos();
            System.out.println();
        }

        sc.close();
    }
}
