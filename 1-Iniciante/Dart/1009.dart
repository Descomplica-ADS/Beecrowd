import 'dart:io';

void main(){
  String nome;
  double salario, vendas; 

  nome = stdin.readLineSync();
  salario = double.parse(stdin.readLineSync());
  vendas = double.parse(stdin.readLineSync());
  
  var totalSal = ((vendas*0.15)+salario).toStringAsFixed(2);
  print('TOTAL = R\$ $totalSal');
}