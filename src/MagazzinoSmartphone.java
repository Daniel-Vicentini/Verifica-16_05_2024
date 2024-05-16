public class MagazzinoSmartphone {
    private Smartphone[] smartphones;
    private int count;

    public MagazzinoSmartphone() {
        smartphones = new Smartphone[10]; // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        this.count=other.count;
        smartphones = new Smartphone[10];
        for(int pos=0; pos<smartphones.length;pos++){
            if(other.smartphones[pos]!=null){
                smartphones[pos]= other.smartphones[pos];
            }
        }



    }
    public Smartphone getSmartphone(int posizione){
        
        if(posizione<0||posizione>smartphones.length){
           return null;
        }else{
            if(smartphones[posizione]==null){
                return null;
            }else{
            
                return smartphones[posizione];
            }
        }
    }


    public void addSmartphone(Smartphone smartphone) {
        for(int pos=0; pos<smartphones.length;pos++){
            if(smartphone==null){
                if(smartphones[pos]!=null){
                }else{
                    smartphones[pos]=smartphone;
                
            }}
        }

        
    }

    public void removeSmartphone(Smartphone smartphone) {
        for(int pos=0; pos<smartphones.length;pos++){
            if(smartphone==null){
            }else{
                if(smartphones[pos]==null){
                }else{
                  smartphones[pos]=null;
                }
            }
        }

    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }


     public Smartphone getSmartphoneByBrand(String brand) {
        boolean uguali=false;
        int pos=0;
        if(brand==null){

        }else{
        while(pos<smartphones.length||uguali==false){
            if(brand.equals(smartphones[pos].getBrand())){
                uguali=true;
            }pos++;
        }}
        
        Smartphone smartphone = null;
        
        return smartphone;
        


         
     }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        boolean uguali=false;
        int pos=0;
        if(storageCapacity<=0){
            return null;
        }else{
        while(pos<smartphones.length||uguali==false){
            if(storageCapacity==smartphones[pos].getStorageCapacity()){
                uguali=true;
                magazzinoSmartphone.smartphones[pos]=smartphones[pos];
            }}
        }
        if(uguali==false){
            return null;
        }else{
            return magazzinoSmartphone;
        }



        
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        for(int pos=0; pos<smartphones.length;pos++){
            if(minPrice>maxPrice){
                return null;
            }
            if(smartphones[pos].getPrice()>=minPrice&&smartphones[pos].getPrice()<=maxPrice){
               magazzinoSmartphone.smartphones[pos]=smartphones[pos];
            }
        }

        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";
        for(int i=0; i<smartphones.length;i++)   {
            result+=smartphones[i].toString();
        } 
        
        return result;
    }

    public int getCount() {
        return count;
    }

    // public boolean equals(Object obj) {
    //     if(obj==null){
    //         return false;
    //     }else{
    //         if(obj instanceof Smartphone){
    //             for(int i=0; i<smartphones.length;i++){
    //                 smartphones[i].equals(obj.smartphones[i]){

    //                 }
    //             }
    //                 return true;
    //             }else{return false;}
        
       

    //     return true;
    // }

    }
