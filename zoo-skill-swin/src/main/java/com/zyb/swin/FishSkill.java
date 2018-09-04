package com.zyb.swin;

import com.zyb.demo.Skill;
import com.zyb.demo.SkillCreate;

public class FishSkill implements SkillCreate {
    @Override
    public Skill create(String feature) throws Exception {
        if("swin".equals(feature)){
            return new Skill("小鱼",feature);
        }
        throw new Exception("这不是小鱼的特有技能");
    }
}
