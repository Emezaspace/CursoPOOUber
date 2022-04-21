class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public  Car(String license, Accouny drive) {
        this.license = license;
        this.drive = driver;

    }

    void printDatacar(){
        System.out.println("License;" + license + "Driver:" + drive.name)
        
        
    }
    
}