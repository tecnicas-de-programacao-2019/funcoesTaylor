package SBWC;
import java.util.ArrayList;

class Lambert {

    private Util util;
    public double wo(double x){
        double breakPoint = Math.pow(10, -12);
        double result;
        int n=0;
    ArrayList<Double> lista = new ArrayList<Double>();
    do{
        result = ((Math.pow((-n), n-1))/util.fatorial(n) * Math.pow(x,n));
        n++;
        lista.add(result);
    }while(Math.abs(result)>breakPoint);

    return util.somatorio(0, n, lista);
    }
}
