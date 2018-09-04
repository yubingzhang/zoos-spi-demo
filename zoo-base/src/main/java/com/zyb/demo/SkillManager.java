package com.zyb.demo;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;

public class SkillManager {

        private final static CopyOnWriteArrayList<SkillInfo> registerList = new CopyOnWriteArrayList<>();

        static{
            initialLoad();
        }

        private static void initialLoad(){
            ServiceLoader<SkillCreate> loaders = ServiceLoader.load(SkillCreate.class);
            Iterator<SkillCreate> driversIterator = loaders.iterator();
            try{
                while(driversIterator.hasNext()) {
                    driversIterator.next();
                }
            } catch(Throwable t) {
            }
        }

        public static synchronized void register(SkillCreate skillCreate){
            registerList.add(new SkillInfo(skillCreate));

        }

        public static Skill getSkill(String feature){
            for(SkillInfo info : registerList){
                try {
                    Skill skill = info.skillCreate.create(feature);
                    if(null != skill){
                        return skill;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            throw new SkillNotFoundException("-10000","找不到相应的类");
        }

}
