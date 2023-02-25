package com.study.appprofessionalwithciandcd.domain

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ExpressionEvaluatorTest {
    private lateinit var evaluator: ExpressionEvaluator

    @Test
    fun `Simple expression properly evaluated`(){
        evaluator = ExpressionEvaluator(
            listOf(
                ExpressionPart.Number(4.0),
                ExpressionPart.OperationSymbol(Operation.ADD),
                ExpressionPart.Number(5.0),
                ExpressionPart.OperationSymbol(Operation.SUBTRACT),
                ExpressionPart.Number(3.0),
                ExpressionPart.OperationSymbol(Operation.MULTIPLY),
                ExpressionPart.Number(5.0),
                ExpressionPart.OperationSymbol(Operation.DIVIDE),
                ExpressionPart.Number(3.0),
            )
        )
        assertThat(evaluator.evaluate()).isEqualTo(4)
    }

    @Test
    fun `Expression with decimals properly evaluated`() {
        evaluator = ExpressionEvaluator(
            listOf(
                ExpressionPart.Number(4.5),
                ExpressionPart.OperationSymbol(Operation.ADD),
                ExpressionPart.Number(5.5),
                ExpressionPart.OperationSymbol(Operation.SUBTRACT),
                ExpressionPart.Number(3.5),
                ExpressionPart.OperationSymbol(Operation.MULTIPLY),
                ExpressionPart.Number(5.5),
                ExpressionPart.OperationSymbol(Operation.DIVIDE),
                ExpressionPart.Number(3.5),
            )
        )

        assertThat(evaluator.evaluate()).isEqualTo(4.5)
    }
}