public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;

    public Smartphone(){};

    public Smartphone(String brand, String model, int storageCapacity, double price) {
        this.brand=brand;
        this.model=model;
        this.storageCapacity=storageCapacity;
        this.price=price; 
    }

    public Smartphone(Smartphone other) {
        this.brand=new String(other.brand);
        this.model=new String(other.model);
        this.storageCapacity=other.storageCapacity;
        this.price=other.price;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String s="";
        s+= "Brand: "+brand+", "+"Model: "+model+", "+"Storage Capacity: "+storageCapacity+", "+"Price: "+price;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }else{
            if(obj instanceof Smartphone){
                if(this.brand.equals(brand)&&this.model.equals(model)&&this.storageCapacity==storageCapacity&&this.price==price){
                    return true;
                }else{return false;}
            }else{return false;}
        }
        
    }
    
}
