package top.lhylxl.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springBoot默认支持两种技术和ES交互
 * 1.Jest (默认不生效)
 * 	需导入jest的工具包 (io.searchbox.client.JestClient)
 * 2.springData ElasticSearch
 * 		1.Client 节点信息clusterNodes; clusterName
 * 		2.ElasticsearchTemplate 操作Es
 * 		3.编写一个ElasticSearchRepository的子接口来操作Es
 */
@SpringBootApplication
public class SpringbootAdvanced03ElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdvanced03ElasticApplication.class, args);
	}

}