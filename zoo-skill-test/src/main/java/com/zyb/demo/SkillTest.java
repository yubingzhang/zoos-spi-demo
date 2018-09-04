package com.zyb.demo;

public class SkillTest {
    public static void main(String[] args){
        testBird();
        testFish();
    }

    public static void testBird(){
        Skill bird = SkillManager.getSkill("fly");
        if(bird != null){
            System.out.println("bird of skill:"+bird);
        }
    }

    public static void testFish(){
        Skill fish = SkillManager.getSkill("swin");
        if(fish != null){
            System.out.println("fish of skill:"+fish);
        }
    }
}
