public class Usuario {
    public static void main(String[] args) throws Exception {

       SmartTv smartTv = new SmartTv();

       System.out.println("------------------- STATUS INICIAL DA TV --------------------------------------");
       System.out.println("TV esta ligada? " + smartTv.ligada);
       System.out.println("Canal atual: " + smartTv.canal);
       System.out.println("Volume atual: " + smartTv.volume);
       System.out.println("-------------------------------------------------------------------------------");
       System.out.println("");


       System.out.println("");
       System.out.println("-----------MUDANÇAS NO STATUS DA TV--------------------------------------------");
       smartTv.ligar();
       smartTv.desligar();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();
       smartTv.aumentarCanal();
       smartTv.diminuirCanal();
       smartTv.mudarCanal(6);
       smartTv.ligar();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();
       smartTv.aumentarCanal();
       smartTv.diminuirCanal();
       smartTv.aumentarCanal();
       smartTv.aumentarCanal();
       smartTv.mudarCanal(6);
       System.out.println("-------------------------------------------------------------------------------");
       System.out.println("");
       

       System.out.println("");
       System.out.println("--------------- STATUS FINAL DA TV --------------------------------------------");
       System.out.println("TV esta ligada? " + smartTv.ligada);
       System.out.println("Canal atual: " + smartTv.canal);
       System.out.println("Volume atual: " + smartTv.volume);
       System.out.println("-------------------------------------------------------------------------------");
       
    }
}
