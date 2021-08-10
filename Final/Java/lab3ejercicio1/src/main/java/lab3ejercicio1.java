public class lab3ejercicio1 {
    public static void main(String [] args){
        System.out.println();
    }
    class Empleado {
        private String Nombre;
        private String Apellido;
        private Integer Cedula;
        private Double Sueldo;
        public Empleado(){
            Nombre=Apellido=" ";
            Cedula=0;
            Sueldo=0.0;
        }
        public Empleado(String Nombre,String Apellido,Integer Cedula,Double Sueldo){
            this.Nombre=Nombre;
            this.Apellido=Apellido;
            this.Cedula=Cedula;
            this.Sueldo=Sueldo;
        }
        public String getnombre(){
            return this.Nombre;
        }
        public String getapellido(){
            return this.Apellido;
        }
        public Integer getcedula(){
            return this.Cedula;
        }
        public Double getsueldo(){
            return this.Sueldo;
        }   
    }
    class Tecnico extends  Empleado  {
        private String Sector;
        public Tecnico(){
            super();
            this.Sector=" ";
        }
        public Tecnico(String Nombre,String Apellido,Integer Cedula,Double Sueldo,String Sector){
            super(Nombre,Apellido,Cedula,Sueldo);
            this.Sector=Sector;
        }
        public void establecerSector(String Sector){
            this.Sector=Sector;
        }
        public String getSector(){
            return this.Sector;
        }
        public void Mostrarsector(){
            System.out.println("El tecnico: "+this.getnombre()+" "+this.getapellido()+" Trabaja en el sector de "+this.getSector());
        }
    }
    class Gerente extends Empleado{
        private String Departamento;
        public Gerente(){
            super();
            Departamento=" ";
        }
        public Gerente(String Nombre,String Apellido,Integer Cedula,Double Sueldo,String Departamento){
            super(Nombre,Apellido,Cedula,Sueldo);
            this.Departamento=Departamento;
        }
        public void establecerDepa(String Departamento){
            this.Departamento=Departamento;
        }
        public String getDepa(){
            return this.Departamento;
        }
        public void ImprimirGerente(){
            System.out.println("El gerente "+this.getnombre()+" "+this.getapellido()+" Supervisa el departamento de "+this.getDepa());
        }
    }
    class Informatico extends Empleado{
        private String Lenguaje;
        public Informatico(){
            super();
            this.Lenguaje=" ";
        }
        public Informatico(String Nombre,String Apellido,Integer Cedula,Double Sueldo,String Lenguaje){
            super(Nombre,Apellido,Cedula,Sueldo);
            this.Lenguaje=Lenguaje;
        }
        public void establerLenguaje(String Lenguaje){
            this.Lenguaje=Lenguaje;
        }
        public String getLenguaje(){
            return this.Lenguaje;
        }
        public void ImprimirInformatico(){
            System.out.println("El infomatico "+this.getnombre()+" "+this.getapellido()+" Se centra en el siguiente lenguaje "+this.getLenguaje());
        }
    }
}
