import unittest
from calculator.agents import SumAgent, SubtractAgent, MultiplyAgent, DivideAgent, PowerAgent
from mesa import Model

class TestAgents(unittest.TestCase):
    def setUp(self):
        self.model = Model()
        self.sum_agent = SumAgent(1, self.model)
        self.sub_agent = SubtractAgent(2, self.model)
        self.mul_agent = MultiplyAgent(3, self.model)
        self.div_agent = DivideAgent(4, self.model)
        self.pow_agent = PowerAgent(5, self.model)

    def test_sum(self):
        self.assertEqual(self.sum_agent.calculate(2, 3), 5)

    def test_subtract(self):
        self.assertEqual(self.sub_agent.calculate(5, 3), 2)

    def test_multiply(self):
        self.assertEqual(self.mul_agent.calculate(2, 3), 6)

    def test_divide(self):
        self.assertEqual(self.div_agent.calculate(6, 3), 2)

    def test_power(self):
        self.assertEqual(self.pow_agent.calculate(2, 3), 8)

if __name__ == '__main__':
    unittest.main()
