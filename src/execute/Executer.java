package pythy.execute;
import pythy.parser.*;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.FileWriter;

//����Pythy/src/execute���棬������������(�����������д��ڴ��ļ���)
/*
>>> javac Executer.java -classpath ../../class -d ../../class
*/


public class Executer {
    /***
     * ǰ�����Ǵ���һ��ִ����ʱ�����ʼ�������ݣ��ɱ����ṩ
     */
    public ArrayList<Statement_AST> statement_list;  //���ast���б���0��û�Ŷ������ӵ�1����ʼ
    public FileWriter file_writer;          //�����ϣ����Ϣ���ļ�����ʱ����ʵ��
    public OutputStreamWriter console_writer;  // �������̨��Ϣ����ʱ����ʵ��

    //���ű����Ҫ������ ��ִ�в���������

    public int pc;          //��ǰ���е��ı��ʽ�кţ���ʼ��Ϊ1
    public boolean end;         //�Ƿ��������ʼ��ΪFalse

    public void execute_once() {}    //����һ����䣬����pc��ȡ��䣬���н������������һ��ָ��ĺ��룬�����á�
                                //����Ѿ��������һ�䣬Ӧ������endΪTrue 

    public void execute_all() {}     //����������䣬ѭ������������Ӧ����endΪTrue

    public Expression_AST eval(Expression_AST ast) {return null;}  //�����Ա��ʽ���еݹ���ֵ,���ط�װ�õ�ֵ

    public void Reset() {}     //��Ҫ��ִ�����������������ǻָ�һ��ʼ��״̬����������һЩ����
}