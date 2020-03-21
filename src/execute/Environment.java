package pythy.execute;
import pythy.parser.*;
import java.util.Hashtable;

public  class Environment {
	public Hashtable<String,Expression_AST> hashtable ;
	//�½���ֵ��
	public Environment() {
		hashtable = new Hashtable<String, Expression_AST>();
	}
	public void put(String key, Expression_AST value) {
		hashtable.put(key,value);
	}
	
	//��֪��������ֵ
	public Expression_AST get(String key) throws PRTException{
		Expression_AST ast = hashtable.get(key);
		if(hashtable.get(key) == null)
			throw new PRTException("Undefined Variable \"" + key + "\"" );
		else
			return hashtable.get(key);
	}

}
