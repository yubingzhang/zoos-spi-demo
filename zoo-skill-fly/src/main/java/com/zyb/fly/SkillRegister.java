package com.zyb.fly;

import com.zyb.demo.SkillCreate;
import com.zyb.demo.SkillManager;

/**
 * 注册实现类
 */
public class SkillRegister extends BirdSkill implements SkillCreate {
    static {
        SkillManager.register(new SkillRegister());
    }
}
