package mintic;

/**
 *
 * @author elkin
 */
public class laClaseMuestra implements InterfGuia {

    public static void main(String[] args) {
        //como usar interfaz
        //eta solo funciona con la implementacion
        //*****************************************
        InterfGuia nombreInterf = new laClaseMuestra();
        int numero = nombreInterf.sumar(2, 3);
        System.out.println(numero);

        //*****************************************
        //clase anoninima
        //esta funciona sin implentar en la cabecera porque 
        //se implementa con la instancia
        InterfGuia nombreInterf1 = new InterfGuia() {
            @Override
            public int sumar(int a, int b) {
                return a + b;
            }
        };
        int numero2 = nombreInterf1.sumar(2, 7);
        System.out.println(numero2);
        //*****************************************
        //clase anonima 2
        int numero3 = (new InterfGuia() {
            @Override
            public int sumar(int a, int b) {
                return a + b;
            }
        }).sumar(8, 9);
         System.out.println(numero3);
         
          //*****************************************
        //uso del almbda
        InterfGuia ejemplo=(a, b) -> a+b;
        int numero4=ejemplo.sumar(5, 0);
        System.out.println(numero4);
    }

    @Override
    public int sumar(int a, int b
    ) {
        return a + b;
    }
}
