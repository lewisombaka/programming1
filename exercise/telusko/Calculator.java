package exercise.telusko;

class Calculator {
    int num1;
    int num2;
    int answer;

    Calculator(int Num1, int Num2){
        num1 = Num1;
        num2 = Num2;
        answer = num1 + num2;
        System.out.println(answer);
    }
}
