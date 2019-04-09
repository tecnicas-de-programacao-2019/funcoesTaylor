package SBWC;

public class App 
{
    public static void main( String[] args )
    {
        Trig trig = new Trig();
        explog exp = new explog();
        Lambert lamb = new Lambert();
            
        //60° em rad
        System.out.println( trig.cos(1.0472) ); //Resultado esperado = 0.5
        System.out.println( trig.sin(1.0472) ); //Resultado esperado =  0.86
        System.out.println( exp.ex(5) ); //Resultado esperado = 148.41
        System.out.println( exp.lnx(0.5) ); //Resultado esperado = 1.6
        System.out.println( lamb.wo(0.5/Math.E) ); //Resultado esperado ≅ 0,567143
	
    }
}
