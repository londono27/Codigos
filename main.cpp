#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;

int main(){
	
	float diametro, radio, altura_junquillo, profundidadl;
	
	cout<<"-----Programa para calcular la profuncidad de un lago con JUNQUILLO-----"<< endl;
	cout<<""<<endl;
	cout<<"El programa calcula la profundidad de pendiendo de la altura de un junquillo que sobre sale del lago justo en el centro"<<endl;
	cout<<"Por favor ingresa el valor del diametro del lago en metros, debe ser un valor entre [1,10000]"<<endl;
	cin>> diametro;
	while (diametro>10000 || diametro<0){
		cout<<"El diametro introducido debe ser mayor que cero y menor a 10000, intenta de nuevo"<<endl;
		cin>>diametro;
	}
		radio=(diametro*100)/2;
	cout<<"Por favor ingresa el valor de la altura del junquillo del lago en centimetros, debe ser un valor entre [0,1000]"<<endl;
	cin>> altura_junquillo;
	while (altura_junquillo>1000) {
    	cout<<"La altura introducida debe ser menor a 1000 y mayor que cero, intenta de nuevo"<<endl;
    cin>> altura_junquillo;
	}
	profundidadl=(pow(radio,2)-pow(altura_junquillo,2))/(2*altura_junquillo);
	profundidadl=profundidadl/100;
	cout<<"la produndidad del lago es: "<< profundidadl<< " metros"<<endl;
	cout<<"el diametro es: "<<diametro<< " metros"<< " y la altura del junquillo es: "<< altura_junquillo<< " centimetros"<<endl;
	
	return 0;
}
