package com.zhjava.chap715_617;

public class Team {
    String [] names=new String[6];
    int total=0;//���˺�ֵ
    //���
    //���ӳ�Ա�����6��
    public void addMember(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]=name;
                System.out.println(name+"���ӳɹ���");
                break;
            }
        }
    }
    //��Ӻ�Ե��˵����˺�ֵ
    public int attackSum(Role role){

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