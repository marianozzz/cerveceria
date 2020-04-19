package com.utn;

public class BeerProducer implements  Runnable
{
    private  BeerHouse Bhouse = null;
    private  int cantidad = 0;


    public BeerProducer(BeerHouse Bhouse, int cantidad)
    {
        this.Bhouse = Bhouse;
        this.cantidad = cantidad;
    }
    @Override
    public void run()
    {
        int i = 0;

        while (i < this.cantidad)
        {
            Bhouse.aumentar(1);
            System.out.println("Producio 1");
            i++;

           // Bhouse.imprimir();
        }
    }
}
