class Calculator{
    float addition(float operand_1,float operand_2){
    return (operand_1+operand_2);
    }
    float substraction(float operand_1,float operand_2){
    return (operand_1-operand_2);
    }
    float multiplication(float operand_1,float operand_2){
    return (operand_1*operand_2);
    }
    float division(float operand_1,float operand_2){
    return (operand_1/operand_2);
    }
    float square(float operand_1){
    return(operand_1*operand_1);
    }

    public static void main(String[] args){
        Calculator calc=new Calculator();
        float operand_1=10;
        float operand_2=5;

        float add_result=calc.addition(operand_1, operand_2);
        System.out.println("result is : "+add_result);

        float sub_result=calc.substraction(operand_1, operand_2);
        System.out.println("result is : "+sub_result);

        float mult_result=calc.multiplication(operand_1, operand_2);
        System.out.println("result is : "+mult_result);

        float div_result=calc.division(operand_1, operand_2);
        System.out.println("result is : "+div_result);

        float square_result=calc.square(operand_1);
        System.out.println("result is : "+square_result);

    }
}
