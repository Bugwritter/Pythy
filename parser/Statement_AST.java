
public class Statement_AST{
    String type; //"if" "where" "null" "="
    String left;//��ֵ�������ֵ
    Expression_AST right; //��ֵ������ұ�ֵ��if��where���������ʽ
    int line; //�к�
    int in; //if��where���Ϊtrueʱ����һ�У�δʵ��
    int out; //if,where���Ϊfalseʱ��һ�У�δʵ��
    int next;
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