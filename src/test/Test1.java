package pythy.test;
import java.io.*;
import java.util.ArrayList;
import pythy.parser.*;
/*
����һ�����뵥Ԫ���ԣ���ȡ�ļ������룬����ӡ�﷨��
*/
public class Test1 {
    public static void main(String[] args) {
		//file reading
		FileReader reader;
        ArrayList<Statement_AST> lst;
		try{
			reader = new FileReader("files/test1.py");
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

		//print statements
        for(int i=1;i<lst.size();i++) {
            System.out.println(lst.get(i).print_self());
        }
    }
}