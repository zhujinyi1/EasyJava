package com.easyJava;

import com.easyJava.bean.TableInfo;
import com.easyJava.builder.*;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<TableInfo> tables = BuildTable.getTables();

        BuildBase.execute();

        for (TableInfo table : tables) {
            BuildPojo.execute(table);
            BuildQuery.execute(table);
            BuildMapper.execute(table);
            BuildMapperXml.execute(table);
            BuildService.execute(table);
            BuildServiceImpl.execute(table);
            BuildController.execute(table);
        }

    }
}
