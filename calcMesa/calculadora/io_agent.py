import re

class InputOutputAgent:
    def __init__(self, model):
        self.model = model

    def evaluate_expression(self, expression):
        tokens = re.findall(r'\d+\.?\d*|\+|\-|\*|\/|\^', expression)
        output_queue = []
        operator_stack = []

        precedence = {'^': 3, '*': 2, '/': 2, '+': 1, '-': 1}

        def apply_operator(op, a, b):
            if op == '+':
                return self.model.sum_agent.calculate(a, b)
            elif op == '-':
                return self.model.subtract_agent.calculate(a, b)
            elif op == '*':
                return self.model.multiply_agent.calculate(a, b)
            elif op == '/':
                return self.model.divide_agent.calculate(a, b)
            elif op == '^':
                return self.model.power_agent.calculate(a, b)

        def precedence_level(op):
            return precedence.get(op, 0)

        for token in tokens:
            if re.match(r'\d+\.?\d*', token):
                output_queue.append(float(token))
            else:
                while (operator_stack and precedence_level(operator_stack[-1]) >= precedence_level(token)):
                    op = operator_stack.pop()
                    b = output_queue.pop()
                    a = output_queue.pop()
                    result = apply_operator(op, a, b)
                    output_queue.append(result)
                operator_stack.append(token)

        while operator_stack:
            op = operator_stack.pop()
            b = output_queue.pop()
            a = output_queue.pop()
            result = apply_operator(op, a, b)
            output_queue.append(result)

        return output_queue[0]
