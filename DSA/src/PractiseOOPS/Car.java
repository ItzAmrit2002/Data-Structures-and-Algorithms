package PractiseOOPS;

 class Car {
    String brand;
    String variant;
    String color;

//    static int a = 5;

    Car(String brandName, String variantName, String colorName){
        brand = brandName;
        variant = variantName;
        color = colorName;
    }
    public void print()
    {
        System.out.print(brand+ " ");
        System.out.print(variant+" ");
        System.out.print(color+" ");
        System.out.println();
    }


}
