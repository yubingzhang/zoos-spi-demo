package com.zyb.swin;

import com.zyb.demo.SkillCreate;
import com.zyb.demo.SkillManager;

public class SkillRegister extends FishSkill implements SkillCreate {
    static {
        SkillManager.register(new SkillRegister());
    }
}
