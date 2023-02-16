public class TestTernaryOperator{
    public static void main(String[] Args){
        boolean isCar=false;
        if(isCar){
            System.out.println("Es un carro");
        }
        if(!isCar){
            System.out.println("No es un carro");
        }
        String car="Volkswagen";
        boolean isIndustrial= car=="Volkswagen" ? false : true;

        if (isIndustrial)
            {
            System.out.println("El auto es para trabajo industrial");
        
        }else{
            System.out.println("El auto es para uso domestico");
        }
    }
}