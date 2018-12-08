package com.ibm.rahultest;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

//import com.ibm.cdd.CDDConfig;
//import com.ibm.cdd.orm.UnifiedServer;
//import com.ibm.cdd.orm.UnifiedServerContacts;
//import com.ibm.scap.util.LoggerUtil;
//import com.ibm.scap.util.db.DB;
//import com.ibm.scap.util.db.RegisteredDB;

public class BasicTest {
//    private static LoggerUtil log;
//
//    public static void main(String[] args) throws Exception {
//        try {
//            basicSetup(args);
//            LoggerUtil log = LoggerUtil.getLogger();
//            log.info("BasicTestApp started");
//
//            try (DB db = RegisteredDB.CDD.noTransaction()) {
//
//                // deleteINCDDFeedBackRecords(log, db);
//
//                // setUnwatedStatustoNull(log, db);
//
//            } catch (SQLException e) {
//                log.info(" Exception executing BasicTestApp" + e);
//            }
//        } catch (Throwable e) {
//            e.printStackTrace();
//            log.severe("uncaught exception", e);
//        }
//    }
//
//    private static void setUnwatedStatustoNull(LoggerUtil log, DB db) throws SQLException {
//        String sql = "SELECT * FROM " +
//                "CDDRPT.UNIFIEDSERVER ";
//        log.info("Query is" + sql);
//        List<UnifiedServer> usAll = UnifiedServer.load(db, sql);
//        for (UnifiedServer us : usAll) {
//            log.info(" Record is " + us);
//            us.serverStatus = null;
//            us.save(db);
//        }
//        log.info("COUNT IS" + usAll.size());
//    }
//
//    private static void deleteINCDDFeedBackRecords(LoggerUtil log, DB db) throws SQLException {
//        String sql = "select * from cddrpt.UNIFIEDSERVERCONTACTS c " +
//                "where c.serverkey in (SELECT serverkey FROM CDDRPT.UNIFIEDSERVER " +
//                "WHERE INSCMON = 'false' " +
//                "AND INCDDFEEDBACK = 'true' " +
//                "AND INSP = 'false' " +
//                "AND (INMAD = 'false' OR MADSERVERTYPE NOT IN ('build','scm')) " +
//                "AND INSCAN = 'false' " +
//                "AND INSB = 'false') ";
//        log.info("Query is" + sql);
//        List<UnifiedServerContacts> uscAll = UnifiedServerContacts.load(db, sql);
//        for (UnifiedServerContacts usc : uscAll) {
//            log.info(" Record is " + usc);
//            usc.delete(db);
//        }
//        log.info("COUNT IS" + uscAll.size());
//        sql = "SELECT * FROM CDDRPT.UNIFIEDSERVER " +
//                "WHERE INSCMON = 'false' " +
//                "AND INCDDFEEDBACK = 'true' " +
//                "AND INSP = 'false' " +
//                "AND (INMAD = 'false' OR MADSERVERTYPE NOT IN ('build','scm')) " +
//                "AND INSCAN = 'false' " +
//                "AND INSB = 'false' ";
//        log.info("Query is" + sql);
//        List<UnifiedServer> usAll = UnifiedServer.load(db, sql);
//        for (UnifiedServer us : usAll) {
//            log.info(" Record is " + us);
//            us.delete(db);
//        }
//        log.info("COUNT IS" + usAll.size());
//    }
//
//    private static void basicSetup(String[] args) throws IOException, IllegalArgumentException {
//        if (args.length == 0) {
//            throw new IllegalArgumentException("No config file passed");
//        }
//        Path configFile = Paths.get(args[0]);
//        CDDConfig.init(configFile);
//    }

}
