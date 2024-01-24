/**
 * The Calculator class is used for performing mathematical calculations.
 */
class Calculator extends ExtendedCalculator{
    /**
     * The function "addition" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a floating-point number.
     * @param operand_2 The second operand in the addition operation.
     * @return the sum of the two operands.
     */
    float addition(float operand_1,float operand_2){
    return (operand_1+operand_2);
    }
    /**
     * The function "substraction" takes two float operands and returns their difference.
     * 
     * @param operand_1 The first operand for the subtraction operation.
     * @param operand_2 The second operand in the subtraction operation.
     * @return the result of subtracting operand_2 from operand_1.
     */
    float substraction(float operand_1,float operand_2){
    return (operand_1-operand_2);
    }
    /**
     * The function "multiplication" takes two float operands and returns their product.
     * 
     * @param operand_1 The first operand of the multiplication operation. It is a floating-point
     * number.
     * @param operand_2 The second operand in the multiplication operation.
     * @return the product of the two operands, which is the result of the multiplication.
     */
    float multiplication(float operand_1,float operand_2){
    return (operand_1*operand_2);
    }
    /**
     * The function division takes two float operands and returns their division result.
     * 
     * @param operand_1 The first operand of the division operation. It is a floating-point number.
     * @param operand_2 The second operand in the division operation.
     * @return the result of dividing operand_1 by operand_2.
     */
    float division(float operand_1,float operand_2){
    return (operand_1/operand_2);
    }
    /**
     * The function "square" takes a float number as input and returns the square of that number.
     * 
     * @param operand_1 A floating-point number that represents the operand to be squared.
     * @return The square of the operand_1 value.
     */
    // float square(float operand_1){
    // return(operand_1*operand_1);
    // }


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

        // float square_result=calc.square(operand_1);
        // System.out.println("result is : "+square_result);

        float square_result=calc.square(operand_1);
        System.out.println("Square of number is : "+square_result);

        float cube_result=calc.cube(operand_1);
        System.out.println("Cube of number is : "+cube_result);

        float modulo_result=calc.modulo(operand_1,operand_2);
        System.out.println("Modulo is : "+modulo_result);




    }
}
