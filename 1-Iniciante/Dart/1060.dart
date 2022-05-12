import 'dart:io';

void main(){
  int resultado = 0;
  for(int i =1; i<=6; i++){
    double num = double.parse(stdin.readLineSync());
      if(num > 0){
        resultado ++;
      }
  } print('$resultado valores positivos');
  
}