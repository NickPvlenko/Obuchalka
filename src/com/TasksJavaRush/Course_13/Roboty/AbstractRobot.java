package com.TasksJavaRush.Course_13.Roboty;

public abstract class AbstractRobot implements Attackable,Defensable{
    private static int hitCount;
     String name;
    public String getName() {
        return name;
    }

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        }else if  (hitCount >= 4) {
                hitCount = 0 ;
            attackedBodyPart = BodyPart.CHEST;
            return BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        }else if  (hitCount >= 4) {
            hitCount = 0 ;
            defendedBodyPart = BodyPart.CHEST;
            return BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}