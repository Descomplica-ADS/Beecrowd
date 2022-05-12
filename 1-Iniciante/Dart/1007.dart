import 'dart:io';

void main(){
  int a, b, c, d;
  int diferenca;
    a = int.parse(stdin.readLineSync());
    b = int.parse(stdin.readLineSync());
    c = int.parse(stdin.readLineSync());
    d = int.parse(stdin.readLineSync());
    
    diferenca = ((a*b)-(c*d));
    print("DIFERENCA = $diferenca");
}