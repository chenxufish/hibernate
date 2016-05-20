package com.stone.hibernate.Dao;


import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * @auther chenxu03 on 2016/5/20.
 */
public class ExportDB {
    public static void main(String[] args) {
        //Configuration cfg = new AnnotationConfiguration().configure();
        Configuration cfg = new Configuration().configure();
        SchemaExport export = new SchemaExport(cfg);
        export.create(true, true);
    }


}
