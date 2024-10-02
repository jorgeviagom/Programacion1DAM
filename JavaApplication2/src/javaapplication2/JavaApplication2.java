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
*/

/*
Un economista te ha encargado un programa para realizar cálculos con el IVA. 
La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. 
Muestra en pantalla el importe correspondiente al IVA y el total
*/
/*Scanner sc = new Scanner(System.in);
//Solicitamos al usuario la base imponible
double baseImponible;
System.out.println("Introduce la base imponible: ");
baseImponible = sc.nextDouble();
//Solicitamos al usuario el porcentaje de IVA
double iva;
System.out.println("Introduce el IVA: ");
iva = sc.nextDouble();
//Sumamos ambos importes para que nos de el importe total del producto
double importeTotal;
importeTotal = baseImponible * (iva/100) + baseImponible;
//Le decimos al usuario el importe total del producto
System.out.println("El importe total es: " + importeTotal);
*/
     
        
//ACTIVIDAD 1.11

/*final double PRECIO_PERA, PRECIO_MANZANA;
PRECIO_PERA = 1.95;
PRECIO_MANZANA = 2.35;
double beneficioAnual, beneficioAnualM, beneficioAnualP, kilosManzana1, kilosManzana2, kilosPeras1, kilosPeras2;
Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca kilos manzanas primer semestre: ");
        kilosManzana1 = sc.nextDouble();
        System.out.println("Introduzca kilos peras primer semestre: ");
        kilosPeras1 = sc.nextDouble();
        System.out.println("Introduzca kilos manzanas segundo trimestre: ");
        kilosManzana2 = sc.nextDouble();
        System.out.println("Introduzca kilos peras segundo trimestre: ");
        kilosPeras2 = sc.nextDouble();
        
        
        beneficioAnualM = (kilosManzana1 + kilosManzana2) * PRECIO_MANZANA;
        System.out.println("El beneficio anual de las manzanas es: " + beneficioAnualM);
        
        beneficioAnualP = (kilosPeras1 + kilosPeras2) * PRECIO_PERA;
        System.out.println("El beneficio anual de las peras es: " + beneficioAnualP);
        
        beneficioAnual = beneficioAnualP + beneficioAnualM;
        System.out.println("El beneficio anual total es: " + beneficioAnual);
 */

//ACTIVIDAD 1.12.

/* int n, valorAbsoluto;
        System.out.println("Escribe un número (positivo o negativo): ");
        Scanner sc = sc.nextInt();
        valorAbsoluto = n>0 ? n : -1*n;
        System.out.println("El valor absoluto de " + n + " es " valorAbsoluto);
*/        

//ACTIVIDAD 1.13.
// Scanner sc = new Scanner(System.in); MODO MÁS RAPIDO
// DESPUES DE CADA VARIABLE: variable = sc.nextInt();

/*int nota1, nota2, nota3;
int notaMedia1;
double notaMedia2;
Scanner sc = new Scanner(System.in);
        System.out.println("Nota primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.println("Nota segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.println("Nota tercer trimestre: ");
        nota3 = sc.nextInt();
notaMedia2 = (nota1 + nota2 + nota3) / 3.0; 
notaMedia1 = (int)notaMedia2;

        System.out.println("La nota media segun el expediente academico es: " + notaMedia2);
        System.out.println("La nota media es: " + notaMedia1);
 */

//ACTIVIDAD RESUELTA 1.14.

/*double n;
int redondeo;
Scanner sc = new Scanner(System.in);
sc.useLocale(Locale.US);
        System.out.println("Introduce un numero decimal (con punto): ");
        n = sc.nextDouble();
        redondeo = (int) (n + 0.5);
        System.out.println(n + " redondeado es " + redondeo);
*/        


/*//ACTIVIDAD RESUELTA 2.1.
//LE PEDIMOS AL USUARIO QUE INTRODUZCA UN NUMERO ENTERO PARA SABER SI ES PAR O IMPAR
Scanner sc = new Scanner(System.in);
int numero;
        System.out.println("Introduzca un número ");
        numero = sc.nextInt();
        if (numero %2 == 0) {
            System.out.println("El numero es par");
        }
        else {
        System.out.println("El numero es impar");
        };        
 */

/*//ACTIVIDAD RESUELTA 2.5.
Scanner sc = new Scanner(System.in);
//introducimos variables
int n1, n2;
int mayor, menor;
//pedimos al usuario que introduzca dos numeros
        System.out.println("Introduzca un numero: ");
        n1 = sc.nextInt();
        System.out.println("Introduzca otro numero: ");
        n2 = sc.nextInt();
        mayor = n1>n2 ? n1 : n2; // si n1 es el mayor, entonces mayor=n1, si no = n2
        menor = n1<n2 ? n1 : n2; //si n1 es menor que n2, entonces menor=n1, si no =n1
//ordenamos los numeros de forma decreciente
        System.out.println(mayor + ", " + menor);
*/

//ACTIVIDAD RESUELTA 2.7.
Scanner sc = new Scanner(System.in);
int a, b, c; //numeros a ordenar 
        System.out.println("Introduzca primer numero: ");
        a = sc.nextInt();
        System.out.println("Introduzca segundo numero: ");
        b = sc.nextInt();
        System.out.println("Introduzca tercer numero: ");
        c = sc.nextInt();
        if (a > b && b >c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a > c && c > b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b > a && c > a) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b > c && c > a) { 
            System.out.println(b + ", " + c + ", " + a);
        } else if (c > a && a > b) {
            System.out.println(c + ", " + a + ", " + b);
        } else if (c > b && b > a) {
            System.out.println(c + ", " + b + ", " + a);
        }
    }

}
delete this file
    commit
