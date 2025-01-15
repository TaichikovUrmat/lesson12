package java15.dao.impl;

import java15.dao.GenericDao;
import java15.dataBase.DataBase;
import java15.model.Group;

import java.util.List;

public class GroupDaoImpl implements GenericDao<Group,Long> {

     private final DataBase dataBase;

    public GroupDaoImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void create(Group group) {
        dataBase.groupList.add(group);
    }

    @Override
    public List<Group> getAll() {
        return List.of();
    }

    @Override
    public Group getById(Long aLong) {
        return null;
    }

    @Override
    public void updateById(Long aLong, Group group) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
