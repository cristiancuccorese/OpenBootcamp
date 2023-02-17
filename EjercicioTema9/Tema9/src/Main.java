    public class Main {
        public static void main(String[] args) {
            Cliente cliente = new Cliente();

            cliente.setEdad(35);
            cliente.setNombre("Cristian");
            cliente.setTelefono("3447625058");
            cliente.setCredito(150000.10);

            System.out.println("Edad:"+ cliente.getEdad());
            System.out.println("Nombre:"+ cliente.getNombre());
            System.out.println("Telefono:"+ cliente.getTelefono());
            System.out.println("Linea de Credito:"+ cliente.getCredito());
            System.out.println("\n");


            Trabajador trabajador = new Trabajador();

            trabajador.setEdad(26);
            trabajador.setNombre("Juana");
            trabajador.setTelefono("3447511600");
            trabajador.setSalario(30000);

            System.out.println("Edad:"+ trabajador.getEdad());
            System.out.println("Nombre:"+ trabajador.getNombre());
            System.out.println("Telefono:"+ trabajador.getTelefono());
            System.out.println("Salario:"+ trabajador.getSalario());

        }
    }
    class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad(){
            return edad;
        }
        public void setEdad(int edad){
            this.edad= edad;
        }
        public String getNombre(){
            return nombre ;
        }
        public void setNombre(String nombre){
            this.nombre= nombre;
        }
        public String getTelefono(){
            return telefono;
        }
        public void setTelefono(String telefono){
            this.telefono= telefono;
        }
    }
    class Cliente extends Persona{
        private double credito;
        public double getCredito(){
            return credito;
        }
        public void setCredito(double credito){
            this.credito = credito;
        }
    }
    class Trabajador extends Persona{
        private double salario;
        public double getSalario(){ return salario; }
        public void setSalario(double salario){this.salario = salario;}
    }