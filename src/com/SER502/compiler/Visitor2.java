package com.SER502.compiler;

import java.io.*;
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

public class Visitor2 extends HelloBaseVisitor<String>{
	
	File fileOut=new File("TestOut.txt");
	FileWriter fw=new FileWriter(fileOut.getAbsoluteFile());
	BufferedWriter bufWriter= new BufferedWriter(fw);
	String output="";
	
	Visitor2() throws Exception {
		super();
	}
	int count=0;
	HashMap<String,Integer> variableTab=new HashMap<String,Integer>();

	@Override
	public String visitProgramLabel(ProgramLabelContext ctx) {
		visitChildren(ctx);
		aggregateResult();
		return null;
	}

	private void aggregateResult() {
		try {
			bufWriter.write(output);
			bufWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	@Override
	public String visitParameterLabel(ParameterLabelContext ctx) {
		System.out.println("FuncParam "+ctx.name.getText());
		output=output+"FuncParam "+ctx.name.getText()+"\n";
		return null;
	}
	
	@Override
	public String visitIntegerLabel(IntegerLabelContext ctx) {
		System.out.println("load "+ctx.getText());
		output=output+"load "+ctx.getText()+"\n";
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
		output=output+"store "+name+"\n";
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
			output+="AND"+"\n";
			count++;
			break;
		case HelloParser.OR:
			System.out.println("OR");
			output+="OR"+"\n";
			count++;
			break;
		case HelloParser.NOT:
			System.out.println("NOT");
			output+="NOT"+"\n";
			count++;
		}
		return null;
		
	}
	
	@Override
	public String visitAddLabel(AddLabelContext ctx) {
		visitChildren(ctx);
		System.out.println("ADD");
		output+="ADD"+"\n";
		count++;
		return null;
	}

	@Override
	public String visitDivLabel(DivLabelContext ctx) {
		visitChildren(ctx);
		System.out.println("Divide");
		output+="Divide"+"\n";
		count++;
		return null;
	
	}
	
	@Override
	public String visitSubtLabel(SubtLabelContext ctx) {
		visitChildren(ctx);
		System.out.println("Subtract");
		output+="Subtract"+"\n";
		count++;
		return null;
	}

	@Override
	public String visitMultLabel(MultLabelContext ctx) {
		visitChildren(ctx);
		System.out.println("Multiply");
		output+="Multiply"+"\n";
		count++;
		return null;
	
	}

	@Override
	public String visitIdentLabel(IdentLabelContext ctx) {
		String name=ctx.IDENT().getText();
		if(variableTab.get(name)!=null){
		System.out.println("load "+ctx.getText());
		output+="load "+ctx.getText()+"\n";
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
		output=output+"loopstart "+"\n";
		if(ctx.stat!=null)
		visit(ctx.stat);
		System.out.println("gotostart "+startCount++);
		output=output+"gotostart "+(startCount++)+ "\n";
		return null;
	}

	@Override
	public String visitFunctCallLabel(FunctCallLabelContext ctx) {
		String cnt=visit(ctx.callParam);
		System.out.println("invoke "+ctx.funName.getText()+" "+cnt);
		output=output+"invoke "+ctx.funName.getText()+" "+cnt+"\n";
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
		if(ctx.ret!=null){
			System.out.println("definefunct "+ctx.name.getText()+" "+cnt+" "+ctx.ret.getText());
			output=output+"definefunct "+ctx.name.getText()+" "+cnt+" "+ctx.ret.getText()+"\n";
		}else{ 
			System.out.println("definefunct "+ctx.name.getText()+" "+cnt);
			output=output+"definefunct "+ctx.name.getText()+" "+cnt+"\n";
		}
		if(ctx.funcstat!=null){
		visit(ctx.funcstat);
		}
		if(ctx.funcret!=null){
		visit(ctx.funcret);
		}
		System.out.println("end "+ctx.name.getText());
		output=output+"end "+ctx.name.getText()+"\n";
		return super.visitFunctDefLabel(ctx);
	}

	@Override
	public String visitBlockLabel(BlockLabelContext ctx) {
		visitChildren(ctx);
		return null;
	}

	
	@Override
	public String visitReturnLabel(ReturnLabelContext ctx) {
		if(ctx.value!=null){
			visit(ctx.value);
		}
		System.out.println("return ");
		output=output+"return "+"\n";
		return null;
	}

	@Override
	public String visitGTLTEQLabel(GTLTEQLabelContext ctx) {	
		visitChildren(ctx);
		switch(ctx.op.getType()){
		case HelloParser.GT:
		System.out.println("GreaterThan");
		output=output+"GreaterThan"+"\n";
		break;
		case HelloParser.LT:
		System.out.println("LessThan");
		output=output+"LessThan"+"\n";
		break;	
		case HelloParser.EQ:
		System.out.println("EqualTo");
		output=output+"EqualTo"+"\n";
		break;	
		}
		return null;
	}

	

	@Override
	public String visitDeclarationLabel(DeclarationLabelContext ctx) {
		String var=ctx.variableName.getText();
		variableTab.put(var, variableTab.size());
		System.out.println("Position "+variableTab.size());
		output=output+"Position "+variableTab.size()+"\n";
		if(ctx.value!=null){
			visit(ctx.expression());
		}
		count++;
		System.out.println("define "+var);
		output=output+"define "+var+"\n";
		count++;
		return null;
	}

	@Override
	public String visitIFStatementLabel1(IFStatementLabel1Context ctx) {
		visit(ctx.express1);
		System.out.println("IF");
		output=output+"IF"+"\n";
		count++;
		visit(ctx.stat1);
		System.out.println("True");
		output=output+"True"+"\n";
		count++;
		if(ctx.stat2!=null){
		visit(ctx.stat2);
		System.out.println("False");
		output=output+"False"+"\n";
		count++;
		}
		return null;
	}
}
