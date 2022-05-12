import 'dart:io';
void main(){
  int number, horas;
  double valorHora, salario;
    number = int.parse(stdin.readLineSync());
    horas = int.parse(stdin.readLineSync());
    valorHora = double.parse(stdin.readLineSync());
    
    salario = horas*valorHora;
    print("NUMBER = $number \nSALARY = U\$ ${(salario).toStringAsFixed(2)}");   
}