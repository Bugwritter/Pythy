package pythy.parser;
public class Statement_AST{
    public String type; //"if" "where" "null" "="
    public String left;//��ֵ�������ֵ
    public Expression_AST right; //��ֵ������ұ�ֵ��if��where���������ʽ
    public int line; //�к�
    public int in; //if��where���Ϊtrueʱ����һ�У�δʵ��
    public int out; //if,where���Ϊfalseʱ��һ�У�δʵ��
    public int next;
    public Statement_AST(String type) {
        //��ʼ��������ͬʱ�����ͺ��кų�ʼ��
        this.type = type;
    }
    public String print_self() {
        switch(this.type) {
            case "=" :
            {
                return ("(=)" + "[left:" + this.left + "]" + "[right:"+ this.right.print_self() + "]"
                        + "[line:"+ this.line  + "]" + "[next:" + this.next + "]");
            }
            case "null":
            {
                return "(null)";
            }
        }
        return "";
    }

}