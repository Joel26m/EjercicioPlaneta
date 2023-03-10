package package_planeta;

public class Main {
    public static void main(String[] args) {
        Planeta[] planetas = new Planeta[5];
        planetas[0] = new Planeta(1, "Mercurio", "3,28·1023", 5.44, 4880.00, "57.910.000");
        planetas[1] = new Planeta(2, "Venus", "4,83·1024", 	5.24, 12104.00,  "108.200.000");
        planetas[2] = new Planeta(3, "Tierra", "5,98·1024", 5.52, 12756.00, "146.600.000");
        planetas[3] = new Planeta(4, "Marte", "6,40·1023", 3.95, 	 6794.00, "227.940.000");
        planetas[4] = new Planeta(5, "Jupiter", "1,90·1027", 1.33, 142984.00, "778.330.000");
        Planeta p1 = new Planeta(); //para usar setters y getters

        for (int i = 0; i < planetas.length; i++) {
            System.out.println((char)27+"[32m");
            System.out.println(planetas[i].toString());
            System.out.println("***********************************************************************************************************************************");
            System.out.println("hola");
        }

    }

}