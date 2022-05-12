import 'dart:io';

void main(){
  int prod1, qtdprod1, prod2, qtdprod2;
  double valorprod1, valorprod2; 

  prod1 = int.parse(stdin.readLineSync());
  qtdprod1 = int.parse(stdin.readLineSync());
  valorprod1 = double.parse(stdin.readLineSync());

  prod2 = int.parse(stdin.readLineSync());
  qtdprod2 = int.parse(stdin.readLineSync());
  valorprod2 = double.parse(stdin.readLineSync());

  var totalApagar = ((prod1*valorprod1) + (prod2*valorprod2)).toStringAsFixed(2);

  print('VALOR A PAGAR: R\$ $totalApagar');

}