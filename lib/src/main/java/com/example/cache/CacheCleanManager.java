//package com.example.cache;
//
//import com.j256.ormlite.dao.Dao;
//import com.j256.ormlite.stmt.QueryBuilder;
//import com.j256.ormlite.stmt.Where;
//
//import java.sql.SQLException;
//import java.util.LinkedList;
//
//
///**
// * 缓存清理管理器
// * Created by 6396000623 on 2017/2/15.
// */
//public class CacheCleanManager {
//
//    private final static LinkedList<ICacheClean> cleanTasks=new LinkedList<ICacheClean>();
//
//    public void clean(){
//        Dao userDao=new Dao();
//        for(ICacheClean cleanTask:cleanTasks){
//            cleanTask.cleanDb(userDaoFact);
//        }
//    }
//    static {
//        cleanTasks.add(new ICacheClean() {
//            private LinkedList<ICondition> iTask;
//            @Override
//            public void cleanDb(UserDaoFactory userDaoFact) {
//                MailInfoDBDao mailInfoDBDao = userDaoFact.getMailInfoDBDao();
//                try {
//                    QueryBuilder builder = mailInfoDBDao.getEntityDao().queryBuilder();
//                    Where where = builder.where();
//                        for (int i = 0; i < iTask.size(); i++) {
//                        ICondition condition=iTask.get(i);
//                        where=condition.cleanCondition(where);
//                    }
//                    String sql = builder.prepareStatementString();
//                    builder.query();
//                    mailInfoDBDao.executeRawNoArgs(sql);
//                } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
//            }
//        });
//    }
//
//    /**
//     * 清理缓存接口
//     * Created by 6396000623 on 2017/2/15.
//     */
//
//    public interface ICacheClean {
//        void cleanDb(DbHelper userDaoFact);
//    }
//
//
//
//
//
//}
