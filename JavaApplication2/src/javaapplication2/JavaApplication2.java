/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author jorge.viagom
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");

/*int edadUsuario;
        
edadUsuario = 31;
       
System.out.println("Tu edad es " + edadUsuario);
*/

/*LocalTime queHoraEs = LocalTime.now();
        System.out.println("Hola");
        System.out.println("La hora actual es " + queHoraEs);
*/


/*Scanner datoTeclado = new Scanner(System.in);
//datos por teclado 

double valor1;
double valor2;
double suma;
double resta;
double multiplicacion;
double division;

        System.out.println("Introduzca un valor:");
        valor1 = datoTeclado.nextDouble();
        System.out.println("Introduzca un valor:");
        valor2 = datoTeclado.nextDouble();
                //datos por teclado abajo datoTeclado.next?
                
suma = valor1 + valor2;
resta = valor1 - valor2;
multiplicacion = valor1 * valor2;
division = valor1 / valor2;

        System.out.println("La suma resultante es " + suma);
        System.out.println("La resta resultante es " + resta);
        System.out.println("La multiplicacion resultante es " + multiplicacion);
        ;
        System.out.println("La division resultante es " + division);*/
/*int a = 5;
int b;
int c;

b = a++;
//a = 5 (++ se incrementa en +1)
        System.out.println(a);
        System.out.println(b);
c = ++a;
//aqui a = 6 por la anterior, por lo tanto ahora a = 7 y c = 7
        System.out.println(a);
        System.out.println(c);
 */



//declaracion de variable
/*int edadUsuario;
//lee los datos del teclado
Scanner sc = new Scanner(System.in);
        //pedimos al usuario su edad
        System.out.println("Introduzca su edad: ");
        //recuperacion del dato y volcado en variable creada
           edadUsuario = sc.nextInt();  
        //incrementpo de la edad en 1
        ++edadUsuario;
        System.out.println("El proximo año cumples " + edadUsuario);
*/




/*
int añoActual;
int añoNacimiento;
int edadActual;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su año de nacimiento: ");
        añoNacimiento = sc.nextInt();
        System.out.println("Introduzca año actual: ");
        añoActual = sc.nextInt();
        edadActual = añoActual - añoNacimiento;
        System.out.println("Tu edad es " + edadActual);
*/



/*
short test;
test = 32767;
        System.out.println("Valor inicial: " + test);
        //incremento valor
        ++test;
        System.out.println("valor siguiente: " + test);
*/        




//ACTIVIDAD 1.6.
/*int notaPrimera;
int notaSegunda;
double notaMedia;

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca primera nota: ");
        notaPrimera = sc.nextInt();
        System.out.println("Introudzca segunda nota: ");
        notaSegunda = sc.nextInt();
        notaMedia = (notaPrimera + notaSegunda)/2;
        
        System.out.println("La nota media es " + notaMedia);
*/

//ACTIVIDAD 1.7
/*double radio, area, longitud;

Scanner sc = new Scanner(System.in);
sc.useLocale(Locale.US);
System.out.print("Introduce el radio: ");
radio = sc.nextDouble();
longitud = 2 * Math.PI * radio;
area = Math.PI * Math.pow(radio,2); //radio al cuadrado//
System.out.println("La longitud de la circunferencia es: " + longitud);
System.out.println("El area del circulo es: " + area + "m2");
*/



//ACTIVIDAD 1.8
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >=18;
        System.out.println("Mayoria de edad: " + mayorEdad);
 */      
        


//ACTIVIDAD 1.9.

/*
Scanner sc = new Scanner(System.in);
System.out.println("Escribe un número: ");
int numero = sc.nextInt();
boolean numeroPar = (numero%2) == 0;
System.out.println("Numero es par: " + numeroPar);
*/


        /*Scanner sc = new Scanner (System.in);                  
        System.out.println("Introduce tu edad : ");
        int edadM = sc.nextInt();
        boolean edad = (edadM >= 18);
        System.out.println("Eres mayor de edad: " + edad);
*/
        
        /*Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        boolean numPar = (num%2 ==0);
        System.out.println("Tu numero es Par: " + numPar);
*/

//ACTIVIDAD 1.10

/*boolean llueve, finTareas, biblio, puedeSalir;
Scanner sc = new Scanner (System.in);
        System.out.println("¿Llueve? (true/false)");
        llueve = sc.nextBoolean();
        System.out.println("¿Has finalizado las tareas? (true/false)");
        finTareas = sc.nextBoolean();
        System.out.println("¿Vas a la biblio? (true/false)");
        biblio = sc.nextBoolean();
        
        puedeSalir = (!llueve&&finTareas)||(biblio);
        
        System.out.println("¿Puede salir a la calle?: " + puedeSalir);
*/

    }
    
}
