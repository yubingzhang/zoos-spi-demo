package com.zyb.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SkillNotFoundException extends RuntimeException{
    private String code;
    private String message;

    public SkillNotFoundException(String code,String message){
        this.code = code;
        this.message = message;
    }
}
