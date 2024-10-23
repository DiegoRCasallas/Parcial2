from mesa import Model
from mesa.time import RandomActivation
from .agents import SumAgent, SubtractAgent, MultiplyAgent, DivideAgent, PowerAgent
from .io_agent import InputOutputAgent

class CalculatorModel(Model):
    def __init__(self):
        self.schedule = RandomActivation(self)

        # Creación de agentes de operación
        self.sum_agent = SumAgent(1, self)
        self.schedule.add(self.sum_agent)

        self.subtract_agent = SubtractAgent(2, self)
        self.schedule.add(self.subtract_agent)

        self.multiply_agent = MultiplyAgent(3, self)
        self.schedule.add(self.multiply_agent)

        self.divide_agent = DivideAgent(4, self)
        self.schedule.add(self.divide_agent)

        self.power_agent = PowerAgent(5, self)
        self.schedule.add(self.power_agent)

        # Creación del agente de entrada/salida
        self.io_agent = InputOutputAgent(self)

    def step(self):
        self.schedule.step()
