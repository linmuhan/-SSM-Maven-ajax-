package service;

import pojo.Grade;

import java.util.List;

public interface GradeService {
    void add(Grade grade);
    List<Grade> list();
    void delete(String sno,String cno);
    Grade get(String sno,String cno);
    void update(Grade grade);
    List<Grade> likeList(String likeKey);
    boolean gradeIsExit(String sno,String cno);
}
