package com.SER502.compiler;

import java.io.*;
import java.io.InputStream;
import java.util.HashMap;

import com.SER502.parser.HelloBaseVisitor;
import com.SER502.parser.HelloParser;
import com.SER502.parser.HelloParser.AddLabelContext;
import com.SER502.parser.HelloParser.SubtLabelContext;
import com.SER502.parser.HelloParser.AndORNotLabelContext;
import com.SER502.parser.HelloParser.AssignmentLabelContext;
import com.SER502.parser.HelloParser.BlockLabelContext;
import com.SER502.parser.HelloParser.CallParamLabelContext;
import com.SER502.parser.HelloParser.DeclarationLabelContext;
import com.SER502.parser.HelloParser.DivLabelContext;
import com.SER502.parser.HelloParser.FunctCallLabelContext;
import com.SER502.parser.HelloParser.FunctDefLabelContext;
import com.SER502.parser.HelloParser.MultLabelContext;
import com.SER502.parser.HelloParser.ParameterLabelContext;
import com.SER502.parser.HelloParser.PassParametersContext;
import com.SER502.parser.HelloParser.ProgramLabelContext;
import com.SER502.parser.HelloParser.ReturnLabelContext;
import com.SER502.parser.HelloParser.GTLTEQLabelContext;
import com.SER502.parser.HelloParser.IFStatementLabel1Context;
import com.SER502.parser.HelloParser.IdentLabelContext;
import com.SER502.parser.HelloParser.IntegerLabelContext;
import com.SER502.parser.HelloParser.LoopStatLabelContext;

public class BackupVisitor2 extends HelloBaseVisitor<String>{
	
	int count=0;
	HashMap<String,Integer> variableTab=new HashMap<String,Integer>();

	@Override
	public String visitParameterLabel(ParameterLabelContext ctx) {
		System.out.println("FuncParam "+ctx.name.getText());;
		return null;
	}
	
	@Override
	public String visitIntegerLabel(IntegerLabelContext ctx) {
		System.out.println("load "+ctx.getText());
		count++;
		return String.valueOf(ctx.INTEGER().getText());
	}

	@Override
	public String visitAssignmentLabel(AssignmentLabelContext ctx) {
		String name=ctx.IDENT().getText();
		String value=null;
		if(variableTab.get(name)!=null){
		value=visit(ctx.expression());
		System.out.println("store "+name);
		count++;
		}else{
			try {
			    throw new Exception("Undefined Variable ");
			} catch (Exception e) {
				System.err.println("Variable "+name+" is not defined");
				 System.exit(100);
			}	
		}
		return null;
	}

	@Override
	public String visitAndORNotLabel(AndORNotLabelContext ctx) {
		visitChildren(ctx);
		switch(ctx.op.getType()){
		case HelloParser.AND:
			System.out.println("AND");
			count++;
			break;
		case HelloParser.OR:
			System.out.println("OR");
			count++;
			break;
		case HelloParser.NOT:
			System.out.println("NOT");
			count++;
		}
		return null;
		
	}
	
	@Override
	public String visitAddLabel(AddLabelContext ctx) {
		visitChildren(ctx);
		System.out.println("add");
		count++;
		return null;
	}

	@Override
	public String visitDivLabel(DivLabelContext ctx) {
		visitChildren(ctx);
		System.out.println("Divide");
		count++;
		return null;
	
	}
	
	@Override
	public String visitSubtLabel(SubtLabelContext ctx) {
		visitChildren(ctx);
		System.out.println("Subtract");
		count++;
		return null;
	}

	@Override
	public String visitMultLabel(MultLabelContext ctx) {
		visitChildren(ctx);
		System.out.println("Multiply");
		count++;
		return null;
	
	}

	@Override
	public String visitIdentLabel(IdentLabelContext ctx) {
		String name=ctx.IDENT().getText();
		if(variableTab.get(name)!=null){
		System.out.println("load "+ctx.getText());
		count++;
		}else{
			try {
			    throw new Exception("Undefined Variable ");
			} catch (Exception e) {
				System.err.println("Variable "+name+" is not defined");
				System.exit(100);
			}	
		}
		
		return ctx.getText();
	}

	@Override
	public String visitLoopStatLabel(LoopStatLabelContext ctx) {
		int startCount=count;
		visit(ctx.expr);
		System.out.println("loopstart ");
		if(ctx.stat!=null)
		visit(ctx.stat);
		System.out.println("gotostart "+startCount++);
		return null;
	}

	@Override
	public String visitFunctCallLabel(FunctCallLabelContext ctx) {
		String cnt=visit(ctx.callParam);
		System.out.println("invoke "+ctx.funName.getText()+" "+cnt);
		return null;
	}
	
	@Override
	public String visitCallParamLabel(CallParamLabelContext ctx) {
		int cnt=0;
		if(ctx.first!=null){
		visitChildren(ctx);
		cnt=ctx.getChildCount();
		cnt=cnt-(cnt/2);
		}
		return cnt+"";
	}

	@Override
	public String visitPassParameters(PassParametersContext ctx) {
		int cnt=0;
		if(ctx.first!=null){
		cnt=ctx.getChildCount();
		cnt=cnt-(cnt/2);
		visitChildren(ctx);
		}
		return cnt+"";
	}

	@Override
	public String visitFunctDefLabel(FunctDefLabelContext ctx) {
		String cnt="";
		if(ctx.parm!=null){
		cnt=visit(ctx.parm);
		}
		System.out.println("definefunct "+ctx.name.getText()+" "+cnt+" "+(ctx.ret==null?"":ctx.ret.getText()));
		if(ctx.funcstat!=null){
		visit(ctx.funcstat);
		}
		if(ctx.ret!=null){
		visit(ctx.funcret);
		}
		System.out.println("end "+ctx.name.getText());
		
		return super.visitFunctDefLabel(ctx);
	}

	@Override
	public String visitBlockLabel(BlockLabelContext ctx) {
		visitChildren(ctx);
		return null;
	}

	@Override
	public String visitProgramLabel(ProgramLabelContext ctx) {
		visitChildren(ctx);
		return null;
	}

	@Override
	public String visitReturnLabel(ReturnLabelContext ctx) {
		if(ctx.value!=null){
			visit(ctx.value);
		}
		System.out.println("return ");
		return null;
	}

	@Override
	public String visitGTLTEQLabel(GTLTEQLabelContext ctx) {	
		visitChildren(ctx);
		switch(ctx.op.getType()){
		case HelloParser.GT:
		System.out.println("GreaterThan");
		break;
		case HelloParser.LT:
		System.out.println("LessThan");
		break;	
		case HelloParser.EQ:
		System.out.println("EqualTo");
		break;	
		}
		return null;
	}

	

	@Override
	public String visitDeclarationLabel(DeclarationLabelContext ctx) {
		String var=ctx.variableName.getText();
		variableTab.put(var, variableTab.size());
		System.out.println("Position "+variableTab.size());
		if(ctx.value!=null){
			visit(ctx.expression());
		}
		count++;
		System.out.println("define "+var);
		count++;
		return null;
	}

	@Override
	public String visitIFStatementLabel1(IFStatementLabel1Context ctx) {
		visit(ctx.express1);
		System.out.println("If");
		count++;
		visit(ctx.stat1);
		System.out.println("True");
		count++;
		if(ctx.stat2!=null){
		visit(ctx.stat2);
		System.out.println("False");
		count++;
		}
		return null;
	}
}
