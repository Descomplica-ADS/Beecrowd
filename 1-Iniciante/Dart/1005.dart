import 'dart:io';

void main(){
  double n1, n2;
  double media;
    n1 = double.parse(stdin. readLineSync());
    n2 = double.parse(stdin.readLineSync());
    media = (((n1*3.5)+(n2*7.5))/11);
    print("MEDIA = ${(media).toStringAsFixed(5)}");
}