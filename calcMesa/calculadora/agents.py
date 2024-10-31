from mesa import Agent, Model
from mesa.time import RandomActivation
import operator
import re
import operator

class OperationAgent(Agent):
    def __init__(self, unique_id, model, operation):
        super().__init__(unique_id, model)
        self.operation = operation

    def calculate(self, operand1, operand2):
        return self.operation(operand1, operand2)

class SumAgent(OperationAgent):
    def __init__(self, unique_id, model):
        super().__init__(unique_id, model, operator.add)

class SubtractAgent(OperationAgent):
    def __init__(self, unique_id, model):
        super().__init__(unique_id, model, operator.sub)

class MultiplyAgent(OperationAgent):
    def __init__(self, unique_id, model):
        super().__init__(unique_id, model, operator.mul)

class DivideAgent(OperationAgent):
    def __init__(self, unique_id, model):
        super().__init__(unique_id, model, operator.truediv)

class PowerAgent(OperationAgent):
    def __init__(self, unique_id, model):
        super().__init__(unique_id, model, operator.pow)
