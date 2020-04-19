package com.utn;

public class Main {

    public static void main(String[] args) {

        BeerHouse  AreaComun = new BeerHouse(100);
        BeerConsumer Consumidor1 = new BeerConsumer( AreaComun,100);
        BeerProducer Productor = new BeerProducer(AreaComun,100);

        Thread HiloProductor = new Thread(Productor);
        Thread HiloConsumidor = new Thread(Consumidor1);

        HiloProductor.start();
        HiloConsumidor.start();

    }
}
