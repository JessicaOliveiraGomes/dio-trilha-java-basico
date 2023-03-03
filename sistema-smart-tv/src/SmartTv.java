
public class SmartTv {
    boolean ligada = false;
    int canal = 10;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("A TV está ligando seu status agora é: " + ligada);
    }

    public void desligar() {
        ligada = false;
        System.out.println("A TV está desligando seu status agora é: " + ligada);
    }
    
    public void aumentarVolume() {
        if (ligada == true) {
            volume++;
            System.out.println("A TV está aumentando de volume para: " + volume);
        } else {
            System.out.println("Erro: A TV não pode aumentar volume desligada. Por favor ligar a TV");
        }
    }

    public void diminuirVolume() {
        if (ligada == true) {
            volume--;
            System.out.println("A TV está diminuindo de volume para: " + volume);
        } else {
            System.out.println("Erro: A TV não pode diminuir volume desligada. Por favor ligar a TV");
        }
    }

    public void aumentarCanal() {
        if (ligada == true) {
            canal++;
            System.out.println("A TV está aumentando de canal para: " + canal);
        } else {
            System.out.println("Erro: A TV não pode aumentar canal desligada. Por favor ligar a TV");
        }
    }


    public void diminuirCanal() {
        if (ligada == true) {
            canal--;
            System.out.println("A TV está diminuindo de canal para: " + canal);
        } else {
            System.out.println("Erro: A TV não pode diminuir canal desligada. Por favor ligar a TV");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada == true) {
            canal = novoCanal;
            System.out.println("A TV mudou de canal para: " + canal);
        } else {
            System.out.println("Erro: A TV não pode mudar de canal desligada. Por favor ligar a TV");
        }

    }

}
