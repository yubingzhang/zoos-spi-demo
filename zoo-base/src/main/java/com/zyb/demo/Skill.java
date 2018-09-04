package com.zyb.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 动物的技能
 */
@Setter
@Getter
@NoArgsConstructor
public class Skill {
    /**
     * 名称
     */
    private String name;
    /**
     * 特有技能
     */
    private String feature;

    public Skill(String name,String feature){
        this.name = name;
        this.feature = feature;
    }

    public String toString(){
        return "name:"+this.name+"  feature:"+this.feature;
    }
}
