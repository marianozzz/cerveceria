package com.utn;

import java.util.ArrayList;

public class BeerHouse
{
    private ArrayList<Integer> cantidad = null;


    public BeerHouse(int size)
    {
        this.cantidad = new ArrayList<Integer>(size);
    }


    synchronized public boolean aumentar(int valor)
    {
        this.cantidad.add(valor);
        return true;
    }

    synchronized  public boolean disminuye()
    {
        //Evaluamos que hayan items antes de eliminar */
        if(this.cantidad.size()>0)
        {
            //si se cumple la condicion eliminamos un elemento de la lista y devolvemos True
            this.cantidad.remove(this.cantidad.size()-1);
            return true;
        }
        //si no se cumple devolvemos false
        return false;
    }

    public void imprimir()
    {
        for(int i=0; i < cantidad.size(); i++)
        {
           // System.out.println(cantidad.get(i));
        }
    }
}
