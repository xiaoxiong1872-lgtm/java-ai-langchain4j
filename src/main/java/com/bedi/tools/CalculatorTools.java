package com.bedi.tools;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.ToolMemoryId;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTools {
    @Tool(name = "sum",value = "计算两个数字的和")
    double sum(@ToolMemoryId int memoryId, @P(value = "a",required = true) double a, @P(value = "b",required = true) double b) {
        System.out.println("调用加法运算");
        return a + b;
    }
    @Tool
    double squareRoot(double x) {
        System.out.println("调用平方根运算");
        return Math.sqrt(x);
    }
}
