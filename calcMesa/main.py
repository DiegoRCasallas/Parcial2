from calculadora.model import CalculatorModel

if __name__ == "__main__":
    calculator = CalculatorModel()

    while True:
        expression = input("Ingrese una expresión matemática (o 'exit' para salir): ")
        if expression.lower() == 'exit':
            break

        result = calculator.io_agent.evaluate_expression(expression)
        print(f"Resultado: {result}")
