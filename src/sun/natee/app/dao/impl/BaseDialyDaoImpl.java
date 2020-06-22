package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.BaseDialy;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;

public class BaseDialyDaoImpl implements BaseDao<BaseDialy, Integer> {
    private final Logger logger = Logger.getLogger(BaseDialyDaoImpl.class);
    private final String table = AppConstants.TABLE_BASE_DIALY;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(BaseDialy bean) throws SQLException {
        String sql = "insert into " + table + " "
                + "(index,type,name,desc2,rang1,rang2,status) "
                + "values(" + bean.getIndex() + ",'" + bean.getType() + "','" + bean.getName() + "',"
                + "'" + bean.getDesc() + "','" + bean.getRang1() + "','" + bean.getRang2() + "',"
                + "'" + bean.getStatus() + "')";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(BaseDialy bean) throws SQLException {
        String sql = "update " + table + " set "
                + "type='" + bean.getType() + "',"
                + "name='" + bean.getName() + "',"
                + "desc2='" + bean.getDesc() + "',"
                + "rang1='" + bean.getRang1() + "',"
                + "rang2='" + bean.getRang2() + "',"
                + "status='" + bean.getStatus() + "' "
                + "where index=" + bean.getIndex() + "";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int delete(Integer id) throws SQLException {
        String sql;
        if (id == null) {
            sql = "delete from " + table;
            logger.debug(sql);
            return Database.getConnect().createStatement().executeUpdate(sql);
        }
        sql = "delete from " + table + " where id=" + id;
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public BaseDialy findById(Integer index) throws SQLException {
        String sql = "select * from " + table + " where index=" + index;
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new BaseDialy());
            }
        }

        return null;
    }

    @Override
    public List<BaseDialy> findAll() throws SQLException {
        List<BaseDialy> listBean = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listBean.add(mapping(rs, new BaseDialy()));
            }
        }

        return listBean;
    }

    @Override
    public BaseDialy mapping(ResultSet rs, BaseDialy bean) throws SQLException {
        bean.setId(rs.getInt("id"));
        bean.setIndex(rs.getInt("index"));
        bean.setName(rs.getString("name"));
        bean.setDesc(rs.getString("desc2"));
        bean.setType(rs.getString("type"));
        bean.setRang1(rs.getString("rang1"));
        bean.setRang2(rs.getString("rang2"));
        bean.setStatus(rs.getString("status"));

        return bean;
    }

    @Override
    public void dropTable() {
        try {
            Database.dropTable(table);
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    @Override
    public boolean isUpdate(BaseDialy bean) throws SQLException {
        boolean isExist = false;
        String sql = "SELECT * FROM " + table + " WHERE index=" + bean.getIndex() + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                isExist = true;
            }
        }

        return isExist;
    }

    public List<BaseDialy> findByType(String type) throws SQLException {
        List<BaseDialy> listBean = new ArrayList<>();
        String sql = "select * from " + table + " where type='" + type + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listBean.add(mapping(rs, new BaseDialy()));
            }
        }

        return listBean;
    }

}
