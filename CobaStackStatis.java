/**
 *
 * @author Rifaldi
 */
public class CobaStackStatis {
    public static void main(String[] args) {
        
        Stack S = new Stack();
        
        S.createEmpty();
        S.printStack();
        
        System.out.println("=================================================");
        
        S.push("E31202038", "Farhan Rifaldi", 86.2);
        S.push("E41202192", "Ilham Nugraha", 84.5);
        S.push("E41201747", "Yoga Andrian", 92.6);
        
        S.printStack();
        
        System.out.println("=================================================");
        
        S.pop();
        S.pop();
        S.printStack();
        
        System.out.println("=================================================");
        
    }
}
