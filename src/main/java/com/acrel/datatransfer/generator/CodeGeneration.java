package com.acrel.datatransfer.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 *
 * @ClassName: CodeGeneration
 * @Description: 代码生成�??
 */
public class CodeGeneration {

	/**
	 *
	 * @Title: main
	 * @Description: 生成
	 * @param args
	 */
	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();

		// 全局配置
		GlobalConfig gc = new GlobalConfig();

		gc.setOutputDir("D:/ideaworkspace/datatransfer/src/main/java");// 输出文件路径t_enterpriseproduce
		gc.setFileOverride(true);
		gc.setActiveRecord(false);// 不需要ActiveRecord特�?�的请改为false
		gc.setEnableCache(false);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(true);// XML columList
		gc.setAuthor("ffy");// 作�??
		String databaseName = "Environment";
		// 自定义文件命名，注意 %s 会自动填充表实体属�?�！
		gc.setControllerName("%s"+databaseName+"Controller");
		gc.setServiceName("%s"+databaseName+"Service");
		gc.setServiceImplName("%s"+databaseName+"ServiceImpl");
		gc.setMapperName("%s"+databaseName+"Mapper");
		gc.setXmlName("%s"+databaseName+"Mapper");
		gc.setEntityName("%s"+databaseName);
		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("1234");
		dsc.setUrl("jdbc:mysql://127.0.0.1:3306/environment");
		mpg.setDataSource(dsc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();

		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		strategy.setTablePrefix(new String[] { "t_" });// 此处可以修改为您的表前缀
		strategy.setInclude(new String[] { "t_enterpriseproduce" ,"t_event","t_eventcheck","t_eventhandle","t_meter","t_monitor","t_produceset","t_producetreat","t_workshop"});
		mpg.setStrategy(strategy);

		TemplateConfig templateConfig = new TemplateConfig();
//		templateConfig.setXml(null);
		mpg.setTemplate(templateConfig);

		// 包名配置
		PackageConfig pc = new PackageConfig();
		String packagePrefix = "environment";
		pc.setParent("com.acrel.datatransfer");
		pc.setController(packagePrefix+".controller");
		pc.setService(packagePrefix+".service");
		pc.setServiceImpl(packagePrefix+".service.impl");
		pc.setMapper(packagePrefix+".mapper");
		pc.setEntity(packagePrefix+".model");
		pc.setXml(packagePrefix+".mapper");
		mpg.setPackageInfo(pc);

		// 执行生成
		mpg.execute();

	}

}
