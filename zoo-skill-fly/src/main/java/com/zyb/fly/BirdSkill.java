package com.zyb.fly;

import com.zyb.demo.Skill;
import com.zyb.demo.SkillCreate;

public class BirdSkill implements SkillCreate {

    @Override
    public Skill create(String feature) throws Exception {
        if("fly".equals(feature)){
            return new Skill("小鸟",feature);
        }
        return null;
    }
}
