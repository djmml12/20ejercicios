Algoritmo DatosPais
	Escribir "Introduzca País"
	Leer País;
	Escribir "introduzca Capital del País"
	Leer Capital del País;
	Si Capitalcorrecta; Entonces
		Escribir "Es la Capital de Pais" Capital
	SiNo
		Escribir "No es la Capital de País"
	Fin Si
FinAlgoritmo


Algoritmo 2
	Escribir "Introduzca País"
	Leer País;
	Escribir "introduzca Capital del País"
	Leer Capital del País;
	Si Capitalcorrecta; Entonces
		Escribir "Es la Capital de Pais" Capital
	SiNo
		Escribir "No es la Capital de País"
	Fin Si
FinAlgoritmo


Algoritmo 3
	Escribir "introduzca n"
	Leer n
	n2 = n*2
	n3 = n*3
	Escribir "El doble es" n2
	Escribir "El triple es" n3
FinAlgoritmo


Algoritmo 4
	Escribir "ingresar Número";
	Leer n;
	cuadrado = n * n
	cubo = n * n * n
	Escribir "el cuadrado es" cuadrado
	Escribir "el cubo es" cubo
FinAlgoritmo


Algoritmo 5
	Escribir "ingresar número"
	Leer n
	nsiguiente = n+1
	Escribir "El número siguiente es" n+1
FinAlgoritmo

Algoritmo 6
	al = aleatorio(0 - 200)
	Escribir "Número Aleatorio ..." aleatorio(0.200)
	
FinAlgoritmo

Algoritmo 7
	Escribir "introduzca n1"
	Leer n1
	Escribir "introduzca n2"
	Leer n2
	Escribir "introduzca n3"
	Leer n3
	suma = n1 + n2 + n3
	prom = suma / 3
	Escribir "El promedio es" prom;
FinAlgoritmo

Algoritmo 8
	Escribir "introduzca n1"
	Leer n1
	Escribir "introduzca n2"
	Leer n2
	Escribir "introduzca n3"
	Leer n3
	suma = n1 + n2 + n3
	prom = suma / 3
	Escribir "El promedio es" prom;
FinAlgoritmo

Algoritmo 9
	Escribir "introduzca A"
	Leer A
	Escribir "itroduzca B"
	Leer B
	intercambio = A + B
	intercambio1 = A - B
	intercambio2 = A - B
	Escribir " intercambio " intercambio, intercambio1, intercambio2 
FinAlgoritmo

Algoritmo 10
	Escribir "base"
	Leer base
	Escribir "altura"
	leer altura
	area = base * altura
	perimetro = 2 * base + 2 * altura
	Escribir "Area es" area
	Escribir "Perimetro es" perimetro
FinAlgoritmo



Algoritmo 11
	Escribir "escribir valor en cm"
	Leer cm
	metro = cm / 100
	yarda = cm / 91
	pie = cm / 32
	pulgada = cm / 2.54
	Escribir "metro es" metro
	Escribir "yarda es" yarda
	Escribir "pie es" pie
	Escribir "pulgada es" pulgada
FinAlgoritmo


Algoritmo 12
	Escribir "temperatura en C"
	Leer C
	F = C * 1.8
	FF = F+32
	Escribir " Temperatura en Fº es " FF
FinAlgoritmo


Algoritmo 13
	p = PI
	Escribir "radio"
	Leer radio
	Si radio > 0  Entonces
		Escribir " ingresar altura "
		Leer altura
		Si altura > 0 Entonces
			V = p * radio ^ 2 * altura
			Escribir " el volumen es " V
		SiNo
			Escribir " no se puede calcular "
		Fin Si
	SiNo
		Escribir " no se puede calcular "

	Fin Si
FinAlgoritmo



Algoritmo 14
	Escribir " num1 "
	Leer num1
	Escribir " num2 "
	Leer num2
	r = num1 / num2
	Si r > 0  Entonces
		Escribir " num no divisible "
	SiNo
		Escribir " num es divisible "
	Fin Si
FinAlgoritmo


Algoritmo 15
	Escribir " num "
	Leer num
	Si num = 0 Entonces
		Escribir " numero neutro "
	SiNo
		Si num > 0 Entonces
			Escribir " numero positivo "
		SiNo
			Escribir "numero negativo "
		Fin Si
	Fin Si
FinAlgoritmo


Algoritmo 16
	Escribir "num1"
	Leer num1
	Escribir "num2"
	Leer num2
	Escribir "num3"
	Leer num3
	
	
	
	
	Si num1 > num2 Entonces
		
		
		
		Si num1 > num3 Entonces
			Escribir "numero 1 es el mayor"
		SiNo
			
			
			
			Si num3 > num2 Entonces
				Escribir "numero 3 es el mayor"
			SiNo
				Escribir " numero 3 es el mayor "
			Fin Si
			
			
			
			
			
		Fin Si
		
		
		
		
		
	SiNo
		
		
		
		Si num2 > num3 Entonces
			Escribir " numero 2 es el mayor "
			
		SiNo
			Escribir "numero 3 es el mayor"
		Fin Si
		
		
		
		
	Fin Si
	
	
	
	
	
FinAlgoritmo



