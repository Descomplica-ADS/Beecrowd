import 'dart:io';

void main(){
  int x = int.parse(stdin.readLineSync());
  for(int i = 1; i <= x; i++){
    if(i % 2 != 0){
       print(i);
      
      }
  }
}