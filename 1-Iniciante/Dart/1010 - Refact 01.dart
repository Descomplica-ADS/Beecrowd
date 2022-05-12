import 'dart:io';

void main(){
  int p1 = int.parse(stdin.readLineSync());
  int np1 = int.parse(stdin.readLineSync());
  double valorp1 = double.parse(stdin.readLineSync());

  int p2 = int.parse(stdin.readLineSync());
  int np2 = int.parse(stdin.readLineSync());
  double valorp2 = double.parse(stdin.readLineSync());

  var totalApagar = (np1 * valorp1) + (np2 * valorp2);

  print('VALOR A PAGAR: R\$ ${totalApagar.toStringAsFixed(2)}');
}