package com.utn;

import static java.lang.Thread.sleep;

public class BeerConsumer implements Runnable {

    private  BeerHouse Bhouse = null;
    private  int cantidad = 0;


    public BeerConsumer(BeerHouse Bhouse, int cantidad)
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
            if(Bhouse.disminuye())
            {
                System.out.println("consumio 1 cerveza");
                i++;
            }
            else
            {
                try
                {
                    System.out.println("Se han consumido todas las cervezas");
                    sleep(50);
                }
                catch (Exception e)
                {
                    System.out.println("Error "+e);
                }

            }
            Bhouse.imprimir();
        }

    }

}
