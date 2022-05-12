import 'dart:math';
import 'dart:io';

void main(){
  double pi = 3.14159;
  double R = double.parse(stdin.readLineSync());
  double A = (pi * pow(R,2));
  print("A=${ (A).toStringAsFixed(4) }");
}