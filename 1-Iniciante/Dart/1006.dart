import 'dart:io';
void main(){
  double n1, n2, n3;
  double media;
    n1 = double.parse(stdin.readLineSync());
    n2 = double.parse(stdin.readLineSync());
    n3 = double.parse(stdin.readLineSync());
    media = (((n1*2)+(n2*3)+(n3*5))/10);
    print("MEDIA = ${(media).toStringAsFixed(1)}");
}