/*package utilitarios;

public class login {
    public static void login() {
        String record = null;
        FileReader in = null;
        boolean existe = false; // para comprobar si cuenta y pass no coindicen con ninguna línea

        try {
            in = new FileReader("db.txt");
            BufferedReader br = new BufferedReader(in);
            Scanner scn = new Scanner(System.in);

            System.out.print("Cuenta: ");
            String cuenta = scn.nextLine();

            System.out.print("Password: ");
            String pass = scn.nextLine();

            while ((record = br.readLine()) !=null) {
                String [] word = record.split(" "); // dividir en palabras delimitadas por espacios
                if (word[0].equals(cuenta) && word[1].equals(pass)) {
                    System.out.println("Saldo de la cuenta " + cuenta + ": " + word[2]);
                    existe = true;
                }
            }

            if (!existe) {
                System.out.println("Usuario o contraseña incorrecto.");
            }
        } catch (IOException e) {
            e.getCause();
        }
    }
}*/
