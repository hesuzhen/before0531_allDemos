package com.zhjava.chap617;

public class Team {
    String [] names=new String[6];
    //组队
    //增加成员，最多6个
    public void addMember(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]=name;
                System.out.println(name+"添加成功！");
                break;
            }
        }
    }
    //组队后对敌人的总伤害值
    public int attackSum(Role role){
        int total=0;//总伤害值
        if(role instanceof  Magicer){
            Magicer m=(Magicer) role;
            int attackM = m.attack();
            total+=attackM;
        } else if (role instanceof Soldier) {
            Soldier s=(Soldier) role;
            int attackS = s.attack();
            total+=attackS;
        }
        return  total;
    }
}
