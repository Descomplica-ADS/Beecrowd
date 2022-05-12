import 'dart:io';

void main(){
  int number, horas;
  double valorHora;
    number = int.parse(stdin.readLineSync());
    horas = int.parse(stdin.readLineSync());
    valorHora = double.parse(stdin.readLineSync());
    var salario = (horas*valorHora).toStringAsFixed(2);
    
    print("NUMBER = $number");
    print("SALARY = U\$ $salario");    
}