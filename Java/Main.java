class Main {
    Run | Debug
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.license = "AMQ123"
        car.driver = "Andres Herrera"
        car.passegenger =   4;
        car.printDatacar(); 
        
        Car car2 = new Car("QWE567", new Account("Andres Herrera", "ANDA"));
        car2.license ="QWE567"
        car2.driver = "Andrea Herrera"
        car2.passegenger = 3
        car2.printDatacar();

    }
}