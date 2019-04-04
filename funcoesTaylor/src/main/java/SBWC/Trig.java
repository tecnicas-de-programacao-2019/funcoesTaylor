package SBWC;

import java.util.ArrayList;

public class Trig {

    private Util util;

    public double cos(double x){
        double breakPoint = Math.pow(10, -12);

        double result;
        int n = 0;
        ArrayList<Double> lista = new ArrayList<Double>();
        do{
            result = ((Math.pow(-1, n))/util.fatorial((2*n))) * Math.pow(x, (2 * n));
            n++;
            lista.add(result);
        }while(Math.abs(result) > breakPoint);

        return util.somatorio(0, n, lista);
    }

    public double sin(double x){
        double breakPoint = Math.pow(10, -12);

        double result;
        int n = 0;
        ArrayList<Double> lista = new ArrayList<Double>();
        do{
            result = ((Math.pow(-1, n))/util.fatorial((2*n)+1)) * Math.pow(x, ((2 * n)+1));
            n++;
            lista.add(result);
        }while(Math.abs(result) > breakPoint);

        return util.somatorio(0, n, lista);
    }
}