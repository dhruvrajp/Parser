package com.SER502.compiler;

import java.util.HashMap;

import org.antlr.v4.runtime.InputMismatchException;

import com.SER502.parser.HelloBaseVisitor;
import com.SER502.parser.HelloParser;
import com.SER502.parser.HelloParser.AddLabelContext;
import com.SER502.parser.HelloParser.AndORNotLabelContext;
import com.SER502.parser.HelloParser.AssignmentLabelContext;
import com.SER502.parser.HelloParser.BlockContext;
import com.SER502.parser.HelloParser.BlockLabelContext;
import com.SER502.parser.HelloParser.BreakStatementContext;
import com.SER502.parser.HelloParser.DivLabelContext;
import com.SER502.parser.HelloParser.GTLTEQLabelContext;
import com.SER502.parser.HelloParser.IFStatementLabel1Context;
import com.SER502.parser.HelloParser.IntegerLabelContext;
import com.SER502.parser.HelloParser.ParameterLabelContext;

public class MyVisitor extends HelloBaseVisitor<Integer> {

	@Override
	public Integer visitParameterLabel(ParameterLabelContext ctx) {
		visitChildren(ctx);
		return null;
	}

	HashMap<String,Integer> memory=new HashMap<String,Integer>();

	@Override
	public Integer visitBlockLabel(BlockLabelContext ctx) {
		System.out.println(ctx.getText());
		return super.visitBlockLabel(ctx);
	}


	@Override
	public Integer visitIFStatementLabel1(IFStatementLabel1Context ctx) {
		int ret=0;
		if(visit(ctx.express1)==1){
				System.out.println("If cond true");
				ret=visit(ctx.stat1);
		}else{
			if(ctx.stat2!=null){
				System.out.println("If cond false");
				ret=visit(ctx.stat2);
				}
		}
		return ret;
	}


	@Override
	public Integer visitAssignmentLabel(AssignmentLabelContext ctx) {
		String name=ctx.IDENT().getText();
		int value=visit(ctx.expression());
		System.out.println("val"+value);
		memory.put(name, value);
		return value;
	}

	@Override
	public Integer visitAndORNotLabel(AndORNotLabelContext ctx) {
		int left=visit(ctx.leftexpr);
		int right=visit(ctx.rightexpr);
		switch(ctx.op.getType()){
		case HelloParser.AND:
		if(left==1&&right==1){
				System.out.println("AND True");
				return 1;
			}else
				return 0;
		case HelloParser.OR:
			if(left==1||right==1){
				System.out.println("OR True");
				return 1;
			}else
				return 0;
		case HelloParser.NOT:
			if(left!=right){
				System.out.println("NOT True");
				return 1;
			}else
				return 0;
			
		}
		return 0;
		
	}

	@Override
	public Integer visitDivLabel(DivLabelContext ctx) {
		try{
		int leftOper=visit(ctx.leftexpr);
		int rightOper=visit(ctx.expression(1));
			System.out.println(leftOper*rightOper);
			return leftOper/rightOper;
		}catch(InputMismatchException |java.util.InputMismatchException | NumberFormatException nm){
			System.out.println("Please enter only Integer type");
			return null;
		}
	}
	
	@Override
	public Integer visitAddLabel(AddLabelContext ctx) {
		try{
		int leftOper=visit(ctx.expression(0));
		int rightOper=visit(ctx.expression(1));
			return leftOper+rightOper;
		}catch(InputMismatchException |java.util.InputMismatchException | NumberFormatException nm){
			System.out.println("Please enter only Integer type");
			return null;
		}
	}
	
	
	@Override
	public Integer visitGTLTEQLabel(GTLTEQLabelContext ctx) {
		int left=visit(ctx.leftexpr);
		int right=visit(ctx.rightexpr);
		switch(ctx.op.getType()){
		case HelloParser.GT:
			if(left>right)
				return 1;
			else
				return 0;
		case HelloParser.LT:
			if(left<right)
				return 1;
			else
				return 0;
		case HelloParser.EQ:
			if(left==right)
				return 1;
			else
				return 0;
		}
		return 0;
	}

	@Override
	public Integer visitIntegerLabel(IntegerLabelContext ctx) {
		return Integer.valueOf(ctx.INTEGER().getText());
	}
	

	
	
	

	
	

	
	
	
	
} 
