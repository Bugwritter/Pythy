package pythy.test;
import java.io.*;
import java.util.ArrayList;
import pythy.parser.*;
import pythy.execute.*;
/*
���Զ������롢ִ�м��ɲ���
ִ������Ҫ�ܹ���ȷ��ִ��ִ�����ָ�ֵ���
�����ܹ���ÿһ��������ȷ�ذѷ��ű�����ݴ�ӡ��files�ļ����µ�output2.dot��

*/
public class Test2 {
    public static void main(String[] args) {
		//file reading
		FileReader reader;
        ArrayList<Statement_AST> lst;
		try{
			reader = new FileReader("files/test2.py");
		} catch(FileNotFoundException e) {
			System.out.println("file not found");
            return;
		}


		//begin parsing
		Parser parser = new Parser(reader);
		try {
            parser.Program();
            lst = parser.get_statement_list();
		} catch(ParseException e) {
			System.out.println("parse error, at" + e);
            return;
        }
        System.out.println("----------parse finish-------");
        for(int i=1;i<lst.size();i++) {
            System.out.println(lst.get(i).print_self());
        }
        System.out.println("-------start to execute------");
        
        //begin executing 
        Executer executer = new Executer();
        executer.statement_list = lst;      //�����ast����

        executer.execute_all();
        System.out.println("------execute finish---------");
        //Ŀ��1��ÿִ��һ����print��ϣ������̨�����Ƿ���ȷ
        //Ŀ��2������ϣ���ӡ���ļ�

        
    }
}