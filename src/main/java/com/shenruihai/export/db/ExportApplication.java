package com.shenruihai.export.db;

import com.shenruihai.export.db.util.ConfigUtil;
import com.shenruihai.export.db.exporter.DatabaseExporter;
import com.shenruihai.export.db.exporter.MySQLDatabaseExporter;

public class ExportApplication {

    public static void main(String[] args) {
        DatabaseExporter exporter = new MySQLDatabaseExporter(ConfigUtil.loadConfig());
        exporter.export();
    }
}
