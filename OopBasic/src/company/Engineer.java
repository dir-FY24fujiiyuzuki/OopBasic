package company;

public class Engineer extends Employee{
    String programingLaguage;
    
    public Engineer(String name, Department department, String position,
            int enployeeId, String programingLangage) {
        super(name,  department,  position, enployeeId);
        this.programingLaguage = programingLangage;
        
    }
    
    public void developSoftware() {
        System.out.println("ソフトウェアを開発します。名前:"+ name +
                 "、プログラミング言語:" + programingLaguage);
        
        
    }
    //会議に参加するメソッドをオーバーライド
    @Override
    public void joinMeeting() {
        department.meeting();//変更
        System.out.println("→技能的な準備を行い、上記の会議に参加します。　名前:" + name);
        
    }

}
